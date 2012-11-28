package pe.edu.upc.dsd.taxiempresarial.test;

import org.junit.Assert;
import org.junit.Test;

import pe.edu.upc.dsd.taxiempresarial.dao.UsuarioDao;
import pe.edu.upc.dsd.taxiempresarial.exception.DaoException;
import pe.edu.upc.dsd.taxiempresarial.exception.LoginException;
import pe.edu.upc.dsd.taxiempresarial.model.Usuario;

public class UsuarioDaoTest {

    @Test
    public void elUsuarioConUsernameAdminTieneNombreAdministrador() throws LoginException, DaoException{
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = usuarioDao.login("max", "max");
        Assert.assertEquals("Carlos Alberto", usuario.getNombre_user());
    }

}
