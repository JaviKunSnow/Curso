package curso.spring.sesion3;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import curso.spring.sesion3.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private ArrayList<Usuario> listado = getListado(); //new ArrayList<Usuario>();
	
	@GetMapping("")
	public String listar(Model model) {
		//TODO Cargar usuarios de BD
		//ArrayList<Usuario> listado = getListado();
		model.addAttribute("lista", listado);
		return "usuario/list";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		Usuario u = new Usuario();
		model.addAttribute("usuario", u);
		//TODO Ir al formulario de creación
		return "usuario/new";
	}
	
	@PostMapping("/crear/summit")
	public String crearSummit(@ModelAttribute Usuario usuario, Model model) {
		//TODO Crear usuario en BD
		addUsuario(usuario);
		
//		model.addAttribute("lista", listado);
//		return "usuario/list";
		return "redirect:/usuario"; //TODO: hablar de redirect
	}

//	@GetMapping("/borrar/{id}")
//	public String borrar(@PathVariable Integer id) {
//		//TODO Borrar usuario y vuelvo al listado
//		delUsuario(id);
//		//return "usuario/list";
//		return "redirect:/usuario";
//	}
	
	@GetMapping("/borrar")
	public String borrar(@RequestParam Integer id) {
		//TODO Borrar usuario y vuelvo al listado
		delUsuario(id);
		//return "usuario/list";
		return "redirect:/usuario";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Integer id, Model model) {
		//System.out.println(id);
		Usuario u = getUsuario(id);
		model.addAttribute("usuario", u);
		//TODO Ir al formulario de edicion
		return "usuario/edit";
	}
	
	@PostMapping("/editar/summit")
	public String editarSummit(@ModelAttribute Usuario usuario) {
		//TODO Editar usuario en BD
		editUsuario(usuario);
		//return "usuario/list";
		return "redirect:/usuario";
	}
	
	//SERVICIO + DAO en Memoria
	private void addUsuario(Usuario u) {
		int id = listado.size() + 1;
		u.setId(id);
		listado.add(u);
	}
	
	private void delUsuario(int id) {
		//listado.remove(id-1);
		int tam = listado.size();
		for(int i=0; i<tam; i++) {
			Usuario u = listado.get(i);
			//for(Usuario u : listado) {
			if(u.getId() == id) {
				listado.remove(u); //problema con el tamaño de la lista al recorrerla
				tam = listado.size(); 
				//break;
			}
		}
	}
	
	private void delUsuario2(int id) {
		//listado.remove(id-1);
		for(Usuario u : listado) {
			if(u.getId() == id) {
				listado.remove(u); //problema con el tamaño de la lista al recorrerla
				break;
			}
		}
	}
	
	private Usuario getUsuario(int id) {
		for(Usuario u : listado) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
	private void editUsuario(Usuario usuario) {
		for(Usuario u : listado) {
			if(u.getId() == usuario.getId()) {
				u.setName(usuario.getName());
				if(!usuario.getPass().equals("")) {
					u.setPass(usuario.getPass());
				}
			}
		}
	}

	private ArrayList<Usuario> getListado() {
		ArrayList<Usuario> listado = new ArrayList<Usuario>();
		listado.add(new Usuario(1, "pepe", "1234"));
		listado.add(new Usuario(2, "admin", "admin"));
		
		return listado;
	}
}
