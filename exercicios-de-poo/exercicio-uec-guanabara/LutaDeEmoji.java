public class LutaDeEmoji{
    public static void main(String[] args){
       
        Lutador lutador[] = new Lutador[6];
        
        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9, 11, 2, 1);
        
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8, 4, 2, 3);
        
        lutador[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9, 12, 2, 1);
        
        lutador[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6, 13, 0, 2);
        
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3, 5, 4, 3);
        
        lutador[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7, 12, 2, 4);
       
        System.out.println(lutador[0].apresentar());
        // System.out.println(lutador[2].apresentar());
        // System.out.println(lutador[1].apresentar());
        // System.out.println(lutador[3].apresentar());
        // System.out.println(lutador[4].apresentar());
        // System.out.println(lutador[5].apresentar());

        Luta luta = new Luta();
        
        luta.marcarLuta(lutador[4], lutador[5]);
        luta.lutar();
        lutador[4].status();

       

    }
}