import dao.pedidosDao;

public class hilo3 extends Thread {
		
	static boolean flag = false;
	
	public void run() {
		
		int old = pedidosDao.devolverCuentaRegistros();
		
		while(!flag) {
			int nuevo = pedidosDao.devolverCuentaRegistros();
			if(old != nuevo) {
				System.out.println("El valor ha cambiado");
				old = nuevo;
			}
			try {
				sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}

}
