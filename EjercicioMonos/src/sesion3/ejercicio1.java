package sesion3;

import java.util.Scanner;

public class ejercicio1 {

	static Scanner teclado = new Scanner(System.in);
	static char caracteres[] = {'@','#','$','%','&','/','(',')','=','?','¿','*','+',']','[','{','_','-','.',':',';',',','<','>','^','ª','º'};
	static char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public static void main(String[] args) {
		
		pregunta();

	}
	
	public static void pregunta() {
		System.out.println("Dime una frase:");
		respuesta(teclado.nextLine());
	}
	
	public static void respuesta(String frase) {
		
		char[] fraseCod = fraseCod(frase);
		char[] fraseCod2 = fraseCod2(frase);
		
		System.out.println("Palabra codificada:");
		System.out.print(fraseCod);
		System.out.println();
		System.out.println("Palabra descodificada:");
		System.out.print(fraseDesCod(fraseCod));
		
		System.out.println();
		System.out.println("Palabra codificada:");
		System.out.print(fraseCod2);
		System.out.println();
		System.out.println("Palabra descodificada:");
		System.out.print(fraseDesCod2(fraseCod2));
		
		
	}
	
	public static char[] fraseCod(String frase) {
		
		char arrFrase[] = frase.toCharArray();
			
			for(int i = 0; i < alfabeto.length; i++) {
				
				for(int j = 0; j < arrFrase.length; j++) {
					if(alfabeto[i] == arrFrase[j]) {
						arrFrase[j] = caracteres[i]; 
					}
				}
				
			}
			
			return arrFrase;
	}
	
	public static char[] fraseDesCod(char[] fraseCod) {

		for(int i = 0; i < caracteres.length; i++) {
			
			for(int j = 0; j < fraseCod.length; j++) {
				if(caracteres[i] == fraseCod[j]) {
					fraseCod[j] = alfabeto[i]; 
				}
			}
			
		}
		
		return fraseCod;
		
	}
	
	public static char[] fraseCod2(String frase) {
		
		char arrFrase[] = frase.toCharArray();
			
			for(int i = 0; i < alfabeto.length; i++) {
				
				for(int j = 0; j < arrFrase.length; j++) {
					if(alfabeto[i] == arrFrase[j]) {
						arrFrase[j] = caracteres[i + 1]; 
					}
				}
				
			}
			
			return arrFrase;
	}
	
	public static char[] fraseDesCod2(char[] fraseCod) {

		for(int i = 0; i < caracteres.length; i++) {
			
			for(int j = 0; j < fraseCod.length; j++) {
				if(caracteres[i] == fraseCod[j]) {
					if(i - 1 < 0) {
						fraseCod[j] = alfabeto[alfabeto.length];
					} else {
						fraseCod[j] = alfabeto[i - 1]; 
					}
					
					
				}
			}
			
		}
		
		return fraseCod;
		
	}
}
