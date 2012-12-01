package pe.edu.upc.dsd.taxiempresarial.model;

public class Reserva {
    private int cod_servicio;
    private int cod_user;
    private String fec_servicio;

    public int getCod_servicio() {
        return cod_servicio;
    }

    public void setCod_servicio(int cod_servicio) {
        this.cod_servicio = cod_servicio;
    }

    public int getCod_user() {
        return cod_user;
    }

    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }

    public String getFec_servicio() {
        return fec_servicio;
    }

    public void setFec_servicio(String fec_servicio) {
        this.fec_servicio = fec_servicio;
    }
}

