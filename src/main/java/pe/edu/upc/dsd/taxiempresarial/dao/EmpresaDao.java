package pe.edu.upc.dsd.taxiempresarial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Empresa;
import pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils;

public class EmpresaDao extends BaseDao {

    public Collection<Empresa> buscarEmpresaPorCodigo(String cod) throws DaoException {

        String query = "SELECT cod_emp, raz_soc_emp "
                        + "FROM Tb_Empresa "
                        + "WHERE cod_emp = ?";

        Collection<Empresa> lista = new ArrayList<Empresa>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = JdbcUtils.getConnection();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + cod + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Empresa empresa = new Empresa();

                empresa.setCod_emp(rs.getInt(1));
                empresa.setRaz_soc_emp(rs.getString(2));

                lista.add(empresa);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DaoException(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return lista;
    }

    public Collection<Empresa> listarEmpresas() throws DaoException {

        String query = "SELECT cod_emp, raz_soc_emp "
                + "FROM Tb_Empresa "
                + "WHERE cod_emp = ?";

        Collection<Empresa> lista = new ArrayList<Empresa>();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = JdbcUtils.getConnection();
            stmt = con.prepareStatement(query);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Empresa empresa = new Empresa();

                empresa.setCod_emp(rs.getInt(1));
                empresa.setRaz_soc_emp(rs.getString(2));

                lista.add(empresa);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            throw new DaoException(e.getMessage());
        } finally {
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return lista;
    }
}
