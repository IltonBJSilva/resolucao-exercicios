
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 05/12/2018 
 * Objetivo sucinto do programa: Programa para demonstração do uso de 
 * THIS (Programação Orientada a Objetos) 
 * Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63
 */

 public class Conta
{
private String nome = "carlos"; // variável de instância

    // método para definir o nome no objeto 
    public void getNome(String nome) 
    { 
        this.nome = nome; // armazena o nome 
    } 
    // método para recuperar o nome do objeto 
    public String setNome(String texto) 
    { 
        return nome; // retorna valor do nome para o chamador
    }

    
 } // fim da classe Account