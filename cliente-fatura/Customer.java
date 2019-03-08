package CustomerInvocer;
/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 25/01/2019 
 * Objetivo sucinto do programa:  Cria clase que recebe valores de id nome e desconto de um cliente
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */
public class Customer {
	
	int ID;
	String name;
	int discount;
	
	public Customer(int id, String name, int discount) {
		super();
		Id = id;
		this.name = name;
		this.discount = discount;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Customer ["
		+ "Id=" + Id 
		+ ", name=" + name 
		+ ", discount=" + discount + "]";
	}
}
