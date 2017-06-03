/*
	5.	(5,0) Desenvolver um algoritmo do jogo da forca, 
		onde a palavra pr�-definida seja ESTUDAR. 
		O usu�rio ir� possuir 7 tentativas para acertar a palavra.
*/
package prova.questao5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int erros = 0;
		int acertos = 0;
		
		boolean possuiLetra = false;
		boolean jaDigitado = false;
		
		String letra;
		String[] palavraSecreta = new String[7];

		palavraSecreta[0] = "E";
		palavraSecreta[1] = "S";
		palavraSecreta[2] = "T";
		palavraSecreta[3] = "U";
		palavraSecreta[4] = "D";
		palavraSecreta[5] = "A";
		palavraSecreta[6] = "R";

		int tentativas = palavraSecreta.length;

		// defini��o de array auxiliar para mostrar o status do jogo
		String[] palavra = new String[7];

		palavra[0] = "_";
		palavra[1] = "_";
		palavra[2] = "_";
		palavra[3] = "_";
		palavra[4] = "_";
		palavra[5] = "_";
		palavra[6] = "_";
		
		String forca = "";
				
		while ((erros < tentativas) && (acertos < palavra.length)) {
			System.out.println("Digite uma letra");
			letra = scanner.nextLine();

			// percorre a palavraSecreta e verifica se existe a letra em alguma posicao
			for (int aux = 0; aux < palavraSecreta.length; aux++) {

				// chega se a letra j� foi digitada. 
				for (int auxDigitado = 0; auxDigitado < palavraSecreta.length; auxDigitado++) {
					
					/*
					 *  utilizada a fun��o .toUpperCase() ( fun��o para strings )
					 *   para que obrigatoriamente sejam comparados valores iguais
					 */
					if (palavra[aux].equals(letra.toUpperCase())){
						jaDigitado = true;
					}
					
				}
				
				// checa se a letra � existe em alguma posi��o da palavraSecreta
				if (palavraSecreta[aux].equals(letra.toUpperCase())) {		
					palavra[aux] = letra.toUpperCase();
					possuiLetra = true;
					
					// e existe e a letra ainda n�o foi digitada, incrementa o contador de acertos
					if (!jaDigitado){
						acertos++;

					}
					
				}

			}
			
			// seta jaDigitado como false para que n�o passe direto no loop na pr�xima vez
			jaDigitado = false;
			
			// se n�o existir a letra, incremeta o contador de erros
			if (!possuiLetra) {
				erros++;
				
				// se os erros forem menores que o numero de tentativas, avisa que errou e mostra o contador
				if ((erros < tentativas)) {
					System.err.println("\nLetra n�o econtrada! Jogadas Dispon�veis: " + (tentativas - erros));
				}

			}
			
			// seta a variavel possuiLetra para false para recome�ar o loop
			possuiLetra = false;
			
			if (erros == 1 ){
				forca = "                     O\n";
			}

			
			if ( erros == 2 ){
				forca = "                     O\n                     |";
			}
			System.out.println();
			
			if ( erros == 3 ){
				forca = "                     O\n                     |\\";
			}
			
			if ( erros == 4 ){
				forca = "                     O\n                    /|\\";
			}					
		
			
			if ( erros == 5 ){
				forca = "                     O\n                    /|\\\n                     \\";
			}
			
			
			if ( erros == 6 ){
				forca ="                     O\n                    /|\\\n                    /\\";
			}
			
			
			if ( erros == 7 ) {
				forca = "                      xx\n                     /|\\\n                     /\\";
			}
			
			System.out.println(forca);
			
			
			// impre a situa��o atual do array auxiliar ( com as letras acertadas nas suas devidas posi��es )
			for (int aux2 = 0; aux2 < palavra.length; aux2++) {
				System.out.print(palavra[aux2] + " ");
			}

		}

		// defini��o de variaveis auxiliares para identificar se os array est�o iguais
		boolean iguais = false;
		int contador = 0;

		while ((contador < palavra.length)) {
			if (palavra[contador].equals(palavraSecreta[contador])) {
				iguais = true;
				contador++;

			} else {
				iguais = false;
				contador = palavra.length;

			}
		}
		
		// define se venceu ou perdeu o jogo
		if ((erros >= tentativas) && (!iguais)) {
			System.err.println("\n\nVoc� perdeu.");
			
		} else if (iguais) {
			System.out.println("\n\rParab�ns! Voc� acertou!");
			
		}

		scanner.close();

	}
}