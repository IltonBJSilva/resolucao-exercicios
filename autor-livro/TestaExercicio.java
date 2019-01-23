/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Testar as classe Author.java e Book.java
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package AuthorELivro;

public class TestaExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1 = new Author ("Sun Tzu", "sunzinho@gmail.com", 'm');
		Book book1 = new Book("Arte da Guerra", author1, 33.33, 1,"lucasart@gmail.com", 'M');
		
		System.out.println(book1.toString());
	}

}
