/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Cria classe de um cilindro gerando altura cor e raio e calcula area e volume 
 * Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */


package CilindroCircle;

public class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return super.getArea() * height;
	}

	public double getArea() {
		return 2 * Math.PI * super.getRadius() * 2 + height * super.getArea();
	}
	
	@Override
	public String toString() {
		return "[radius = " + this.getRadius() + ", color = " + this.getColor() + ", height = "+ height +"]";
	}

}
