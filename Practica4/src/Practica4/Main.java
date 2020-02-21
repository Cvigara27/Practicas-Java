package Practica4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Pelicula> videoclub=new ArrayList<Pelicula>();
		ArrayList <Socio> miembros=new ArrayList<Socio>();
		HashMap <String, String> reservas=new HashMap<String, String>();
		Socio admin=new Socio("Cristian","0","1234",miembros);
		String noFunciona="SALIR";
		System.out.println("Para salir del Login escribe SALIR");
		boolean login=false;
		while (login==false) {
			boolean account=false;boolean passw=false;
			//count es para que no haya mas de 3 intentos
			int count=0;
			//idAccount es para quedarse con la posicion de la cuenta comprobada
			int idAccount=0;
			while (account==false) {
				System.out.println();
				//Pide el nº de socio
				System.out.print("Nº de Socio: ");
				String acc=input.nextLine().toUpperCase();
				//Si escribe salir cierra el programa
				if (acc.equals(noFunciona)) {
					account=true;
					passw=true;
					login=true;
				}
				int i=0;
				boolean comprobar=false;
				//Comprueba la lista para ver si existe el socio
				while(i<miembros.size() && comprobar==false) {
					if (acc.equals(miembros.get(i).getNumSocio())) {
						account=true;
						idAccount=i;
						comprobar=true;
					}
					i++;
				}
			}
			while (passw==false && count<3) {
				//Pide la constraseña del socio ya comprobado
				System.out.println();
				System.out.print("Contraseña: ");
				String pass=input.nextLine().toUpperCase();
				//Si escribe salir cierra el programa
				if (pass.equals(noFunciona)) {
					passw=true;
					login=true;
				}
				//Comprueba que el socio tenga la contraseña
				if (pass.equals(miembros.get(idAccount).getContraseña().toUpperCase())) {
					System.out.println("Bienvenido "+miembros.get(idAccount).getNombre());
					miembros.get(idAccount).videoclub(videoclub,reservas,miembros.get(idAccount).getNombre(),miembros);
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

