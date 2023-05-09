package curso.spring.sesion1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sesion1")
public class PruebasController {

	@GetMapping("")
	public String saludar() {
		//TODO Cargar productos del catálogo
		return "index";
	}
	
	@GetMapping("/saludo1")
	public String saludar1(Model model) {
		model.addAttribute("nombre", "Pepe");
		model.addAttribute("html", "<h1>cabecera</h1>");
		return "saludo1";
	}
	
	@GetMapping("/saludo2")
	public String saludar2(Model model) {
		Usuario user = new Usuario("Pepe");
		model.addAttribute("usuario", user);
		return "saludo2";
	}
	
	@GetMapping("/saludo3")
	public String saludar3(Model model) {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(new Usuario("Pepe"));
		listaUsuarios.add(new Usuario("Juan"));
		listaUsuarios.add(new Usuario("Jacinta"));
		
		model.addAttribute("list", listaUsuarios);
		return "saludo3";
	}

	@GetMapping("/saludo4")
	public String saludar4(@RequestParam("n") String nombre) {
		System.out.println(nombre);
		
		return "index";
	}
	
	@GetMapping("/saludo5")
	public String saludar5(@RequestParam(name="n", required=false, defaultValue="Fulanito") String nombre) {
		System.out.println(nombre);
		
		return "index";
	}

	
}
