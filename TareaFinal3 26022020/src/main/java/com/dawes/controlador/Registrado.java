package com.dawes.controlador;

import java.util.Optional;

import javax.persistence.metamodel.SetAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dawes.modelo.ProveedoresVO;
import com.dawes.repository.ProveedorRepository;
@Controller
public class Registrado {
	
	@Autowired
	ProveedorRepository pr;
	
	@RequestMapping("/registrado/listar")
	public String listar(Model modelo) {
		System.out.println("listar");
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "registrado/listar";
	}
	
	@RequestMapping("/registrado/buscar")
	public String buscar(Model modelo) {
		modelo.addAttribute("proveedores", new ProveedoresVO() );		
		return "registrado/buscarForm";
	}
	
	@RequestMapping("/registrado/a")
	public String buscarId(@RequestParam int idproveedor,Model modelo) {
		Optional<ProveedoresVO> proveedor = pr.findByIdproveedor(idproveedor);
		if(proveedor.isPresent()) {			
			modelo.addAttribute("lista",proveedor.get());
			modelo.addAttribute("id",true);
		}else {
			modelo.addAttribute("id",false);
		}
		return "registrado/listar";
	}
	
	@RequestMapping("/registrado/modificarForm")
	public String modificarForm(@RequestParam int idproveedor,Model modelo) {
		modelo.addAttribute("idproveedora",idproveedor);
		modelo.addAttribute("proveedor", pr.findByIdproveedor(idproveedor).get() );		
		return "registrado/ModificarProveedor";
	}
	
	@RequestMapping("/registrado/modificar")
	public String modificar(@ModelAttribute ProveedoresVO proveedor,Model modelo) {	
		pr.save(proveedor);
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "registrado/listar";
	}

}
