package practicaobjetos;
import java.util.Scanner;
public class Persona {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private int edad;
	private Nif infoNif=new Nif();

	public Persona(String nombre, String primerApellido, String segundoApellido, int edad, Nif infoNif) {
		this.setNombre(nombre);
		this.setPrimerApellido(primerApellido);
		this.setSegundoApellido(segundoApellido);
		this.setEdad(edad);
		this.setInfoNif(infoNif);
	}

	public Persona(){
		
	}
	
	public Persona(Persona pers1) {
		this.nombre = pers1.nombre;
		this.primerApellido = pers1.primerApellido;
		this.segundoApellido = pers1.segundoApellido;
		this.edad = pers1.edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public Nif getInfoNif() {
		return infoNif;
	}

	public void setInfoNif(Nif infoNif) {
		this.infoNif = infoNif;
	}

	public void solicitarDatos() {
		Scanner input=new Scanner(System.in);
		System.out.print("Escribe el nombre: ");
		this.setNombre(input.nextLine());
		System.out.print("Escribe el primer apellido: ");
		this.setPrimerApellido(input.nextLine());
		System.out.print("Escribe el segundo apellido: ");
		this.setSegundoApellido(input.nextLine());
		System.out.print("Escribe la edad: ");
		this.setEdad(Integer.parseInt(input.nextLine()));
		this.infoNif.pedirInfo();
		input.close();
	}
	
	public void mostrarAtributos() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellido1: "+this.getPrimerApellido());
		System.out.println("Apellido2: "+this.getSegundoApellido());
		System.out.println("Edad: "+this.getEdad());
		this.infoNif.mostrarInfo();
	}
}
