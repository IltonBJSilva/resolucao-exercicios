
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 13/12/2018 
 * Objetivo sucinto do programa: Enviar informação para a classe livro e da um retorno na tela no usuario
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

import java.util.Date;
import java.text.SimpleDateFormat;
class TestaLivro{

    public static void main(String[] args){
       
       SimpleDateFormat converter = new SimpleDateFormat("dd-mm-yyyy");
       
       
        
        Date dataAtual = new Date();
        Date dataInicial = new Date(dataAtual.getTime() - (864 * 10 * 100000));
        Date dataFinal = new Date(dataAtual.getTime() + (864 * 1 * 100000));
        Date dataFinalAtrasado01 = new Date(dataAtual.getTime() - (864 * 5 * 100000));
        Date dataFinalAtrasado02 = new Date(dataAtual.getTime() - (864 * 8 * 100000));
        
        Livro[] senhorAneis = new Livro[3];

        //Livros do Senhor dos Aneis do array dele
        senhorAneis[0] = new Livro(1, "O Senhor dos Aneis: A Sociedade do Anel", "J. R. R. Tolkien","Emprestado",dataInicial, dataFinalAtrasado01);
        senhorAneis[1] = new Livro(2, "O Senhor dos Aneis: As Duas Torre", "J. R. R. Tolkien", "Disponivel",dataInicial, dataFinalAtrasado01);
        senhorAneis[2] = new Livro(3, "O Senhor dos Aneis: O Retorno do Rei", "J. R. R. Tolkien", "Emprestado",dataInicial, dataFinal);
    
        //Livros do Harry Potter
        Livro harryPotter1 = new Livro(4, "Harry Potter e a Pedra Filosofal", "J. K. Rowling", "Disponivel",dataInicial, dataFinal);        
       
        //Livros StarWars
        Livro starWars1 = new Livro(7, "Troopers da Morte", "Joe Schreiber",  "Disponivel" ,dataInicial, dataFinal);
        Livro starWars2 = new Livro(8, "Um Novo Amanhece", "Jackson Miller", "Emprestado", dataInicial,dataFinal);
        
        // Livro  quandVchegou= new Livro(4, "Quando Você Chegou", "Rita Ramos", dataInicio, dataFim, "emprestado", 4);

        //Pessoa 1:
        System.out.println("-------------------------------------------------");
        System.out.println("Titulo: " + starWars2.getTitulo());
        System.out.println("Autor: " + starWars2.getAutor());
        System.out.println("Status: " + starWars2.getStatusLivro());
        
        System.out.println("Data de emprestimo: " + starWars2.getDataEmprestimo());
        System.out.println("Data de devolução: " + starWars2.getDataDevolucao());
        System.out.println("Quantidade de emprestimo que ja teve: " + starWars2.getQuantidadeEmprestimos());
        
    
        // Pessoa 2:
        System.out.println("-------------------------------------------------");
        System.out.println("Titulo: " + harryPotter1.getTitulo());
        System.out.println("Autor: " + harryPotter1.getAutor());
        System.out.println("Status: " + harryPotter1.getStatusLivro());
     
        System.out.println("Data de emprestimo: " + harryPotter1.getDataEmprestimo());
        System.out.println("Data de devolução: " + harryPotter1.getDataDevolucao());
        System.out.println("Quantidade de emprestimo que ja teve: " + harryPotter1.getQuantidadeEmprestimos());
     

        
        // Pessoa 3:
        System.out.println("-------------------------------------------------");
        System.out.println("Titulo: " + starWars1.getTitulo());
        System.out.println("Autor: " + starWars1.getAutor());
        System.out.println("Status: " + starWars1.getStatusLivro());
        
        System.out.println("Data de emprestimo: " + starWars1.getDataEmprestimo());
        System.out.println("Data de devolução" + starWars1.getDataDevolucao());
        System.out.println("Quantidade de emprestimo que ja teve" + starWars1.getQuantidadeEmprestimos());
        
        System.out.println("------------------------------------------------");
        System.out.println("exibir Livros Emprestados:\n");
        System.out.println(Livro.exibirLivrosEmprestados(senhorAneis));
        
        System.out.println("------------------------------------------------");
        System.out.println("exibir Livros Disponivel:\n");
        System.out.println(Livro.exibirLivrosDisponiveis(senhorAneis));

        System.out.println("------------------------------------------------");
        System.out.println("exibir Livros Mas emprestados:\n");
        System.out.println(Livro.listarLivrosMaisEmprestados(senhorAneis));
        
        System.out.println("------------------------------------------------");
        System.out.println("exibir Livros Atrasados:\n");
        System.out.println(Livro.exibirLivrosAtrasados(senhorAneis));
        
        System.out.println("------------------------------------------------");
        System.out.println("exibir Todos os livros:\n");
        System.out.println(Livro.listarTodosLivros(senhorAneis));
    }

}