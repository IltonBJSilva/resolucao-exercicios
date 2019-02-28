/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Testar as classe Author.java e Book.java
 * Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package br.com.sankhya.exercicio.autorlivro;

public class TestaExercicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1 = new Author ("Sun Tzu", "sunzinho@gmail.com", 'm');
		Author author2 = new Author ("Sun tzu", "sunzinho@gmail.com", 'm');
		Author author3 = new Author ("Sun tz", "sunzinho@gmail.com", 'm');

		Book book1 = new Book("Arte da Guerra", author1, 33.33, 1,"lucasart@gmail.com", 'M');
		Book book2 = new Book("Arte da Guerra", author1, 33.33, 1,"lucasart@gmail.com", 'M');
		Book book3 = new Book("Arte da Guer", author1, 33.33, 1,"lucasart@gmail.com", 'M');

		System.out.println("Author1\n"+book1.toString());
		System.out.println("\nAuthor2"+book2.toString());
		System.out.println("\nAuthor3"+book3.toString());

		System.out.println("\nAuthor1 e igual a author2? --> "+author1.equals(author2));
		System.out.println("Author1 e igual a author3? --> "+author1.equals(author3));
	}
}