package curso.tienda.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "detalle")
@Data @AllArgsConstructor @NoArgsConstructor
public class Detalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
    
    private int unidades;
    private double preciounidad;
    private double impuesto;
    private double total;

}
