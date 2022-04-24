package tema_2.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaVentanas {
	/**
	 * Clase PruebaVentanas donde estoy haciendo pruebas
	 * 
	 * IMPORTANTE: Este fichero me lo pasaron para estudiarmelo, me ha parecido muy
	 * interesante y por eso lo comparto
	 */
	private JFrame frmPruebaDeVentanas;
	private JTextField cajaNdep;
	private JTextField cajaLdep;
	private JTextField cajaCdep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaVentanas window = new PruebaVentanas();
					window.frmPruebaDeVentanas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PruebaVentanas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaDeVentanas = new JFrame();
		frmPruebaDeVentanas.setTitle("PRUEBA DE VENTANAS");
		frmPruebaDeVentanas.setBounds(100, 100, 450, 300);
		frmPruebaDeVentanas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaDeVentanas.getContentPane().setLayout(null);
		
		JLabel lblCdigoDepartamento = new JLabel("C\u00F3digo Departamento:");
		lblCdigoDepartamento.setBounds(55, 69, 149, 14);
		frmPruebaDeVentanas.getContentPane().add(lblCdigoDepartamento);
		
		JLabel lblLocalidadDepartamento = new JLabel("Nombre Departamento:");
		lblLocalidadDepartamento.setBounds(55, 94, 149, 14);
		frmPruebaDeVentanas.getContentPane().add(lblLocalidadDepartamento);
		
		JLabel lblLocalidadDepartamento_1 = new JLabel("Localidad Departamento:");
		lblLocalidadDepartamento_1.setBounds(55, 119, 149, 14);
		frmPruebaDeVentanas.getContentPane().add(lblLocalidadDepartamento_1);
		
		cajaNdep = new JTextField();
		cajaNdep.setToolTipText("Nombre Departamento");
		cajaNdep.setBounds(214, 94, 148, 20);
		frmPruebaDeVentanas.getContentPane().add(cajaNdep);
		cajaNdep.setColumns(10);
		
		
		
		cajaLdep = new JTextField();
		cajaLdep.setToolTipText("Localidad Departamento");
		cajaLdep.setColumns(10);
		cajaLdep.setBounds(214, 122, 148, 20);
		frmPruebaDeVentanas.getContentPane().add(cajaLdep);
		
		JButton btnInsertarDatos = new JButton("Insertar datos");
		btnInsertarDatos.setToolTipText("Insertar datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Has introducido datos del departamento");
			/*btnInsertarDatos.setEnabled(false);*/}
		});
		btnInsertarDatos.setBounds(55, 195, 112, 23);
		frmPruebaDeVentanas.getContentPane().add(btnInsertarDatos);
							
		JButton btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.setToolTipText("Limpiar datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println("Has limpiado los datos");
			cajaCdep.setText(" ");
			cajaNdep.setText(" ");
			cajaLdep.setText(" ");
			}
		});
		btnLimpiarDatos.setBounds(250, 195, 112, 23);
		frmPruebaDeVentanas.getContentPane().add(btnLimpiarDatos);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 11, 189, 14);
		frmPruebaDeVentanas.getContentPane().add(lblNewLabel);
		
		cajaCdep = new JTextField();
		cajaCdep.setToolTipText("Codigo Departamento");
		cajaCdep.setBackground(Color.GRAY);
		cajaCdep.setColumns(10);
		cajaCdep.setBounds(214, 69, 69, 20);
		frmPruebaDeVentanas.getContentPane().add(cajaCdep);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(36, 47, 362, 119);
		frmPruebaDeVentanas.getContentPane().add(panel);
	}
}
