package curso.java.tienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalle")
@Data @NoArgsConstructor @AllArgsConstructor
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private Integer unidades;

    @Column(name = "preciounidad")
    private Double precioUnidad;

    private Double impuesto;

    private Double total;

    // constructors, getters and setters
}
