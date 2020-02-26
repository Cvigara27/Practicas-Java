package Practica5;
import java.util.ArrayList;
import java.util.Scanner;
final public class Comercial extends Empleado{
	//ATRIBUTOS
	private int ventasRealizadas;
	private float comision;
	
	
	//CONSTRUCTORES
	public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, float salario, int ventasRealizadas, float comision) {
		super(nombre, nif, apellido1, apellido2,  edad, salario);
		this.setVentasRealizadas(ventasRealizadas);
		this.setComision(comision);
	}
	
	
	//GETTERS Y SETTERS
	public Comercial() {
	}
	
	public int getVentasRealizadas() {
		return ventasRealizadas;
	}
	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	public float getComision() {
		return comision;
	}
	public void setComision(float comision) {
		this.comision = comision;
	}
	
	
	//METODOS
	public void mostrarAtributos(ArrayList <Empleado> trabajadores) {
		//ENSEÑA TODOS LOS ATRIBUTOS DE LOS COMERCIALES
		int i;
		for (i=0; i<trabajadores.size(); i++) {
			//COMPRUEBA QUE SEA DE TIPO COMERCIAL
			if (trabajadores.get(i) instanceof Comercial) {
				System.out.println("Nombre: "+trabajadores.get(i).getNombre()+"   NIF: "+trabajadores.get(i).getNif());
				System.out.println("Apellidos: "+trabajadores.get(i).getApellido1()+" "+trabajadores.get(i).getApellido2());
				System.out.println("Edad: "+trabajadores.get(i).getEdad()+"   Salario: "+trabajadores.get(i).getSalario());
				System.out.println("Ventas realizadas: "+((Comercial)trabajadores.get(i)).getVentasRealizadas()+"   Comision: "+((Comercial)trabajadores.get(i)).getComision());
				System.out.println();
			}
		}
	}
	
	
	public void pedirAlta(ArrayList <Empleado> trabajadores) {
		//PIDE LA INFORMACIÓN DE UN COMERCIAL
		//PONER MAYUS ESTA DEFINIDO EN EL PADRE
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
		System.out.print("Intoduce la cantidad de ventas realizadas: ");
		int ventas=Integer.parseInt(input.nextLine());
		System.out.print("Introduce la comision: ");
		float comision=Float.parseFloat(input.nextLine());
		//CREA Y AÑADE EL COMERCIAL CON LOS DEBIDOS ATRIBUTOS
		Comercial señor=new Comercial(nombre,nif,apellido1,apellido2,edad,sueldo,ventas,comision);
		trabajadores.add(señor);
	}
}
