
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 21/12/2018 
 * Objetivo sucinto do programa: Esse codigo demonstra quando se tenta acessar uma parte de uma string que e bem maior que o tamanho original na propria string que gera esse erro 
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
 */

class Demonstra_StringIndexOutOfBoundsException{
    public static void main(String[] args) {
        try{
            String nome = "Ilton";
            char altera = nome.charAt(50);
            System.out.println(altera);
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Não pode acessar essa parte na qual deseja");  
        }
     

    }


}