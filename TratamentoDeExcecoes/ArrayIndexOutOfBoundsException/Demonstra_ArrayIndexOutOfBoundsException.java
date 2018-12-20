
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 20/12/2018 
 * Objetivo sucinto do programa: Demonstrar a execeção de nome ArrayIndexOutOfBoundsException de que quando tenta acessar um array que não existe
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
 */

class Demonstra_ArrayIndexOutOfBoundsException{
    public static void main(String[] args) {
        
        int casa[] = new int[4];
        
        try{
            casa[5] = 30;
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array não existe ou e negativo");
        }

    }


}