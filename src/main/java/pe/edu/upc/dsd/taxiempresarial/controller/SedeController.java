package pe.edu.upc.dsd.taxiempresarial.controller;

import java.util.Collection;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Sede;
import pe.edu.upc.dsd.taxiempresarial.dao.SedeDao;


public class SedeController {

	public Collection<Sede> buscarSedePorCodigo(String cod)
			throws DaoException {

		SedeDao sedeDao = new SedeDao();
		return sedeDao.buscarSedePorCodigo(cod);
	}

	public Collection<Sede> listarSedes()
			throws DaoException {

		SedeDao sedeDao = new SedeDao();
		return sedeDao.listarSedes();
	}
	
}

