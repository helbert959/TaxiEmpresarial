<%@include file = "validarSesion.jsp" %>


<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@page import="pe.edu.upc.dsd.taxiempresarial.model.Servicio"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.controller.ServicioController"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.model.Sede"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.controller.SedeController"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.model.Empresa"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.controller.EmpresaController"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils "%>

<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*,java.sql.Statement" %>

<html> <!-- :html lang="true">  -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Realizar Reserva de Taxi - Taxi Empresarial</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="iframe">
            <div id="logo">
                
                   	<div>
                    	<form id = "form1" name = "form1" method = "post" action = "ConsultarServicioServlet">
	                        <table width="200" border="0">
	                          <tr>
	                            <td colspan="3">Seleccionar una Empresa: </td>
	                            
		                            <select id="cboEmpresa">
									<%
										EmpresaController empresaController = new EmpresaController();
										
					      				for(Empresa empresa : empresaController.listarEmpresas()){
					      					String cadena = empresa.getCod_emp() + " - " + empresa.getRaz_soc_emp();
					      			%>
					      					<option> <%= cadena %> </option>
					      			<%				
					      				}
					      			%>
	                                </select>
	                            
	                            <td colspan="3">
	                            </td>
	                          </tr>
	                          <tr>
	                            <td>Origen: </td>
	                            <td colspan="3">
	                            	<select id="cboOrigen">
									<%
										SedeController sedeOrigenController = new SedeController();
										
					      				for(Sede sede : sedeOrigenController.listarSedes()){
					      					String cadena = sede.getCod_distrito() + " - " + sede.getDesc_sede();
					      			%>
					      					<option> <%= cadena %> </option>
					      			<%				
					      				}
					      			%>
	                                </select> </td>
	                            <td>Destino: </td>
	                            <td colspan="3">
	                            	<select id="cboDestino">
									<%
										SedeController sedeDestinoController = new SedeController();
										
					      				for(Sede sede : sedeDestinoController.listarSedes()){
					      					String cadena = sede.getCod_distrito() + " - " + sede.getDesc_sede();
					      			%>
					      					<option> <%= cadena %> </option>
					      			<%				
					      				}
					      			%>
	                                </select> </td>                            
	                          </tr>
	                          
	                        </table>
	                        <input type = "submit" name = "btnConsultar" id = "button1" value = "Consultar"  />                        
				            			
	                	</form>
					</div>                       
    </body>
</html>
