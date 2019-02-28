/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Criar um classe que modela um livro de um autor, com atributos e m�todos
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package AuthorELivro2;

import java.util.Arrays;

public class Book extends Author{
	String texto;
	String name;
	String email;
	char gender;
	Author[] author;
	double price;
	int qty = 1;
	
	public Book(String name, Author author[], double price, String email, char gender) {
		super(name,email, gender);
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String name, Author author[], double price, int qty, String email, char gender) {
		super(name,email, gender);
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		for(int i = 0; i < author.length; i++) {
			return texto += author.toString();
		}
		return name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty+1;
	}

	public void setQty(int qty) {
		this.qty = qty+1;
	}
	
	@Override
	public String toString() {
		
		for(int j = 0; j < author.length; j++) {
			
			for(int i = 1; i < author.length; i++) {
				return ""
						+ "\nBook name = "+ name
						+ "\nFirst author name = "+ author[j].getName()
						+ "\nFirst gender author = " + author[j].getGender()
						+ "\nFirst email author = " + author[j].getEmail()
						+ "\nSecond author name = "+ author[i].getName()
						+ "\nSecond gender author = " + author[i].getGender()
						+ "\nSecond email author = " + author[i].getEmail()
						+ "\nBook Price = " + price +" US$"
						+ "\nQuantity = " + qty;
			}
		}	
		return Arrays.toString(author);
	}
}