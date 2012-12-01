<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@include file = "validarSesion.jsp" %>

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
										<option>Taxi Seguro</option>
										<option>Lima Taxi</option>
	                                </select>
	                            
	                            <td colspan="3">
	                            </td>
	                          </tr>
	                          <tr>
	                            <td>Origen: </td>
	                            <td colspan="3">
	                            	<select id="cboOrigen">
										<option>Aeropuerto Jorge Chavez</option>
										<option>Sucursal Miraflores</option>
									</select> </td>
	                            <td>Destino: </td>
	                            <td colspan="3">
	                            	<select id="cboDestino">
										<option>Aeropuerto Jorge Chavez</option>
										<option>Sucursal Miraflores</option>
									</select> </td>                            
	                          </tr>
	                          
	                        </table>
	                        <input type = "submit" name = "btnConsultar" id = "button1" value = "Consultar"  />                        
				            			
	                	</form>
					</div>                       
    </body>
</html>
