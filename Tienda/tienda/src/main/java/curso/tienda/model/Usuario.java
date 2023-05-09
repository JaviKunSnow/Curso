package curso.tienda.model;

import javax.persistence.*;

import lombok.*;

@Table(name = "usuario")
@Data @AllArgsConstructor @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    private String email;

    private String clave;

    private String nombre;

    private String apellidos;

    private boolean baja;

    // Constructor, getters y setters
}
