package PracticaWeb;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ejercicios {
	static Scanner input=new Scanner(System.in);
	public enum Dias{
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
	}
	public void operaciones() {
		//Introduce 2 numeros y opera con ellos
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
	}
	
	public void mayorMenor() {
		//Determinar que número es mayor o si son iguales
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
	}
	
	public void saludar() {
		//Pedir nombre y enseñarlo
		System.out.println("Pedir nombre y enseñarlo");
		System.out.print("Cual es tu nombre? ");
		String nombre=input.nextLine();
		System.out.println("Bienvenido "+nombre);
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
		System.out.println("Calcular el area de un circulo");
		System.out.print("Que radio tiene el circulo? ");
		double numero=input.nextDouble();
		double area=Math.PI*Math.pow(numero, 2);
		System.out.println("El area del circulo es "+area);
	}
	
	public void divide() {
		//Calcula si es divisible entre 2
		System.out.print("Que número quieres comprobar si es divisible entre 2? ");
		int numero=input.nextInt();
		if(numero%2==0) {
			System.out.println(numero+" es divisible entre 2");
		} else {
			System.out.println(numero+" NO es divisible entre 2");
		}
	}
	
	public void ascii() {
		//Comprueba el numero en la tabla ASCII
		System.out.print("Introduce un número de la tabla ASCII ");
		int numero=input.nextInt();
		char caracter=(char)numero;
		System.out.println(caracter);
	}
	
	public void ascii2() {
		//Devuelve el numero del caracter en la tabla ASCII
		System.out.print("Introduce el caracter ASCII ");
		char caracter=input.next().charAt(0);
		int numero=(int)caracter;
		System.out.println(numero);
	}

	public void iva() {
		//Devuleve el precio con IVA
		final double iva=0.21;
		System.out.print("Introduce un precio ");
		double precio=input.nextDouble();
		System.out.println("El valor con IVA es "+(precio+(precio*iva)));
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
		System.out.print("Cuantas numeros quieres sumar? ");
		int cantidad=input.nextInt();
		int i,total=0;
		for (i=1; i<=cantidad; i++) {
			System.out.print("Estas introduciendo el numero "+i+": ");
			int suma=input.nextInt();
			total+=suma;
		}
		System.out.println("El total es: "+total);
	}
	
	public void ecuacion() {
		//Pedir 3 numero y realizar una acuacion de segundo grado
		System.out.print("Introduce el numero que corresponde a A: ");
		int numa=input.nextInt();
		System.out.print("Introduce el numero que corresponde a B: ");
		int numb=input.nextInt();
		System.out.print("Introduce el numero que corresponde a C: ");
		int numc=input.nextInt();
		double raiz=Math.pow(numb, 2)-4*numa*numc;
		if(raiz<0) {
			System.out.println("No tiene solucion real");
		} else if (raiz==0) {
			double resul=-numb/2*numa;
			System.out.println("La solucion es :"+resul);
		} else {
			double resul1=(-(numb)+Math.sqrt(raiz))/(2*numa);
			double resul2=(-(numb)-Math.sqrt(raiz))/(2*numa);
			System.out.println("El resultado de X1 es: "+resul1);
			System.out.println("El resutado de X2 es: "+resul2);
		}
	}
	
	public void doWhile() {
		//Pedir un numero hasta que sea mayor o igual a 0
		int numero;
		do {
			System.out.println("Escribe un número mayor a 0");
			numero=input.nextInt();
		} while(numero<0);
		System.out.println("El numero es: "+numero);
	}
	
	public void passw() {
		//Definir una string e intentar adivinarla con 3 intentos 
		String respuesta = "";
		String pass="hola";
		int contar=0;
		while(!respuesta.equals(pass) && contar<3){
			System.out.println("Cual es la contraseña?");
			respuesta=input.nextLine();
			contar++;
		}
		if (contar==3) {
			System.out.println("Piensatelo mejor para la proxima");
		} else {
			System.out.println("Has adivinado la contraseña");
		}
	}
	
	public void diasSemana() {
		//Pedir un dia de la semana y decir si es laboral o no
		System.out.print("Introduce un dia de la semana: ");
		String dia=input.nextLine();
		switch(dia) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("Es un dia laboral"); break;
			case "sabado":
			case "domingo":
				System.out.println("NO es un dia laboral"); break;
		}
	}
	
	public void random() {
		//Pedir 2 numeros y generar 10 numeros aleatorios entre esos 2
		System.out.print("Introduce el primer numero: ");
		int num1=input.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2=input.nextInt();
		int i;
		for(i=0; i<10; i++) {
			int random=(int) (Math.random()*(num1-num2)+num2);
			System.out.print(random+" ");
		}
	}
	
	public void contarCifras() {
		//Pedir un numero y contar el numero de cifras
		System.out.print("Introduce un numero: ");
		int numero=input.nextInt();
		String cifras=Integer.toString(numero);
		int i;
		for (i=0; i<cifras.length(); i++) {
		}
		System.out.println("Tiene "+i+" cifras");
	}
	
	public void primos() {
		//Pedir un numero y decir si es primo o no
		System.out.print("Introduce un numero: ");
		int numero=input.nextInt();
		boolean primo=true;
		int i=2;
		while (i<numero && primo==true) {
			if (numero%i==0) {
				primo=false;
			}
			i++;
		}
		if (numero<=2) {
			primo=false;
		}
		if (primo==true) {
			System.out.println(numero+" es un numero primo");
		} else {
			System.out.println(numero+" NO es un numero primo");
		}
	}
	
	public void primos1a100() {
		//Enseñar los numero primos del 1 al 100
		int i=0,num=2;
		while(i<100) {
			boolean primo=true;
			int k=2;
			while (k<num && primo==true) {
				if (num%k==0) {
					primo=false;
				}
				k++;
			}
			if (primo==true) {
				System.out.println(num);
			}
			num++;
			i++;
		}
	}
	
	public void contarVocales() {
		//Contar las vocales de una frase
		System.out.print("Escribe un frase: ");
		String frase=input.nextLine();
		int i;
		int contar=0;
		for (i=0; i<frase.length(); i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' ||
				frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
				contar++;
			}
		}
		System.out.println("Hay "+contar+" vocales");
	}
	
	public void cambiarVocales() {
		//Cambiar todas las vocales en otra vocal pedida
		System.out.print("Escribe un frase: ");
		String frase=input.nextLine();
		System.out.print("Que vocal quieres? ");
		char vocal=input.next().charAt(0);
		int i;
		char[] fraseChars=frase.toCharArray();
		for (i=0; i<frase.length(); i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' ||
				frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
				fraseChars[i]=vocal;
			}
		}
		frase=String.valueOf(fraseChars);
		System.out.println(frase);
	}
	
	public void devolverASCII() {
		//Pide una frase y devulve el correspondiente numero de todos los caracteres
		System.out.print("Escribe un frase: ");
		String frase=input.nextLine();
		char[] fraseChars=frase.toCharArray();
		int i;
		for (i=0; i<fraseChars.length; i++) {
			int numero=(int)fraseChars[i];
			System.out.print(numero+ " ");
		}
	}
	
	public void calculadora() {
		//Pedir dos numeros y un operador y calcular
		System.out.print("Que operacion quieres hacer? (Signo aritmetico) ");
		String signo=input.next();
		System.out.print("Escribe el primer numero: ");
		int num1=input.nextInt();
		System.out.print("Escribe el segundo numero: ");
		int num2=input.nextInt();
		switch(signo) {
			case "+": System.out.println("El resutado de la suma es: "+(num1+num2)); break;
			case "-": System.out.println("El resutado de la resta es: "+(num1-num2)); break;
			case "*": System.out.println("El resutado del producto es: "+(num1*num2)); break;
			case "/": System.out.println("El resutado de la division es: "+(num1/num2)); break;
			case "^": System.out.println("El resutado de la potencia es: "+(Math.pow(num1, num2))); break;
			case "%": System.out.println("El resutado del módulo es: "+(num1%num2)); break;
		}
	}
	
	public void sumador() {
		//Sumar todos los numeros del 1 hasta el indicado
		System.out.print("Cual es el numero limite? ");
		int limite=input.nextInt();
		int i=1,total=0;
		if (limite<=1) {
			System.out.println("Escribe un limite decente la proxima vez");
		} else {
			while (i<=limite) {
				total+=i;
				i++;
			}
		}
		System.out.println("La suma total es: "+total);
	}
	
	public void contarInputs() {
		//Recibir numeros hasta que se escriba una negativo y decir la cantidad de numeros recibida
		System.out.print("Introduce un numero: ");
		int num=input.nextInt();
		int contar=0;
		while (num>=0) {
			System.out.print("Introduce un numero: ");
			num=input.nextInt();
			contar++;
		}
		System.out.println("Has introducido "+contar+" numeros");
	}
	
	public void eliminarEspacio() {
		//Eliminar los espacios de una frase
		System.out.print("Escribe un frase: ");
		String frase=input.nextLine();
		frase=frase.replaceAll("\\s+", "");
		//	    \\s cualquier espacio, \\S todo menos espacio, \\w cualquier palabra, \\W todo menos palabras
		System.out.println(frase);
	}
	
	public void concatenar() {
		//Pedir string hasta que este vacia
		System.out.print("Escribe una frase: ");
		String frase=input.nextLine();
		String concat=frase;
		while(!frase.equals("")) {
			System.out.print("Escribe una frase: ");
			frase=input.nextLine();
			concat+=" "+frase;
		}
		System.out.println(concat);
	}
	
	public void upperLower() {
		//Pedir una string y ponerla en mayusculas o minusculas a peticion
		System.out.print("Escribe una frase: ");
		String frase=input.nextLine();
		System.out.print("Es mayusculas(mayus) o minusculas(minus)? ");
		String cambio=input.nextLine();
		if (cambio.equals("mayus")) {
			System.out.println(frase.toUpperCase());
		} else {
			System.out.println(frase.toLowerCase());
		}
	}
	
	public void fraseLength() {
		//Mostrar la longitud de una frase
		System.out.print("Escribe una frase: ");
		String frase=input.nextLine();
		System.out.println("La longitud es: "+frase.length());
	}
	
	public void igual() {
		//Pedir 2 palabras y decir si son iguales
		System.out.print("Escribe una palabra: ");
		String pal1=input.nextLine();
		System.out.print("Escribe otra palabra: ");
		String pal2=input.nextLine();
		if(pal1.equals(pal2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
	}
	
	public void substring() {
		//Sacar la cuarta y quinta letra de un input
		System.out.print("Escribe una palabra: ");
		String pal=input.nextLine();
		if(pal.length()>=6) {
			pal+=" ";
			System.out.println(pal.substring(4,6));
		} else if(pal.length()==5) {
			pal+=" ";
			System.out.println("Solo tiene la posicion 4: "+pal.substring(4,5));
		} else {
			System.out.println("La palabra es demasiado corta");
		}
	}
	
	public void separa() {
		//Separar una frase por palabras
		System.out.print("Escribe una frase: ");
		String frase=input.nextLine();
		String[] palabras=frase.split(" ");
		int i;
		for (i=0; i<palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
	
	public void enumDias() {
		//Crear enum con los dias de la semana y decir si es laborar
		System.out.print("Introduce un dia de la semana: ");
		String dia=input.nextLine();
		Dias posible=Dias.valueOf(dia.toUpperCase());
		switch(posible) {
			case LUNES:
			case MARTES:
			case MIERCOLES:
			case JUEVES:
			case VIERNES:
				System.out.println("Es un dia laboral"); break;
			case SABADO:
			case DOMINGO:
				System.out.println("NO es un dia laboral"); break;
		}
	}
}
