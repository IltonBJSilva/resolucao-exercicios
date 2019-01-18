
public class PlayStation {
	private int identificacao;
	private double precoConsole;
	private String versao;
	private String estado;
	
	
	public PlayStation(int identificacao, double precoConsole, 
					  String versao, String estado){
		this.identificacao = identificacao;
		this.precoConsole = precoConsole;
		this.versao = versao;
		this.estado = estado;
	}
	

	public int getIdentificacao() {
		return this.identificacao;
	}
	
	public String getVersao() {
		return ""+this.versao;
	}
	
	public void setIdentificacao(int id) {
		identificacao = id;
	}
	
	public void setPrecoConsole(double precoConsole) {
		this.precoConsole = precoConsole;
	}
	
	public void setVersao(String versao) {		

		if(versao == "1") {
			System.out.println("PlayStation 1 meu chapa meio antigo não acha?");
		} else if(versao == "2") {
			System.out.println("PlayStation 2 ta evoluindo mas ainda continua antigo\n menos que antes mas continue firme");			
		} else if(versao == "3") {
			System.out.println("PlayStation 3 meu brow ja ta evoluindo um controle sem fio\n e top mesmo");
		} else if(versao == "4") {
			System.out.println("PlayStation 4 oloco vei tu tem um console de ultima geração que foda vei");
		} else if(versao == "5") {
			System.out.println("PlayStation 5? kkkk nem existe ainda menti e feio");
		} else {
			System.out.println("Vai tomar banho na soda nem existe outro diferente top assim");
		}
	}
	
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		if(estado == "Ligado") {
			ligarConsole();
		} else if(estado == "Desligado"){
			desligaConsole();
		} else {
			System.out.println("Estado não existe");
		}
	}		

	
	public void ligarConsole() {
		
		System.out.println("Console ligado com sucesso");
	}
	
	public void desligaConsole() {
		System.out.println("Console desligado com sucesso");
	}


	@Override
	public String toString() {
		return "\n\nPlayStation\nID = " + identificacao + ", \nPreco do Console= " + precoConsole + "\nversao= " + versao
				+ "\nestado = " + estado;
	}
	
	
}
