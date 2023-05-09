package curso.spring.sesion5;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService5 {

	//@Autowired
	//private ProductoDAO4 pdao; // = new ProductoDAO();
	
	@Autowired
	private ProductoRepository prepo;
	
	@PostConstruct
	public void cargarDatos() {
		prepo.save(new Producto(1, "peras", 2.3));
		prepo.save(new Producto(2, "manzanas", 5.6));
	}
		
	public List<Producto> getListado() {
		return prepo.findAll();
	}
	
	public void addProducto(Producto u) {
		prepo.save(u);
	}
	
	public void delProducto(int id) {
		Producto p = getProducto(id);
		prepo.delete(p);
	}
	
	public Producto getProducto(int id) {
		//prepo.buscarFiltro("");
		return prepo.findById(id);
	}


}
