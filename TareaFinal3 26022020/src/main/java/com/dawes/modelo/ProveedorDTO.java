package com.dawes.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class ProveedorDTO implements Serializable{
	private int idproveedor;
	private String nombre;
	private String apellidos;
	private LocalDate fecha;
	private String nif;
	
		
	public ProveedorDTO(int idproveedor, String nombre, String apellidos, LocalDate fecha, String nif) {
		super();
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.nif = nif;
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
}
