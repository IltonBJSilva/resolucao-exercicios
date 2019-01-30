/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar Listas
 * Referência ao enunciado/origem do exercício: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informações adicionais: Introdução à programação em linguagem JAVA
 */

package topicosEspecial;

import java.util.ArrayList;

public class JavaCollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();

		int numberOfElements = (int) (Math.random() * 100);

		for (int i = 0; i < numberOfElements; i++) {
			myList.add(i);
		}
		for (int element : myList) {
			System.out.println(element);
		}
	}

}