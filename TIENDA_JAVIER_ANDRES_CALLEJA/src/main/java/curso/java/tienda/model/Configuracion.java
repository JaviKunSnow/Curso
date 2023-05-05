package curso.java.tienda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Configuracion {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "clave", length = 255)
	private String clave;
	
	@Column(length = 255)
	private String valor;
	
}

