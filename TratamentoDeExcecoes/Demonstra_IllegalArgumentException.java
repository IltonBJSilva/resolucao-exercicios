/*
* Nome do autor: Ilton Batista da Silva Júnior 
* Data de criação do arquivo: 28/12/2018 
* Objetivo sucinto do programa: Demonstra lançamento na execeção do tipo IllegalArgumentException.
* Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.IllegalArgumentException;

class Demonstra_IllegalArgumentException {

    public static void verifica(int numero){
        if(numero != 32324013){
            throw new IllegalArgumentException("Argumento invalido");
        }
    }
    public static void main(String[] args) {
        try {
            verifica(32324012);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}