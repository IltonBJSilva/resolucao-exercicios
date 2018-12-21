
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 21/12/2018 
 * Objetivo sucinto do programa: Demonstrar a execeção de quando se tenta manipu
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
 */

class Demonstra_NullPointerException{
    public static void main(String[] args) {
        
        String Carteira = null;
        try{
            System.out.println(Carteira.charAt(2));
        } catch(NullPointerException e){
            System.out.println("Não se pode manipular objeto null");
        }

    }


}