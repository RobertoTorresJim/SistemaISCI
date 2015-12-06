package Presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEliminarOrden extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEliminarOrden frame = new VentanaEliminarOrden();
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
	public VentanaEliminarOrden() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEliminarOrden = new JLabel("Eliminar Orden ");
		lblEliminarOrden.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEliminarOrden.setBounds(145, 11, 96, 19);
		panel.add(lblEliminarOrden);
		
		JLabel lblCveOrden = new JLabel("Cve. Orden: ");
		lblCveOrden.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCveOrden.setBounds(50, 59, 75, 19);
		panel.add(lblCveOrden);
		
		textField = new JTextField();
		textField.setBounds(135, 59, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar ");
		btnEliminar.setBounds(307, 205, 89, 23);
		panel.add(btnEliminar);
		
		JButton btnCancelar = new JButton("Cancelar ");
		btnCancelar.setBounds(200, 205, 89, 23);
		panel.add(btnCancelar);
		
		JLabel lblDatosDeLa = new JLabel("                  Datos de la Orden ");
		lblDatosDeLa.setBounds(10, 89, 372, 96);
		panel.add(lblDatosDeLa);
		
		JButton btnConsu = new JButton("Consultar ");
		btnConsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsu.setBounds(246, 58, 89, 23);
		panel.add(btnConsu);
	}
}
