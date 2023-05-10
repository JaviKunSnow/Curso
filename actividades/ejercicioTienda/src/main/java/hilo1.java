import dao.pedidosDao;

public class hilo1 extends Thread {
		
	static boolean flag = false;
	
	public void run() {
		//while(!flag) {
			System.out.println(pedidosDao.devolverCuentaRegistros());
			try {
				sleep(3000);
			} catch(Exception e) {
				
			}
			
		}
	//}
}
