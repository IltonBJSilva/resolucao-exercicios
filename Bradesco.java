public class Bradesco {
    /*
     * Nome do autor: Ilton Batista da Silva Júnior Data de criação do arquivo:
     * 05/12/2018 Objetivo sucinto do programa: Programa para demonstração do uso de
     * THIS (Programação Orientada a Objetos) Referência ao enunciado/origem do
     * exercício: Exercício https://docs.google.com/forms/d/e/
     * 1FAIpQLSckb5FSZXqMVsgf3gF831PDLcp0iZySindzJ1P4hkZq7wg0og/viewform Informações
     * adicionais: https://goo.gl/MfFPuz
     */
    int dinheiro = 200;
    int banco = 600;
    int imposto = -4;
    
    Bradesco(int dinheiro){
      this.dinheiro = dinheiro;
    }
    
    Bradesco(int dinheiro, int banco){
      this(dinheiro);
      this.banco = banco;
    }
    
    void salario(int dinheiro, int imposto){
      
      this.dinheiro += dinheiro+this.imposto;
    }
    public static void main(String[] args) {
      Bradesco pessoa1 = new Bradesco(2, 5);
      pessoa1.salario(10, -10);
    }
}