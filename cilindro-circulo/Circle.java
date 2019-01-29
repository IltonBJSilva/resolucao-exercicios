/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe de um Circulo gerando altura cor e raio e calcula area 
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */


package CilindroCircle;

public class Circle {
	private double radius = 1.0;
	private String color  = "Red";
	
	
	
	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
		
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		double area = 2 * Math.PI * radius;
		return area;
	}

	@Override
	public String toString() {
		return "[radius = " + radius + ", color = " + color+"]";
	}
	
	
	

}
