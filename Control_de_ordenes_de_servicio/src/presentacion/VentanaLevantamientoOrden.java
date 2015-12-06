package Presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Orden;
import negocio.ControlLevantarOrden;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;



import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VentanaLevantamientoOrden extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldFecha;
	private static ControlLevantarOrden controlLO;
	private Orden orden;
	private JTextField textField_fecha;
	private JTextField textField_Descripcion;
	


	/**
	 * Create the frame.
	 * @wbp.parser.constructor
	 */
	public VentanaLevantamientoOrden(ControlLevantarOrden controlLO) {
		
		super();
		VentanaLevantamientoOrden.controlLO = controlLO;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 366);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setForeground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido  a Levantamiento de orden ");
		lblBienvenido.setForeground(new Color(255, 255, 255));
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBienvenido.setBounds(152, 11, 241, 20);
		contentPane.add(lblBienvenido);
		
		JRadioButton rdbtnSoftware = new JRadioButton("Software");
		rdbtnSoftware.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSoftware.setBackground(new Color(0, 0, 51));
		rdbtnSoftware.setForeground(new Color(255, 255, 255));
		rdbtnSoftware.setBounds(128, 128, 109, 23);
		contentPane.add(rdbtnSoftware);
		
		JRadioButton rdbtnHardware = new JRadioButton("Hardware");
		rdbtnHardware.setForeground(new Color(255, 255, 255));
		rdbtnHardware.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnHardware.setBackground(new Color(0, 0, 51));
		rdbtnHardware.setBounds(283, 128, 109, 23);
		contentPane.add(rdbtnHardware);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setForeground(new Color(255, 255, 255));
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescripcion.setBounds(33, 152, 87, 20);
		contentPane.add(lblDescripcion);
				
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(310, 293, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar ");
		btnNewButton_1.setBounds(422, 293, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre : ");
		lblNewLabel_1.setBounds(158, 42, 286, 79);
		contentPane.add(lblNewLabel_1);
		
		textField_fecha = new JTextField();
		textField_fecha.setEditable(false);
		textField_fecha.setBounds(403, 11, 134, 20);
		contentPane.add(textField_fecha);
		textField_fecha.setColumns(10);
		textField_fecha.setText(horaActual());
		
		textField_Descripcion = new JTextField();
		textField_Descripcion.setBounds(138, 158, 279, 66);
		contentPane.add(textField_Descripcion);
		textField_Descripcion.setColumns(10);
		
		
	}
	public String horaActual(){
		//Date fecha= new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		   return dateFormat.format(cal.getTime());
	}
	
	public static String fechaActual(){
		Date fecha= new Date();
		
		SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
		return formatofecha.format(fecha);		
	}

public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLevantamientoOrden frame = new VentanaLevantamientoOrden(controlLO);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
