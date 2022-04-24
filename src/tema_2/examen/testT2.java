package tema_2.examen;

public class testT2 {
	/**
	 * Clase testT2 que conecta con AutoresEjercicio2 y EnciclopediasEjercicio2
	 *
	 * @author Robert Gutiérrez
	 * 
	 */
	public static void main(String[] args) {

		AutoresEjercicio2 a = new AutoresEjercicio2();

		EnciclopediasEjercicio2 e = new EnciclopediasEjercicio2();
		
		TomosEjercicio2 t = new TomosEjercicio2();

		a.setNombreAutor("Robert Gutiérrez");
		e.setAutores(a);
		e.setNombre("Planeta Venus");
		e.setIsbn("123456789-B");
		e.setEditorial("Editorial de prueba");
		t.setNombreTomo("Tomo de prueba");

		
		System.out.println("\\\\Datos extraídos de la Clase Autores////");
		System.out.println("Autor: " + a.getNombreAutor());
		System.out.println("\n\\\\Datos extraídos de la Clase Enciclopedias////");
		System.out.println("Nombre: " + e.getNombre());
		System.out.println("ISBN: " + e.getIsbn());
		System.out.println("Editorial: " + e.getEditorial());
		System.out.println("Autor: " + e.getAutores().getNombreAutor());
		System.out.println("\n\\\\Datos extraídos de la Clase Tomos////");
		System.out.println("Tomo:" + t.getNombreTomo());
	}
}
