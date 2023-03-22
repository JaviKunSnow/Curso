package model;

import lombok.Data;

@Data
public class modelDetallesPedidos {

	int id;
	int id_pedido;
	int id_producto;
	float precio_unidad;
	int cantidad;
	float impuesto;
	double total;
	
}
