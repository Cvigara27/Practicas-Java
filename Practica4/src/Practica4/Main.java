package Practica4;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList <Pelicula> videoclub=new ArrayList<Pelicula>();
		Pelicula obj=new Pelicula();
		boolean menu=true;
		Scanner input=new Scanner(System.in);
		while(menu==true) {
			System.out.println("===========================");
			System.out.println("|    V I D E O C L U B    |");
			System.out.println("===========================");
			System.out.println("|                         |");
			System.out.println("|  1) Añadir película     |");
			System.out.println("|  2) Reservar película   |");
			System.out.println("|  3) Buscar pelicula     |");
			System.out.println("|  4) Salir               |");
			System.out.println("|                         |");
			System.out.println("===========================");
			System.out.print("¿Qué opción deseas? ");
			int opcion=input.nextInt();
			switch(opcion) {
				case 1:obj.añadirPelicula(videoclub);break;
				case 2:obj.reservarPelicula(videoclub);break;
				case 3:obj.buscarPelicula(videoclub);break;
				case 4:menu=false;
			}
		}
	}

}
