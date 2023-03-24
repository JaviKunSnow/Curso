package hospital;

public class hilo1 extends Thread {

	Centro centro;

	public hilo1(Centro centro) {
		this.centro = centro;
	}
	
	public void run() {
		while(!main.flag) {
			centro.getPacientes().add(new Paciente(false, 213323, null));
			System.out.println("Paciente añadido");
			try {
				sleep(5000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	
}
