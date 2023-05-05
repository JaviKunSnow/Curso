package curso.java.tienda.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Pedido {
    private int id;
    private int usuarioId;
    private Timestamp fecha;
    private String metodoPago;
    private String numFactura;
    private double total;

    
}
