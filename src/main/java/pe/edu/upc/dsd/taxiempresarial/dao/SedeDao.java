package pe.edu.upc.dsd.taxiempresarial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Sede;

public class SedeDao extends BaseDao{

	public Collection<Sede> buscarSedePorCodigo(String cod) throws DaoException {

		String query = "SELECT S.cod_sede, S.desc_sede, D.cod_distrito " +
					   "FROM Tb_Sede S INNER JOIN Tb_Distrito D ON S.cod_distrito = D.cod_distrito " +
					   "WHERE S.cod_sede = ?";

		Collection<Sede> lista = new ArrayList<Sede>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + cod + "%");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Sede sede = new Sede();

				sede.setCod_sede(rs.getString(1));
				sede.setDesc_sede(rs.getString(2));
				sede.setCod_distrito(rs.getString(3));				

				lista.add(sede);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DaoException(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}

	public Collection<Sede> listarSedes() throws DaoException {

		String query = "SELECT S.cod_sede, S.desc_sede, D.cod_distrito " +
				   	   "FROM Tb_Sede S INNER JOIN Tb_Distrito D ON S.cod_distrito = D.cod_distrito ";				   	   

		Collection<Sede> lista = new ArrayList<Sede>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);

			rs = stmt.executeQuery();

			while (rs.next()) {
				Sede sede = new Sede();

				sede.setCod_sede(rs.getString(1));
				sede.setDesc_sede(rs.getString(2));
				sede.setCod_distrito(rs.getString(3));				

				lista.add(sede);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DaoException(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
}
