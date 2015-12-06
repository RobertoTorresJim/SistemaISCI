package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class VentanaCambioTipo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCambioTipo frame = new VentanaCambioTipo();
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
	public VentanaCambioTipo() {
		setTitle("Ventana Cambio Tipo Orden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);//Manda al centro de la pantalla la ventana
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecciona el Tipo de la Orden");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(97, 29, 247, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbSoftware = new JRadioButton("Software");
		rbSoftware.setFont(new Font("Arial Black", Font.PLAIN, 12));
		rbSoftware.setBackground(new Color(0, 0, 51));
		rbSoftware.setForeground(new Color(255, 255, 255));
		rbSoftware.setBounds(97, 97, 85, 23);
		contentPane.add(rbSoftware);
		
		JRadioButton rbHardware = new JRadioButton("Hardware");
		rbHardware.setForeground(Color.WHITE);
		rbHardware.setFont(new Font("Arial Black", Font.PLAIN, 12));
		rbHardware.setBackground(new Color(0, 0, 51));
		rbHardware.setBounds(247, 97, 97, 23);
		contentPane.add(rbHardware);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(93, 171, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(255, 171, 89, 23);
		contentPane.add(btnCancelar);
	}
}
