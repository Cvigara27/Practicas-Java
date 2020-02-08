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
	
	public void getTodo(ArrayList <Pelicula> videoclub,int i) {
		
	}
	
	
	public String ponerMayus(String cadena) {
		int i;
		cadena.toLowerCase();
		String[] uppers=cadena.split(" ");
		for (i=0; i<uppers.length; i++) {
			if(uppers[i]==("l" )) {
				
			}
			String mayus=uppers[i].substring(0,1).toUpperCase();
			mayus=mayus+uppers[i].substring(1);
			uppers[i]=mayus;
		}
		String chain="";
		for (i=0; i<uppers.length; i++) {
			chain+=uppers[i]+" ";
		}
		return chain;
	}
	
	public void añadirPelicula(ArrayList <Pelicula> videoclub) {
		Scanner input=new Scanner(System.in);
		if (cantidadPelis>=capacidad) {
			System.out.println("!ERROR¡ El videoclub no puede almacenar más películas");
		} else {
			System.out.print("Introduzca el titulo de la pelicula: ");
			String title=ponerMayus(input.nextLine());
			System.out.print("Introduzca el director: ");
			String direc=ponerMayus(input.nextLine());
			System.out.print("Introduzca la duración en minutos: ");
			int duracion=Integer.parseInt(input.nextLine());
			System.out.print("Introduzca el genero: ");
			String genre=ponerMayus(input.nextLine());
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
				cantidadPelis+=amount;
			}
		}
	}
	
	public void listarPelicula(ArrayList <Pelicula> videoclub,int i,boolean check) {
		if (check==true) {
			System.out.println("ID: "+videoclub.get(i).getId()+"   Titulo: "+videoclub.get(i).getTitulo()+"   Director: "+videoclub.get(i).getDirector());
			System.out.println("Duracion: "+videoclub.get(i).getDuracion()+" minutos   Genero: "+videoclub.get(i).getGenero());
			if(videoclub.get(i).getDisponibilidad()==true){
				System.out.println("Año de estreno: "+videoclub.get(i).getAño()+"   Estado: Disponible");
			} else if (videoclub.get(i).getDisponibilidad()==false){
				System.out.println("Año de estreno: "+videoclub.get(i).getAño()+"   Estado: No disponible");
			}
			System.out.println();
		}else {for (i=0; i<videoclub.size(); i++) {
				System.out.println("ID: "+videoclub.get(i).getId()+"   Titulo: "+videoclub.get(i).getTitulo()+"   Director: "+videoclub.get(i).getDirector());
				System.out.println("Duracion: "+videoclub.get(i).getDuracion()+" minutos   Genero: "+videoclub.get(i).getGenero());
				if(videoclub.get(i).getDisponibilidad()==true){
					System.out.println("Año de estreno: "+videoclub.get(i).getAño()+"   Estado: Disponible");
				} else if (videoclub.get(i).getDisponibilidad()==false){
					System.out.println("Año de estreno: "+videoclub.get(i).getAño()+"   Estado: No disponible");
				}
				System.out.println();
			}
		}
	}
	
	public void reservarPelicula(ArrayList <Pelicula> videoclub) {
		Scanner input=new Scanner(System.in);
		if(videoclub.size()==0) {
			System.out.println("No hay ninguna pelicula en el videoclub");
		}else {
			System.out.println("===========================");
			System.out.println("|   Lista de peliculas    |");
			System.out.println("===========================");
			listarPelicula(videoclub,0,false);
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
	
	public void buscarPelicula(ArrayList <Pelicula> videoclub) {
		Scanner input=new Scanner(System.in);
		int i;
		boolean comprobar=false;
		if(videoclub.size()==0) {
			System.out.println("No hay ninguna pelicula en el videoclub");
		}else {
			System.out.println();
			System.out.println("  1) Por título");
			System.out.println("  2) Por director");
			System.out.println("  3) Por género");
			System.out.println("  4) Por año");
			System.out.println("  5) Por duración");
			System.out.print("¿Qué tipo de busqueda quieres realizar? ");
			int opcion=Integer.parseInt(input.nextLine());
			switch(opcion) {
				case 1:
					System.out.print("¿Qué título quieres buscar? ");
					String titulo=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getTitulo().toLowerCase().contains(titulo)) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 2:
					System.out.print("¿Qué director quieres buscar? ");
					String direc=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getDirector().toLowerCase().contains(direc)) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 3:
					System.out.print("¿Qué género quieres buscar? ");
					String genre=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getGenero().toLowerCase().contains(genre)) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 4:
					System.out.print("¿Qué año quieres buscar? ");
					int year=input.nextInt();
					mayorMenor(year,videoclub,true);break;
				case 5:
					System.out.print("¿Qué duración quieres buscar(minutos)? ");
					int time=input.nextInt();
					mayorMenor(time,videoclub,false);break;
			}
		}
	}
	
	public void mayorMenor(int opcion,ArrayList <Pelicula> videoclub,boolean añoTime) {
		Scanner input=new Scanner(System.in);
		int i;
		boolean comprobar=false;
		System.out.println();
		System.out.println("  1) Mayor que...");
		System.out.println("  2) Cantidad exacta");
		System.out.println("  3) Menor que...");
		System.out.print("¿Qué tipo de busqueda prefieres? ");
		int eleccion=input.nextInt();
		switch(eleccion){
			case 1:
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (añoTime==true) {
						if(videoclub.get(i).getAño()>=opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()>=opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
				}
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
			case 2:
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (añoTime==true) {
						if(videoclub.get(i).getAño()==opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()==opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
				}
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
			case 3:
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (añoTime==true) {
						if(videoclub.get(i).getAño()<=opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()<=opcion) {
							listarPelicula(videoclub,i,true);
							comprobar=true;
						}
					}
				}
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
		}
	}
}