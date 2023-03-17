package sesion5;

import java.util.ArrayList;

public class Primate extends Recinto{

	private String nombre;
	private ArrayList<Comida> almacenPropio = new ArrayList<Comida>();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Comida> getAlmacenPropio() {
		return almacenPropio;
	}

	public void setAlmacenPropio(ArrayList<Comida> almacenPropio) {
		this.almacenPropio = almacenPropio;
	}

	public Primate(String nombre, ArrayList<Comida> almacenPropio) {
		this.nombre = nombre;
		this.almacenPropio = almacenPropio;
	}
	
	
	

}
