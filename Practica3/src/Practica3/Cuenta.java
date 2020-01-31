package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double saldo;
	private String usuario;
	private String contraseña;
	static Scanner input=new Scanner(System.in);
	
	public Cuenta(String nombre, String numCuenta, double saldo, String usuario, String contraseña, ArrayList<Cuenta> lista) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setUsuario(usuario);
		this.setContraseña(contraseña);
		lista.add(this);
	}
	
	public Cuenta(String nombre, String numCuenta, double saldo, String usuario, String contraseña) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setUsuario(usuario);
		this.setContraseña(contraseña);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean ingresar() {
		boolean comprobar=false;
		System.out.println("Cuanto quieres ingresar?");
		double introducir = input.nextDouble();
		if (introducir<0 ) {
			System.out.println("¡ERROR! Operación no valida");
		} else {
			this.setSaldo(introducir+saldo);
			comprobar=true;
		}
		return comprobar;
	}
	
	public boolean retirar() {
		boolean comprobar=false;
		System.out.println("Cuanto quieres retirar?");
		double reintegro = input.nextDouble();
		if (reintegro<0 || reintegro>saldo) {
			System.out.println("¡ERROR! Operación no valida");
		} else {
			this.setSaldo(saldo-reintegro);
			comprobar=true;
		}
		return comprobar;
	}
	
	public void añadirPersona(ArrayList<Cuenta> lista) {
		boolean comprobar=true;
		int i=0;
		while(i<lista.size() && comprobar==true){
			System.out.print("Escribe tu usuario: ");
			String usuario=input.nextLine();
			if(usuario.equals(lista.get(i).getUsuario())) {
				System.out.println("Nombre de usuario ya registrado");
				comprobar=false;
			}
			i++;
		}
		System.out.print("Escribe tu contraseña: ");
		String contraseña=input.nextLine();
		System.out.print("Escribe tu nombre: ");
		String nombre=input.nextLine();
		String cuenta=Integer.toString(lista.size());
		System.out.println("Quieres hacer un ingrso inicial? [Y/N]");
		String inicial=input.nextLine().toUpperCase();
		if (inicial=="Y") {
			System.out.print("Cuanto vas a ingresar? ");
			double saldo=input.nextDouble();
		} else {
			double saldo=0;
		}
		Cuenta persona=new Cuenta(nombre,cuenta,saldo,usuario,contraseña);
		lista.add(persona);
	}
	
}
