package tema_3;

import javax.swing.JOptionPane;

public class Debug01_Explicacion {
	/**
	 * Clase Debug01_Explicacion
	 *
	 * @author Robert Guti�rrez
	 * 
	 */
	public static void main(String[] args) {

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos del array"));
		// Creamos un array con el numero de elementos introducido
		int num_aleatorios[] = new int[elementos];

		// Llenamos el array con numeros aleatorios
		for (int i = 0; i < num_aleatorios.length; i++) {
			num_aleatorios[i] = (int) (Math.random() * 100);
		} // fin for
			// Imprimir valores
		for (int i = 0; i < num_aleatorios.length; i++) {
			System.out.print(num_aleatorios[i] + " ");
		}
	}
}
