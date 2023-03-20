package sesion4;

import java.util.*;

public class Mensaje {

	private Persona origen;
	private Persona destino;
	private String mensaje;
	private String fecha;
	
	public Mensaje(Persona origen, Persona destino, String mensaje, String fecha) {
		this.origen = origen;
		this.destino = destino;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}

	public Persona getOrigen() {
		return origen;
	}

	public void setOrigen(Persona origen) {
		this.origen = origen;
	}

	public Persona getDestino() {
		return destino;
	}

	public void setDestino(Persona destino) {
		this.destino = destino;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
