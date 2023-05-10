package curso.spring.sesion2b;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import curso.spring.sesion2.Usuario;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private ArrayList<Usuario> listado = getListado();
			
	@GetMapping("")
	public String form(Model model) {
		//System.out.println("** GET: voy al formulario");
		Usuario user = new Usuario();
		model.addAttribute("usuario", user);
		return "sesion2/login";
	}
	
	@PostMapping("/summit")
	public String login(Model model, @ModelAttribute Usuario usuario) {
		
		//System.out.println("Usuario: " + usuario.getName());
		//System.out.println("Contraseña: " + usuario.getPass());
		if(comprobarLogin(usuario)) {
			model.addAttribute("usuario", usuario);
			return "bienvenida";
		}
		else {
			model.addAttribute("mensaje", "Las credenciales no son correctas");
			return "sesion2/login";
		}
	}
	
	private boolean comprobarLogin(Usuario usuario) {
		boolean encontrado = false;
		
		for(Usuario u : listado) {
			if(u.getName().equals(usuario.getName()) && u.getPass().equals(usuario.getPass())) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	private ArrayList<Usuario> getListado() {
		ArrayList<Usuario> listado = new ArrayList<Usuario>();
		listado.add(new Usuario("pepe", "1234"));
		listado.add(new Usuario("admin", "admin"));
		
		return listado;
	}
}
