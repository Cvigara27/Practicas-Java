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
		Socio admin2=new Socio("Dani","1","1234",miembros);
		String noFunciona="SALIR";
		System.out.println("Para salir del Login escribe SALIR");
		boolean login=false;
		while (login==false) {
			boolean account=false;boolean passw=false;
			int count=0,idAccount=0;
			while (account==false) {
				System.out.println();
				System.out.print("Nº de Socio: ");
				String acc=input.nextLine().toUpperCase();
				if (acc.equals(noFunciona)) {
					account=true;
					passw=true;
					login=true;
				}
				int i=0;
				boolean comprobar=false;
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
				System.out.println();
				System.out.print("Contraseña: ");
				String pass=input.nextLine().toUpperCase();
				if (pass.equals(noFunciona)) {
					passw=true;
					login=true;
				}
				if (pass.equals(miembros.get(idAccount).getContraseña())) {
					System.out.println("Bienvenido "+miembros.get(idAccount).getNombre());
					miembros.get(idAccount).videoclub(videoclub,reservas,miembros.get(idAccount).getNombre(),miembros);
					passw=true;
				}
				count++;
			}
			if(count==3) {
				System.out.println("Demasiados intentos fallidos");
			}
		}
	}
}

