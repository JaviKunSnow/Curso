package sesion4;

import java.util.*;

public class Buzon implements Enviable {

	private HashMap <String, Mensaje> BuzonEntrada;
	private HashMap <String, Mensaje> BuzonSalida;
	
	public Buzon(HashMap<String, Mensaje> buzonEntrada, HashMap<String, Mensaje> buzonSalida) {
		BuzonEntrada = buzonEntrada;
		BuzonSalida = buzonSalida;
	}

	public HashMap<String, Mensaje> getBuzonEntrada() {
		return BuzonEntrada;
	}

	public void setBuzonEntrada(String dato, Mensaje mensaje) {
		BuzonEntrada.put(dato, mensaje);
	}

	public HashMap<String, Mensaje> getBuzonSalida() {
		return BuzonSalida;
	}

	public void setBuzonSalida(String dato, Mensaje mensaje) {
		BuzonSalida.put(dato, mensaje);
	}

	public void llamaEnviar(Buzon origen, Buzon destino, String dato, Mensaje mensaje) {
		enviar(this, destino, dato, mensaje);
	}

	
	
	
}
