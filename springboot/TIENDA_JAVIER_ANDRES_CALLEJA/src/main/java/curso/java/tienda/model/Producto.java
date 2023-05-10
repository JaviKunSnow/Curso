package curso.java.tienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "producto")
@Data @NoArgsConstructor @AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private String marca;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoria;

    private Double precio;

    private Double impuesto;

    private Integer stock;

    private Boolean baja;

    
}
