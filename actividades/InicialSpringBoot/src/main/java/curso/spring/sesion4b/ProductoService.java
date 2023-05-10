package curso.spring.sesion4b;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

public class ProductoService {

//	private ArrayList<Producto> listado = cargarListado();
//	
//	private ArrayList<Producto> cargarListado() {
//		ArrayList<Producto> listado = new ArrayList<Producto>();
//		listado.add(new Producto(1, "peras", 2.3));
//		listado.add(new Producto(2, "manzanas", 5.6));
//		return listado;
//	}
	
	private ProductoDAO pdao = new ProductoDAO();
	
	public ArrayList<Producto> getListado() {
		return pdao.getListado();
	}
	
	public void addProducto(Producto u) {
		pdao.addProducto(u);
	}
	
	public void delProducto(int id) {
		pdao.delProducto(id);
	}
	
	public Producto getProducto(int id) {
		return pdao.getProducto(id);
	}


}
