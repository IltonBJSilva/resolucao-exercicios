/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Criar um classe que modela um autor de livros, com atributos e m�todos
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package br.com.sankhya.exercicio.autorlivro;

import br.com.sankhya.exercicion.equalsobject.Aluno;

public class Author {
	String name;
	String email;
	char gender;

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
	
	public boolean equals(Object object) {
		//vai comparar se a referencia e igual ao paramentro que recebeu se for retorna verdadeiro
		if(this == object) {
			return true;
		}
		//se a referencia for nula retorna o null
		if(this == null) {
			return false;
		}
		Author other = (Author) object;
		if(email.equalsIgnoreCase(other.getEmail()) && name.equalsIgnoreCase(other.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.email + this.gender + this.name;
	}
}