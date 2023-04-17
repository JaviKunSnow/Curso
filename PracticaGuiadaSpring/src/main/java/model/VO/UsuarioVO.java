package model.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioVO {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "id_rol")
  private Long idRol;
  
  @Column
  private String email;
  
  @Column
  private String clave;
  
  @Column
  private String nombre;
  
  @Column(name = "apellido1")
  private String apellido1;
  
  @Column(name = "apellido2")
  private String apellido2;
  
  @Column
  private String direccion;
  
  @Column
  private String provincia;
  
  @Column
  private String localidad;
  
  @Column
  private String telefono;
  
  @Column
  private String dni;

  // Constructor vacío
  public UsuarioVO() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getIdRol() {
	return idRol;
}

public void setIdRol(Long idRol) {
	this.idRol = idRol;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}

public String getLocalidad() {
	return localidad;
}

public void setLocalidad(String localidad) {
	this.localidad = localidad;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}
  
  
  
}



