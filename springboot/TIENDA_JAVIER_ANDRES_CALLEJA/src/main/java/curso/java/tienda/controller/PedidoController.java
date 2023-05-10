package curso.java.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import curso.java.tienda.model.Pedido;
import curso.java.tienda.service.PedidoService;
import curso.java.tienda.service.ProductoService;

@Controller
@RequestMapping("")
public class PedidoController {

	@Autowired
	private PedidoService pedService;
	
	@Autowired
	private ProductoService prodService;
	
	@GetMapping("/admin")
	public String goAdminPrincipal(Model model) {
		List<Pedido> pedidos = pedService.getByLast();
		Long cantPed = pedService.count();
		Long cantProd = prodService.count();
		
		model.addAttribute("pedidos", pedidos);
		model.addAttribute("cantPedidos", cantPed);
		model.addAttribute("cantProd", cantProd);
		
		return "admin";
	}
	
}
