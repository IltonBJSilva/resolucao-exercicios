// Figura 3.2: contaTeste.Java
// Cria e manipula um objeto Account.
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
        System.out.printf("Initial name is: %s%n%n", minhaConta.pegaNome(null));
        
        // solicita e lê o nome
        System.out.println("Please enter the name:");

        String Onome = input.nextLine(); // lê uma linha de texto pra vc mesmo inserir oque deseja que vai virar Onome

        minhaConta.colocaNome(Onome); // insere Onome em minhaConta no colocaNome que recebe como paramentro nome

        System.out.println(); // gera saída de uma linha em branco

        // exibe o nome armazenado no objeto minhaConta no caso chama o novo Onome acessando
        //
        System.out.printf("Name in object minhaConta is:%n%s%n",minhaConta.pegaNome(null));
    }
} // fim da classe contaTeste