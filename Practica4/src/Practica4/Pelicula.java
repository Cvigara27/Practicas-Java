package Practica4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Pelicula {
	//ATRIBUTOS
	private int id=1;
	private String titulo;
	private String director;
	private int duracion;
	private String genero;
	private int a�o;
	private boolean disponibilidad;
	private int copiasTotal;
	private int copiaReservada;
	//CONTIENE LA CANTIDAD DE COPIAS TOTALES DENTRO DEL VIDEOCLUB
	private int cantidadPelis=0;
	final int capacidad=3000;
	static Scanner input=new Scanner(System.in);
	
	
	//CONSTRUCTORES
	public Pelicula(int id, String titulo, String director, int duracion, String genero, int a�o,boolean disponibilidad,int copiasTotal,int copiaReservada) {
		this.setId(id);
		this.setTitulo(titulo);
		this.setDirector(director);
		this.setDuracion(duracion);
		this.setGenero(genero);
		this.setA�o(a�o);
		this.setDisponibilidad(disponibilidad);
		this.setCopiasTotal(copiasTotal);
		this.setCopiaReservada(copiaReservada);
	}
	
	public Pelicula() {
	}
	
	
	//GETTERS Y SETTERS
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
	
	
	//METODOS
	public String ponerMayus(String cadena) {
		//PONE LA PRIMERA LETRA EN MAYUSCULAS Y EL RESTO EN MINUSCULAS
		int i;
		cadena.toLowerCase();
		String[] uppers=cadena.split(" ");
		for (i=0; i<uppers.length; i++) {
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
	
	
	public void a�adirPelicula(ArrayList <Pelicula> videoclub) {
		//SI EL VIDEOCLUB ESTA LLENO DA ERROR
		if (cantidadPelis>=capacidad) {
			System.out.println("!ERROR� El videoclub no puede almacenar m�s pel�culas");
		} else {
			//PIDE INFORMACION DE LA PELICULA
			System.out.print("Introduzca el titulo de la pelicula: ");
			String title=ponerMayus(input.nextLine());
			System.out.print("Introduzca el director: ");
			String direc=ponerMayus(input.nextLine());
			System.out.print("Introduzca la duraci�n en minutos: ");
			int duracion=Integer.parseInt(input.nextLine());
			System.out.print("Introduzca el genero: ");
			String genre=ponerMayus(input.nextLine());
			System.out.print("Introduzca el a�o de estreno: ");
			int year=Integer.parseInt(input.nextLine());
			System.out.print("Introduzca el numero de copias: ");
			int amount=Integer.parseInt(input.nextLine());
			if((cantidadPelis+amount)>capacidad) {
				//SI LA CANTIDAD DE COPIAS QUE QUIERE A�ADIR SUPERAN LA CAPACIDAD DEL VIDEOCLUB
				System.out.println("!ERROR� El videoclub no puede almacenar tantas pel�culas");
			} else {
				Pelicula peli=new Pelicula(id,title,direc,duracion,genre,year,true,amount,0);
				videoclub.add(peli);
				id++;
				cantidadPelis+=amount;
			}
		}
	}
	
	
	public void listarPelicula(ArrayList <Pelicula> videoclub,int i) {
		//ENSE�A UNA PELICULA ESPECIFICA INDICADA POR int i
		System.out.println("ID: "+videoclub.get(i).getId()+"   Titulo: "+videoclub.get(i).getTitulo()+"   Director: "+videoclub.get(i).getDirector());
		System.out.println("Duracion: "+videoclub.get(i).getDuracion()+" minutos   Genero: "+videoclub.get(i).getGenero());
		if(videoclub.get(i).getDisponibilidad()==true){
			System.out.println("A�o de estreno: "+videoclub.get(i).getA�o()+"   Estado: Disponible");
		} else if (videoclub.get(i).getDisponibilidad()==false){
			System.out.println("A�o de estreno: "+videoclub.get(i).getA�o()+"   Estado: No disponible");
		}
		System.out.println();
	}
	
	
	public void listarTodas(ArrayList <Pelicula> videoclub) {
		//ESNE�A TODAS LAS PELICULAS
		System.out.println("===========================");
		System.out.println("|   Lista de peliculas    |");
		System.out.println("===========================");
		int i;
		for (i=0; i<videoclub.size(); i++) {
			System.out.println("ID: "+videoclub.get(i).getId()+"   Titulo: "+videoclub.get(i).getTitulo()+"   Director: "+videoclub.get(i).getDirector());
			System.out.println("Duracion: "+videoclub.get(i).getDuracion()+" minutos   Genero: "+videoclub.get(i).getGenero());
			if(videoclub.get(i).getDisponibilidad()==true){
				System.out.println("A�o de estreno: "+videoclub.get(i).getA�o()+"   Estado: Disponible");
			} else if (videoclub.get(i).getDisponibilidad()==false){
				System.out.println("A�o de estreno: "+videoclub.get(i).getA�o()+"   Estado: No disponible");
			}
			System.out.println();
		}
	}
	
	
	public void reservarPelicula(ArrayList <Pelicula> videoclub,HashMap <String, String> reservas,String nombre) {
		if(videoclub.size()==0) {
			//SI EL VIDEOCLUB ESTA VACIO
			System.out.println("No hay ninguna pelicula en el videoclub");
		}else {
			listarTodas(videoclub);
			System.out.print("�Qu� pelicula quieres reservar(ID)? ");
			int opcion=Integer.parseInt(input.nextLine());
			//SI LA PELICULA NO EXISTE
			if(opcion>videoclub.size() || opcion<0) {
				System.out.println("La pel�cula seleccionada no existe");
			} 
			//SI NO ESTA DISPONIBLE
			else if(videoclub.get(opcion-1).getDisponibilidad()==false) {
				System.out.println("La pelicula no esta disponible");
			}
			//SI ESTA DISPONIBLE
			else if (videoclub.get(opcion-1).getDisponibilidad()==true) {
				System.out.println("Se ha reservado su pelicula");
				//SE A�ADE 1 AL NUMEOR DE RESERVAS DE LA PELICULA
				int num=videoclub.get(opcion-1).getCopiaReservada();
				num+=1;
				videoclub.get(opcion-1).setCopiaReservada(num);
				//SI HAY TANTAS RESERVAS COMO COPIAS DE LA PELICULA
				if(videoclub.get(opcion-1).getCopiaReservada()==videoclub.get(opcion-1).getCopiasTotal()) {
					videoclub.get(opcion-1).setDisponibilidad(false);
				}
				//COMPRUEBA SI EL CLIENTE YA TIENE ALGUNA RESERVA Y A�ADE LA NUEVA PELICULA A SUS RESERVAS
				if (reservas.containsKey(nombre)) {
					String newValue=reservas.get(nombre)+", "+videoclub.get(opcion-1).getTitulo();
					reservas.put(nombre, newValue);
				} 
				//SE A�ADE EL CLIENTE A UN DICCIONARIO(HASHMAP) PARA SABER SUS RESERVAS
				else {
					reservas.put(nombre, videoclub.get(opcion-1).getTitulo());
				}				
			}
		}
	}
		
	
	public void buscarPelicula(ArrayList <Pelicula> videoclub) {
		//SUB-MENU DE BUSQUEDA
		int i;
		//COMPRUEBA SI HAY ALGUNA COINCIDENCIA
		boolean comprobar=false;
		if(videoclub.size()==0) {
			System.out.println("No hay ninguna pelicula en el videoclub");
		}else {
			System.out.println();
			System.out.println("  1) Por t�tulo");
			System.out.println("  2) Por director");
			System.out.println("  3) Por g�nero");
			System.out.println("  4) Por a�o");
			System.out.println("  5) Por duraci�n");
			System.out.print("�Qu� tipo de busqueda quieres realizar? ");
			int opcion=Integer.parseInt(input.nextLine());
			input.nextLine();
			switch(opcion) {
				case 1:
					//BUSQUEDA POR TITULO
					System.out.print("�Qu� t�tulo quieres buscar? ");
					String titulo=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getTitulo().toLowerCase().contains(titulo)) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
					//SI NO SE ENCUENTRA NADA
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 2:
					//BUSQUEDA POR DIRECTOR
					System.out.print("�Qu� director quieres buscar? ");
					String direc=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getDirector().toLowerCase().contains(direc)) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
					//SI NO SE ENCUENTRA NADA
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 3:
					//BUSQUEDA POR GENERO
					System.out.print("�Qu� g�nero quieres buscar? ");
					String genre=input.nextLine().toLowerCase();
					System.out.println("===========================");
					System.out.println("|   Lista de peliculas    |");
					System.out.println("===========================");
					for(i=0; i<videoclub.size(); i++) {
						if(videoclub.get(i).getGenero().toLowerCase().contains(genre)) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
					//SI NO SE ENCUENTRA NADA
					if (comprobar==false) {
						System.out.println("No se ha encontrado ninguna coincidencia");
					};break;
				case 4:
					//BUSQUEDA POR A�O
					System.out.print("�Qu� a�o quieres buscar? ");
					int year=Integer.parseInt(input.nextLine());
					mayorMenor(year,videoclub,true);break;
				case 5:
					//BUSQUEDA POR DURACION
					System.out.print("�Qu� duraci�n quieres buscar(minutos)? ");
					int time=Integer.parseInt(input.nextLine());
					mayorMenor(time,videoclub,false);break;
			}
		}
	}
	
	
	public void mayorMenor(int opcion,ArrayList <Pelicula> videoclub,boolean a�oTime) {
		//METODO DE BUSQUEDA POR A�O Y DURACION YA QUE HACEN LO MISMO
		//boolean a�oTime ES PARA DIFERENCIAR SI SE BUSCA POR A�O O POR DURACION
		int i;
		//COMPRUEBA SI HAY ALGUN RESULTADO
		boolean comprobar=false;
		System.out.println();
		System.out.println("  1) Mayor que...");
		System.out.println("  2) Cantidad exacta");
		System.out.println("  3) Menor que...");
		System.out.print("�Qu� tipo de busqueda prefieres? ");
		int eleccion=Integer.parseInt(input.nextLine());
		switch(eleccion){
			case 1:
				//BUSQUEDA MAYOR AL NUMERO INSERTADO
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (a�oTime==true) {
						if(videoclub.get(i).getA�o()>=opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()>=opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
				}
				//SI NO SE ENCUENTRA NADA
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
			case 2:
				//BUSCAR UNA CANTIDAD EXACTA
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (a�oTime==true) {
						if(videoclub.get(i).getA�o()==opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()==opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
				}
				//SI NO SE ENCUENTRA NADA
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
			case 3:
				//BUSCAR UN NUMERO MENOR AL INSERTADO
				System.out.println("===========================");
				System.out.println("|   Lista de peliculas    |");
				System.out.println("===========================");
				for(i=0; i<videoclub.size(); i++) {
					if (a�oTime==true) {
						if(videoclub.get(i).getA�o()<=opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					} else {
						if(videoclub.get(i).getDuracion()<=opcion) {
							listarPelicula(videoclub,i);
							comprobar=true;
						}
					}
				}
				//SI NO SE ENCUENTRA NADA
				if (comprobar==false) {
					System.out.println("No se ha encontrado ninguna coincidencia");
				};break;
		}
	}
	
	
	public void listarMiembro(ArrayList <Socio> miembros) {
		//ENSE�A TODOS LOS SOCIOS
		int i;
		System.out.println("===========================");
		System.out.println("|     Lista de socios     |");
		System.out.println("===========================");
		for (i=0; i<miembros.size(); i++) {
			System.out.println("Nombre: "+miembros.get(i).getNombre());
		}
	}
	
	
	public void mostrarReservaCliente(HashMap <String,String> reservas,String nombre) {
		//MUESTRA LAS RESERVAS DE UN CLIENTE
		//COMPRUEBA SI ESTA EN LA LISTA DE RESERVAS
		if (reservas.containsKey(nombre)==false) {
			System.out.println("El cliente no tiene ninguna reserva");
		} else {
			System.out.println("El socio "+nombre+" tiene reservadas:");
			System.out.println(reservas.get(nombre));
		}
	}
	
	
	public void mostrarReservaPelicula(HashMap <String,String> reservas,int titulo,ArrayList <Pelicula> videoclub) {
		//MUESTRA LOS CLIENTE QUE TIENEN UNA PELICULA RESERVADA
		boolean comprobar=false;
		for (String i : reservas.keySet()) {
			if (reservas.get(i).contains(videoclub.get(titulo-1).getTitulo())) {
				System.out.println(i);
				comprobar=true;
			}
		}
		//SI NO ESTA RESERVADA
		if (comprobar==false) {
			System.out.println("Esta pelicula no tiene reservas");
		}
	}
	
	
	public void verReserva(HashMap <String,String> reservas,ArrayList <Pelicula> videoclub,ArrayList <Socio> miembros) {
		//MUESTRA LAS RESERVAS QUE HAY
		//SI EL VIDEOCLUB ESTA VACIO
		if (videoclub.size()==0) {
			System.out.println("No hay ninguna pelicula en el videoclub");
		} else {
			System.out.println();
			System.out.println("  1) Buscar por socio");
			System.out.println("  2) Buscar por pelicula");
			System.out.print("�Qu� tipo de busqueda quieres realizar? ");
			int opcion=input.nextInt();
			input.nextLine();
			switch(opcion) {
				case 1:
					//BUSCAR POR SOCIO
					System.out.println();
					listarMiembro(miembros);
					System.out.print("�Qu� miembro quieres comprobar si tiene reservas?(Precauci�n: Key Sensitive) ");
					String nombre=input.nextLine();
					mostrarReservaCliente(reservas,nombre);break;
				case 2:
					//BUSCAR POR PELICULA
					System.out.println();
					listarTodas(videoclub);
					System.out.print("�Qu� pelicula quieres comprobar si tiene reservas? ");
					int titulo=input.nextInt();
					mostrarReservaPelicula(reservas,titulo,videoclub);break;
			}
		}
	}
}