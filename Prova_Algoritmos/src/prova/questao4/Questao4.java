/*
 * 4.	(2,0) Escreva um algoritmo seguindo as seguintes instruções:
	a.	Declare a variável “umNumero” e a variável “outroNumero”, ambas do tipo int.
	 	Efetue a soma das duas variáveis e verifique se o resultado da soma divido por 10 
	 	é igual ao resto variável “umNumero” por 5. 
	 	Caso sim imprima “True”, caso contrário imprima “False”.
	 	
	b.	Declare uma variável do tipo String e outra do tipo boolean. 
		Coloque seu nome como valor da variável String. 
		Verifique se o tamanho do valor da variável String é maior que 10. 
		Coloque o resultado desta verificação na variável boolean. 
		Imprima o valor da variável boolean.
		
	c.	Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
		Declare outra variável do tipo boolean de nome ”falso” com valor true. 
		Imprima no console o resultado da condição da negação da variável “verdadeiro” 
		e a dupla negação da variável “falso”.

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
		 * Declare uma variável do tipo boolean de nome “verdadeiro” com valor false. 
		Declare outra variável do tipo boolean de nome ”falso” com valor true. 
		Imprima no console o resultado da condição da negação da variável “verdadeiro” 
		e a dupla negação da variável “falso”.
		 * 
		 * 
		 */
		
		boolean verdadeiro = false;
		boolean falso = true;
		
		System.out.println(!verdadeiro);
		System.out.println(!(!falso));
	}
}
