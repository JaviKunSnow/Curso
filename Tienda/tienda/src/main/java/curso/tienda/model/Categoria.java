package curso.tienda.model;

import javax.persistence.*;
import lombok.*;


@Entity
@Table(name = "categorias")
@Data @AllArgsConstructor @NoArgsConstructor
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

}
