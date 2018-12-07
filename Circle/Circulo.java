/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 06/12/2018 
 * Objetivo sucinto do programa: Criar raio, cor, circuferencia e area do circulo
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */
 
 public class Circulo
{ 
    private double raio = 1.0;
    private String cor = "red";

    public Circulo(){

    }
    public Circulo(double raio){

        this.raio = raio;
    }
    public Circulo(double raio, String cor) {

        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio(){
       
        return this.raio;
    }

    public String getCor(){
       return this.cor;
    }

    public void setRaio(double raio){
    
        this.raio = raio;

    }

    public void setCor(String cor){

        this.cor = cor;

    }

    public String toString(){

        return "Circulo [Raio: " + raio + ", Cor: " + cor +"]";

    }

    public double getArea(){
        return Math.PI*(raio*raio);
    }
    public double getCircunferencia(){
        
        return 2 * Math.PI * raio;
    }
 }