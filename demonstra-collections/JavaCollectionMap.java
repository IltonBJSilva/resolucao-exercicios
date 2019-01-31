/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar Listas
 * Referência ao enunciado/origem do exercício: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informações adicionais: Introdução à programação em linguagem JAVA
 */


package br.com.sankhya.timtec.topicosespecial;

import java.security.KeyStore.Entry;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class JavaCollectionMap {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<>();
		mySet.add("HakunaBatata");
		mySet.add("BananaLisa");
		
		System.out.println("\n________________________________________\nCom");
		System.out.println("BananaLisa: " + mySet.contains("BananaLisa")); // True
		System.out.println("HakunaBatata: " + mySet.contains("HakunaBatata")); // True
		System.out.println("Copo: " + mySet.contains("copo")); //False
		System.out.println("\n________________________________________\nSem");
		mySet.remove("BananaLisa");
		mySet.add("copo");
		System.out.println("BananaLisa: " + mySet.contains("BananaLisa")); // false
		System.out.println("copo: " + mySet.contains("copo")); //true
		mySet.remove("copo");
		System.out.println("\n________________________________________\n\n\n\n");

		mySet.add("Banana");
		mySet.add("Apple");
		mySet.add("Orage");

		for(String fruit : mySet) {
			System.out.println(fruit);
		}
		System.out.println("\n________________________________________\n\n\n\n");
		
		HashMap<String, Integer> myBooks = new HashMap <>();
		myBooks.put("Ender's Game", 4);
		myBooks.put("Harry Potter", 3);
		myBooks.put("Books and Star Wars Word", 5);

		for(String title : myBooks.keySet()) {
			System.out.println(title);
		}
			
		
		
		for(int score: myBooks.values()) {
			System.out.println(score);
		}
	}
}
