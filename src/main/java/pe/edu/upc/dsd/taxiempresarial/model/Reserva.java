package pe.edu.upc.dsd.taxiempresarial.model;

public class Reserva {
    private String cod_servicio;
    private String cod_user;
    private String partida;
    private String destino;
    private String fec_reserva;
    private String est_reserva;
    
	public String getCod_servicio() {
		return cod_servicio;
	}
	public void setCod_servicio(String cod_servicio) {
		this.cod_servicio = cod_servicio;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFec_reserva() {
		return fec_reserva;
	}
	public void setFec_reserva(String fec_reserva) {
		this.fec_reserva = fec_reserva;
	}
	public String getEst_reserva() {
		return est_reserva;
	}
	public void setEst_reserva(String est_reserva) {
		this.est_reserva = est_reserva;
	}
    
}

