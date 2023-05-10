package curso.spring.sesion2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sesion2")
public class PruebasController2 {

	@GetMapping("")
	public String saludar() {
		//TODO Cargar productos del catálogo
		return "index";
	}
	
	@GetMapping("/saludo4")
	public String saludar4(@RequestParam("n") String nombre) { //required=true
		System.out.println(nombre);
		return "index";
	}
	
	@GetMapping("/saludo5")
	public String saludar5(@RequestParam(required=false) String nombre) {
		System.out.println(nombre);
		return "index";
	}
	
	@GetMapping("/saludo6")
	public String saludar6(@RequestParam(name="n", required=false) String nombre) {
		System.out.println(nombre);
		return "index";
	}
	
	@GetMapping("/saludo7")
	public String saludar7(@RequestParam(name="n", required=false, defaultValue="Fulanito") String nombre) {
		System.out.println(nombre);
		return "index";
	}
	/*
	@GetMapping("/login/{n}") // /edit/1 // /edit?id=1
	public String metodo(@PathVariable("n") String name) {
		System.out.println("Usuario: " + name);
		return "index";
	}
*/
	@GetMapping("/form")
	public String form() {
		return "login";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String name, @RequestParam(required=false, defaultValue="1234") String pass) {
		//String name  = request.getParameter("name");
		System.out.println("** GET: @RequestParam");
		System.out.println("Usuario: " + name);
		System.out.println("Contraseña: " + pass);
		return "index";
	}

	@GetMapping("/login/{n}")
	public String login2(@PathVariable("n") String name, @RequestParam(name="p", required=false, defaultValue="1234") String pass) {
		System.out.println("** GET: @PathVariable/@RequestParam");
		System.out.println("Usuario: " + name);
		System.out.println("Contraseña: " + pass);
		return "index";
	}
	/*
	@GetMapping("/login/{n}/{p}")
	public String login3(@PathVariable("n") String name, @PathVariable("p") String pass) {
		System.out.println("** GET: @PathVariable");
		System.out.println("Usuario: " + name);
		System.out.println("Contraseña: " + pass);
		return "index";
	}
		
	@PostMapping("/login")
	public String login4(@RequestParam("n") String name, @RequestParam(name="p", required=false, defaultValue="1234") String pass) {
		System.out.println("** POST: @RequestParam");
		System.out.println("Usuario: " + name);
		System.out.println("Contraseña: " + pass);
		return "index";
	}

	@PostMapping("/login/{n}/{p}")
	public String login5(@PathVariable("n") String name, @PathVariable("p") String pass) {
		System.out.println("** POST: @PathVariable");
		System.out.println("Usuario: " + name);
		System.out.println("Contraseña: " + pass);
		return "index";
	}
	*/
}
