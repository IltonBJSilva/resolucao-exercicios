/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar HashMap
 * Referência ao enunciado/origem do exercício: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informações adicionais: Introdução à programação em linguagem JAVA
 */


package br.com.sankhya.timtec.topicosespecial;

import java.util.HashMap;
import java.util.Map.Entry;

public class JavaCollectionMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> myBooks = new HashMap <>();
		myBooks.put("Ender's Game", 4);
		myBooks.put("Harry Potter", 3);
		myBooks.put("Books and Star Wars Word", 5);
		
		System.out.println("Contem o livro Ender's Game? -->"+myBooks.containsKey("Ender's Game")+"\n"); // True

		System.out.println("Contem o livro de chave -->"+myBooks.containsValue(4)+"\n");
		
		System.out.println("Removido o livro de chave --> "+myBooks.remove("Ender's Game")+"\n");
		
		System.out.println("Contem o livro de chave -->"+myBooks.containsValue(4)+"\n");
	
		System.out.println("Contem o livro Ender's Game? -->"+myBooks.containsKey("Ender's Game")+"\n"); // False
		
		
		
		
		
		
		
		
		/*
		for(String title : myBooks.keySet()) {
			System.out.println(title);
		}
			
		
		for(Entry<String, Integer> entry : myBooks.entrySet()) {
			String title = entry.getKey();
			int score = entry.getValue();
			System.out.println(title + "é nota" + score);
		}
*/


	}
	
}
