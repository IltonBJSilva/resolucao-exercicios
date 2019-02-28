/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 11/12/2018 
 * Objetivo sucinto do programa: Mostar as informações relacionada a fatura como id, descrição, quantidade e o preço po unidade
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class Fatura 
{
    int id;
    String descricao;
    int quantidade;
    double precoUnidade;

    public Fatura(){}
    
    public Fatura(int id, String descricao, int quantidade, double precoUnidade ){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }
    //retorna ID
    public int getId(){
    return id;
    }
    
    //retorna descrição
    public String getDescricao(){
        return descricao;
    }
    
    //retorna a quantidade
    public int getQuantidade(){
        return quantidade;
    }
    
    // altera quantidade da classe 
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double PrecoUnidade(){
        return precoUnidade;
    }

    //altera preçoUnidade da classe
    public void setPrecoUnidade(double precoUnidade){
        this.precoUnidade = precoUnidade;
    }

    //mostra o total
    public double getPrecoTotal(){
        return (quantidade * precoUnidade);
    }

   public String toString(){
        return "Fatura[Quantidade: " + quantidade + "\n preço por unidade: " + precoUnidade + "\n ID: " + id + "descrição: " + descricao + "]"; 
    }
}    