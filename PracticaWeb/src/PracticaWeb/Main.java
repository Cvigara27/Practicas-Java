package PracticaWeb;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		ejercicios ejer=new ejercicios(); 
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Que ejercicio quieres ver? "));
		switch(opcion) {
			case 1: ejer.operaciones(); break;
			case 2: ejer.mayorMenor(); break;
			case 3: ejer.saludar(); break;
			case 4: ejer.jpane(); break;
			case 5: ejer.radio(); break;
			case 6: ejer.divide(); break;
			case 7: ejer.ascii(); break;
			case 8: ejer.ascii2(); break;
			case 9: ejer.iva(); break;
			case 10: ejer.unoA100(); break;
			case 11: ejer.unoA100FOR(); break;
			case 12: ejer.unoA100Divide(); break;
			case 13: ejer.ventas(); break;
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:		
		}
	}

}
