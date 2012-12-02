<%@page
	import="pe.edu.upc.dsd.taxiempresarial.controller.UsuarioController"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@include file="validarSesion.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1252">
<link href="css/style.css" rel="stylesheet" type="text/css" />
<title>Registro de Reserva de Taxi</title>
</head>
<body class="iframe">

	<div>
		<div>
			<form id="form1" name="form1" method="post"
				action="RegistrarServicioServlet.java">

				<table width="800" border="0">
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">
							<p FACE="arial" SIZE=16 align="justify">
								<strong>Registro del Servicio</strong>
							</p>
						</td>

					</tr>
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">&nbsp</td>
					</tr>
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">
							<p align="justify">
								<strong>Datos del Usuario</strong>
							</p>
						</td>

					</tr>
					<tr>
						<td FACE="arial" SIZE=14 width="300">Nombre de Usuario:</td>

						<td FACE="arial" SIZE=14 width="500">
							${sessionScope.USUARIO_ACTUAL.nombre_user }
							${sessionScope.USUARIO_ACTUAL.apePat_user }
							${sessionScope.USUARIO_ACTUAL.apeMat_user }</td>

					</tr>

					<tr>
						<td FACE="arial" SIZE=16 colspan="3">&nbsp</td>
					</tr>
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">
							<p align="justify">
								<strong>Datos del Servicio</strong>
							</p>
						</td>

					</tr>

					<tr>
						<td FACE="arial" SIZE=14 width="300">Código de Reserva:</td>
						<td FACE="arial" SIZE=14 width="500">2</td>
					</tr>

					<tr>
						<td FACE="arial" SIZE=14 width="300">Fecha de Servicio :</td>
						<td FACE="arial" SIZE=14 width="500">2012-11-30</td>
					</tr>
					<tr>
						<td FACE="arial" SIZE=14 width="300">Origen:</td>
						<td FACE="arial" SIZE=14 width="500">Lima</td>
					</tr>

					<tr>
						<td FACE="arial" SIZE=14 width="300">Destino:</td>
						<td FACE="arial" SIZE=14 width="500">Cercado</td>
					</tr>

				</table>

				<table width="800" border="0">
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">&nbsp</td>
					</tr>
					<tr>
						<td FACE="arial" SIZE=16 colspan="3">&nbsp</td>
					</tr>
				</table>

				<input class="uiButtonConfirm" align="center" type="submit"
					name="btnConsultar" id="button1" value="Registrar"
					action="RegistroReservaTaxi.jsp" />

			</form>
		</div>
</body>
</html>
