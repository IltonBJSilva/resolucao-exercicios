/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 05/12/2018 
 * Objetivo sucinto do programa: Programa para demonstração do uso de 
 * THIS (Programação Orientada a Objetos) 
 * Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63
 */

import java.util.Scanner;

public class ContaTeste 
{
  public static void main(String[] args)
  {
        //- cria um objeto Scanner para obter entrada a partir da janela de comando, ou seja para o usuario digitar alguma coisa,
        //semelante com scanf
        Scanner input = new Scanner(System.in);

        // cria um objeto Conta e o atribui a minhaConta, mas resumido faz acesso a class Conta.java com a ContaTeste.java
        Conta minhaConta = new Conta(); 

        // exibe o valor inicial do nome (null) o valor ja guardado na variavel antiga
        System.out.printf("Nome inicial: %s%n%n", minhaConta.getNome(null));
        
        // solicita e lê o nome
        System.out.println("Por favor digite um nome:");

        String Onome = input.nextLine(); // lê uma linha de texto pra vc mesmo inserir oque deseja que vai virar Onome

        minhaConta.getNome(Onome); // insere Onome em minhaConta no getNome que recebe como paramentro nome

        System.out.println(); // gera saída de uma linha em branco

        // exibe o nome armazenado no objeto minhaConta no caso chama o novo Onome acessando
        //
        System.out.printf("Name na minha conta: %n%s%n",minhaConta.getNome(null));
    }
} // fim da classe contaTeste