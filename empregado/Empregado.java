/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 07/12/2018 
 * Objetivo sucinto do programa: Cria classe Empregado com metodos atribuido ao fucionario
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class Empregado 
{
    int id;
    String primeiroNome, segundoNome;
    int salario;

    Empregado(){}
    
    Empregado(int id, String primeroNome, String segundoNome, int salario){
        this.id = id;
        this.primeiroNome = primeroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPrimeiroNome(){
        return this.primeiroNome;
    }
    
    public String getSegundoNome(){
        return this.segundoNome;
    }

    public String getNomeCompleto(){
        return primeiroNome + " " + segundoNome;
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
         this.salario = salario;
    }

    public int getSalarioAnual(){
        return salario*12;
    }
 
    public int getAumentoSalario(int porcentagem){
        return (porcentagem * salario) /100;
    }

    public String toString(){
        return "Fucionario [Salario normal: " + salario  + "\n ID = " + id + "]"; 
    }
}