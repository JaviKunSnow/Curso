/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.A.arrays;

/**
 *
 * @author Javi
 */

class C_ArrayComoParametro {

	static void min(int arr[]) {
		int min = arr[0];
		// Buscamos el valor minimo, lo almacenamos y lo devolvemos
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	// Sobreescribimos el metodo min
	static void min(String arr[]) {
		// imprimir array usando for-each loop
		for (String x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4 };
		String arg[] = { "a", "b" };

		min(a);// pasar el array como parametro
		min(arg);
	}

}
