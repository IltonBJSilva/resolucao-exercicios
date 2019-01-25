package AccountCustomer;
/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 25/01/2019 
 * Objetivo sucinto do programa: Cria classe que gera um cliente pelo id o nome e o genero
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */
public class Customer {

	int Id;
	String name;
	char gender;
	
	public Customer(int id, String name, char gender) {
		super();
		Id = id;
		this.name = name;
		this.gender = gender;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return " "
				 + Id + ", name = " + name + ", gender = " + gender + "]";
	}
	
	
	
	
	
}
