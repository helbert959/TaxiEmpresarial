<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="localhost.webservicetaxyemp.TaxyServicioEntity"%>
<%@include file="validarSesion.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=windows-1252">
        <title>Realizar Reserva de Taxi - Taxi Empresarial</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="iframe">
        <div id="logo">

            <div align="center">
                <form id="form1" name="form1" method="post"
                      action="ConsultarServicioServlet">
                    <div>
                        <h1>Consultar Disponibilidad de Taxis</h1><br>
                    </div>
                    <table border="0">
                        <tr>
                            <td>
                                <div style="width: 150px;" align="right">Empresa:</div>
                            </td>
                            <td>
                                <div align="left">
                                    <select id="cboEmpresa" name="cboEmpresa">
                                        <option>4 - Taxi Seguro</option>
                                        <option>5 - Lima Taxi</option>
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div style="width: 150px;" align="right">Fecha reserva:</div>
                            </td>
                            <td colspan="3">
                                <div align="left">
                                    <select name="cboDia" id="cboDia">
                                        <option>Dia</option>
                                        <c:forEach var="x" begin="1" end="30" step="1">
                                            <option>${x}</option>
                                        </c:forEach>
                                    </select> <select name="cboMes" id="cboMes">
                                        <option>Mes</option>
                                        <c:forEach var="x" begin="1" end="12" step="1">
                                            <option>${x}</option>
                                        </c:forEach>
                                    </select> <select name="cboAnio" id="cboAnio">
                                        <option>A&ntilde;o</option>
                                        <c:forEach var="x" begin="2012" end="2013" step="1">
                                            <option>${x}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <div style="width: 335px;" align="center">
                                    <input type="submit" name="btnConsultar" id="button1"
                                           value="Consultar" />
                                </div>
                            </td>
                        </tr>
                    </table>

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
                                Collection<TaxyServicioEntity> servicios = (ArrayList<TaxyServicioEntity>) request.getAttribute("SERVICIOS");

                                if (servicios != null) {
                                    for (TaxyServicioEntity servicio : servicios) {
                            %>
                            <td> <%= servicio.getCodServicio()%> </td>
                            <td> <%= servicio.getDesRutaIni()%> </td>
                            <td> <%= servicio.getDesRutaFin()%> </td>
                            <td> <%= servicio.getCostoRuta()%> </td>
                            <td> <%= servicio.getFecServicio()%> </td>
                            <td><a href="<%=request.getContextPath()%>/SeleccionarServicioServlet?codServ=<%=servicio.getCodServicio()%>">Reservar</a>

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
