/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 06/12/2018 
 * Objetivo sucinto do programa: Executar a classe TestaCirculo
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class TestaCirculo {
    public static void main(String[] args) {
        //Cada um dos circulos
        Circulo circuloUm = new Circulo(4, "blue");
        Circulo circuloDois = new Circulo(2, "black");
        Circulo circuloTres = new Circulo(6, "prata");

        //Circulo1
        System.out.println("CIRCULO 1:");
        System.out.println("Cor = " + circuloUm.getCor());
        System.out.println("Raio = " + circuloDois.getRaio());
        System.out.println("Area = " + circuloUm.getArea());
        System.out.println("Circuferencia = " + circuloUm.getCircunferencia());
        System.out.println("---------------------------");

        //Circulo2
        System.out.println("CIRCULO 2:");
        System.out.println("Cor = " + circuloTres.getCor());
        System.out.println("Raio = " + circuloDois.getRaio());
        System.out.println("Area = " + circuloDois.getArea());
        System.out.println("Circuferencia = " + circuloDois.getCircunferencia());
        System.out.println("---------------------------");
        
        //Circulo3
        System.out.println("CIRCULO 3:");
        System.out.println("Cor = " + circuloTres.getCor());
        System.out.println("Raio = " + circuloTres.getRaio());
        System.out.println("Area = " + circuloTres.getArea());
        System.out.println("Circuferencia = " + circuloTres.getCircunferencia());
        System.out.println("---------------------------");
    }
}