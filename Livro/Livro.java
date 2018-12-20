
/*
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 13/12/2018 
 * Objetivo sucinto do programa: receber informações da classe TestaLivro em cada metodo e devolver para que apareça na tela no usuario
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
 */

import java.util.Date;
import java.text.SimpleDateFormat;

public class Livro{
    //Declaração dos metodos
    int id;
    int quantidadeEmprestimos;
    String titulo;

    String autor;
    String statusLivro;
    Date dataEmprestimo;
    Date dataDevolucao;
    SimpleDateFormat converter = new SimpleDateFormat("dd-MM-yyy");

    public Livro(){}

    public Livro (int id, String titulo, String autor, String statusLivro, Date dataEmprestimo, Date dataDevolucao){
        this.autor = autor;
        this.dataDevolucao = dataDevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.id = id;
        this.statusLivro = statusLivro;
        this.titulo = titulo;

    }
    
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }

   public String getDataEmprestimo(){
        String data = "" + converter.format(dataEmprestimo);
        return data;
    }
    
    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    // Retorna a data de devolucao
    public String getDataDevolucao() {
        String data = "" + converter.format(dataDevolucao);
        return data;
    }

    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getStatusLivro(){
        return statusLivro;
    }

    public void setStatusLivro(String statusLivro){
        this.statusLivro = statusLivro;
    }

    public int getQuantidadeEmprestimos(){

        return quantidadeEmprestimos;
    }

    public void setQuantidadeEmprestimos(int quantidadeEmprestimos){
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    //Esse metodo empresta livros
    public String emprestarLivro(){
        
        if(this.getStatusLivro() == "Disponivel"){
            statusLivro = "Emprestado";
            Date dataAtual = new Date();
            setDataEmprestimo(dataAtual);
            long adiciona = dataAtual.getTime() + (864 * 7 * 100000); 
            Date dataAux = new Date();
            setDataDevolucao(dataAux);
            quantidadeEmprestimos++;
            return "------------------------------------------------------\nO livro" + titulo +"foi emprestado com sucesso.\n";

        }
        else{
            return "------------------------------------------------------\n\nO livro " + titulo + " já está emprestado.\n";
        }


    }

    // esse metodo realiza a devolução do livro
    public String devolverLivro(){
        if(statusLivro == "Emprestado"){
            statusLivro = "Disponivel";
            return "------------------------------------------------------\nO livro " + titulo + "devolvido com sucesso.\n";
        }
        else{
            return "------------------------------------------------------\n\nO livro " + titulo + "não pode ser devolvido, pois não está emprestado.\n";
        }


    }


    //Esse metodo lista e busca todos os livros pelo autor e pelo titulo
    public static String buscarLivro(Livro[] arr, String titulo, String autor){
       

        for(int i = 0; i < arr.length; i++){
            if(arr[i].getTitulo() == titulo && arr[i].getAutor() == autor){
                return "------------------------------------------------------\nLivro encotrado com sucesso!\n"+ "Id: " + arr[i].getId() 
                + "\nTitulo: " + arr[i].getTitulo() 
                + "\nAutor: "+ arr[i].getAutor() 
                + "\nData de emprestimo: " + arr[i].getDataEmprestimo() 
                + "\nData de devolucao: " + arr[i].getDataDevolucao() 
                + "\nStatus do livro: " + arr[i].getStatusLivro() 
                + "\nQuantidade de emprestimos: " + arr[i].getQuantidadeEmprestimos();
            }
            
        }
        
        return "Livro não encotrado";
    }
    
    //Esse metodo exibi todos os livros que foram Emprestados
    public static String exibirLivrosEmprestados (Livro[] arr){
        String livros = "Emprestados\n";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getStatusLivro() == "Emprestado"){
                livros += "Titulo do livro = " + arr[i].getTitulo() +"\n";
            }
        }
        return livros;
    }

    //esse metodo exibi todos os livros Disponivel ou seja que não foram emprestados
    public static String exibirLivrosDisponiveis(Livro[] arr){
    String livros = "------------------------------------------------------\nLivro disponivel\n";
    for(int i = 0;i<arr.length;i++)
    {
        if (arr[i].getStatusLivro() == "Disponivel") {
            livros += arr[i].getTitulo() + "\n";
        }
    }
    return livros;
      
    }

    //Esse metodo so exibi os livros atrasados
    public static String exibirLivrosAtrasados(Livro[] arr){
        String livros = "------------------------------------------------------\nLivros Atrasados\n";
        Date dataAtual = new Date();
        for(int i = 0; i < arr.length; i++){
            if(dataAtual.getTime() > arr[i].dataDevolucao.getTime() && arr[i].getStatusLivro() == "Emprestado"){
                livros += arr[i].getTitulo() + "\n";
            }
        }
        return livros;
    }

    //Esse metodo gera uma multa se a pessoa demorar muito e multada de acordo com o tanto de dia
    public double gerarMulta(double taxaPorDiaAtrasado){
        Date dataAtual = new Date();
            if(dataAtual.getTime() < dataDevolucao.getTime()){
                long diferente = dataDevolucao.getTime() - dataAtual.getTime();
                long dia = diferente / (864 * 1 * 100000) * 1;
                double preco = dia * taxaPorDiaAtrasado;
                return preco;
            }else{
                return -1;
            }
    } 


    //Esse metodo lista todos os livros no qual mas pessoas pegou
    public static String exibeLivroMaisEmprestado(Livro[] arr){
        String livro = "------------------------------------------------------\nMas emprestados: \n";
        int quantidadeEmprest = 0;
        int posicao = 0;
        int id = 0;
        String titulo = "";
        String autor = "";
        String statusLivro = "";
        String dataEmprestimo = "";
        String dataDevolucao = "";
        int quantidadeEmprestimos = 0;

        for(int i = 0; i < arr.length; i++){
            if (i == 0){
                quantidadeEmprest = arr[i].getQuantidadeEmprestimos();
                posicao = i;
                id = arr[i].getId();
                titulo = arr[i].getTitulo();
                autor = arr[i].getAutor();
                statusLivro = arr[i].getStatusLivro();
                dataEmprestimo = arr[i].getDataEmprestimo();
                dataDevolucao = arr[i].getDataDevolucao();
                quantidadeEmprestimos = arr[i].getQuantidadeEmprestimos();



            }if (arr[i].getQuantidadeEmprestimos() > quantidadeEmprest){
                quantidadeEmprest = arr[i].getQuantidadeEmprestimos();
                posicao = i;
                id = arr[i].getId();
                titulo = arr[i].getTitulo();
                autor = arr[i].getAutor();
                statusLivro = arr[i].getStatusLivro();
                dataEmprestimo = arr[i].getDataEmprestimo();
                dataDevolucao = arr[i].getDataDevolucao();
                quantidadeEmprestimos = arr[i].getQuantidadeEmprestimos();
            }
        }
        return "------------------------------------------------------\nLivros mas emprestados\n" + "ID: " + id 
        + "\nTitulo: "+ titulo 
        + "\nAutor: " + autor 
        + "\nStatus do livro: " + statusLivro 
        + "\nQuantidade de emprestimo: " + quantidadeEmprestimos;
    }

    
    public String toString(){

        return "Livro[id= " + id + " titulo= " + titulo + " autor= " + autor + " dataEmprestimo= "+ converter.format(dataEmprestimo) + " dataDevolucao= " + converter.format(dataDevolucao) + " statusLivro= " + statusLivro + " quantidadeEmprestimos= " + quantidadeEmprestimos + "]";
        
    }


}
