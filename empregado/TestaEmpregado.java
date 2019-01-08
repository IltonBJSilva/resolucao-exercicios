/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 07/12/2018 
 * Objetivo sucinto do programa: Que chama classe Empregado e seus metodos 
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class TestaEmpregado {


    public static void main(String[] args) {
        //Fucionario da empresa
        Empregado Fucionario1 = new Empregado(1, "Ilton", "Batista", 1000);
        Empregado Fucionario2 = new Empregado(2, "Elian", "Melo", 800);
        Empregado Fucionario3 = new Empregado(3, "Fabio", "Amoire", 600);

        //Fucionario 1:
        System.out.println("-------------------------------------------");
        System.out.println("Fucionario 1:");
        System.out.println("Nome = "+ Fucionario1.getNomeCompleto());
        System.out.println("Salario normal = " + Fucionario1.getSalario());
        System.out.println("Salario Anual = "+ Fucionario1.getSalarioAnual());
        System.out.println(" Aumento de salario = " + Fucionario1.getAumentoSalario(10));

        // Fucionario 2:
        System.out.println("-------------------------------------------");
        System.out.println("Fucionario 2:");
        System.out.println("Nome = " + Fucionario2.getNomeCompleto());
        System.out.println("Salario normal = " + Fucionario2.getSalario());
        System.out.println("Salario Anual = " + Fucionario2.getSalarioAnual());
        System.out.println(" Aumento de salario = " + Fucionario2.getAumentoSalario(20));


        //Fucionario 3:
        System.out.println("-------------------------------------------");
        System.out.println("Fucionario 3:");
        System.out.println("Nome = " + Fucionario3.getNomeCompleto());
        System.out.println("Salario normal = " + Fucionario3.getSalario());
        System.out.println("Salario Anual = " + Fucionario3.getSalarioAnual());
        System.out.println(" Aumento de salario = " + Fucionario3.getAumentoSalario(30));

    }

}