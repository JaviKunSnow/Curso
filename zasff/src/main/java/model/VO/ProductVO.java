package model.VO;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "productos")
@Data
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
  
}