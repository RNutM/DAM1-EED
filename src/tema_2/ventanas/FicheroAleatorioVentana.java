package tema_2.ventanas;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

public class FicheroAleatorioVentana {

	/**
	 * Clase FicheroAleatorioVentana esta es la clase main que va en conjunto con
	 * VentanaDepart
	 * 
	 * IMPORTANTE: Este fichero me lo pasaron para estudiarmelo, me ha parecido muy
	 * interesante y por eso lo comparto
	 */

	public static void main(String[] args) throws IOException {

		JFrame f = new JFrame("DEPARTAMENTOS.");
		// Nos aseguramos que el fichero exista para evitar posibles errores
		File fichero = new File(".\\src\\ficheros\\AleatorioDep.dat");
		RandomAccessFile file;
		file = new RandomAccessFile(fichero, "rw");
		file.close();
		VentanaDepart v = new VentanaDepart(f);
		v.setVisible(true);
	}
}
