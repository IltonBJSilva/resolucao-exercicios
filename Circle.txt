
// Figura 3.1: Account.java
 // Classe Account que contém uma variável de instância name
 // e métodos para configurar e obter seu valor.

 public class Conta
{
private String nome = "carlos"; // variável de instância

    // método para definir o nome no objeto 
    public void colocaNome(String nome) 
    { 
        this.nome = nome; // armazena o nome 
    } 
    // método para recuperar o nome do objeto 
    public String pegaNome(String text) 
    { 
        return nome; // retorna valor do nome para o chamador
    }
    public static void main(String[] args) {   

    }
    
 } // fim da classe Account