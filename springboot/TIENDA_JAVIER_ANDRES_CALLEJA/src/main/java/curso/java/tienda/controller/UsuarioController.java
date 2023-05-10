package curso.java.tienda.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import curso.java.tienda.model.Pedido;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.PedidoService;
import curso.java.tienda.service.ProductoService;
import curso.java.tienda.service.UsuarioService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class UsuarioController {

	@Autowired
	private UsuarioService userService;
	
	@Autowired
	private PedidoService pedService;
	
	@Autowired
	private ProductoService prodService;
	
	@GetMapping("")
	public String goLogin() {
		return "index";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@RequestParam String nombre, @RequestParam String password, HttpServletResponse response, HttpSession sesion, Model model) {
		
		Usuario usuario = userService.getByNombre(nombre);
		if(usuario != null) {
			sesion.setAttribute("usuario", usuario);
			
			List<Pedido> pedidos = pedService.getByLast();
			Long cantPed = pedService.count();
			Long cantProd = prodService.count();
			
			model.addAttribute("pedidos", pedidos);
			model.addAttribute("cantPedidos", cantPed);
			model.addAttribute("cantProd", cantProd);
			
			return "admin";
//			try {
//				response.sendRedirect("/admin");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} else {
			model.addAttribute("error", "Las credenciales son incorrectas.");
			return "index";
		}
		
		
	}
	
	
}