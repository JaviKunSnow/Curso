//package service.usuario;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//
//import model.VO.ProductVO;
//import repository.ProductRepository;
//
//@Service
//public class ProductService {
//
//	@Autowired
//	private ProductRepository productRepository;
//
//	public ProductService() {
//		System.out.println("llamamos al constructor del servicio de usuario");
//	}
//
//	public List<ProductVO> obtenerLista() {
//		// TODO Auto-generated method stub
//		return productRepository.findAll();
//	}
//	
//	public Optional<ProductVO> buscarPorId(Long id) {
//		// TODO Auto-generated method stub
//		return productRepository.findById(id);
//	}
//
//	public void guardarUsuario(ProductVO producto) {
//
//		productRepository.save(producto);
//
//	}
//
//	public void actualizarUsuario(ProductVO producto) {
//		// TODO Auto-generated method stub
//		// HARIAMOS UN METODO CON NUESTRO CODIGO
//
//	}
//
//	public void borrarUsuario(ProductVO producto) {
//		productRepository.delete(producto);
//
//	}
//
//	public void borrarUsuarioPorId(Long id) {
//		productRepository.deleteById(id);
//
//	}
//
//	public void cargarDatos(List<ProductVO> lista, Model model, HttpServletRequest request) {
//		lista = lista.subList(0, 24);
//
//		model.addAttribute("catalogo", lista);
//		request.setAttribute("catalogo", lista);
//
//	}
//
//}
