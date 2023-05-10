package com.dawes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ProveedoresVO;
import com.dawes.repository.ProveedorRepository;
@Service
public class ServicioProveedoresImpl implements ServicioProveedores{

	@Autowired
	ProveedorRepository pr;

	
	@Override
	public <S extends ProveedoresVO> S save(S entity) {
		// TODO Auto-generated method stub		
		return pr.save(entity);
	}

	
	@Override
	public Iterable<ProveedoresVO> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	

	@Override
	public void delete(ProveedoresVO entity) {
		// TODO Auto-generated method stub
		pr.delete(entity);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		pr.deleteAll();
		
	}


	@Override
	public Optional<ProveedoresVO> findByIdproveedor(Integer id) {
		// TODO Auto-generated method stub
		return pr.findByIdproveedor(id);
	}

	

}
