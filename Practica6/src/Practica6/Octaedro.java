package Practica6;
public class Octaedro implements Calculadora{
	//ATRIBUTOS
	private double arista;
	
	
	//CONSTRUCTOR
	public Octaedro(double arista) {
		this.setArista(arista);
	}


	//SETTERS Y GETTERS
	public double getArista() {
		return arista;
	}


	public void setArista(double arista) {
		this.arista = arista;
	}
	
	
	//METODOS
	public void calcularArea() {
		double superficie=2*Math.sqrt(3)*Math.pow(this.getArista(), 2);
		imprimirCaracteristicas();
		System.out.println("El Area es de "+superficie+" unidades imaginarias");
	}
	
	public void calcularVolumen() {
		//ES NECESARIO PONER .0 EN 1/3 PARA QUE NO DEVUELVA UN INTEGRO
		double volumen=(1.0/3.0)*Math.sqrt(2)*Math.pow(this.getArista(),3);
		imprimirCaracteristicas();
		System.out.println("El Volumen es de "+volumen+" unidades imaginarias");
	}
	
	public void imprimirCaracteristicas() {
		System.out.println("Calculadora de Cristian Vigara: Con las caracteristicas:");
		System.out.println("Arista: "+this.getArista());
	}
}
