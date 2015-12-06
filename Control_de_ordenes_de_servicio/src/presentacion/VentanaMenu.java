package presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import principal.Aplicacion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Aplicacion aplicacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu(aplicacion);
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
	public VentanaMenu(final Aplicacion aplicacion) {
		setResizable(false);
		setTitle("Ventana Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 305);
		setLocationRelativeTo(null);//Manda al centro de la pantalla la ventana
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(new Color(255, 255, 255));
		lblBienvenido.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblBienvenido.setBounds(147, 11, 141, 29);
		contentPane.add(lblBienvenido);
		
		JButton btnNewButton = new JButton("Modulo Gerente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aplicacion.iniciaMODGerente();
			}
		});
		btnNewButton.setBounds(125, 62, 184, 32);
		contentPane.add(btnNewButton);
		
		JButton btnAdministracionUsuarios = new JButton("Administracion Usuarios");
		btnAdministracionUsuarios.setBounds(125, 129, 184, 32);
		contentPane.add(btnAdministracionUsuarios);
		
		JButton CerrarSesion = new JButton("Cerrar Sesion");
		CerrarSesion.setBounds(125, 190, 184, 32);
		contentPane.add(CerrarSesion);
	}
}
