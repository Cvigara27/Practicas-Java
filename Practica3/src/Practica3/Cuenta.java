package Practica3;
import java.util.Scanner;
public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;
	static Scanner input=new Scanner(System.in);
	
	public Cuenta(String nombre, String numCuenta, double tipoInteres, double saldo) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setTipoInteres(tipoInteres);
		this.setSaldo(saldo);
	}

	public Cuenta() {
		
	}

	public Cuenta(Cuenta c1) {
		this.setNombre(c1.nombre);
		this.setNumCuenta(c1.numCuenta);
		this.setTipoInteres(c1.tipoInteres);
		this.setSaldo(c1.saldo);
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

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void crearCuenta() {
		System.out.print("Escribe tu nombre: ");
		this.setNombre(input.nextLine());
		System.out.print("Esribe el numero de cuenta: ");
		this.setNumCuenta(input.nextLine());
		System.out.print("Escribe tu interes: ");
		this.setTipoInteres(input.nextDouble());
		this.setSaldo(0);
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
}
