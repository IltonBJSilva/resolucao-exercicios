/*
* Nome do autor: Ilton Batista da Silva Júnior 
* Data de criação do arquivo: 21/12/2018 
* Objetivo sucinto do programa: Verifica se o argumento e valido ou não se ele não for valido retornara e mensagem de erro
* Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.IllegalArgumentException;

class Demonstra_IllegalArgumentException {
    int idade;
    public Demonstra_IllegalArgumentException(){}
    
    public Demonstra_IllegalArgumentException(int idade){
        if(idade != 32324013){
            throw new IllegalArgumentException(Integer.toString(idade));
        }
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }



    public static void main(String[] args) {
        try{    
            Demonstra_IllegalArgumentException humano = new Demonstra_IllegalArgumentException(9);
        }catch(IllegalArgumentException e){
            System.out.println("Argumento não e valido por favor revise");
        }

    
    }
}