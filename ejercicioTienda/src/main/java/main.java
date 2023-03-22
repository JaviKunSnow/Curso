import java.util.ArrayList;
import java.util.List;

import config.config;
import controller.pedidosController;
import model.modelDetallesPedidos;
import model.modelPedidos;

public class main {

	public static void main(String[] args) {
		
		
		modelPedidos pedido = new modelPedidos();
		pedido.setId_usuario(1);
		pedido.setFecha(null);
		pedido.setMetodo_pago(null);
		pedido.setNum_factura(null);
		pedido.setTotal(30.0);
		
		modelDetallesPedidos detalles1 = new modelDetallesPedidos();
		detalles1.setId_producto(1);
		modelDetallesPedidos detalles2 = new modelDetallesPedidos();
		detalles2.setId_producto(1);
		
		List <modelDetallesPedidos> detallesPedido = new ArrayList();
		detallesPedido.add(detalles1);
		detallesPedido.add(detalles2);
 		
		
		pedidosController.insertarPedido(pedido, detallesPedido);

	}

}
