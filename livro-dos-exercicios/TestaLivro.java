
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
       
       SimpleDateFormat converter = new SimpleDateFormat("dd-MM-yyyy");
       
       
        
        Date dataAtual = new Date();
        Date dataInicial = new Date(dataAtual.getTime() - (864 * 6 * 100000));
        Date dataFinal = new Date(dataAtual.getTime() + (864 * 3 * 100000));
        Date dataFinalAtrasado01 = new Date(dataAtual.getTime() - (864 * 7 * 100000));
        Date dataFinalAtrasado02 = new Date(dataAtual.getTime() - (864 * 9 * 100000));
        
        Livro[] senhorAneis = new Livro[3];

        //Livros do Senhor dos Aneis do array dele
        senhorAneis[0] = new Livro(1, "O Senhor dos Aneis: A Sociedade do Anel ", "J. R. R. Tolkien","Emprestado",dataInicial, dataFinalAtrasado01);
        senhorAneis[1] = new Livro(2, "O Senhor dos Aneis: As Duas Torre ", "J. R. R. Tolkien", "Disponivel",dataInicial, dataFinalAtrasado01);
        senhorAneis[2] = new Livro(3, "O Senhor dos Aneis: O Retorno do Rei ", "J. R. R. Tolkien", "Emprestado",dataInicial, dataFinal);

        //Livros do Harry Potter
        Livro harryPotter1 = new Livro(4, " Harry Potter e a Pedra Filosofal ", "J. K. Rowling", "Disponivel",dataInicial, dataFinal);        
       
        //Livros StarWars
        Livro starWars1 = new Livro(7, " Troopers da Morte ", "Joe Schreiber",  "Disponivel" ,dataInicial, dataFinal);
        Livro starWars2 = new Livro(8, " Um Novo Amanhece ", "Jackson Miller", "Emprestado", dataInicial,dataFinal);

        
               
        System.out.println("" + starWars1.emprestarLivro());
        
        System.out.println(starWars1.devolverLivro());

        System.out.println("\n" + Livro.buscarLivro(senhorAneis, " O Senhor dos Aneis: A Sociedade do Anel ", "J. R. R. Tolkien"));
        
        System.out.println(Livro.exibirLivrosEmprestados(senhorAneis));        
        
        System.out.println(Livro.exibirLivrosDisponiveis(senhorAneis));
        
        System.out.println(Livro.exibirLivrosAtrasados(senhorAneis));
        
        System.out.println("Multa gerado no dia: "+ harryPotter1.getDataDevolucao() +" "+harryPotter1.gerarMulta(4) + " " );

 
        System.out.println("" + Livro.exibeLivroMaisEmprestado(senhorAneis));

    }

}