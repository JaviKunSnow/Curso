package model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class modelPedidos {

	int id;
	int id_usuario;
	Timestamp fecha;
	String metodo_pago;
	String estado;
	String num_factura;
	Double total;
	
}
