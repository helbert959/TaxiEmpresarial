<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@page contentType="text/html" pageEncoding="windows-1252"%>

<%@include file="validarSesion.jsp"%>
<html>

<head>
<title>Taxi Empresarial</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page-out">
		<div class="page-in">
			<div class="page">
				<div class="main">
					<div class="header">
						<%@include file="cabecera.jsp"%>
						<div class="header-top">
							<h1>
								Taxi <span>Empresarial</span>
							</h1>
						</div>

						<div class="header-bottom">
							<h2>
								Viaje comodo y seguro<br> Taxi Empresarial
							</h2>
						</div>

						<div class="topmenu">
							<ul>
								<li
									style="background: transparent none repeat scroll 0% 50%; -moz-background-clip: initial; -moz-background-origin: initial; -moz-background-inline-policy: initial; padding-left: 0px;">
									<a href="home.jsp" target="content-content"><span>Home</span></a>
								</li>
								<li><a href="consultarServicioTaxi.jsp"
									target="content-content"><span>Reserva de Taxi</span></a></li>
								<!--<a href="Sede1.do?accion=listar" target="content-content">-->
								<li><a href="<%=request.getContextPath() %>/ConsultarReservaServlet"
									target="content-content"><span>Consulta de Reservas</span></a>
								</li>
								<!--<li><a href="consultadisponibilidad?opcion=0" target="content-content"><span>Eliminar Reserva</span></a></li>-->
								<!--<li><a href="logServicio.do" target="content-content"><span>Confirma Servicio </span></a></li>
  <li><a href="#"><span>Reportes</span></a></li>-->
								<li><a href="#"><span>Contáctanos</span></a></li>
								<li><a href="calificarSericioTaxi.jsp"><span>Calificar Servicios</span></a></li>
							</ul>
						</div>
					</div>
					<div class="content-top"></div>
					<div class="content">
						<div class="content-left">
							<IFRAME src="home.jsp" name="content-content" src="#" width="600"
								height="600" scrolling="auto" frameborder="0" scrolling="no">
							</IFRAME>
						</div>

						<div class="content-right">
							<div class="mainmenu">
								<h2 class="sidebar1">Menu Principal</h2>
								<ul>
									<li><a href="consultarServicioTaxi.jsp"
										target="content-content">Reserva de Taxis</a></li>
									<li><a href="ConsultarReservas.jsp"
										target="content-content">Consulta de Reservas</a></li>
									<!--<li><a href="consultadisponibilidad?opcion=0" target="content-content"><span>Eliminar Reservas</span></a></li>-->
									<!--<li><a href="ConfirmaServicio.jsp" target="content-content">Confirma Servicio </a></li>-->
								</ul>
							</div>

							<div class="mainmenu">
								<h2 class="sidebar-planos">Planos</h2>
								<ul>
									<li><strong> Plano de Lima</strong> <a target="_blank"
										href="http://www.guiacalles.com/calles/newcalles.htm?ID=2130">Click
											aqui</a><br /></li>
									<li><strong> Plano de distancias </strong><a
										target="_blank"
										href="http://elbuscapersonas.com.pe/distancias.htm">Click
											aqui</a>.<br /></li>
									<li><strong> Plano de playas</strong> <a target="_blank"
										href="http://www.playasperu.com/playas/lima/limasur2.htm">Click
											aqui</a></li>
								</ul>
							</div>


							<div class="contact">
								<h2 class="sidebar2">Contact</h2>
								<div class="contact-detail">
									<p class="green">
										<strong>Mas a cerca del servicio.</strong>
									</p>
									<p>
										<strong>Direccion :</strong> Conde de Superunda 1300<br />
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.
									</p>
									<p>
										<strong>Correo :</strong>
										&nbsp;&nbsp;&nbsp;tsecure@tsecure.com.pe
									</p>
									<p>
										<strong>Telefono :</strong> &nbsp;&nbsp;&nbsp;4241059<br />
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;000-0000-0000
									</p>
								</div>
							</div>
						</div>
					</div>
					<div class="footer">
						<p>
							&copy; Diseñado por <a target="_blank"
								href="http://www.htmltemplates.net">UPC Templates</a><br />
						</p>
						<ul>
							<li style="border-left: medium none;"><a href="index.html"><span>Inicio</span></a></li>
							<li><a href="#"><span>Acerca de </span></a></li>
							<li><a href="#"><span>Sericios</span></a></li>
							<li><a href="#"><span>Contactar</span></a></li>
							<li><a href="#"><span>Recursos</span></a></li>
							<li style="padding-right: 0px;"><a href="#"><span>Accesos</span></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>