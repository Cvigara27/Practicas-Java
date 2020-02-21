package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Cuenta {
	//ATRIBUTOS
	private String nombre;
	private String numCuenta;
	private double saldo;
	private String contraseña;
	static Scanner input=new Scanner(System.in);
	
	
	//CONSTRUCTORES
	public Cuenta(String nombre, String numCuenta, double saldo, String contraseña, ArrayList<Cuenta> lista) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setSaldo(saldo);
		this.setContraseña(contraseña);
		lista.add(this);
	}

	
	//GETTERS Y SETTERS
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
	
	//METODOS
	public boolean ingresarDinero() {
		boolean comprobar=false;
		System.out.println("Cuanto quieres ingresar?");
		double introducir = Double.parseDouble(input.nextLine());
		//Si se introduce una cantidad menor o igual a cero saca un ¡ERROR!
		if (introducir<=0 ) {
			System.out.println("¡ERROR! Operación no valida");
		} else {
			this.setSaldo(introducir+saldo);
			comprobar=true;
		}
		return comprobar;
	}
	
	
	public boolean retirarDinero() {
		boolean comprobar=false;
		System.out.println("Cuanto quieres retirar?");
		double reintegro = Double.parseDouble(input.nextLine());
		//Si saca una cantidad de cero o menos o una cantidad mayor a su saldo saca un ¡ERROR!
		if (reintegro<=0 || reintegro>this.getSaldo()) {
			System.out.println("¡ERROR! Operación no valida");
		} else {
			this.setSaldo(saldo-reintegro);
			comprobar=true;
		}
		return comprobar;
	}
	
	
	public void transferirDinero(ArrayList<Cuenta> lista) {
		//Para comprobar si existe la cuenta
		boolean numcuenta=false;
		//Para comprobar que se tiene que hacer la transferencia
		boolean transfer=true;
		//Para guardar la posicion del destinatario si existe
		int idAccount = 0;
		while(numcuenta==false) {
			//Pide la cuenta destino de la transferencia
			System.out.print("Introduzca el numero de cuenta destino: ");
			String numacc=input.nextLine();
			int i=0;
			//Comprueba que existe el destinatario
			while(i<lista.size() && numcuenta==false) {
				if (numacc.equals(lista.get(i).getNumCuenta())) {
					idAccount=i;
					numcuenta=true;
				}
				i++;
			}
			//Si no encuentra la cuenta permite abandonar o pedir otra cuenta
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
			//Pide la cantidad a transferir
			System.out.print("Cuanto quieres transferir: ");
			double transferir = Double.parseDouble(input.nextLine());
			//Si saca una cantidad de cero o menos o una cantidad mayor a su saldo saca un ¡ERROR!
			if (transferir<=0 || transferir>this.getSaldo()) {
				System.out.println("¡ERROR! Operación no valida");
			} else {
				//Reduce el saldo de quien transfiere y se aumenta el del destinatario
				this.setSaldo(saldo-transferir);
				lista.get(idAccount).setSaldo(lista.get(idAccount).getSaldo()+transferir);
			}
		}
	}
	
	
	public static void verCuentas(ArrayList <Cuenta> lista) {
		int i;
		//Enseña todas las cuentas
		System.out.println("NumCuenta/Nombre/saldo");
		for(i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).getNumCuenta()+"/"+lista.get(i).getNombre()+"/"+lista.get(i).getSaldo());
		}
	}
	
	
	public static void añadirPersona(ArrayList<Cuenta> lista) {
		//Pide informacion de la nueva persona
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
			saldo=Double.parseDouble(input.nextLine());
		}
		String cuenta=Integer.toString(lista.size());
		//Crea y añade la persona al grupo de cuentas
		Cuenta persona=new Cuenta(nombre,cuenta,saldo,contraseña,lista);
	}
	
	
	//MENU PRINCIPAL
	public void cajero(ArrayList <Cuenta> lista) {
		boolean menu=true;
		System.out.println();
		while(menu==true) {
			System.out.println("=======================================");
			System.out.println("|          Cajero Automatico          |");
			System.out.println("=======================================");
			System.out.println("|                                     |");
			System.out.println("|   1) Ingresar dinero                |");
			System.out.println("|   2) Retirar dinero                 |");
			System.out.println("|   3) Realizar una trasnferencia     |");
			System.out.println("|   4) Ver todos las cuentas          |");
			System.out.println("|   5) Salir                          |");
			//Si es la cuenta administradora, en este caso 0
			if (this.getNumCuenta().equals("0")) {
				System.out.println("|   9999) Crear una nueva cuenta      |");
			}
			System.out.println("|                                     |");
			System.out.println("=======================================");
			System.out.println();
			System.out.print("Que operación deseas hacer? ");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion) {
				case 1:
					this.ingresarDinero();break;
				case 2:
					this.retirarDinero();break;
				case 3:
					this.transferirDinero(lista);break;
				case 4:
					verCuentas(lista);break;
				case 5:
					menu=false;break;
				case 9999:
					if (this.getNumCuenta().equals("0")) {
						añadirPersona(lista);break;
					}
				default:
					System.out.println("¡ERROR! Operacion no valida");
			}
		}
	}
}
