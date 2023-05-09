package curso.spring.sesion4d;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService4 {

	@Autowired
	private ProductoDAO pdao; // = new ProductoDAO();
	
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
