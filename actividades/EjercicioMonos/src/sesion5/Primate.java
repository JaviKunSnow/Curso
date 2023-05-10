package sesion5;

import java.util.*;

public class Primate {

	private String nombre;
	private ArrayList<Comida> almacen = new ArrayList<Comida>();
	
	public Primate(String nombre, ArrayList<Comida> almacen) {
		this.nombre = nombre;
		this.almacen = almacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Comida> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(ArrayList<Comida> almacen) {
		this.almacen = almacen;
	}
	
	public void recogerComida() {
		
	}
	
	public void guardarComida() {
		
	}
	
	public void comer() {
		
	}
	
	
}
