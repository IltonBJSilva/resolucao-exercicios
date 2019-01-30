/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 30/01/2019 
 * Objetivo sucinto do programa: Cria classe Student.java que manipula dados de um estudante
 * Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package br.com.sankhya.exercicio.person;

public class Student extends Person{
	private String program;
	private int  year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "["
				+ "Name="+ super.getName()
				+ ", Address="+super.getAddress()
				+ ", program=" + program + ", "
				+ ", year=" + year 
				+ ", fee=" + fee +"]";
	}
	
	
	
}
