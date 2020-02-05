package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double saldo;
	private String contraseña;
	static Scanner input=new Scanner(System.in);
	
	public Cuenta(String nombre, String numCuenta, double saldo, String contraseña, ArrayList<Cuenta> lista) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setContraseña(contraseña);
		lista.add(this);
	}
	
	public Cuenta(String nombre, String numCuenta, double saldo, String contraseña) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setContraseña(contraseña);
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña.toUpperCase();
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
		if (reintegro<0 || reintegro>this.getSaldo()) {
			System.out.println("¡ERROR! Operación no valida");
		} else {
			this.setSaldo(saldo-reintegro);
			comprobar=true;
		}
		return comprobar;
	}
	
	public void transferir(ArrayList<Cuenta> lista) {
		Scanner input=new Scanner(System.in);
		boolean numcuenta=false,transfer=true;
		int idAccount = 0;
		while(numcuenta==false) {
			System.out.print("Introduzca el numero de cuenta destino: ");
			String numacc=input.nextLine();
			int i=0;
			while(i<lista.size() && numcuenta==false) {
				if (numacc.equals(lista.get(i).getNumCuenta())) {
					idAccount=i;
					numcuenta=true;
				}
				i++;
			}
			if(numcuenta==false) {
				System.out.println("El numero de cuenta no existe");
				System.out.println("Presione ENTER para probar otra vez o escriba SALIR para finalizar el tramite");
				String exit=input.nextLine().toUpperCase();
				if(exit=="SALIR") {
					numcuenta=true;
					transfer=false;
				}
			}
		}
		if(transfer==true) {
			System.out.print("Cuanto quieres transferir: ");
			double transferir = input.nextDouble();
			if (transferir<0 || transferir>this.getSaldo()) {
				System.out.println("¡ERROR! Operación no valida");
			} else {
				this.setSaldo(saldo-transferir);
				lista.get(idAccount).setSaldo(lista.get(idAccount).getSaldo()+transferir);
			}
		}
	}
	
	public void verCuentas(ArrayList <Cuenta> lista) {
		int i;
		System.out.println("NumCuenta/Nombre/saldo");
		for(i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).getNumCuenta()+"/"+lista.get(i).getNombre()+"/"+lista.get(i).getSaldo());
		}
	}
	
	public void añadirPersona(ArrayList<Cuenta> lista) {
		Scanner input=new Scanner(System.in);
		System.out.print("Escribe tu nombre: ");
		String nombre=input.nextLine();
		System.out.print("Escribe tu contraseña: ");
		String contraseña=input.nextLine();
		System.out.println("Quieres hacer un ingreso inicial? [Y/N]");
		String inicial=input.nextLine().toUpperCase();
		double saldo=0;
		String patata="Y";
		if (inicial.equals(patata)) {
			System.out.print("Cuanto vas a ingresar? ");
			saldo=input.nextDouble();
		}
		String cuenta=Integer.toString(lista.size());
		Cuenta persona=new Cuenta(nombre,cuenta,saldo,contraseña);
		lista.add(persona);
	}
	
	
	public void cajero(ArrayList <Cuenta> lista) {
		boolean menu=true;
		System.out.println();
		while(menu==true) {
			System.out.println("---------- Cajero Automatico ----------");
			System.out.println("|                                     |");
			System.out.println("|   1) Ingresar dinero                |");
			System.out.println("|   2) Retirar dinero                 |");
			System.out.println("|   3) Realizar una trasnferencia     |");
			System.out.println("|   4) Ver todos las cuentas          |");
			System.out.println("|   5) Salir                          |");
			if (this.getNumCuenta().equals("0")) {
				System.out.println("|  9999) Crear una nueva cuenta       |");
			}
			System.out.println("|                                     |");
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.print("Que operación deseas hacer? ");
			int opcion=input.nextInt();
			switch(opcion) {
				case 1:
					this.ingresar();break;
				case 2:
					this.retirar();break;
				case 3:
					this.transferir(lista);break;
				case 4:
					this.verCuentas(lista);break;
				case 5:
					menu=false;break;
				case 9999:
					añadirPersona(lista);break;
			}
			}
		}
	
}
