<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="validarSesion.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*, pe.edu.upc.dsd.taxiempresarial.model.ServicioRuta"%>

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
			<form id="form1" name="form1" method="post" action="ConsultarServicioServlet">
				<table border="0">					
					<tr>
						<td>
							<div style="width: 150px;" align="right">Empresa:
							</div>
						</td>
						<td>
							<div align="left">
								<select id="cboEmpresa" name="cboEmpresa">
									<option>1</option>
									<option>2</option>
								</select>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div style="width: 150px;" align="right">Fecha reserva:
							</div>
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
								<input type="submit" name="btnConsultar" id="button1" value="Consultar"/>
							</div>
						</td>
					</tr>
				</table>
				
				<table width="589" height="89" border="1">
	<tr>
		<td>C&oacute;digo</td>
		<td>Ruc</td>
		<td>Raz&oacute;n Social</td>
		<td>Fecha Inicio Operaciones</td>
		<td>Cantidad Empleados</td>		
	</tr>
	<tr><%
			ArrayList lista = (ArrayList)request.getAttribute("SERVICIOS");
			/*Collection<Object> listaServicios = (ArrayList<Oject>)request.getAttribute("SERVICIOS");*/	
			
			if ( listaServicios != null ) { 
				for (ServicioRuta servicio : listaServicios) { 
			%>
					<td> <%= servicio.getCod_servicio() %> </td>
					<td> <%= servicio.getDes_ruta_ini() %> </td>
					<td> <%= servicio.getDes_ruta_fin() %> </td>
					<td> <%= servicio.getCosto_ruta() %> </td>
					<td> <%= servicio.getFec_servicio() %> </td>
									
	</tr>
			<%
			}
		}
		%>			
</table>
			</form>
		</div>
</body>
</html>
