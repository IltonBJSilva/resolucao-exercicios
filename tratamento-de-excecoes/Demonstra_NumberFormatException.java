/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 21/12/2018 
 * Objetivo sucinto do programa: Demonstra lançamento na execeção do tipo NumberFormatException
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
 */

class Demonstra_NumberFormatException {
    public static void main(String[] args) {

        try{
            int idade = Integer.parseInt("quinze");
            System.out.println(idade);

        } catch(NumberFormatException e){
            System.out.println("Formato invalido troque a palavra por numeros ou refaça seu codigo");
        }
    }
}