package pe.edu.upc.dsd.taxiempresarial.controller;

import java.util.Collection;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.model.Empresa;
import pe.edu.upc.dsd.taxiempresarial.dao.EmpresaDao;


public class ServicioController {

	public Collection<Empresa> buscarEmpresaPorCodigo(String cod)
			throws DaoException {

		EmpresaDao empresaDao = new EmpresaDao();
		return empresaDao.buscarEmpresaPorCodigo(cod);
	}

	public Collection<Empresa> listarEmpresas()
			throws DaoException {

		EmpresaDao empresaDao = new EmpresaDao();
		return empresaDao.listarEmpresas();
	}
	
}

