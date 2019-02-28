/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 01/02/2019 
 * Objetivo sucinto do programa: Cria classe para demonstrar o StringBuffer e o StringBuilder
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1tHsvSkW3aBy2ZpfaSjeoBOKYCG-XaKoBZA8AwFiPxlw/edit
 * Informa��es adicionais: Concatena��o: StringBuilder e StringBuffer
 */

package br.com.sankhya.exercicio.example;

import java.awt.List;
import java.util.ArrayList;

public class ExemploBufferBuilder {
	public static void main(String[] args) {
		//Com Buffer
		ArrayList<Object> minhaLista = new ArrayList<>();
		minhaLista.add("M");
		minhaLista.add("I");
		minhaLista.add("N");
		minhaLista.add("H");
		minhaLista.add("A");
		minhaLista.add(" ");
		minhaLista.add("C");
		minhaLista.add("A");
		minhaLista.add("S");
		minhaLista.add("A");
		
		StringBuffer str = new StringBuffer();
		
		for(Object percorre : minhaLista) {
			str.append(percorre);
		}
		
		String s = str.toString();
		System.out.println(s);
	
		//Com builder
		ArrayList<Object> minhaLista2 = new ArrayList<>();
		minhaLista2.add("E");
		minhaLista2.add("X");
		minhaLista2.add("P");
		minhaLista2.add("E");
		minhaLista2.add("C");
		minhaLista2.add("T");
		minhaLista2.add("O");
		minhaLista2.add(" ");
		minhaLista2.add("P");
		minhaLista2.add("A");
		minhaLista2.add("T");
		minhaLista2.add("R");
		minhaLista2.add("O");
		minhaLista2.add("N");
		minhaLista2.add("U");
		minhaLista2.add("M");
		
		StringBuilder str2 = new StringBuilder();
		
		for(Object percorre2 : minhaLista2) {
			str2.append(percorre2);
		}
		
		String segundaString = str2.toString();
		System.out.println(segundaString);

	}
}
