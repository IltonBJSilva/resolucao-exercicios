/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe para testar Listas
 * Refer�ncia ao enunciado/origem do exerc�cio: https://cursos.timtec.com.br/course/programacaojava/lesson/4-topicos-especiais#/5
 * Informa��es adicionais: Introdu��o � programa��o em linguagem JAVA
 */

package topicosEspecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaAtm3List {

	public static void main(String[] args) {
		int amount = 12;
		List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		
		List<Integer> numberOfBills = getBillDistribution(amount, billValues);
		printOutput(amount, billValues, numberOfBills);
		
		
	}
	
	public static void printOutput(int amount, List<Integer> billValues, List<Integer> numberOfBills) {
		System.out.println("Dividindo R$ "+ amount +" em notas de R$ 100, "+ "R$ 50, R$ 20, R$ 10, R$ 5, R$  2 e R$ 1");
		
		for(int i = 0; i < numberOfBills.size(); i++) {
			System.out.println("Notas de R$ " + billValues.get(i) + ": "
			 + numberOfBills.get(i));
		}
	}
	public static List<Integer> getBillDistribution(int amount, List<Integer> billValues) {
		
		ArrayList<Integer> numberOfBills = new ArrayList<>();
		
		for(int value : billValues) {
			//numberOfBills[i] = amount / billValues[i];
			numberOfBills.add(amount / value);
			amount %= value;
		}
		return numberOfBills;
	}
	
}