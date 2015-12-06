import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

public class PanelBitacora extends JPanel {
	private JTable table;
	public static ControlBitacora control;
	/**
	 * Create the panel.
	 */
public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelBitacora frame = new PanelBitacora(control);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PanelBitacora(ControlBitacora control) {
		setBackground(new Color(51, 153, 204));
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jacquelin\\Downloads\\12348222_1045285648855104_613057522_n.jpg"));
		lblNewLabel.setBounds(382, 12, 85, 75);
		add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Fecha Seguimiento", "Hora Seguimiento", "Observaciones", "Status"},
				{"", null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(94);
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(2).setPreferredWidth(79);
		table.setBounds(57, 193, 343, 32);
		add(table);
		
		JLabel lblDescripvion = new JLabel("Descripcion:");
		lblDescripvion.setForeground(Color.WHITE);
		lblDescripvion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripvion.setBounds(57, 152, 69, 14);
		add(lblDescripvion);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFecha.setForeground(new Color(255, 255, 255));
		lblFecha.setBounds(10, 41, 56, 14);
		add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setForeground(Color.WHITE);
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHora.setBounds(10, 72, 46, 14);
		add(lblHora);
		
		JLabel lblFechaAsignacion = new JLabel("Fecha Asignacion:");
		lblFechaAsignacion.setForeground(Color.WHITE);
		lblFechaAsignacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFechaAsignacion.setBounds(132, 41, 102, 14);
		add(lblFechaAsignacion);
		
		JLabel lblHoraAsignacion = new JLabel("Hora Asignacion:");
		lblHoraAsignacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHoraAsignacion.setForeground(new Color(255, 255, 255));
		lblHoraAsignacion.setBounds(132, 72, 102, 14);
		add(lblHoraAsignacion);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTipo.setBounds(10, 104, 46, 14);
		add(lblTipo);
		
		JLabel lblTecnicoAsignado = new JLabel("Tecnico Asignado:");
		lblTecnicoAsignado.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTecnicoAsignado.setForeground(Color.WHITE);
		lblTecnicoAsignado.setBounds(132, 104, 102, 14);
		add(lblTecnicoAsignado);

	}
}
