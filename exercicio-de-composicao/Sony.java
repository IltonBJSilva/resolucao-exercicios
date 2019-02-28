
public class Sony {
	int quantidadeConsole;
	String fundador;
	String ceo;
	PlayStation console;
	
	public Sony(int quantidadeConsole, String fundador, String ceo, PlayStation console) {
		this.quantidadeConsole = quantidadeConsole;
		this.fundador = fundador;
		this.ceo = ceo;
		this.console = console;
	}
	
	public int getQuantidadeConsole() {
		return quantidadeConsole;
	}

	public void setQuantidadeConsole(int quantidadeConsole) {
		this.quantidadeConsole = quantidadeConsole;
	}

	public String getFundador() {
		return ""+fundador;
	}

	public void setFundador(String fundador) {
		this.fundador = fundador;
	}

	public String getCeo() {
		return ""+ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	public void criaConsole() {
		
		System.out.println("novo console criado com sucesso");
	}

	@Override
	public String toString() {
		return "Sony\nquantidade de Console = " 
				+ quantidadeConsole 
				+"\nfundador = " + fundador 
				+"\nCEO DA EMPRESA = " + ceo
				+ "\nID = " + console.getIdentificacao()
				+ "\nPre�o do console = "+ console.getPrecoConsole()
				+ "\nVersao do console = "+ console.getVersao()
				+ "\nEstado do console = "+ console.getEstado();
	}	
}