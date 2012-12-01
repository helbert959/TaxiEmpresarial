<%@page import="pe.edu.upc.dsd.taxiempresarial.model.Servicio"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.controller.ServicioController"%>
<%@page import="pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*,java.sql.Statement" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="iframe">
            Resultado de consulta
            
            <table width="589" height="89" border="1">
			<tr>
				<td>C&oacute;digo</td>
				<td>Ruc</td>
				<td>Raz&oacute;n Social</td>
				<td>Fecha Inicio Operaciones</td>
				<td>Cantidad Empleados</td>		
			</tr>
				<%
					Collection<Servicio> lista = (ArrayList<Servicio>)request.getAttribute("SERVICIOS");	
					
					if ( lista != null ) { 
						for (Servicio serv : lista) { 
					%>
							<td> <%= serv.getCod_Servicio() %> </td>
							<td> <%= serv.getNom_chofer() %> </td>
							<td> <%= serv.getPlaca_auto() %> </td>
							<td> <%= serv.getModelo_auto() %> </td>
							<td> <%= serv.getColor_auto() %> </td>				
			</tr>
					<%
					}
				}
				%>
			</table>
                
    </body>
</html>
