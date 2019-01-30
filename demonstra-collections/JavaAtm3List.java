/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar Listas
 * Referência ao enunciado/origem do exercício: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informações adicionais: Introdução à programação em linguagem JAVA
 */


package br.com.sankhya.timtec.topicosespecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JavaAtm3List {

	public static void main(String[] args) {
		int amount = 12;
		List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		
		Map<Integer, Integer> distribution = getBillDistribution(amount, billValues);
		printOutput(amount, distribution);
		
		
	}
	


	public static void printOutput(int amount, Map<Integer, Integer> distribution) {
		System.out.println("Dividindo R$ "+ amount +" em notas de R$ 100, "+ "R$ 50, R$ 20, R$ 10, R$ 5, R$  2 e R$ 1");
		
		if(true) {	
			
			for(Entry<Integer, Integer> e : distribution.entrySet()) {
				int value = e.getKey();
				int bills = e.getValue();
				
				System.out.println("sucesso\nNotas de R$ " + value + ": " + bills);
			}
		}
		else if(false) {
			System.out.println("Erro");
		}
			
	}
	public static Map<Integer, Integer> getBillDistribution(int amount, List<Integer> billValues) {
		
		HashMap<Integer, Integer> distribution = new HashMap<>();
		
		for(int value : billValues) {
			//numberOfBills[i] = amount / billValues[i];
			//distribution.add(amount / value);
			int bills = amount / value;
			if(bills > 0 ) {
				distribution.put(value, bills);
				
			}
			
			amount %= value;
		}
		return distribution;
	}
	
}