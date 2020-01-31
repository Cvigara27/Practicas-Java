package Practica3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();
		Cuenta admin=new Cuenta("Cristian","0",696969,"admin","1234",cuentas);
		boolean login=false;
		while (login==false) {
			boolean user=false;boolean passw=false;
			int count=0;
			while (user==false && count<3) {
				System.out.println();
				System.out.print("Usuario: ");
				String usuario=input.nextLine();
				int i;
				for (i=0; i<cuentas.size(); i++) {
					if (usuario.equals(cuentas.get(i).getUsuario())) {
						user=true;
					}
				}
			}
		}	
	}
	public void cajero() {
		boolean menu=true;
		System.out.println();
		while(menu==true) {
			System.out.println();
			System.out.println("---------- Cajero Automatico ----------");
			System.out.println("|                                     |");
			System.out.println("|   1) Ingresar dinero                |");
			System.out.println("|   2) Retirar dinero                 |");
			System.out.println("|   3) Realizar una trasnferencia     |");
			System.out.println("|   4) Ver todos las cuentas          |");
			System.out.println("|   5) Salir                          |");
			System.out.println("|                                     |");
			System.out.println("---------------------------------------");
			System.out.println();
			System.out.print("Que operación deseas hacer? ");
			int opcion=input.nextInt();
				
			}
		input.close();
		}
	
}

