/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 12/12/2018 
 * Objetivo sucinto do programa: realiza transferencia de uma conta bancaria pra outra se possivel
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

public class ContaBancaria {
    int id;
    String nomeTitular;
    double saldo = 0.0;

    public ContaBancaria() {
    }

    public ContaBancaria(int id, String nomeTitular, double saldo) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String realizarCredito(double valor) {
        saldo += valor;
        return "" + saldo;
    }

    public String realizarDebito(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return "" + saldo;
        } else {
            return "saldo insuficiente";
        }
    }

    public String realizarTransferencia(ContaBancaria contaDestino, double valor) {
        String retorno = "";
        try {
            double saldo1 = Double.parseDouble(this.realizarDebito(valor));
            if(saldo1 >= valor){
                String saldo2 = contaDestino.realizarCredito(valor);
                System.out.println("Transferência realizada com sucesso!");            
                retorno = "Valor transferido: " + valor + "\nSaldo da conta destino: " + saldo2;
            }
        } catch (NumberFormatException e) {
            retorno = "saldo insuficiente";
        }
        return retorno;
    }

    public String toString() {
        return "Conta [Id: " + id + "Nome: " + nomeTitular + "Saldo: " + saldo + "]";
    }

}