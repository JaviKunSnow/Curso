package sesion3;

import java.util.Scanner;

public class ejercicio2 {

	static char[][] vagon1 = new char[4][16];
    static char[][] vagon2 = new char[4][16];
    static char[][] vagon3 = new char[4][16];
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
    	if(comprobarVacio(vagon1) && comprobarVacio(vagon2) && comprobarVacio(vagon3)) {
    		rellenarVacio(vagon1);
    		rellenarVacio(vagon2);
    		rellenarVacio(vagon3);
    	}
    	
    	preguntarAsiento();
    	
    }
    
    public static void preguntarAsiento() {
    	
    	int numVagon, fila = 0, columna = 0;
    	
    	String posiciones[] = null;
    	
    	do {
            System.out.println("Ingrese el n�mero de vagon (1, 2 o 3):");
            numVagon = teclado.nextInt();
        } while (numVagon < 1 || numVagon > 3);
    	
    	
    	do {
    		System.out.println("Ingrese el n�mero de asiento (fila/columna):");
    		posiciones = teclado.next().split("/");
    		fila = Integer.parseInt(posiciones[0]);
            columna = Integer.parseInt(posiciones[1]);
    		
    	} while (posiciones.length != 2 || fila < 1 || fila > 4 || columna < 1 || columna > 16);
    	
    	comprobarVagon(numVagon, fila, columna);
    	
    }
    
    public static void comprobarVagon(int vagon, int fila, int columna) {
    	
    	switch(vagon) {
    		
    		case 1:
    			if(comprobarAsiento(vagon1, fila, columna)) {
    				rellenarAsiento(vagon1, fila, columna);
    			} else {
    				System.out.println("El asiento esta ocupado, pruebe otra vez.");
    				preguntarAsiento();
    			}
    			break;
    		case 2:
    			if(comprobarAsiento(vagon2, fila, columna)) {
    				rellenarAsiento(vagon2, fila, columna);
    			} else {
    				System.out.println("El asiento esta ocupado, pruebe otra vez.");
    				preguntarAsiento();
    			}
    			break;
    		case 3:
    			if(comprobarAsiento(vagon3, fila, columna)) {
    				rellenarAsiento(vagon3, fila, columna);
    			} else {
    				System.out.println("El asiento esta ocupado, pruebe otra vez.");
    				preguntarAsiento();
    			}
    			break;
    	}
    	
    	System.out.println("Asiento reservado.");
    	System.out.println("�Quieres reservar otro asiento? (S/N)");
    	if(teclado.next().charAt(0) == '0') {
    		preguntarAsiento();
    	}
    }
    
    public static boolean comprobarAsiento(char[][] vagon, int fila, int columna) {
		if(vagon[fila-1][columna-1] == 'L') {
			return true;
		}
    	return false;
    	
    }
    
    public static void rellenarAsiento(char[][] vagon, int fila, int columna) {
    	vagon[fila-1][columna-1] = 'O';
    }
    
    public static boolean comprobarVacio(char[][] vagon) {
        for (int i = 0; i < vagon.length; i++) {
            for (int j = 0; j < vagon[i].length; j++) {
                if (vagon[i][j] != '\0') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void rellenarVacio(char[][] vagon) {
        for (int i = 0; i < vagon.length; i++) {
            for (int j = 0; j < vagon[i].length; j++) {
                vagon[i][j] = 'L';
            }
        }
    }
	
}
