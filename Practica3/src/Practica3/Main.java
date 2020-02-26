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
			///COUNT ES PARA QUE NO HAYA MAS DE 3 INTENTOS
			int count=0;
			//idAccount ES PARA QUEDARSE CON LA POSICION DE LA CUENTA COMPROBADA
			int idAccount=0;
			while (account==false) {
				//PIDE EL Nº DE CUENTA
				System.out.println();
				System.out.print("Nº de Cuenta: ");
				String acc=input.nextLine().toUpperCase();
				//SI ESCRIBE SALIR CIERRA EL PROGRAMA
				if (acc.equals(salida)) {
					account=true;
					passw=true;
					login=true;
				}
				int i=0;
				boolean comprobar=false;
				//COMPRUBEA LA LISTA PARA VER SI EXISTE LA CUENTA
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
				//PIDE LA CONTRASEÑA DE AL CUENTA YA COMPROBADA
				System.out.println();
				System.out.print("Contraseña: ");
				String pass=input.nextLine().toUpperCase();
				//SI ESCRIBE SALIR CIERRA EL PROGRAMA
				if (pass.equals(salida)) {
					passw=true;
					login=true;
				}
				//COMPRUEBA QUE LA CUENTA TENGA LA CONSTRASEÑA INDICADA
				if (pass.equals(cuentas.get(idAccount).getContraseña().toUpperCase())) {
					System.out.println("Bienvenido "+cuentas.get(idAccount).getNombre());
					cuentas.get(idAccount).cajero(cuentas);
					passw=true;
				}
				count++;
			}
			//SI HAY MAS DE TRES FALLOS VUELBE A PEDIR EL SOCIO
			if(count==3) {
				System.out.println("Demasiados intentos fallidos");
			} 
		}
	}	
}


