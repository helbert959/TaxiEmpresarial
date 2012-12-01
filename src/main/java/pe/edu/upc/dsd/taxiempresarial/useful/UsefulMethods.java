package pe.edu.upc.dsd.taxiempresarial.useful;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap;

public final class UsefulMethods {

    public WebServiceTaxyEmpSoap callWebService() {
        // Call Web Service Operation
        pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmp service = new pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmp();
        pe.edu.upc.dsd.taxiempresarial.wsdlservice.WebServiceTaxyEmpSoap port = service.getWebServiceTaxyEmpSoap();
        return port;
    }
    
    //Devuelve un java.util.Date desde un String en formato dd-MM-yyyy    
    public static synchronized java.util.Date fromStringToDate(String date)
    {
       SimpleDateFormat formatOfText = new SimpleDateFormat("dd-MM-yyyy");
       Date dateToSend = null;
       
       try {
           dateToSend = formatOfText.parse(date);
           return dateToSend;
       } catch (ParseException ex) {
           ex.printStackTrace();
           return null;
       }
    }

    // INSERT, DELETE, UPDATE
    static public String ejecuta(String sql) {
        String mensaje = null;
        try {
            Connection cn = new JdbcUtils().getConnection();

            if (cn == null) {
                mensaje = "No hay acceso a base de datos!";
            } else {
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
                cn.close();
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }

        return mensaje; // returna null si todo bien
    // Si falla retorna mensaje de error
    }

    // SELECT simple
    static public List consulta(String sql) {

        List<Object[]> list = new ArrayList<Object[]>();
        try {
            Connection cn = new JdbcUtils().getConnection();

            if (cn == null) {
                list = null;
            } else {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSetMetaData rm = rs.getMetaData();
                int numCols = rm.getColumnCount();

                // Toma titulos de columnas
                String[] titCols = new String[numCols];
                for (int i = 0; i < numCols; ++i) {
                    titCols[i] = rm.getColumnName(i + 1);
                }
                // fila 0 lleva los titulos de columnas
                list.add(titCols);

                // toma las filas de la consulta
                while (rs.next()) {
                    Object[] fila = new Object[numCols];
                    for (int i = 0; i < numCols; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    list.add(fila);
                }
                cn.close();
            }
        } catch (SQLException e) {
            list = null;
        }

        return list;    // returna null si falla
    }

    // <table> con consulta simple
    public static StringBuffer consultaHtml(String sql) {

        List list = UsefulMethods.consulta(sql);
        StringBuffer tabla = new StringBuffer("");

        if (list != null) {
            tabla.append("<table>");
            tabla.append("<thead>");
            tabla.append("<tr>");
            Object[] fila = (Object[]) list.get(0);
            for (int col = 0; col < fila.length; ++col) {
                tabla.append("<td>" + fila[col] + "</td>");
            }
            tabla.append("</tr>");
            tabla.append("</thead>");

            tabla.append("<tbody>");
            for (int fil = 1; fil < list.size(); ++fil) {
                tabla.append("<tr>");
                fila = (Object[]) list.get(fil);
                for (int col = 0; col < fila.length; ++col) {
                    Object campo = fila[col];
                    if (campo == null) {
                        tabla.append("<td>&nbsp;</td>");
                    } else {
                        tabla.append("<td>" + fila[col] + "</td>");
                    }
                }
                tabla.append("</tr>");
            }
            tabla.append("</tbody>");
            tabla.append("</table>");
        } else {
            tabla.append(
                    "Consulta mal hecha o NO hay acceso a DB");
        }

        return tabla;
    }

    // <select> con id de value y texto para <option>
    public static StringBuffer comboHtml(String sql,
            String nameCombo) {
        List list = UsefulMethods.consulta(sql);
        StringBuffer combo = new StringBuffer("");

        if (list != null) {
            combo.append("<select name=\"" + nameCombo + "\">");
            for (int fil = 1; fil < list.size(); ++fil) {
                Object[] fila = (Object[]) list.get(fil);
                combo.append("<option value=\"" + fila[0] +
                        "\">" + fila[1] + "</option>");
            }
            combo.append("</select>");
        } else {
            combo.append(
                    "Consulta mal hecha o NO hay acceso a DB");
        }

        return combo;
    }

    // retorna fila condicionada por un WHERE
    public static Object[] getFila(String sql) {
        List list = UsefulMethods.consulta(sql);
        Object[] fila = null;

        if (list != null) {
            if (list.size() > 1) {
                fila = (Object[]) list.get(1);
            }
        }

        return fila;
    }

    // retorna campo condicionado por un WHERE
    public static Object getCampo(String sql) {
        Object[] fila = getFila(sql);
        Object campo = null;

        if (fila != null) {
            campo = fila[0];
        }

        return campo;
    }

    // solo para MySQL (consulta paginada)
    static public List consulta(String sql,
            long numPagina, long filsPorPagina) {

        List list = consulta(sql + " LIMIT " +
                numPagina * filsPorPagina + "," +
                filsPorPagina);

        return list;
    }

    // <table> con consulta paginada
    public static StringBuffer consultaHtml(String sql,
            long numPagina, long filsPorPagina) {

        List list = UsefulMethods.consulta(sql, numPagina, filsPorPagina);
        StringBuffer tabla = new StringBuffer("");

        if (list != null) {
            tabla.append("<table>");
            tabla.append("<thead>");
            tabla.append("<tr>");
            Object[] fila = (Object[]) list.get(0);
            for (int col = 0; col < fila.length; ++col) {
                tabla.append("<td>" + fila[col] + "</td>");
            }
            tabla.append("</tr>");
            tabla.append("</thead>");

            tabla.append("<tbody>");
            for (int fil = 1; fil < list.size(); ++fil) {
                tabla.append("<tr>");
                fila = (Object[]) list.get(fil);
                for (int col = 0; col < fila.length; ++col) {
                    Object campo = fila[col];
                    if (campo == null) {
                        tabla.append("<td>&nbsp;</td>");
                    } else {
                        tabla.append("<td>" + fila[col] + "</td>");
                    }
                }
                tabla.append("</tr>");
            }
            tabla.append("</tbody>");
            tabla.append("</table>");
        } else {
            tabla.append(
                    "Consulta mal hecha o NO hay acceso a DB");
        }

        return tabla;
    }

    // retorna cantidad de filas de una consulta
    static public long ctasFilas(String sql) {
        sql = sql.toUpperCase();
        int x = sql.indexOf("FROM");
        String from = sql.substring(x + 5); // 5 por "FROM "
        sql = "SELECT COUNT(*) FROM " + from;
        long ctasFilas = -1L;

        try {
            Connection cn = new JdbcUtils().getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next(); // avanza a primera fila
            ctasFilas = rs.getLong(1); // primer campo
            cn.close();
        } catch (SQLException e) {
            ctasFilas = -1L;
        }

        return ctasFilas;
    }

     static public List rsConsultaFila(String sql) {
     List fila=null;
       try {
            Connection cn = new JdbcUtils().getConnection();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int n = 0;
                // toma las filas de la consulta
                while (rs.next()) {
                      fila.add(n,rs.getString(1));
                      n=n+1;
                }
                cn.close();

        } catch (SQLException e) {
            fila = null;
        }

        return fila;    // returna null si falla
    }

}
