package fumadores;

public class mesa {

	public static void main(String[] args) {
		
		Tabaquero tabaquero = new Tabaquero();
		tabaquero.start();
		
		Fumador fuma1 = new Fumador(0);
		fuma1.start();
		
	}
	
}
