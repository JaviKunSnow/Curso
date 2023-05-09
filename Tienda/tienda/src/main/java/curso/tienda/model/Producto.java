package curso.tienda.model;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "producto")
@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String marca;
   
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    private double precio;
    private double impuesto;
    private int stock;
    private boolean baja;

}
