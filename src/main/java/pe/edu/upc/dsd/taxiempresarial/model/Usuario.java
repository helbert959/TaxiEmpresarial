package pe.edu.upc.dsd.taxiempresarial.model;

public class Usuario {
    private String cod_user;
    private String nombre_user;
    private String apePat_user;
    private String apeMat_user;
    private String dni_user;
    private String cod_emp;
    private String nick_user;
    private String pw_user;
    private String rol;
    private String estado;
    
    public Usuario () {    	
    }

	public String getCod_user() {
		return cod_user;
	}

	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}

	public String getNombre_user() {
		return nombre_user;
	}

	public void setNombre_user(String nombre_user) {
		this.nombre_user = nombre_user;
	}

	public String getApePat_user() {
		return apePat_user;
	}

	public void setApePat_user(String apePat_user) {
		this.apePat_user = apePat_user;
	}

	public String getApeMat_user() {
		return apeMat_user;
	}

	public void setApeMat_user(String apeMat_user) {
		this.apeMat_user = apeMat_user;
	}

	public String getDni_user() {
		return dni_user;
	}

	public void setDni_user(String dni_user) {
		this.dni_user = dni_user;
	}

	public String getCod_emp() {
		return cod_emp;
	}

	public void setCod_emp(String cod_emp) {
		this.cod_emp = cod_emp;
	}

	public String getNick_user() {
		return nick_user;
	}

	public void setNick_user(String nick_user) {
		this.nick_user = nick_user;
	}

	public String getPw_user() {
		return pw_user;
	}

	public void setPw_user(String pw_user) {
		this.pw_user = pw_user;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}    
    
}
