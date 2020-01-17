package PracticaWeb;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ejercicios {
	public void operaciones() {
		//Introduce 2 numeros y opera con ellos
		Scanner input=new Scanner(System.in);
		System.out.println("Introduce 2 numeros y opera con ellos");
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
	
	public void mayorMenor() {
		//Determinar que número es mayor o si son iguales
		Scanner input=new Scanner(System.in);
		System.out.println("Determinar que número es mayor o si son iguales");
		System.out.print("Introduce el primer numero: ");
		int num1=input.nextInt();
		System.out.println();
		System.out.print("Introduce el segundo numero: ");
		int num2=input.nextInt();
		if (num1>num2) {
			System.out.println("El primer número es mayor");
		} else if (num1<num2) {
			System.out.println("El segundo número es mayor");
		} else {
			System.out.println("Los números son iguales");
		}
		input.close();
	}
	
	public void saludar() {
		//Pedir nombre y enseñarlo
		Scanner input=new Scanner(System.in);
		System.out.println("Pedir nombre y enseñarlo");
		System.out.print("Cual es tu nombre? ");
		String nombre=input.nextLine();
		System.out.println("Bienvenido "+nombre);
		input.close();
	}
	
	public void jpane() {
		//Pedir nombre y enseñarlo(con JOptionPane)
		//Solo funciona al tener otro inputDialog en el Main
		String nombre=JOptionPane.showInputDialog("Cual es tu nombre? ");
		JFrame frame=new JFrame("Alert");
		JOptionPane.showMessageDialog(frame,"Bienvenido "+nombre);
	}
	
	public void radio() {
		//Calcular el area de un circulo
		Scanner input=new Scanner(System.in);
		System.out.println("Calcular el area de un circulo");
		System.out.print("Que radio tiene el circulo? ");
		double numero=input.nextDouble();
		double area=Math.PI*Math.pow(numero, 2);
		System.out.println("El area del circulo es "+area);
		input.close();
	}
	
	public void divide() {
		//Calcula si es divisible entre 2
		Scanner input=new Scanner(System.in);
		System.out.print("Que número quieres comprobar si es divisible entre 2? ");
		int numero=input.nextInt();
		if(numero%2==0) {
			System.out.println(numero+" es divisible entre 2");
		} else {
			System.out.println(numero+" NO es divisible entre 2");
		}
		input.close();
	}
	
	public void ascii() {
		//Comproeba el numero en la tabla ASCII
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce un número de la tabla ASCII ");
		int numero=input.nextInt();
		char caracter=(char)numero;
		System.out.println(caracter);
		input.close();
	}
	
	public void ascii2() {
		//Devuelve el numero del caracter en la tabla ASCII
		Scanner input=new Scanner(System.in);
		System.out.print("Introduce el caracter ASCII ");
		char caracter=input.next().charAt(0);
		int numero=(int)caracter;
		System.out.println(numero);
		input.close();
	}

	public void iva() {
		//Devuleve el precio con IVA
		Scanner input=new Scanner(System.in);
		final double iva=0.21;
		System.out.print("Introduce un precio ");
		double precio=input.nextDouble();
		System.out.println("El valor con IVA es "+(precio+(precio*iva)));
		input.close();
	}
	
	public void unoA100() {
		//Enseña los numero del 1 al 100(incluidos)
		int i=1;
		while (i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	public void unoA100FOR() {
		//Enseña los numero del 1 al 100(incluidos), pero con FOR
		int i;
		for (i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void unoA100Divide() {
		//Enseña los número que sean divisible entre 2 o 3
		int i;
		for(i=1; i<=100; i++) {
			if (i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
	}
	
	public void ventas() {
		//Pide una cantidad de numeros y luego introduces tantos numeros como esa cantidad y los suma
		Scanner input=new Scanner(System.in);
		System.out.print("Cuantas numeros quieres sumar? ");
		int cantidad=input.nextInt();
		int i,total=0;
		for (i=1; i<=cantidad; i++) {
			System.out.print("Estas introduciendo el numero "+i+": ");
			int suma=input.nextInt();
			total+=suma;
		}
		System.out.println("El total es: "+total);
		input.close();
	}
}
