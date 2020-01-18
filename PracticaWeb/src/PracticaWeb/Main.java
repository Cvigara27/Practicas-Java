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
			case 14: ejer.ecuacion(); break;
			case 15: ejer.doWhile(); break;
			case 16: ejer.passw(); break;
			case 17: ejer.diasSemana(); break;
			case 18: ejer.random(); break;
			case 19: ejer.contarCifras(); break;
			case 20: ejer.primos(); break;
			case 21: ejer.primos1a100(); break;
			case 22: ejer.contarVocales(); break;
			case 23: ejer.cambiarVocales(); break;
			case 24: ejer.devolverASCII(); break;
			case 25: ejer.calculadora(); break;
			case 26: ejer.sumador(); break;
			case 27: ejer.contarInputs(); break;
			case 28: ejer.eliminarEspacio(); break;
			case 29: ejer.concatenar(); break;
			case 30: ejer.upperLower(); break;
			case 31: ejer.fraseLength(); break;
			case 32: ejer.igual(); break;
			case 33: ejer.substring(); break;
			case 34: ejer.separa(); break;
			case 35: ejer.enumDias(); break;
		}
	}

}
