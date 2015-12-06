package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaEmpleado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Component logo;
	private JTextField JTUsuarioCabecera;
	private JTextField JTCargoCabecera;
	private JTextField JTHoraCabecera;
	private JTextField JTFechaCabecera;
	private JTextField JTEstado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEmpleado frame = new VentanaEmpleado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaEmpleado() {
		setTitle("VentanaEmpleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 460);
		setLocationRelativeTo(null);//Manda al centro de la pantalla la ventana
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 684, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel Panellogo;
		logo = createPanelIm("/presentacion/LogoF.png");
			
		
		
		JPanel panelCabeceraB = new JPanel();
		panelCabeceraB.setBackground(Color.BLACK);
		panelCabeceraB.setBounds(0, 0, 439, 71);
		panel.add(panelCabeceraB);
		panelCabeceraB.setLayout(null);
		
		JLabel labelBienvenido = new JLabel("Bienvenido");
		labelBienvenido.setForeground(Color.WHITE);
		labelBienvenido.setBounds(153, 1, 134, 32);
		labelBienvenido.setFont(new Font("Arial Black", Font.PLAIN, 22));
		panelCabeceraB.add(labelBienvenido);
		
		JLabel lavelUsuario = new JLabel("Usuario:");
		lavelUsuario.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lavelUsuario.setForeground(Color.WHITE);
		lavelUsuario.setBounds(10, 46, 65, 14);
		panelCabeceraB.add(lavelUsuario);
		
		JLabel labelCargo = new JLabel("Cargo:");
		labelCargo.setForeground(Color.WHITE);
		labelCargo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelCargo.setBounds(272, 44, 59, 19);
		panelCabeceraB.add(labelCargo);
		
		JTUsuarioCabecera = new JTextField();
		JTUsuarioCabecera.setFont(new Font("Arial Black", Font.PLAIN, 12));
		JTUsuarioCabecera.setForeground(new Color(255, 255, 0));
		JTUsuarioCabecera.setBounds(79, 45, 183, 20);
		panelCabeceraB.add(JTUsuarioCabecera);
		JTUsuarioCabecera.setColumns(10);
		
		JTCargoCabecera = new JTextField();
		JTCargoCabecera.setForeground(new Color(255, 255, 0));
		JTCargoCabecera.setText("");
		JTCargoCabecera.setBounds(328, 45, 101, 20);
		panelCabeceraB.add(JTCargoCabecera);
		JTCargoCabecera.setColumns(10);
		
		JPanel panelCabeceraFecha = new JPanel();
		panelCabeceraFecha.setBackground(new Color(0, 0, 51));
		panelCabeceraFecha.setBounds(440, 0, 165, 71);
		panel.add(panelCabeceraFecha);
		panelCabeceraFecha.setLayout(null);
		
		JLabel labelFecha = new JLabel("Fecha:");
		labelFecha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelFecha.setForeground(new Color(255, 255, 255));
		labelFecha.setBounds(10, 11, 46, 14);
		panelCabeceraFecha.add(labelFecha);
		
		JLabel labelHora = new JLabel("Hora:");
		labelHora.setForeground(Color.WHITE);
		labelHora.setFont(new Font("Arial Black", Font.PLAIN, 12));
		labelHora.setBounds(10, 46, 46, 14);
		panelCabeceraFecha.add(labelHora);
		
		JTHoraCabecera = new JTextField();
		JTHoraCabecera.setForeground(new Color(255, 255, 0));
		JTHoraCabecera.setBounds(66, 40, 89, 20);
		panelCabeceraFecha.add(JTHoraCabecera);
		JTHoraCabecera.setColumns(10);
		
		JTFechaCabecera = new JTextField();
		JTFechaCabecera.setForeground(new Color(255, 255, 0));
		JTFechaCabecera.setBounds(66, 9, 89, 20);
		panelCabeceraFecha.add(JTFechaCabecera);
		JTFechaCabecera.setColumns(10);
		Panellogo = new JPanel();
		Panellogo.setBounds(603, -1, 81, 72);
		panel.add(Panellogo);
		Panellogo.setBackground(Color.WHITE);
		Panellogo.setLayout(new BorderLayout());
		Panellogo.add(logo, BorderLayout.CENTER);
		
		JTUsuarioCabecera.setEditable(false);
		JTCargoCabecera.setEditable(false);
		JTHoraCabecera.setEditable(false);
		JTFechaCabecera.setEditable(false);
		
		JTUsuarioCabecera.setBackground(Color.white);
		JTCargoCabecera.setBackground(Color.white);
		JTHoraCabecera.setBackground(Color.white);
		JTFechaCabecera.setBackground(Color.white);
		
		JTUsuarioCabecera.setOpaque(false);
		JTCargoCabecera.setOpaque(false);
		JTHoraCabecera.setOpaque(false);
		JTFechaCabecera.setOpaque(false);
	
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.desktop);
		panel_1.setBounds(0, 396, 684, 26);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estado :");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 4, 62, 21);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel);
		
		JTEstado = new JTextField();
		JTEstado.setForeground(new Color(255, 153, 0));
		JTEstado.setEditable(false);
		JTEstado.setBounds(70, 4, 608, 20);
		panel_1.add(JTEstado);
		JTEstado.setColumns(10);
		JTEstado.setOpaque(false);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(173, 216, 230));
		panel_3.setBackground(new Color(224, 255, 255));
		panel_3.setBounds(0, 108, 684, 285);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 74, 684, 33);
		contentPane.add(panel_2);
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnSalir = new JButton("Cerrar Sesion");
		panel_2.add(btnSalir);
		
		JButton btnAgregar = new JButton("Levantar Orden");
		panel_2.add(btnAgregar);
		
		JButton btnOrdenesLevantadas = new JButton("Ordenes Levantadas");
		panel_2.add(btnOrdenesLevantadas);
	}
	
	private static JPanel createPanelIm(final String imagen) {
		  TransparentPanel panel = new TransparentPanel();
		 
		  panel.setBackgroundImage(panel.createImage(imagen).getImage());
		 	  
		  return panel;
		 }
}
