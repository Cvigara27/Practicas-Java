package practicaobjetos;
import java.util.Scanner;
public class Nif {
	private String nif;
	private String direccion;
	private String nombrePadre;
	private String nombreMadre;
	
	public Nif(String nif, String direccion, String nombrePadre, String nombreMadre) {
		super();
		this.setNif(nif);
		this.setDireccion(direccion);
		this.setNombrePadre(nombrePadre);
		this.setNombreMadre(nombreMadre);
	}
	
	public Nif() {
		
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombrePadre() {
		return nombrePadre;
	}

	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}

	public String getNombreMadre() {
		return nombreMadre;
	}

	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	
	public void pedirInfo() {
		Scanner input=new Scanner(System.in);
		System.out.print("Escribe el NIF: ");
		this.setNif(input.nextLine());
		System.out.print("Escribe la direccion: ");
		this.setDireccion(input.nextLine());
		System.out.print("Escribe el nombre del padre: ");
		this.setNombrePadre(input.nextLine());
		System.out.print("Escribe el nombre de la madre: ");
		this.setNombreMadre(input.nextLine());
		input.close();
	}
	
	public void mostrarInfo() {
		System.out.println("NIF: "+this.getNif());
		System.out.println("Direccion: "+this.getDireccion());
		System.out.println("Nombre padre: "+this.getNombrePadre());
		System.out.println("Nombre madre: "+this.getNombreMadre());
	}
	
}
