package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import BD.ConexionMySQL;

public class VentanaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JTUsuario;
	private JTextField JTPasword;
	private JTextField JTEstadoConeccion;
	
	Connection cn= ConexionMySQL.conectar();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);//Manda al centro de la pantalla la ventana
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		
      	JLabel lblSistemaDeControl = new JLabel("Sistema de Control de Ordenes");
		lblSistemaDeControl.setForeground(new Color(255, 255, 255));
		lblSistemaDeControl.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblSistemaDeControl.setBounds(53, 11, 332, 43);
		contentPane.add(lblSistemaDeControl);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblUsuario.setBounds(85, 80, 57, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPasword = new JLabel("Pasword:");
		lblPasword.setForeground(Color.WHITE);
		lblPasword.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblPasword.setBounds(76, 130, 66, 14);
		contentPane.add(lblPasword);
		
		JTUsuario = new JTextField();
		JTUsuario.setBounds(152, 78, 202, 20);
		contentPane.add(JTUsuario);
		JTUsuario.setColumns(10);
		
		JTPasword = new JTextField();
		JTPasword.setColumns(10);
		JTPasword.setBounds(152, 128, 202, 20);
		contentPane.add(JTPasword);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(85, 189, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(265, 189, 89, 23);
		contentPane.add(btnCancelar);
		
		JTEstadoConeccion = new JTextField();
		JTEstadoConeccion.setForeground(new Color(255, 255, 0));
		JTEstadoConeccion.setEditable(false);
		JTEstadoConeccion.setOpaque(false);
		JTEstadoConeccion.setBounds(10, 242, 414, 20);
		compruevaconeccion();
		JTEstadoConeccion.setHorizontalAlignment(SwingConstants.CENTER); 
		contentPane.add(JTEstadoConeccion);
		JTEstadoConeccion.setColumns(10);
	}
	
	public void compruevaconeccion (){
		if(!cn.equals(null)){                             
            JTEstadoConeccion.setText("----------Conectado Correctamente----------");
            try{
                cn.close();
               
            }catch(SQLException ex){

            	 JTEstadoConeccion.setText("X-X-X-X-X-FALLO EN CONECCION-X-X-X-X-X-X");

            }

    }
	}
}
