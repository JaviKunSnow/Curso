package curso.tienda.model;

import javax.persistence.*;
import java.util.Date;
import lombok.*;

@Entity
@Table(name = "pedido")
@Data @AllArgsConstructor @NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private Date fecha;
    private String metodopago;
    private String numfactura;
    private double total;

}
