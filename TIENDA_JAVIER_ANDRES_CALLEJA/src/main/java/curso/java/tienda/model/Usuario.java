package curso.java.tienda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Usuario {

	private int id;
	private int id_rol;
	private String email;
	private String clave;
	private String nombre;
	private String apellidos;
	private boolean baja;
	
	
}
