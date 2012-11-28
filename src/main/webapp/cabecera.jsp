<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>	
	<body>
		<div>
			<form id="formLog" name="formLog" method="post" action="LogoutServlet">
				<div align="right"  class="main">
					<font color="#CCCCCC"> <h4>Bienvenido al sistema: </h4><h3>${sessionScope.USUARIO_ACTUAL.nombre_user } ${sessionScope.USUARIO_ACTUAL.apePat_user } ${sessionScope.USUARIO_ACTUAL.apeMat_user }</h3> </font>
				</div>
				<div align="right">
					<input class="cerrarSesion" type="submit" name= "btnCerrarSesion" id="btnCerrarSesion" value="Cerrar Sesión" />
				</div>		
			</form>
		</div>
	</body>
</html>