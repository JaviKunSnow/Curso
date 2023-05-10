package model.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "usuarios")
@Data
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
}

