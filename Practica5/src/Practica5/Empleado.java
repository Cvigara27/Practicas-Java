package Practica5;
import java.util.ArrayList;
import java.util.Scanner;
public class Empleado {
	//ATRIBUTOS
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String nif;
	protected int edad;
	protected float salario;
	
	
	//CONSTRUCTORES
	public Empleado(String nombre, String nif, String apellido1, String apellido2 , int edad, float salario) {
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
		this.setNif(nif);
		this.setEdad(edad);
		this.setSalario(salario);
	}
	
	public Empleado() {
	}
	
	
	//GETTERS Y SETTERS
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	//METODOS
	public String ponerMayus(String cadena) {
		//PONE LA PRIMERA LETRA EN MAYUSCULAS Y EL RESTO EN MINUSCULAS
		int i;
		cadena.toLowerCase();
		String[] uppers=cadena.split(" ");
		for (i=0; i<uppers.length; i++) {
			String mayus=uppers[i].substring(0,1).toUpperCase();
			mayus=mayus+uppers[i].substring(1);
			uppers[i]=mayus;
		}
		String chain="";
		for (i=0; i<uppers.length; i++) {
			chain+=uppers[i]+" ";
		}
		return chain;
	}
	
	
	public void mostrarAtributos(ArrayList <Empleado> trabajadores) {
		//ENSEÑA TODOS LOS ATRIBUTOS DE LOS EMPLEADOS
		int i;
		for (i=0; i<trabajadores.size(); i++) {
			//COMPRUEBA QUE SEA DE TIPO EMPLEADO
			if (trabajadores.get(i) instanceof Empleado) {
				System.out.println("Nombre: "+trabajadores.get(i).getNombre()+"   NIF: "+trabajadores.get(i).getNif());
				System.out.println("Apellidos: "+trabajadores.get(i).getApellido1()+" "+trabajadores.get(i).getApellido2());
				System.out.println("Edad: "+trabajadores.get(i).getEdad()+"   Salario: "+trabajadores.get(i).getSalario());
				System.out.println();
			}
		}
	}
	
	
	public void pedirAlta(ArrayList <Empleado> trabajadores) {
		//PIDE LA INFORMACION DE UN EMPLEADO
		Scanner input=new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		String nombre=ponerMayus(input.nextLine());
		System.out.print("Introduce el NIF: ");
		String nif=input.nextLine();
		System.out.print("Introduce el primer apellido: ");
		String apellido1=ponerMayus(input.nextLine());
		System.out.print("Introduce el segundo apellido: ");
		String apellido2=ponerMayus(input.nextLine());
		System.out.print("Introduce la edad: ");
		int edad=Integer.parseInt(input.nextLine());
		//COMPRUEBA QUE SEA MAYOR DE 16 AÑOS
		while(edad<16) {
			System.out.println("Edad demasiado baja");
			System.out.println();
			System.out.print("Introduce la edad: ");
			edad=Integer.parseInt(input.nextLine());
		}
		System.out.print("Introduce el salario: ");
		float sueldo=Float.parseFloat(input.nextLine());
		//CREA Y AÑADE EL REPARTIDOR CON LOS DEBIDOS ATRIBUTOS
		Empleado señor=new Empleado(nombre,nif,apellido1,apellido2,edad,sueldo);
		trabajadores.add(señor);
	}
}
