/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 29/01/2019 
 * Objetivo sucinto do programa: Testar as classe Circle.java e Cylinder.java
 * Refer�ncia ao enunciado/origem do exerc�cio:https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
 */

package CilindroCircle;

public class TestClass {
	public static void main(String[] args) {
	Cylinder cilindro1 = new Cylinder(3.3,5.5, "Azul");
	Circle circulo1 = new Circle(2.3, "Ciano");

	System.out.println("Circle:  " + circulo1.toString());
	System.out.println("Cylinder: " + cilindro1.toString());
	}
}