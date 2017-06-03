/*
 * 1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual irá imprimir o número e ao lado exibirá a mensagem se é par ou ímpar.
		10 - Par
		9 - Ímpar
		8 - Par
		7 – Ímpar
 * 
 * 
 */
package prova.questao1;

public class Questao1 {
		
	public static void main(String[] args) {
		
		for (int aux = 10; aux > 0; aux-- ){
			if ( aux % 2 == 0 ){
				System.out.println(aux + " - Par");
			}else {
				System.out.println(aux + " - Ímpar");
			}
			
		}
	}

}
