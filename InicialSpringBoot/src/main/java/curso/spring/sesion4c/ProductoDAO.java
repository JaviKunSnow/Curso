package curso.spring.sesion4c;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class ProductoDAO {

	private ArrayList<Producto> listado = cargarListado();
	
	private ArrayList<Producto> cargarListado() {
		ArrayList<Producto> listado = new ArrayList<Producto>();
		listado.add(new Producto(1, "peras", 2.3));
		listado.add(new Producto(2, "manzanas", 5.6));
		return listado;
	}
	
	public ArrayList<Producto> getListado() {
		return listado;
	}
	
	public void addProducto(Producto u) {
		int id = listado.size() + 1;
		u.setId(id);
		listado.add(u);
	}
	
	public void delProducto(int id) {
		int tam = listado.size();
		for(int i=0; i<tam; i++) {
			Producto u = listado.get(i);
			if(u.getId() == id) {
				listado.remove(u);
				tam = listado.size(); 
			}
		}
	}
	
	public Producto getProducto(int id) {
		for(Producto u : listado) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
}
