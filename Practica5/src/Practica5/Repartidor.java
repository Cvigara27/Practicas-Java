package Practica5;

import java.util.ArrayList;
import java.util.Scanner;

final public class Repartidor extends Empleado{
	private int horasTrabajadas;
	private String zona;
	
	public Repartidor(String nombre, String apellido1, String apellido2, String nif, String edad, float salario, int horasTrabajadas, String zona) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.setHorasTrabajadas(horasTrabajadas);
		this.setZona(zona);
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: "+this.getNombre()+"   NIF: "+this.getNif());
		System.out.println("Apellidos: "+this.getApellido1()+" "+this.getApellido2());
		System.out.println("Edad: "+this.getEdad()+"   Salario: "+this.getSalario());
	}
	
	public void pedirAlta(ArrayList <Empleado> trabajadores) {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		String nombre=input.nextLine();
		System.out.print("Introduce el NIF: ");
		String nif=input.nextLine();
		System.out.print("Introduce el primer apellido: ");
		String apellido1=input.nextLine();
		System.out.print("Introduce el segundo apellido: ");
		String apellido2=input.nextLine();
		System.out.print("Introduce la edad: ");
		String edad=input.nextLine();
		System.out.print("Introduce el salario: ");
		float sueldo=input.nextFloat();
		input.nextLine();
		Empleado señor=new Empleado(nombre,nif,apellido1,apellido2,edad,sueldo);
		trabajadores.add(señor);
	}
}
