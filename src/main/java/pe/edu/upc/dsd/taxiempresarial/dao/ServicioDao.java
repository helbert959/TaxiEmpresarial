package pe.edu.upc.dsd.taxiempresarial.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import pe.edu.upc.dsd.taxiempresarial.useful.JdbcUtils;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Servicio;

public class ServicioDao extends BaseDao{

	public Collection<Servicio> listarServicios() throws DaoException {

		String query = "SELECT cod_servicio,cod_user,fec_servicio,nom_chofer,placa_auto,modelo_auto,color_auto,estado " +
					   "FROM Tb_Servicio " +
					   "WHERE cod_emp = ?";
		
		Collection<Servicio> lista = new ArrayList<Servicio>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			con = JdbcUtils.getConnection();
			stmt = con.prepareStatement(query);

			rs = stmt.executeQuery();

			while (rs.next()) {
				Servicio Servicio = new Servicio();

				/*
				 * */
				
				lista.add(Servicio);
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
