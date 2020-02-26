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
			//COUNT ES PARA QUE NO HAYA MAS DE 3 INTENTOS
			int count=0;
			//idAccount ES PARA QUEDARSE CON LA POSICION DE LA CUENTA COMPROBADA
			int idAccount=0;
			while (account==false) {
				System.out.println();
				//PIDE EL Nº DE SOCIO
				System.out.print("Nº de Socio: ");
				String acc=input.nextLine().toUpperCase();
				//SI ESCRIBE SALIR CIERRA EL PROGRAMA
				if (acc.equals(noFunciona)) {
					account=true;
					passw=true;
					login=true;
				}
				int i=0;
				boolean comprobar=false;
				//COMPRUBEA LA LISTA PARA VER SI EXISTE EL SOCIO
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
				//PIDE LA CONTRASEÑA DEL SOCIO YA COMPROBADO
				System.out.println();
				System.out.print("Contraseña: ");
				String pass=input.nextLine().toUpperCase();
				//SI ESCRIBE SALIR CIERRA EL PROGRAMA
				if (pass.equals(noFunciona)) {
					passw=true;
					login=true;
				}
				//COMPRUEBA QUE EL SOCIO TENGA LA CONSTRASEÑA INDICADA
				if (pass.equals(miembros.get(idAccount).getContraseña().toUpperCase())) {
					System.out.println("Bienvenido "+miembros.get(idAccount).getNombre());
					miembros.get(idAccount).videoclub(videoclub,reservas,miembros.get(idAccount).getNombre(),miembros);
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

