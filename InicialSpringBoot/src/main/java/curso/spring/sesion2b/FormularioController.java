package curso.spring.sesion2b;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import curso.spring.sesion2.Usuario;

@Controller
@RequestMapping("/sesion2b")
public class FormularioController {

//	@GetMapping("")
//	public String form() {
//		return "formulario";
//	}
//	
//	@PostMapping("/summit")
//	public String login4(@RequestParam String name, @RequestParam(required=false, defaultValue="1234") String pass) {
//		System.out.println("** POST: @RequestParam");
//		Usuario user = new Usuario(name, pass);
//		//TODO: almacenar/comprobar en BD
//		System.out.println("Usuario: " + name);
//		System.out.println("Contraseña: " + pass);
//		return "index";
//	}
	
	/************************************/
	
	@GetMapping("")
	public String form(Model model) {
		System.out.println("** GET: voy al formulario");
		Usuario user = new Usuario();
		model.addAttribute("usuario", user);
		return "form";
	}
	
	@PostMapping("/submit")
	public String login(@ModelAttribute Usuario usuario) {
		System.out.println("** POST: vengo del formulario");
		//TODO: almacenar/comprobar en BD
		System.out.println("Usuario: " + usuario.getName());
		System.out.println("Contraseña: " + usuario.getPass());
		return "index";
	}
}
