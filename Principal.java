package publicaciones;

import java.util.*;
//Si se realizo el cambio a ArrayList
public class Principal {

	public static void main(String[] args) {
		
		int opc = 0, opc2 = 0, num2;
		boolean e;
		double num;
		String pala;
		Scanner leer = new Scanner(System.in);
		ArrayList<Object> publicacion = new ArrayList<Object>();
		
		do {
			
			System.out.println("-----------------Menu-----------------");
			System.out.println("1.-Dar de alta una publicacion");
			System.out.println("2.-Mostrar datos");
			System.out.println("3.-Salir");
			
			do{
	            try {
	            	System.out.print("Ingrese la opcion a realizar: ");
	            	opc=leer.nextInt();
	            	e=true;
	            } catch (InputMismatchException exception) {
	                System.out.println("Ingrese solamente un numero");
	                leer.next();
	                e = false;
	            }//catch
	        }while(!e);
			
			switch(opc) {
			
				case 1:
					System.out.println("-----------------Menu-----------------");
					System.out.println("1.-Libro");
					System.out.println("2.-Revista");
					System.out.println("3.-Periodico");
					do{
			            try {
			            	System.out.print("Ingrese la opcion a realizar: ");
			            	opc2=leer.nextInt();
			            	e=true;
			            } catch (InputMismatchException exception) {
			                System.out.println("Ingrese solamente un numero");
			                leer.next();
			                e = false;
			            }//catch
			        }while(!e);
					
					switch(opc2) {
					
						case 1:
							leer.nextLine();
							Libro libro = new Libro();
							System.out.print("Ingerese el ISBN: ");
							pala = leer.nextLine();
							libro.setISBN(pala);
							
							System.out.print("Ingerese el Titulo: ");
							pala = leer.nextLine();
							libro.setTitulo(pala);
							
							System.out.print("Ingerese el Autor: ");
							pala = leer.nextLine();
							libro.setAutor(pala);
							
							System.out.print("Ingerese el Precio: ");
							num = leer.nextDouble();
							libro.setPrecio(num);
							leer.nextLine();
							
							System.out.print("Ingerese el Numero de Edicion: ");
							pala = leer.nextLine();
							libro.setEdicion(pala);
							
							System.out.print("Ingerese el Numero de paginas: ");
							num2 = leer.nextInt();
							libro.setNumpag(num2);
							
							publicacion.add(libro);
							break;
							
						case 2:

							leer.nextLine();
							Revista revista = new Revista();
							System.out.print("Ingerese el ISSN: ");
							pala = leer.nextLine();
							revista.setISSN(pala);
							
							System.out.print("Ingerese el Titulo: ");
							pala = leer.nextLine();
							revista.setTitulo(pala);
							
							System.out.print("Ingerese el Precio: ");
							num = leer.nextDouble();
							revista.setPrecio(num);
							
							System.out.print("Ingerese el Numero de publicacion: ");
							num2 = leer.nextInt();
							revista.setNumero(num2);
							
							System.out.print("Ingerese el Año de publicacion: ");
							num2 = leer.nextInt();
							revista.setAnio(num2);
							
							System.out.print("Ingerese el Numero de paginas: ");
							num2 = leer.nextInt();
							revista.setNumpag(num2);
							leer.nextLine();
							
							System.out.print("Ingerese la Periodicidad: ");
							pala = leer.nextLine();
							revista.setPeriodicidad(pala);
							
							publicacion.add(revista);
							break;
							
						case 3:

							leer.nextLine();
							Periodicos peri = new Periodicos();
							
							System.out.print("Ingerese el Titulo: ");
							pala = leer.nextLine();
							peri.setTitulo(pala);
							
							System.out.print("Ingerese las secciones: ");
							pala = leer.nextLine();
							peri.setSecciones(pala);
							
							System.out.print("Ingerese el Precio: ");
							num = leer.nextDouble();
							peri.setPrecio(num);
							
							System.out.print("Ingerese el Numero de paginas: ");
							num2 = leer.nextInt();
							peri.setNumpag(num2);
							leer.nextLine();
							
							System.out.print("Ingerese la Periodicidad: ");
							pala = leer.nextLine();
							peri.setPeriodicidad(pala);
							
							publicacion.add(peri);
							break;
							
						default:
							System.out.println("Ingrese una opcion valida");
					}
					break;
				case 2:
					for(int i = 0; i < publicacion.size(); i++) {
						System.out.println(" " + publicacion.get(i).getClass());
						if(publicacion.get(i) instanceof Revista) {
							
							Revista rev1 = new Revista();
							rev1 = (Revista)publicacion.get(i);
							System.out.println("--------------Revista--------------");
							System.out.println("ISSN " + rev1.getISSN());
							System.out.println("Titulo " + rev1.getTitulo());
							System.out.println("Precio " + rev1.getPrecio());
							System.out.println("Numero de publicacion " + rev1.getNumero());
							System.out.println("Año de publicacion" + rev1.getAnio());
							System.out.println("Numero de paginas " + rev1.getNumpag());
							System.out.println("Periodicidad " + rev1.getPeriodicidad());
						}//if
						
						else if(publicacion.get(i) instanceof Libro) {
							Libro lib = new Libro();
							lib = (Libro)publicacion.get(i);
							System.out.println("--------------Libro--------------");
							System.out.println("ISBN " + lib.getISBN());
							System.out.println("Titulo " + lib.getTitulo());
							System.out.println("Autor " + lib.getAutor());
							System.out.println("Precio " + lib.getPrecio());
							System.out.println("Edicion " + lib.getEdicion());
							System.out.println("Numero de paginas " + lib.getNumpag());
							
						}
						else if(publicacion.get(i) instanceof Periodicos) {
							Periodicos peri = new Periodicos();
							peri = (Periodicos) publicacion.get(i);
							System.out.println("--------------Periodicos--------------");
							System.out.println("Titulo " + peri.getTitulo());
							System.out.println("Secciones " + peri.getSecciones());
							System.out.println("Precio " + peri.getPrecio());
							System.out.println("Numero de paginas " + peri.getNumpag());
							System.out.println("Periodicidad " + peri.getPeriodicidad());
						}
					}
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Ingrese una opcion valida");
			}//switch
				
		}while(opc!=3);
		leer.close();
	}//main

}//class
