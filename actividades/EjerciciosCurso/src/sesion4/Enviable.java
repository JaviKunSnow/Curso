package sesion4;

public interface Enviable {

	default void enviar(Buzon origen, Buzon destino, String dato, Mensaje mensaje) {
		destino.setBuzonEntrada(dato, mensaje);
		origen.setBuzonSalida(dato, mensaje);
	}
	
}
