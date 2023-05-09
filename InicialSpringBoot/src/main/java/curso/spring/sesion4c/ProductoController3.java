package curso.spring.sesion4c;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import curso.spring.sesion4c.Producto;

@Controller
@RequestMapping("/producto3")
public class ProductoController3 {

	@Autowired
	private ProductoService ps; // = new ProductoService();
	
	@GetMapping("")
	public String listar(Model model) {
		model.addAttribute("lista", ps.getListado());
		return "producto/list";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		Producto u = new Producto();
		model.addAttribute("Producto", u);
		return "producto/new";
	}
	
	@PostMapping("/crear/summit")
	public String crearSummit(@ModelAttribute Producto Producto) {
		ps.addProducto(Producto);
		return "redirect:/producto3";
	}

	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable Integer id) {
		ps.delProducto(id);
		return "redirect:/producto3";
	}


}
