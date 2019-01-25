package CustomerInvocer;
/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 25/01/2019 
 * Objetivo sucinto do programa: Criar um classe que calcula a futura de um desconto de um cliente
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */


public class Invoice {
	
	int ID;
	Customer customer;
	double amount;
	
	
	
	
	public Invoice(int iD, Customer customer, double amount) {
		ID = iD;
		this.customer = customer;
		this.amount = amount;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double getAmountAfterDiscount() {
		double v1 = (customer.discount*amount)/100;
		double v2 = amount*v1;
		
		return v2;
	}


	@Override
	public String toString() {
		return "Invoice ["
				+ "ID=" + ID + ", " 
				+ customer.toString() + ", amount=" 
				+ amount + "]";
	}
	
	


	
	
	

	
	
	
	
}
