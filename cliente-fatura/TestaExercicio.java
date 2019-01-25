package CustomerInvocer;

/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 25/01/2019 
 * Objetivo sucinto do programa: Testar as classe Customer.java e Invoice.java
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

public class TestaExercicio {

	
	public static void main(String[] args) {
		Customer customers1 = new Customer(1, "Ilton", 20);
		Invoice invoces1 = new Invoice(1, customers1,629);
		
		Customer customers2 = new Customer(2,"Vanessa", 40);
		Invoice invoces2 = new Invoice(2, customers2,62900);

	
		

		
		System.out.println(invoces1.toString());
		System.out.println(invoces2.toString());


	}

}
