import java.util.*;

import controller.pedidosController;
import model.modelDetallesPedidos;
import model.modelPedidos;

public class main {

	static boolean flag = false;
	static Scanner teclado = new Scanner(System.in);
	
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
 		
		
		//pedidosController.insertarPedido(pedido, detallesPedido);
		
		
		hilo3 hilo3 = new hilo3();
		
		hilo3.start();
		
		do {
			
			System.out.println("1. Consultar registros");
			System.out.println("2. insertar registro");
			System.out.println("3. salir");
			System.out.println("-------------");
			System.out.println("Dime una opcion:");
			int opc = teclado.nextInt();
			
			switch(opc) {
			case 1:
				hilo1 hilo1 = new hilo1();
				hilo1.start();
				break;
			case 2:
				hilo2 hilo2 = new hilo2(pedido);
				hilo2.start();
				break;
			case 3:
				flag = true;
				break;
			default:
				System.out.println("No has elegido ninguna opcion.");
				break;
			}
			
		} while(!flag);
		

	}

}
