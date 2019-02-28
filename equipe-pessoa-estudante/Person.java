/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 30/01/2019 
 * Objetivo sucinto do programa: Cria classe Person.java que manipula dados de uma pessoa
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package br.com.sankhya.exercicio.person;

public class Person {
	private String name;
	private String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "["
				+ "name=" + name 
				+ ", address= " + address + "]";
	}
}