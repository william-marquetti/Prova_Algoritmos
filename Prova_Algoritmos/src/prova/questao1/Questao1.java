/*
 * 1.	(1,0) Imprimir uma lista ordenada de 10 a 1, no qual ir� imprimir o n�mero e ao lado exibir� a mensagem se � par ou �mpar.
		10 - Par
		9 - �mpar
		8 - Par
		7 � �mpar
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
				System.out.println(aux + " - �mpar");
			}
			
		}
	}

}
