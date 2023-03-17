package sesion3;

import java.util.Scanner;

public class ejercicio3 {

	static char tablero[][] = new char[3][3];
	static char J1 = 'X';
	static char J2 = 'O';
	static int turnoJugador = 1;
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			System.out.println("¿Iniciar la partida? S/N");
		} while(teclado.next().charAt(0) != 'S');
		
		iniciarJuego();
		mostrarTablero();
		
	}
	
	public static void iniciarJuego() {
		for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero.length; j++) {
	            tablero[i][j] = '-';
	        }
	    }
	}
	
	public static void mostrarTablero() {
		for (int i = 0; i < tablero.length; i++) {
	        for (int j = 0; j < tablero[0].length; j++) {
	            System.out.print(tablero[i][j] + " ");
	        }
	        System.out.println("");
	    }
	}
	
	public static void preguntarJugador() {
		System.out.println("-----------------");
		System.out.println("Es el turno del jugador " + turnoJugador + ", elige movimiento: ");
		
	}
	
	public static void insertarPosicion(String posicion) {
		
		String[] posiciones = posicion.split("/");
		if(validarPosicion(Integer.parseInt(posiciones[0]), Integer.parseInt(posiciones[1]))) {
			
		}
	}
	
	public static boolean validarPosicion(int fila, int columna) {
		if(tablero[columna][fila] == '-') {
			return true;
		}
		return false;
	}
}
