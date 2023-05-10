package fumadores;


public class Fumador extends Thread {
	
	int num;
	
	public Fumador(int num) {
		this.num = num;
	}

	public void run() {
		//while(!flag) {
			
			try {
				sleep(3000);
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
	//}
}
