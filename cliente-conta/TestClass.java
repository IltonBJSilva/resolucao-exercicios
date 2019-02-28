/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 25/01/2019 
 * Objetivo sucinto do programa: Testar as classe Account.java e Customer.java
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package AccountCustomer;

public class TestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customers = new Customer(1,"Ilton", 'm');
		Account account1 = new Account(1, customers, 629.39);
		
		Customer customers2 = new Customer(2,"Claudio", 'm');
		Account account2 = new Account(2, customers2, 929.39);
	
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}
}