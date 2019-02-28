/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 12/12/2018 
 * Objetivo sucinto do programa: Testa a classe ContaBancaria e printa todos os valores passado e retorna as informação pedida
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class TestaContaBancaria {
        public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, "Ilton", 0.0);
        ContaBancaria conta2 = new ContaBancaria(2, "Lucas", 500.0);
        ContaBancaria conta3 = new ContaBancaria(3, "Ana", 800.0);

        //Conta01
        System.out.println("---------------------------");
        // System.out.println("" + conta1.realizarDebito(1000.0));
        // System.out.println("" + conta1.realizarCredito(20));
        System.out.println("" + conta1.realizarTransferencia(conta2, 100.0));
        System.out.println("Titular da conta destino: " + conta2.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + conta1.getSaldo());

        //Conta02
        System.out.println("---------------------------");
        // System.out.println("" + conta2.realizarDebito(2000));
        // // System.out.println("" + conta2.realizarCredito(20));
        System.out.println("" + conta2.realizarTransferencia(conta3, 100000.0));
        System.out.println("Titular da conta destino: " + conta3.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + conta2.getSaldo());

        //Conta03
        System.out.println("---------------------------");
        // System.out.println("" + conta3.realizarDebito(700));
        // // System.out.println("" + conta3.realizarCredito(20));
        System.out.println("" + conta3.realizarTransferencia(conta1, 100.0));
        System.out.println("Titular da conta destino: " + conta1.getNomeTitular());
        System.out.println("Saldo total da sua conta: " + conta3.getSaldo());
        System.out.println("---------------------------");
    }
}