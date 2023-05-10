import dao.pedidosDao;
import model.modelPedidos;

public class hilo2 extends Thread {
			
	static boolean flag = false;
	modelPedidos pedido;
		
	public hilo2(modelPedidos pedido) {
		this.pedido = pedido;
	}

	public void run() {	
		//while(!flag) {
			if(pedidosDao.insertarPedido(pedido)) {
				System.out.println("Se ha insertado un valor.");
			}
			
			try {
				sleep(10000);
			} catch(Exception e) {
				
			}
		//}
	}
}
