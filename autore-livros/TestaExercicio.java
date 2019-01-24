/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Testar as classe Author.java e Book.java
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package AuthorELivro2;

public class TestaExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author[] authors = new Author[] {
		
		 new Author ("GLAIR ALONSO ARRUDA", "alonsoruda@gmail.com", 'm'),
		 new Author ("Ednilce Duran", "mizenta@gmail.com", 'f'),
	
		};
		
		Author[] authors2 = new Author[] {
				 
				 new Author ("Patrick Estrela", "patrinick@gmail.com",'m'),
				 new Author ("Bob Esponja calça quadrada","espondranada@gmail.com", 'm'),
				};
		
		
		Book book1 = new Book("Crescer Com Alegria e Fé", authors, 15.33, 13,"alonsoruda@gmail.com", 'm');
		
		Book book2 = new Book("A historia do mexilhão tão feio que morreu", authors2,35.33,33 ,"espondranada@gmail.com", 'm');

		
		System.out.println(book1.toString());
		System.out.println("----------------------------");

		System.out.println(book2.toString());

		//System.out.println(book2.toString());
	}

}
