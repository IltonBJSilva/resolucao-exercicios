/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Criar um classe que modela um autor de livros, com atributos e m�todos
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package AuthorELivro2;

public class Author {
	
	String name;
	String name2;

	String email;
	String email2;
	
	char gender;
	char gender2;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return this.email + this.gender + this.name + this.email + this.gender + this.name;
	}
}