<%@ page import = "pe.edu.upc.dsd.taxiempresarial.model.Usuario" %>

	<%
	Usuario usuarioActual = (Usuario)session.getAttribute("USUARIO_ACTUAL");

	if (usuarioActual == null){
		request.getRequestDispatcher("error.jsp").forward(request, response);
		return;
	}
	%>
