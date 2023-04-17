package model.VO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "productos")
public class ProductVO {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name = "id_categoria")
  private Long idCategoria;
  
  @Column
  private String nombre;
  
  @Column
  private String descripcion;
  
  @Column
  private Double precio;
  
  @Column
  private Integer stock;
  
  @Column(name = "fecha_alta")
  private Timestamp fechaAlta;
  
  @Column(name = "fecha_baja")
  private Timestamp fechaBaja;
  
  @Column
  private Float impuesto;
  
  @Column
  private String imagen;

  // Constructor vacío
  public ProductVO() {}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getIdCategoria() {
	return idCategoria;
}

public void setIdCategoria(Long idCategoria) {
	this.idCategoria = idCategoria;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Double getPrecio() {
	return precio;
}

public void setPrecio(Double precio) {
	this.precio = precio;
}

public Integer getStock() {
	return stock;
}

public void setStock(Integer stock) {
	this.stock = stock;
}

public Timestamp getFechaAlta() {
	return fechaAlta;
}

public void setFechaAlta(Timestamp fechaAlta) {
	this.fechaAlta = fechaAlta;
}

public Timestamp getFechaBaja() {
	return fechaBaja;
}

public void setFechaBaja(Timestamp fechaBaja) {
	this.fechaBaja = fechaBaja;
}

public Float getImpuesto() {
	return impuesto;
}

public void setImpuesto(Float impuesto) {
	this.impuesto = impuesto;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}
  
  
  
  
}
