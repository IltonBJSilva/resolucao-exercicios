
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 09/01/2019 
 * Objetivo sucinto do programa: Demonstar uma simulação de luta entre emoji
 * Referência ao enunciado/origem do exercício: https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
 */

public class Lutador{
    //Atributos
    private String nome;
    private String nacionalidade;
    private String categoria;
    private double altura;
    private double peso;
    private int vitorias;
    private int idade;
    private int derrotas;
    private int empates;

    //Metodos Especiais
    public Lutador(){}

    public Lutador(String nome, String nacionalidade, int idade, float altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.idade = idade;
        this.derrotas = derrotas;
        this.empates = empates;
    }
 
    
    /*Gets de string*/
    
    public String getNome(){
        return ""+nome;
    }

    public String getNacionalidade(){
        return ""+nacionalidade;
    }
    
    public String getCategoria(){
        return ""+categoria;
    }
    

    /*Gets de doubles */
    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    /*Gets de inteiros*/
    public int getVitorias(){
        return vitorias;
    }

    public int getIdade(){
        return idade;
    }
    public int getDerrotas(){
        return derrotas;
    }

    public int getEmpates(){
        return empates;
    }

    /* Sets das string */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private void setCategoria(double peso) {        
        if(peso <52.2){
            categoria = "Inválido";
        }
        
        else if(peso <= 70.3){
            categoria = "Leve";
        }
        
        else if(peso <= 83.9){
            categoria = "Médio";
        }

        else if(peso <120.2){
            categoria = "Pesado";
        }
        else{
            categoria = "Inválido";
        }

    }

    /* Sets dos doubles */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    /* Sets dos inteiros */
    public void setVitorias(int vitorias) {

        this.vitorias = vitorias;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos Publicos
    public String apresentar(){
        System.out.println("---------------------------------------");
        System.out.println("SENHORAS E SENHORES E HORA DA PORRADA VAMOS APRESENTAR O LUTADOR: "+ this.getNome());
        System.out.println("Origem: "+ this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println("Categoria: "+ this.getCategoria());
        System.out.println("Pensando "+ this.getPeso()+"Kg");
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu:"+ this.getDerrotas());
        System.out.println("Empates: "+ this.getEmpates());
        return "";
    }
    
    public String status(){
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+" empates");
        return "";
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    
    public void perderLuta(){
        setDerrotas(getDerrotas() +1);
    }
    
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);

    }
}