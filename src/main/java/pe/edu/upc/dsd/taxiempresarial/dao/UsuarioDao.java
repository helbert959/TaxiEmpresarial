package pe.edu.upc.dsd.taxiempresarial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils;
import pe.edu.upc.dsd.taxiempresarial.exception.LoginException;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;

public class UsuarioDao extends BaseDao{

	public void insertarUsuario(Usuario usuario) throws DaoException{
		String query = "INSERT INTO Tb_Usuario(cod_user, nombre_user, apePat_user, apeMat_user, " +
					                          "dni_user, cod_emp, nick_user, pw_user, rol, estado) " +
					   "VALUES (?,?,?,?,?,?,?,?,?,?)";

		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);
			
			stmt.setString(1, usuario.getCod_user());
			stmt.setString(2, usuario.getNombre_user());
			stmt.setString(3, usuario.getApePat_user());
			stmt.setString(4, usuario.getApeMat_user());
			stmt.setString(5, usuario.getDni_user());
			stmt.setString(6, usuario.getCod_emp());
			stmt.setString(7, usuario.getNick_user());
			stmt.setString(8, usuario.getPw_user());
			stmt.setString(9, usuario.getRol());
			stmt.setString(10, usuario.getEstado());
			
			int i = stmt.executeUpdate();
			
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DaoException(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}
	
	public Usuario obtenerUsuario(String dni) throws DaoException {
		//preferible manejarlo con store procedure
		String query = "SELECT cod_user, nombre_user, apePat_user, apeMat_user, " +
					          "dni_user, cod_emp, nick_user, pw_user, rol, estado " +
					   "WHERE dni_user = ?";
		Usuario usuario = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, dni);
			
			rs = (ResultSet) stmt.executeQuery();

			if (rs.next()) {
				usuario = new Usuario();
				
				usuario.setCod_user(rs.getString(1));
				usuario.setNombre_user(rs.getString(2));
				usuario.setApePat_user(rs.getString(3));
				usuario.setApeMat_user(rs.getString(4));
				usuario.setDni_user(rs.getString(5));
				usuario.setCod_emp(rs.getString(6));	
				usuario.setNick_user(rs.getString(7));
				usuario.setPw_user(rs.getString(8));
				usuario.setRol(rs.getString(9));
				usuario.setEstado(rs.getString(10));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DaoException(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return usuario;
	}
	
	public Usuario login(String nick, String pw) throws LoginException, DaoException {
		String query = "SELECT cod_user, nombre_user, apePat_user, apeMat_user, " +
		          	   		  "dni_user, cod_emp, nick_user, pw_user, rol, estado " +
		          	   "FROM Tb_Usuario " +
					   "WHERE nick_user = ? AND pw_user = ?";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuario usuario = null;
		
		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);
			
			stmt.setString(1, nick);
			stmt.setString(2, pw);
			
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				usuario = new Usuario();
				
				usuario.setCod_user(rs.getString(1));
				usuario.setNombre_user(rs.getString(2));
				usuario.setApePat_user(rs.getString(3));
				usuario.setApeMat_user(rs.getString(4));
				usuario.setDni_user(rs.getString(5));
				usuario.setCod_emp(rs.getString(6));	
				usuario.setNick_user(rs.getString(7));
				usuario.setPw_user(rs.getString(8));
				usuario.setRol(rs.getString(9));
				usuario.setEstado(rs.getString(10));
			} else {
				throw new LoginException("Usuario y/o contraseña incorrectos.");
			}
		} catch (SQLException e) {
			throw new DaoException(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return usuario;
	}
}
