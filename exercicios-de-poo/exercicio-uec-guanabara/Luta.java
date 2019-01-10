import java.util.Random;

public class Luta{
   //Atributos
   private Lutador desafiado;
   private Lutador desafiante;
   private boolean aprovada;
   //Métdo especiais

   public Lutador getDesafiado(){
      return desafiado;
   }
   
   public void setDesafiado(Lutador desafiado){
      this.desafiado = desafiado;
   }

   public void marcarLuta(Lutador lutador1, Lutador lutador2){
      if(lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
         this.aprovada = true;
         this.desafiado = lutador1;
         this.desafiante = lutador2;
         System.out.println("Luta marcada com sucesso");
      }
      else{
         this.aprovada = false;
         this.desafiado = null;
         this.desafiante = null;
         System.out.println("Luta negada");

      }
   }
   public void lutar(){
      if(this.aprovada){
         System.out.println("##LUTADOR DESAFIADO##");
         this.desafiado.apresentar();
         System.out.println("##LUTADOR DESAFIANTE##");
         this.desafiante.apresentar();
         Random aleatorio = new Random();
         int vencedor = aleatorio.nextInt(3); // 0 1 2
         
         switch(vencedor){
            case 0: //Empate
            System.out.println("Ouve um empate entre o \n" + this.desafiado.getNome() + "\ne o " + this.desafiante.getNome());
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();

            break;
            
            case 1: //Ganhou Desafiado
            System.out.println("O senhooorrr " + this.desafiado.getNome() + " venceu a lutaaaaa uma salva de palma pesoaal");
            this.desafiado.ganharLuta();
            this.desafiante.perderLuta();
            break;

            case 2: //Ganhou Desafiante
            System.out.println("O senhooorrr " + this.desafiante.getNome() + " venceu a lutaaaaa uma salva de palma pesoaal");
            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();
            break;
         }
      }

      else{
         System.out.println("Luta não pode acontecer");
      }
   }
   



}