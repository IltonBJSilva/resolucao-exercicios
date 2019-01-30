/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 30/01/2019 
 * Objetivo sucinto do programa: Cria classe Staff.java que manipula dados de um staff com nome, endereço, instituição e pagamento
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package PersonStaffStudent;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "["
				+"Name="+ super.getName() 
				+",Adress="+super.getAddress()
				+ ",school=" + school 
				+ ",pay=" + pay +"]";
	}
	
	
	
	
	
}
