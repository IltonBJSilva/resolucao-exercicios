/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 30/01/2019 
 * Objetivo sucinto do programa: Testar as classe Staff.java, Student.java e Person.java
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package br.com.sankhya.exercicio.person;

public class TestClass {

	public static void main(String[] args) {		
		//Instancia dos objetos
		
		//Pessoa instancia
		Person pessoa1 = new Person("Ilton","Rua Jose Alves Garcias 1612");
		Person pessoa2 = new Person("Andressa","Rua parksab 7692");
		//Estudante Instancia
		Student estudante1 = new Student("Vanessa", "Rua dos bobo 439", "Engenharia Psicologia", 2019, 1543);
		Student estudante2 = new Student("Ezequiel", "Rua mansour 44", "Sistema", 2018, 1043);
		//Staff Instancia
		Staff staff1 = new Staff("Fabio", "Rua tabajara 4432", "Universidade Federal de uberlandia", 3499);
		Staff staff2 = new Staff("Elian", "Rua manuel gomes 3264", "Pitagoras", 6424);

		//Printar os metodos
		//Pessoa
		System.out.println("data of a person");
		System.out.println("data of a person");
		System.out.println("\nFirst person"+pessoa1.toString());
		System.out.println("Second person"+pessoa2.toString()+"\n");
		
		//Estudante
		System.out.println("data of a student");
		System.out.println("\nFirst student"+estudante1.toString());
		System.out.println("Second student"+estudante2.toString()+"\n");
		
		//Staff
		System.out.println("data of a staff");
		System.out.println("\nFirst staff"+staff1.toString());
		System.out.println("Second staff"+staff2.toString()+"\n");
		
	}

}
