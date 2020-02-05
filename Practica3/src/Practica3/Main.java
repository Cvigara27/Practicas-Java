package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();
		Cuenta admin=new Cuenta("Cristian","0",696969,"1234",cuentas);
		Cuenta admin2=new Cuenta("Don Kakas","1",2,"1234",cuentas);
		boolean main=true;
		String noFunciona="SALIR";
		System.out.println("Para salir del Login escribe SALIR");
		while (main==true) {
			boolean login=false;
			while (login==false) {
				boolean account=false;boolean passw=false;
				int count=0,idAccount=0;
				while (account==false) {
					System.out.println();
					System.out.print("Nº de Cuenta: ");
					String acc=input.nextLine().toUpperCase();
					if (acc.equals(noFunciona)) {
						account=true;
						passw=true;
						main=false;
					}
					int i=0;
					boolean comprobar=false;
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
					System.out.println();
					System.out.print("Contraseña: ");
					String pass=input.nextLine().toUpperCase();
					if (pass.equals(noFunciona)) {
						passw=true;
						main=false;
					}
					if (pass.equals(cuentas.get(idAccount).getContraseña())) {
						System.out.println("Bienvenido "+cuentas.get(idAccount).getNombre());
						cuentas.get(idAccount).cajero(cuentas);
						passw=true;
						login=true;
					}
					count++;
				}
				if(count==3) {
					System.out.println("Demasiados intentos fallidos");
				} else if (passw==true && account==true) {
					login=true;
				}
			}
		}
	}
}


