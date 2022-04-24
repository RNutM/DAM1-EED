package tema_2.radio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class radio {
	/**
	 * Clase radio que muestra una ventana con botones que actuan y muestran datos en un
	 * campo
	 * 
	 * @author Robert Gutiérrez
	 * 
	 */
	private JFrame frmJosRobertoGutirrez;
	private JTextField textNomCadena;
	private JButton btnCuarenta;
	private JButton btnRadio3;
	private JButton btnRadio5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio window = new radio();
					window.frmJosRobertoGutirrez.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public radio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJosRobertoGutirrez = new JFrame();
		frmJosRobertoGutirrez.getContentPane().setFont(new Font("Arial", Font.PLAIN, 40));
		frmJosRobertoGutirrez.setTitle("Radio by Robert Guti\u00E9rrez");
		frmJosRobertoGutirrez.setBounds(100, 100, 450, 300);
		frmJosRobertoGutirrez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJosRobertoGutirrez.getContentPane().setLayout(null);

		textNomCadena = new JTextField();
		textNomCadena.setHorizontalAlignment(SwingConstants.CENTER);
		textNomCadena.setFont(new Font("Arial", Font.PLAIN, 45));
		textNomCadena.setForeground(Color.LIGHT_GRAY);
		textNomCadena.setEditable(false);
		textNomCadena.setBackground(Color.BLACK);
		textNomCadena.setBounds(10, 11, 414, 104);
		frmJosRobertoGutirrez.getContentPane().add(textNomCadena);
		textNomCadena.setColumns(10);

		JButton btnOff = new JButton("OFF");
		btnOff.setEnabled(false);

		JButton btnOn = new JButton("ON");
		btnOn.setEnabled(true);

		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOn.setEnabled(false);
				btnOff.setEnabled(true);
				textNomCadena.setText("CUARENTA");
				btnCuarenta.setEnabled(true);
				btnRadio3.setEnabled(true);
				btnRadio5.setEnabled(true);
			}
		});
		btnOn.setBounds(89, 126, 89, 23);
		frmJosRobertoGutirrez.getContentPane().add(btnOn);

		btnOff.setEnabled(false);
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOn.setEnabled(true);
				btnOff.setEnabled(false);
				textNomCadena.setText("");
				btnCuarenta.setEnabled(false);
				btnRadio3.setEnabled(false);
				btnRadio5.setEnabled(false);
			}
		});
		btnOff.setBounds(257, 126, 89, 23);
		frmJosRobertoGutirrez.getContentPane().add(btnOff);

		btnCuarenta = new JButton("CUARENTA");
		btnCuarenta.setEnabled(false);
		btnCuarenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textNomCadena.setText("CUARENTA");

			}
		});
		btnCuarenta.setBounds(44, 174, 100, 50);
		frmJosRobertoGutirrez.getContentPane().add(btnCuarenta);

		btnRadio3 = new JButton("RADIO 3");
		btnRadio3.setEnabled(false);
		btnRadio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNomCadena.setText("RADIO 3");
			}
		});
		btnRadio3.setBounds(168, 174, 100, 50);
		frmJosRobertoGutirrez.getContentPane().add(btnRadio3);

		btnRadio5 = new JButton("RADIO 5");
		btnRadio5.setEnabled(false);
		btnRadio5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNomCadena.setText("RADIO 5");
			}
		});
		btnRadio5.setBounds(287, 174, 100, 50);
		frmJosRobertoGutirrez.getContentPane().add(btnRadio5);
	}
}
