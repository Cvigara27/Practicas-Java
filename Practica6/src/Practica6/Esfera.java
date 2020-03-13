package Practica6;
public class Esfera implements Calculadora{
	//ATRIBUTOS
	private double radio;
	
	
	//CONSTRUCTORES
	public Esfera(double radio) {
		this.setRadio(radio);
	}
	
	
	//SETTERS Y GETTERS
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	//METODOS
	public void calcularArea() {
		double superficie=4*Math.PI*Math.pow(this.getRadio(), 2);
		imprimirCaracteristicas();
		System.out.println("El Area es de "+superficie+" unidades imaginarias");
	}
	
	public void calcularVolumen() {
		double volumen=(4*Math.PI*Math.pow(this.getRadio(),3))/3;
		imprimirCaracteristicas();
		System.out.println("El Volumen es de "+volumen+" unidades imaginarias");
	}
	
	public void imprimirCaracteristicas() {
		System.out.println("Calculadora de Cristian Vigara: Con las caracteristicas:");
		System.out.println("Radio: "+this.getRadio());
	}
}
