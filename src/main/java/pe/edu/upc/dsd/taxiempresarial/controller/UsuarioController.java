package pe.edu.upc.dsd.taxiempresarial.controller;

import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.exception.LoginException;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;
import pe.edu.upc.dsd.taxiempresarial.dao.UsuarioDao;

public class UsuarioController {

	public void registrarUsuario(String cod_user, String nombre_user, String apePat_user,
								 String apeMat_user, String dni_user, String cod_emp,
								 String nick_user, String pw_user, String rol, String estado)	
								throws DaoException {
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		Usuario usuario = new Usuario();
		
		usuario.setCod_user(cod_user);
		usuario.setNombre_user(nombre_user);
		usuario.setApePat_user(apePat_user);
		usuario.setApeMat_user(apeMat_user);		
		usuario.setDni_user(dni_user);
		usuario.setCod_emp(cod_emp);
		usuario.setNick_user(nick_user);
		usuario.setPw_user(pw_user);
		usuario.setRol(rol);
		usuario.setEstado(estado);

		usuarioDao.insertarUsuario(usuario);		
	}
	
	public Usuario buscarPorNumeroDocumento(String dni) throws DaoException {
		
		UsuarioDao dao =  new UsuarioDao();
		return dao.obtenerUsuario(dni);		
	}
	
	public Usuario login(String nick, String pw) throws LoginException, DaoException {
		
		UsuarioDao dao = new UsuarioDao();	
		return dao.login(nick, pw);				
	}
	
}
