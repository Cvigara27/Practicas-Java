package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();
		Cuenta admin=new Cuenta("Cristian","0",696969,"1234",cuentas);
		String salida="SALIR";
		System.out.println("Para salir del Login escribe SALIR");
		boolean login=false;
		while (login==false) {
			boolean account=false;boolean passw=false;
			//count es para que no haya mas de 3 intentos
			int count=0;
			//idAccount es para quedarse con la posicion de la cuenta comprobada
			int idAccount=0;
			while (account==false) {
				//Pide el nº de cuenta
				System.out.println();
				System.out.print("Nº de Cuenta: ");
				String acc=input.nextLine().toUpperCase();
				//Si escribe salir cierra el programa
				if (acc.equals(salida)) {
					account=true;
					passw=true;
					login=true;
				}
				int i=0;
				boolean comprobar=false;
				//Comprueba la lista para ver si existe la cuenta
				while(i<cuentas.size() && comprobar==false) {
					if (acc.equals(cuentas.get(i).getNumCuenta())) {
						account=true;
						idAccount=i;
						comprobar=true;
					}
					i++;
				}
			}
			while (passw==false && count<3) {
				//Pide la constraseña de la cuenta ya comprobada
				System.out.println();
				System.out.print("Contraseña: ");
				String pass=input.nextLine().toUpperCase();
				//Si escribe salir cierra el programa
				if (pass.equals(salida)) {
					passw=true;
					login=true;
				}
				//Comprueba que la cuenta tenga la contraseña 
				if (pass.equals(cuentas.get(idAccount).getContraseña().toUpperCase())) {
					System.out.println("Bienvenido "+cuentas.get(idAccount).getNombre());
					cuentas.get(idAccount).cajero(cuentas);
					passw=true;
				}
				count++;
			}
			//Si hay mas de tres fallos vuelve a pedir la cuenta
			if(count==3) {
				System.out.println("Demasiados intentos fallidos");
			} 
		}
	}	
}


