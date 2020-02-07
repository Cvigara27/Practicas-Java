package Practica4;
import java.util.ArrayList;
import java.util.Scanner;
public class Pelicula {
	private int id=1;
	private String titulo;
	private String director;
	private int duracion;
	private String genero;
	private int año;
	private boolean disponibilidad;
	private int copiasTotal;
	private int copiaReservada;
	private int cantidadPelis=0;
	final int capacidad=3000;
	
	public Pelicula(int id, String titulo, String director, int duracion, String genero, int año,boolean disponibilidad,int copiasTotal,int copiaReservada) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setDirector(director);
		this.setDuracion(duracion);
		this.setGenero(genero);
		this.setAño(año);
		this.setDisponibilidad(disponibilidad);
		this.setCopiasTotal(copiasTotal);
		this.setCopiaReservada(copiaReservada);
	}
	
	public Pelicula() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getCopiasTotal() {
		return copiasTotal;
	}

	public void setCopiasTotal(int copiasTotal) {
		this.copiasTotal = copiasTotal;
	}

	public int getCopiaReservada() {
		return copiaReservada;
	}

	public void setCopiaReservada(int copiaReservada) {
		this.copiaReservada = copiaReservada;
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	public int getCantidadPelis() {
		return cantidadPelis;
	}

	public void setCantidadPelis(int cantidadPelis) {
		this.cantidadPelis = cantidadPelis;
	}
	
	public void añadirPelicula(ArrayList <Pelicula> videoclub) {
		Scanner input=new Scanner(System.in);
		if (copiasTotal>=capacidad) {
			System.out.println("!ERROR¡ El videoclub no puede almacenar más películas");
		} else {
			System.out.print("Introduzca el titulo de la pelicula: ");
			String title=input.nextLine();
			System.out.print("Introduzca el director: ");
			String direc=input.nextLine();
			System.out.print("Introduzca la duración en minutos: ");
			int duracion=Integer.parseInt(input.nextLine());
			System.out.print("Introduzca el genero: ");
			String genre=input.nextLine();
			System.out.print("Introduzca el año de estreno: ");
			int year=input.nextInt();
			System.out.print("Introduzca el numero de copias: ");
			int amount=input.nextInt();
			if((cantidadPelis+amount)>capacidad) {
				System.out.println("!ERROR¡ El videoclub no puede almacenar tantas películas");
			} else {
				Pelicula peli=new Pelicula(id,title,direc,duracion,genre,year,true,amount,0);
				videoclub.add(peli);
				id++;
			}
		}
	}
	
	public void listarPeliculas(ArrayList <Pelicula> videoclub) {
		int i;
		for (i=0; i<videoclub.size(); i++) {
			System.out.println("ID: "+videoclub.get(i).getId()+"   Titulo: "+videoclub.get(i).getTitulo()+"   Director: "+videoclub.get(i).getDirector());
			System.out.println("Duracion: "+videoclub.get(i).getDuracion()+" minutos   Genero: "+videoclub.get(i).getGenero()+"   Año de estreno: "+videoclub.get(i).getAño());
			if(videoclub.get(i).getDisponibilidad()==true){
				System.out.println("Estado: Disponible");
			} else if (videoclub.get(i).getDisponibilidad()==false){
				System.out.println("Estado: No disponible");
			}
			System.out.println();
		}
	}
	
	public void reservarPelicula(ArrayList <Pelicula> videoclub) {
		Scanner input=new Scanner(System.in);
		listarPeliculas(videoclub);
		System.out.print("¿Qué pelicula quieres reservar(ID)? ");
		int opcion=input.nextInt();
		if(opcion>videoclub.size()) {
			System.out.println("La película seleccionada no existe");
		} else if(videoclub.get(opcion-1).getDisponibilidad()==false) {
			System.out.println("La pelicula no esta disponible");
		} else if (videoclub.get(opcion-1).getDisponibilidad()==true) {
			System.out.println("Se ha reservado su pelicula");
			int num=videoclub.get(opcion-1).getCopiaReservada();
			num+=1;
			videoclub.get(opcion-1).setCopiaReservada(num);
			if(videoclub.get(opcion-1).getCopiaReservada()==videoclub.get(opcion-1).getCopiasTotal()) {
				videoclub.get(opcion-1).setDisponibilidad(false);
			}
		} else if(opcion>=videoclub.size()) {
			System.out.println("La película seleccionada no existe");
		}
	}
}