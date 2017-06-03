/*
 * 2.	(1,0) Imprimir uma lista de números de 100 a 300, 
 * 	mostrando no console apenas múltiplos de 5 e 10.
 * 
 * 
 */
package prova.questao2;

public class Questao2 {
	
	public static void main(String[] args) {
		
		int minimo = 100;
		int maximo = 300;
		int multiplo1 = 5;
		int multiplo2 = 10;
		
		for ( int aux = minimo; aux < maximo; aux++ ){
			
			if ( ( aux % multiplo1 == 0) && ( aux % multiplo2 == 0 )  ){
				System.out.println(aux);
			}
			
		}
	}
}
