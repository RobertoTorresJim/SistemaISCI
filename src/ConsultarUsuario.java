import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ConsultarUsuario extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ConsultarUsuario() {
		setBackground(new Color(51, 153, 204));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jacquelin\\Downloads\\12348222_1045285648855104_613057522_n.jpg"));
		lblNewLabel.setBounds(337, 21, 83, 75);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar Usuario");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(45, 51, 97, 14);
		add(lblNewLabel_1);
		
		JLabel lblClave = new JLabel("Clave:");
		lblClave.setForeground(Color.WHITE);
		lblClave.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClave.setBackground(Color.WHITE);
		lblClave.setBounds(45, 99, 46, 14);
		add(lblClave);
		
		textField = new JTextField();
		textField.setBounds(101, 97, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblResultado.setBounds(45, 153, 70, 14);
		add(lblResultado);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(45, 183, 294, 63);
		add(textArea);

	}
}
