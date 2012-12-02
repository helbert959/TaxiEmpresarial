<%@page import="localhost.webservicetaxyemp.TaxyServicioEntity"%>
<%@page import="localhost.webservicetaxyemp.TaxyReservaEntity"%>
<%@include file="validarSesion.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>


<%@page
    import="pe.edu.upc.dsd.taxiempresarial.controller.EmpresaController"%>
    <%@page
        import="java.util.*, pe.edu.upc.dsd.taxiempresarial.model.Empresa"%>
        <%@page
            import="java.util.*, pe.edu.upc.dsd.taxiempresarial.model.ServicioRuta"%>

            <html>

                <head>
                    <meta http-equiv="Content-Type"
                          content="text/html; charset=windows-1252">
                    <title>Consultar Reservas Realizadas - Taxi Empresarial</title>
                    <link href="css/style.css" rel="stylesheet" type="text/css" />
                </head>
                <body class="iframe">
                    <div id="logo">

                        <div align="center">
                            <form id="form1" name="form1" method="get"
                                  action="">
                                  <div>
                                  	<h1>Consultar Reservas Realizadas</h1><br>
                                  </div>
                                <table width="589" height="89" border="1">
                                    <tr>
                                        <td>Cod. Servicio</td>
                                        <td>Ruta Inicio</td>
                                        <td>Ruta Fin</td>
                                        <td>Costo Ruta</td>
                                        <td>Fecha Servicio</td>
                                    </tr>
                                    
                                    <%-- start web service invocation --%>
                                    <tr>
                                        <%
                                            //try {
                                            Collection<TaxyReservaEntity> reservas = (ArrayList<TaxyReservaEntity>) request.getAttribute("RESERVAS");

                                            if (reservas != null) {
                                                for (TaxyReservaEntity reserva : reservas) {
                                        %>
                                        <td> <%= reserva.getCodReserva() %> </td>
                                        <td> <%= reserva.getFecReserva() %> </td>
                                        <td> <%= reserva.getDesRutaIni() %> </td>
                                        <td> <%= reserva.getDesRutaFin() %> </td>
                                        <td> <%= reserva.getCostoRuta() %> </td>
                                        <td> <%= reserva.getEstReserva() %> </td>
                                        <td>
                                        	<a href="<%=request.getContextPath() %>/CancelarReservaServlet?codRes=<%=reserva.getCodReserva() %>" onclick="return confirm('¿Está seguro que desea eliminar');">Eliminar</a>                                        	
                                        </td>
                                    </tr>
                                    <%                                                                      
                                            }
                                        }
                                    %>
                                </table>
                            </form>
                        </div>
                    </div>
                </body>
            </html>
