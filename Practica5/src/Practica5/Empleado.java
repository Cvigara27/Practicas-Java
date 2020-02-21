package Practica5;
import java.util.ArrayList;
import java.util.Scanner;
public class Empleado {
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String nif;
	protected String edad;
	protected float salario;
	
	public Empleado(String nombre, String apellido1, String apellido2, String nif, String edad, float salario) {
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
		this.setNif(nif);
		this.setEdad(edad);
		this.setSalario(salario);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
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
