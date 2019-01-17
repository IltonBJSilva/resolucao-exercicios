/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: Demonstração da coleção ArrayList<T> genérica do livro de referência Java
 * Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 225 ate 227
 */

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String[] args) {
		// cria um novo ArrayList de strings com uma capacidade inicial de 10
		ArrayList<String> objeto = new ArrayList<String>();

		objeto.add(" vermelho "); // anexa um item à lista qual quer que seja
		objeto.add(0, " amarelo "); // insere "yellow" no índice 0 ja coloca no 0 se tiver outro ele sobrescreve

		// cabeçalho
		System.out.print(" lista com conteudo e controle de loop na tela: ");

		// exibe as cores na lista
		for (int i = 0; i < objeto.size(); i++)
			System.out.printf(" %s", objeto.get(i));

		// exibe as cores usando for aprimorada no método tela
		tela(objeto, "%nlista com conteudo melhorado na tela: ");

		objeto.add(" verde "); // adiciona "verde" ao fim da lista
		objeto.add(" amarelo "); // adiciona "amarelo" ao fim da lista
		objeto.add(" rosa "); // adiciona "rosa" ao fim da lista
		tela(objeto, "Lista com dos novos elementos: ");

		objeto.remove(" amarelo "); // remove o primeiro "yellow"
		tela(objeto, "Remove primeira instancia amarela: ");

		objeto.remove(1); // remove o item no índice 1
		tela(objeto, "Remove segundo elemento da lista ( verde ): ");

		// verifica se um valor está na Lista
		System.out.printf("\" Vermelho \" %s esta  na lista%n ", 
		objeto.contains(" vermelho ") ? "" : "não ");
		
		// exibe o número de elementos na Lista
		System.out.printf(" Tamanho:  %s%n", objeto.size());
	}

	// exibe elementos do ArrayList no console
	public static void tela(ArrayList<String> objeto, String cabeça) {
		System.out.printf(cabeça); // exibe o cabeçalho

		// exibe cada elemento em itensoo
		for (String objetos : objeto)
			System.out.printf(objetos);

		System.out.println();
	}
}