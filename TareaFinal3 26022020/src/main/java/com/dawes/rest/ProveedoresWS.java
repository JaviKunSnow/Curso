package com.dawes.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.modelo.ProveedorDTO;
import com.dawes.modelo.ProveedoresVO;
import com.dawes.service.ServicioProveedores;

@RestController
public class ProveedoresWS {
	@Autowired
	ServicioProveedores ps;
	
	@GetMapping("/proveedores")
	public Iterable mostrarProveedores(){
		List<ProveedorDTO> lista = new ArrayList<>();
		for(ProveedoresVO p:ps.findAll()) {
			lista.add(new ProveedorDTO(p.getIdproveedor(),p.getNombre(),p.getApellidos(),p.getFecha(),p.getNif()));
		}
		return lista;
	}
	
	
	
	@GetMapping("/proveedores/{idproveedor}")
	public ProveedorDTO buscarProveedor(@PathVariable int idproveedor) {
		ProveedoresVO p = ps.findByIdproveedor(idproveedor).get();
		ProveedorDTO pd = new ProveedorDTO(p.getIdproveedor(),p.getNombre(),p.getApellidos(),p.getFecha(),p.getNif());
		return pd;
	}
	
	@PostMapping("/insertarProveedor")
	public String insertarProveedor(@RequestBody ProveedorDTO p) {
		ps.save(new ProveedoresVO(p.getIdproveedor(),p.getNombre(),p.getApellidos(),p.getNif(),p.getFecha()));
		return "Proveedor inseratdo";
	}
	
	@DeleteMapping("/eliminarProveedor/{idproveedor}")
	public String eliminarProveedor(@PathVariable int idproveedor,@RequestBody ProveedorDTO pd) {
		ps.delete(ps.findByIdproveedor(idproveedor).get());
		return "proveedor eliminado";
	}

	@PutMapping("/modificarProveedor/{idproveedor}")
	public String modificarProveedor(@PathVariable int idproveedor, @RequestBody ProveedorDTO pd){
		ProveedoresVO p = ps.findByIdproveedor(idproveedor).get();
		p.setNombre(pd.getNombre());
		p.setApellidos(pd.getApellidos());
		p.setNif(pd.getNif());
		p.setFecha(pd.getFecha());
		ps.save(p);
		return "proveedor modificado";
	}
}
