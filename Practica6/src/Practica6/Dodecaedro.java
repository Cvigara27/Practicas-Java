package Practica6;
public class Dodecaedro implements Calculadora{
	//ATRIBUTOS
	private double arista;
	private double apotema;
	
	
	//CONSTRUCTORES
	public Dodecaedro(double arista) {
		this.setArista(arista);
		this.setApotema(arista*1.45);
	}
	
	
	//SETTERS Y GETTERS
	public double getArista() {
		return arista;
	}


	public void setArista(double arista) {
		this.arista = arista;
	}
	
	public double getApotema() {
		return apotema;
	}
	
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}


	//METODOS
	public void calcularArea() {
		double superficie=(((arista*5)*this.getApotema())/2)*12;
		imprimirCaracteristicas();
		System.out.println("El Area es de "+superficie+" unidades imaginarias");
	}
	
	public void calcularVolumen() {
		double volumen=(Math.pow(arista, 3))*7.663;
		imprimirCaracteristicas();
		System.out.println("El Volumen es de "+volumen+" unidades imagirnarias");
	}
	
	public void imprimirCaracteristicas() {
		System.out.println("Calculadora de Cristian Vigara: Con las caracteristicas:");
		System.out.println("Arista: "+this.getArista()+"   Apotema: "+this.getApotema());
	}
}
