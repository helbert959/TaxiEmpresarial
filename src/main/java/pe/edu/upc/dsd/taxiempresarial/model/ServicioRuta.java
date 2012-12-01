package pe.edu.upc.dsd.taxiempresarial.model;

public class ServicioRuta {
	
	private int cod_servicio;
	private String des_ruta_ini;
	private String des_ruta_fin;
	private Double costo_ruta;
	private String fec_servicio;
	
	public int getCod_servicio() {
		return cod_servicio;
	}
	public void setCod_servicio(int cod_servicio) {
		this.cod_servicio = cod_servicio;
	}
	public String getDes_ruta_ini() {
		return des_ruta_ini;
	}
	public void setDes_ruta_ini(String des_ruta_ini) {
		this.des_ruta_ini = des_ruta_ini;
	}
	public String getDes_ruta_fin() {
		return des_ruta_fin;
	}
	public void setDes_ruta_fin(String des_ruta_fin) {
		this.des_ruta_fin = des_ruta_fin;
	}
	public Double getCosto_ruta() {
		return costo_ruta;
	}
	public void setCosto_ruta(Double costo_ruta) {
		this.costo_ruta = costo_ruta;
	}
	public String getFec_servicio() {
		return fec_servicio;
	}
	public void setFec_servicio(String fec_servicio) {
		this.fec_servicio = fec_servicio;
	}
}
