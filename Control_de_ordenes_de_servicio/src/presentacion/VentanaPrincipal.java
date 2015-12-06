package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Proyecto.Aplicacion;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Aplicacion aplicacion;
	/**
	 * Launch the application.
	 */
public static void main(String[] args) {
	aplicacion	= new Aplicacion();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal (aplicacion);//Hace una referencia a la clase Aplicacion para que se ejecute la Ventana Principal
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
	public VentanaPrincipal(Aplicacion aplicacion) {
		aplicacion = new Aplicacion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setForeground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIniciarSesion = new JButton("LevantarOrden");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aplicacion.LOrden();
			}
		});
		btnIniciarSesion.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnIniciarSesion.setBounds(155, 110, 123, 23);
		contentPane.add(btnIniciarSesion);
		
		JLabel lblLevantamientoDeOrdenes = new JLabel("Levantamiento de Ordenes");
		lblLevantamientoDeOrdenes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLevantamientoDeOrdenes.setBounds(111, 11, 261, 29);
		contentPane.add(lblLevantamientoDeOrdenes);
	}

}
