package tema_3;

public class Debug00_Explicacion1 {
	/**
	 * Clase Debug00_Explicacion1
	 *
	 * @author Robert Gutiérrez
	 * 
	 */
	public static void main(String[] args) {

		// Creamos un array de 3 posiciones para almacenar una fecha
		// en formato dd/mm/yyyy
		int arrFecha[] = new int[3];
		System.out.println("Creamos una fecha para luego imprimirla");
		arrFecha[1] = 12; // dia
		arrFecha[2] = 02; // mes
		arrFecha[3] = 2019; // Año. En esta línea tenemos un error que genera una excepción

		System.out.println("La fecha almacenada es " + arrFecha[1] + "/" + arrFecha[2] + "/" + arrFecha[3]);
	}
}

// -> La corrección es la siguiente:
/*arrFecha[0] = 12; // dia
arrFecha[1] = 02; // mes
arrFecha[2] = 2019; // Año. En esta línea tenemos un error que genera una excepción

System.out.println("La fecha almacenada es " + arrFecha[0] + "/" + arrFecha[1] + "/" + arrFecha[2]);*/

