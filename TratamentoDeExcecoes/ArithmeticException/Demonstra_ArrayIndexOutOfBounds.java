
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 20/12/2018 
 * Objetivo sucinto do programa: Demonstrar a situação de erro quando se divide por 0 usando try catch  com a ArithmeticException
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

class Demonstra_ArrayIndexOutOfBounds{
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