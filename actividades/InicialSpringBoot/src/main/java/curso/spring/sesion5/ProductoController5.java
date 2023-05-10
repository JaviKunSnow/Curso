package curso.spring.sesion5;

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

import curso.spring.sesion5.Producto;

@Controller
@RequestMapping("/producto5")
public class ProductoController5 {

	@Autowired
	private ProductoService5 ps; // = new ProductoService5();
	
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
		return "redirect:/producto5";
	}

	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable Integer id) {
		Producto p = ps.getProducto(id); 
		if(p!=null){
			ps.delProducto(id);
		}
		return "redirect:/producto5";
	}


}
