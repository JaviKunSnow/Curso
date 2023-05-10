package curso.java.tienda.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pedido")
@Data @NoArgsConstructor @AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private LocalDateTime fecha;

    @Column(name = "metodopago")
    private String metodoPago;
    
    private String estado;

    @Column(name = "numfactura")
    private String numFactura;

    private Double total;

    // constructors, getters and setters
}
