package Practica4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Socio extends Pelicula{
	private String nombre;
	private String numSocio;
	private String contrase�a;
	static Scanner input=new Scanner(System.in);
	
	public Socio(String nombre, String numSocio, String contrase�a, ArrayList<Socio> lista) {
		this.setNombre(nombre);
		this.setNumSocio(numSocio);
		this.setContrase�a(contrase�a);
		lista.add(this);
	}
	
	public Socio(String nombre, String numSocio, String contrase�a) {
		this.setNombre(nombre);
		this.setNumSocio(numSocio);
		this.setContrase�a(contrase�a);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(String numSocio) {
		this.numSocio = numSocio;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void a�adirPersona(ArrayList<Socio> lista) {
		System.out.print("Escribe tu nombre: ");
		String nombre=ponerMayus(input.nextLine());
		System.out.print("Escribe tu contrase�a: ");
		String contrase�a=input.nextLine();
		String cuenta=Integer.toString(lista.size());
		Socio persona=new Socio(nombre,cuenta,contrase�a);
		lista.add(persona);
	}
	
	public void videoclub(ArrayList <Pelicula> videoclub,HashMap <String,String> reservas, String nombre, ArrayList <Socio> miembros) {
		boolean menu=true;
		System.out.println();
		while(menu==true) {
			System.out.println("==================================");
			System.out.println("|       V I D E O C L U B        |");
			System.out.println("==================================");
			System.out.println("|                                |");
			System.out.println("|  1) A�adir pel�cula            |");
			System.out.println("|  2) Reservar pel�cula          |");
			System.out.println("|  3) Buscar pelicula            |");
			System.out.println("|  4) Ver reservas               |");
			System.out.println("|  5) Salir                      |");
			if (this.getNumSocio().equals("0")) {
				System.out.println("|  9999) Crear una nueva cuenta  |");
			}
			System.out.println("|                                |");
			System.out.println("==================================");
			System.out.print("�Qu� opci�n deseas? ");
			int opcion=input.nextInt();
			input.nextLine();
			switch(opcion) {
				case 1:
					a�adirPelicula(videoclub);break;
				case 2:
					reservarPelicula(videoclub,reservas,nombre);break;
				case 3:
					buscarPelicula(videoclub);break;
				case 4:
					verReserva(reservas,videoclub,miembros);break;
				case 5:
					menu=false;break;
				case 9999:
					if (this.getNumSocio().equals("0")) {
						a�adirPersona(miembros);break;
					}
				default:
					System.out.println("�ERROR! Operacion no valida");
			}
		}
	}
}
