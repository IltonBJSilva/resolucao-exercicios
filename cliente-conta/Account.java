/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 25/01/2019 
 * Objetivo sucinto do programa: Cria classe que realiza debito, credito e faz deposito em uma determinada conta de um cliente
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */


package AccountCustomer;

public class Account {
	int id;
	Customer customer;
	double balance = 0.0;
	
	public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	

	public Account(int id, Customer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customer.getName();
	}
	
	public double deposit(double amount) {
		
		this.balance += amount;
		return balance;
	}
	
    public String CarryOutCredit(double amount) {
    	balance += amount;
        return "" + amount;
    }
	
    public String MakeDebit(double amount) {
        if (balance >= amount) {
        	balance -= amount;
            return "" + balance;
        } else {
            return "insufficient balance";
        }
    }

	
	
	
	@Override
	public String toString() {
		return "Account [id = " + id + ", customer ID = " + customer + ", balance = " + balance + "]";
	}
	
	
	
	

}
