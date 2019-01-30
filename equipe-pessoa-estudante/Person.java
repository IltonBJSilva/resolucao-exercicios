/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 30/01/2019 
 * Objetivo sucinto do programa: Cria classe Person.java que manipula dados de uma pessoa
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package PersonStaffStudent;

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
