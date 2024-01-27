package libreria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes" , 2, 0);
		Libro libro2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte" , 1, 0);
		Libro libro3 = new Libro("Percy Jackson y el ladrón del rayo", "Rick Riordan" , 5, 0);
		
		System.out.println(libro1.prestamo());
		System.out.println(libro1.prestamo());
		System.out.println(libro1.prestamo());
		
		System.out.println(libro1.devolucion());
		System.out.println(libro1.devolucion());
		System.out.println(libro1.devolucion());
		
		System.out.println(libro1.toString());
		
		System.out.println(libro2.prestamo());
		System.out.println(libro2.prestamo());
		System.out.println(libro2.prestamo());
		
		System.out.println(libro2.devolucion());
		System.out.println(libro2.devolucion());
		System.out.println(libro2.devolucion());
		
		System.out.println(libro2.toString());
		
		System.out.println(libro3.prestamo());
		System.out.println(libro3.prestamo());
		System.out.println(libro3.prestamo());
		
		System.out.println(libro3.devolucion());
		System.out.println(libro3.devolucion());
		System.out.println(libro3.devolucion());
		
		System.out.println(libro3.toString());

	}

}
