package CustomerInvocer;
/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 25/01/2019 
 * Objetivo sucinto do programa:  Cria clase que recebe valores de id nome e desconto de um cliente
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */
public class Customer {

	int Id;
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
