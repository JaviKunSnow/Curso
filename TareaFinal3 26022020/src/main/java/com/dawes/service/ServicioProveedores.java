package com.dawes.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.dawes.modelo.ProveedoresVO;

public interface ServicioProveedores {
	
	<S extends ProveedoresVO> S save(S entity);
	Iterable<ProveedoresVO> findAll();
	Optional<ProveedoresVO> findByIdproveedor(Integer id);
	void delete(ProveedoresVO entity);
	void deleteAll();

}