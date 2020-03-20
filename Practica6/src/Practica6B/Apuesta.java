package Practica6B;
public abstract class Apuesta {
	//ATRIBUTOS
	protected static int numUltApuesta;
	protected int numApuesta;
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	
	
	//CONSTRUCTORES
	public Apuesta(String nombre, String apellido1, String apellido2) {
		this.setNumApuesta(numUltApuesta++);
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
	}
	
	public Apuesta() {
		this.setNumApuesta(numUltApuesta++);
	}
	
	public Apuesta(Apuesta a1) {
		this.setNumApuesta(numUltApuesta++);
		this.setNombre(a1.nombre);
		this.setApellido1(a1.apellido1);
		this.setApellido2(a1.apellido2);
	}
	
	
	//SETTER Y GETTERS
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

	public static int getNumUltApuesta() {
		return numUltApuesta;
	}

	public static void setNumUltApuesta(int numUltApuesta) {
		Apuesta.numUltApuesta = numUltApuesta;
	}
	
	public int getNumApuesta() {
		return numApuesta;
	}

	public void setNumApuesta(int numApuesta) {
		this.numApuesta = numApuesta;
	}

	
	//METODOS
	public void mostrarApuesta() {
		System.out.println("Nombre: "+this.getNombre()+"   Nº Apuesta: "+this.getNumApuesta());
		System.out.println("Apellidos: "+this.getApellido1()+" "+this.getApellido2());
	}
}
