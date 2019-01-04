
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 20/12/2018 
 * Objetivo sucinto do programa: Demonstra lançamento na execeção do tipo ArithmeticException.
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
 */

class Demonstra_ArithmeticException{
    public static void main(String[] args) {
        int dinheiro = 20;
        int vazio = 0;
        int total;
        
        try{
            total = dinheiro/vazio;
        }
        catch(ArithmeticException e){
            System.out.println("Impossivel");
        }


    }


}