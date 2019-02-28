/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 11/12/2018 
 * Objetivo sucinto do programa: Testar a classe Fatura e iniciar a mesma mandando informações como paramentro
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class TestaFatura {
    public static void main(String[] args) {
        //Faturas
        Fatura fatura1 = new Fatura(1, "Primeira Fatura", 40, 20);
        Fatura fatura2 = new Fatura(2, "Segunda Fatura",  20, 20);
        Fatura fatura3 = new Fatura(3, "Terceira Fatura", 75, 20);

        //Fatura 1
        System.out.println("----------------------");
        System.out.println("Fatura 1:");
        System.out.println("ID: "+ fatura1.getId());
        System.out.println("Preço por Unidade: " + fatura1.PrecoUnidade());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço Total: " + fatura1.getPrecoTotal());
        System.out.println("descrição: " + fatura1.getDescricao());
        

        //Fatura 2
        System.out.println("----------------------");
        System.out.println("Fatura 1:");
        System.out.println("ID: " + fatura2.getId());
        System.out.println("Preço por Unidade: " + fatura2.PrecoUnidade());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço Total: " + fatura2.getPrecoTotal());
        System.out.println("descrição: " + fatura2.getDescricao());

        //Fatura 3
        System.out.println("----------------------");
        System.out.println("Fatura 1:");
        System.out.println("ID: " + fatura3.getId());
        System.out.println("Preço por Unidade: " + fatura3.PrecoUnidade());
        System.out.println("Quantidade: " + fatura3.getQuantidade());
        System.out.println("Preço Total: " + fatura3.getPrecoTotal());
        System.out.println("descrição: " + fatura3.getDescricao());
    }
}