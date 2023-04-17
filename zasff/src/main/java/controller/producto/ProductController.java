package controller.producto;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.VO.ProductVO;
import service.usuario.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/getCatalogo")
	public String getCatalogo(Model model, HttpServletRequest request)
	{
		List<ProductVO> lista = productService.obtenerLista();
		
		productService.cargarDatos(lista, model, request);		
		
		return "tienda/catalogo";                                      
	}

}
