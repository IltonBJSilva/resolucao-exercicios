class Sandero implements Car{
    /* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 09/01/2019 
 * Objetivo sucinto do programa: Demonstar o uso na interface que pede que os metodos escritos sejam passado tbm para a class na qual foi implementada
 * Referência ao enunciado/origem do exercício:https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
 */
    
    
    
    int testa;
    Boolean possui;
    String qualidade;

    //Mensagem de erro que gera quando não e chamado os metodos pedido pela interface
    /**
     * sers\ilton.silva\Desktop\TRABALHO\Resolucao\resolucao-exercicios\exercicios-de-poo\exercicio-docs-oracle\Sandero.java:1: error: Sandero is not abstract and does not override abstract method rodas(String) in Car
    class Sandero implements Car{
    ^
    1 error
     */
    
    public void aplicacaoFreios(int testa){
        this.testa = testa;
    }

    public void airbag(Boolean possui){
        this.possui = possui;
    }

    public void rodas(String qualidade){
        this.qualidade = qualidade;
    }


}