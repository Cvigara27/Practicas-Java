package Practica5;
import java.util.ArrayList;
import java.util.Scanner;
final public class Repartidor extends Empleado{
	//ATRIBUTOS
	private int horasTrabajadas;
	private String zona;
	
	
	//CONSTRUCTORES
	public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, float salario, int horasTrabajadas, String zona) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.setHorasTrabajadas(horasTrabajadas);
		this.setZona(zona);
	}
	
	
	//GETTERS Y SETTERS
	public Repartidor() {
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
	
	
	//METODOS
	public void mostrarAtributos(ArrayList <Empleado> trabajadores) {
		//ENSEÑA TODOS LOS ATRIBUTOS DE LOS REPARTIDORES
		int i;
		for (i=0; i<trabajadores.size(); i++) {
			//COMPRUEBA QUE SEA DE TIPO REPARTIDOR
			if (trabajadores.get(i) instanceof Repartidor) {
				System.out.println("Nombre: "+trabajadores.get(i).getNombre()+"   NIF: "+trabajadores.get(i).getNif());
				System.out.println("Apellidos: "+trabajadores.get(i).getApellido1()+" "+trabajadores.get(i).getApellido2());
				System.out.println("Edad: "+trabajadores.get(i).getEdad()+"   Salario: "+trabajadores.get(i).getSalario());
				System.out.println("Horas trabajadas: "+((Repartidor)trabajadores.get(i)).getHorasTrabajadas()+"   Zona: "+((Repartidor)trabajadores.get(i)).getZona());
				System.out.println();
			}
		}
	}
	
	
	public void pedirAlta(ArrayList <Empleado> trabajadores) {
		//PIDE LA INFORMACIÓN DE UN REPARTIDOR
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
		System.out.print("Intoduce la cantidad de horas trabajadas: ");
		int horas=Integer.parseInt(input.nextLine());
		System.out.print("Introduce la zona de trabajo: ");
		String zona=input.nextLine();
		//CREA Y AÑADE EL REPARTIDOR CON LOS DEBIDOS ATRIBUTOS
		Repartidor señor=new Repartidor(nombre,nif,apellido1,apellido2,edad,sueldo,horas,zona);
		trabajadores.add(señor);
	}
}
