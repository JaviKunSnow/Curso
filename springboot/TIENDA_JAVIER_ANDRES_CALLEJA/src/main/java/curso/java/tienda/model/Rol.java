package curso.java.tienda.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@Data @NoArgsConstructor @AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;


    // Constructor, getters y setters
}