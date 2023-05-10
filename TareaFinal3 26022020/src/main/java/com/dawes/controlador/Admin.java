package com.dawes.controlador;

import java.util.Optional;

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
public class Admin {
	
	@Autowired
	ProveedorRepository pr;	
	
	@RequestMapping("/admin/listar")
	public String borrar(Model modelo) {
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "admin/listar";
	}
	
	@RequestMapping("/admin/buscar")
	public String buscar(Model modelo) {
		modelo.addAttribute("proveedores", new ProveedoresVO() );		
		return "admin/buscarForm";
	}
	
	@RequestMapping("/admin/a")
	public String buscarId(@RequestParam int idproveedor,Model modelo) {
		Optional<ProveedoresVO> proveedor = pr.findByIdproveedor(idproveedor);
		if(proveedor.isPresent()) {			
			modelo.addAttribute("lista",proveedor.get());
			modelo.addAttribute("id",true);
		}else {
			modelo.addAttribute("id",false);
		}
		return "admin/listar";
	}
	
	@RequestMapping("/admin/insertarForm")
	public String insertarForm(Model modelo) {
		modelo.addAttribute("proveedor", new ProveedoresVO() );		
		return "admin/insertarProveedor";
	}
	
	@RequestMapping("/admin/insertarProveedor")
	public String insertarProveedor(@ModelAttribute ProveedoresVO proveedor,Model modelo) {	
		pr.save(proveedor);
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "admin/listar";
	}
	
	@RequestMapping("/admin/borrarProveedor")
	public String borrarProveedor(@RequestParam int idproveedor,Model modelo) {
		ProveedoresVO vo = pr.findByIdproveedor(idproveedor).get();
		pr.delete(vo);	
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "admin/listar";
	}
	
	@RequestMapping("/admin/modificarForm")
	public String modificarForm(@RequestParam int idproveedor,Model modelo) {
		modelo.addAttribute("idproveedora",idproveedor);
		modelo.addAttribute("proveedor", pr.findByIdproveedor(idproveedor).get() );		
		return "admin/ModificarProveedor";
	}
	
	@RequestMapping("/admin/modificar")
	public String modificar(@ModelAttribute ProveedoresVO proveedor,Model modelo) {	
		pr.save(proveedor);
		Iterable<ProveedoresVO> lista = pr.findAll();
		modelo.addAttribute("lista",lista); 
		return "admin/listar";
	}

}
