package PracticaWeb;
import java.util.Scanner;
public class ejercicio2 {
	public void mayorMenor() {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1=input.nextInt();
		System.out.println();
		System.out.print("Introduce el segundo numero: ");
		int num2=input.nextInt();
		if (num1>num2) {
			System.out.println("El primer n�mero es mayor");
		} else if (num1<num2) {
			System.out.println("El segundo n�mero es mayor");
		} else {
			System.out.println("Los n�meros son iguales");
		}
		input.close();
	}
}
