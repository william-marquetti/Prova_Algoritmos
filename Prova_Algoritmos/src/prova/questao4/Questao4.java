/*
 * 4.	(2,0) Escreva um algoritmo seguindo as seguintes instru��es:
	a.	Declare a vari�vel �umNumero� e a vari�vel �outroNumero�, ambas do tipo int.
	 	Efetue a soma das duas vari�veis e verifique se o resultado da soma divido por 10 
	 	� igual ao resto vari�vel �umNumero� por 5. 
	 	Caso sim imprima �True�, caso contr�rio imprima �False�.
	 	
	b.	Declare uma vari�vel do tipo String e outra do tipo boolean. 
		Coloque seu nome como valor da vari�vel String. 
		Verifique se o tamanho do valor da vari�vel String � maior que 10. 
		Coloque o resultado desta verifica��o na vari�vel boolean. 
		Imprima o valor da vari�vel boolean.
		
	c.	Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false. 
		Declare outra vari�vel do tipo boolean de nome �falso� com valor true. 
		Imprima no console o resultado da condi��o da nega��o da vari�vel �verdadeiro� 
		e a dupla nega��o da vari�vel �falso�.

 * 
 * 
 * 
 */
package prova.questao4;

public class Questao4 {

	public static void main(String[] args) {
		
		System.out.println("------------------------");
		System.out.println("-------- Item A --------");
		System.out.println("------------------------");
		int umNumero = 24;
		int outroNumero = 10;
		
		int soma = ( umNumero + umNumero );

		if ( ( soma / 10 ) == (outroNumero % 5) ) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println("\n------------------------");
		System.out.println("-------- Item B --------");
		System.out.println("------------------------");
			
		String nome = "William Gustavo Marquetti";
		boolean maiorDez;
		
		if ( nome.length() > 10 ){
			
			maiorDez = true;
			
		} else {
			maiorDez = false;
		}
		
		System.out.println(maiorDez);
		
		System.out.println("\n------------------------");
		System.out.println("-------- Item C --------");
		System.out.println("------------------------");
		
		/*
		 * Declare uma vari�vel do tipo boolean de nome �verdadeiro� com valor false. 
		Declare outra vari�vel do tipo boolean de nome �falso� com valor true. 
		Imprima no console o resultado da condi��o da nega��o da vari�vel �verdadeiro� 
		e a dupla nega��o da vari�vel �falso�.
		 * 
		 * 
		 */
		
		boolean verdadeiro = false;
		boolean falso = true;
		
		System.out.println(!verdadeiro);
		System.out.println(!(!falso));
	}
}
