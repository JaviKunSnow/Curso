package curso.java.tienda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Articulo {
    private int id;
    private String nombre;
    private String descripcion;
    private String marca;
    private int categoria_id;
    private double precio;
    private double impuesto;
    private int stock;
    private boolean baja;
    private int cantidad;
    
}
