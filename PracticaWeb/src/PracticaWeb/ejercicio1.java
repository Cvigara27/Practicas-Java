package PracticaWeb;
import java.util.Scanner;
public class ejercicio1 {
	public void operaciones() {
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1=input.nextInt();
		System.out.println();
		System.out.print("Introduce el segundo numero: ");
		int num2=input.nextInt();
		System.out.println("Esta es la suma "+(num1+num2));
		System.out.println("Esta es la resta "+(num1-num2));
		System.out.println("Esta es la multiplicación "+(num1*num2));
		System.out.println("Esta es la división "+(num1/num2));
		System.out.println("Este es el módulo "+(num1%num2));
		input.close();
	}
}
