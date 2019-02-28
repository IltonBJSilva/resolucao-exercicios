/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: Demonstra��o da cole��o ArrayList<T> gen�rica do livro de refer�ncia Java
 * Refer�ncia ao enunciado/origem do exerc�cio: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  p�ginas 225 ate 227
 */

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		// cria um novo ArrayList de strings com uma capacidade inicial de 10
		ArrayList<String> objeto = new ArrayList<String>();
		
		objeto.add(" vermelho "); // anexa um item � lista qual quer que seja
		objeto.add(0, " amarelo "); // insere "yellow" no �ndice 0 ja coloca no 0 se tiver outro ele sobrescreve

		// cabe�alho
		System.out.print(" lista com conteudo e controle de loop na tela: ");

		// exibe as cores na lista
		for (int i = 0; i < objeto.size(); i++)
			System.out.printf(" %s", objeto.get(i));

		// exibe as cores usando for aprimorada no m�todo tela
		tela(objeto, "%nlista com conteudo melhorado na tela: ");

		objeto.add(" verde "); // adiciona "verde" ao fim da lista
		objeto.add(" amarelo "); // adiciona "amarelo" ao fim da lista
		objeto.add(" rosa "); // adiciona "rosa" ao fim da lista
		tela(objeto, "Lista com dos novos elementos: ");

		objeto.remove(" amarelo "); // remove o primeiro "yellow"
		tela(objeto, "Remove primeira instancia amarela: ");

		objeto.remove(1); // remove o item no �ndice 1
		tela(objeto, "Remove segundo elemento da lista ( verde ): ");

		// verifica se um valor est� na Lista
		System.out.printf("\" Vermelho \" %s esta  na lista%n ", 
		objeto.contains(" vermelho ") ? "" : "n�o ");
		
		// exibe o n�mero de elementos na Lista
		System.out.printf(" Tamanho:  %s%n", objeto.size());
	}

	// exibe elementos do ArrayList no console
	public static void tela(ArrayList<String> objeto, String cabe�a) {
		System.out.printf(cabe�a); // exibe o cabe�alho

		// exibe cada elemento em itensoo
		for (String objetos : objeto)
			System.out.printf(objetos);

		System.out.println();
	}
}