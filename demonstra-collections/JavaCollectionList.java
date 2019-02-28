/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar Listas
 * Refer�ncia ao enunciado/origem do exerc�cio: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informa��es adicionais: Introdu��o � programa��o em linguagem JAVA
 */


package br.com.sankhya.timtec.topicosespecial;

import java.util.ArrayList;

public class JavaCollectionList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myList = new ArrayList<>();

		int numberOfElements = (int) (Math.random() * 100);
		
		for(int i = 0; i < numberOfElements; i++) {
			myList.add(i);
		}
		for(int element : myList) {
			System.out.println(element);
		}
	}
}
