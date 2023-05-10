package com.dawes.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "proveedores",  uniqueConstraints = { @UniqueConstraint(name = "nif", columnNames = "nif") })
public class ProveedoresVO {
	@Id
	private int idproveedor;
	private String nombre;
	@GeneratedValue
	private String apellidos;
	private String nif;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate fecha;
	
	
	
	public ProveedoresVO(int idproveedor, String nombre, String apellidos, String nif, LocalDate fecha) {
		this.idproveedor = idproveedor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.fecha = fecha;
	}
	public ProveedoresVO() {
		// TODO Auto-generated constructor stub
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
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
}
