package curso.java.tienda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class DetallePedido {
    private int id;
    private int pedidoId;
    private int productoId;
    private int unidades;
    private double precioUnidad;
    private double impuesto;
    private double total;

}
