package curso.tienda.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "rol")
@Data @AllArgsConstructor @NoArgsConstructor
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    
}
