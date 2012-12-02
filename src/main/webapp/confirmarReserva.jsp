<%-- 
    Document   : ConfirmarReserva
    Created on : 30/11/2012, 06:58:15 AM
    Author     : Ana
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html><!-- :html lang="true">-->
    <head>
        <title>Confirmar Reserva</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <!--<script src="js/default.js" language="javascript" type="text/javascript"></script>-->
    </head>

    <body class="iframe">

        <!--<div class="page-out">
            <div class="page-in">
                <div class="page">
                    <div class="main">
                    </div>
                </div>
            </div>
        </div>       -->
<!-- <div class="content-top"></div>-->
<!-- <div class="content">-->
     <div id="form-login">
        <div class="presentation">
            <% String cadena = (String)request.getAttribute("RESERVA"); %>
            <h1 class="title"> <%=cadena %></h1>
            <div id="login-comment">
                <div id="conforme-img"></div>
            </div>
        </div>
    </div> 
     
                 
    </body>
</html><!-- :html>  -->
