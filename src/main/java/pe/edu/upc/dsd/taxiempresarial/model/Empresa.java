package pe.edu.upc.dsd.taxiempresarial.model;

public class Empresa {

    private int cod_emp;
    private String raz_soc_emp;
    private String ruc_emp;
    private String telefono;
    private String direccion;
    private int tipo;
    private String estado;

    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getRaz_soc_emp() {
        return raz_soc_emp;
    }

    public void setRaz_soc_emp(String raz_soc_emp) {
        this.raz_soc_emp = raz_soc_emp;
    }

    public String getRuc_emp() {
        return ruc_emp;
    }

    public void setRuc_emp(String ruc_emp) {
        this.ruc_emp = ruc_emp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
