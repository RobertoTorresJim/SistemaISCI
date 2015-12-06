import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;


public class VentanaBitacora extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabelTitulo;
	private JLabel jLabelNumeroOrden;
	private JLabel jLabelTipoOrden;
	private JLabel jLabelFechaLevantamiento;
	private JLabel jLabelFechaAsignacion;
	private JLabel jLabelTecnico;
	private JLabel jLabelDescripcion;

	private JPanel jPanelCabecera;

	private JTextPane jTextPane;
	
	private JPanel contentPane;
	
	
	private JTable tableBitacora;
	private JButton btnNuevoSeguimiento;


	/**
	 * Create the frame.
	 */
	public VentanaBitacora(ControlBitacora controlB) {
		setTitle("Bitacora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(2, 1));
		setContentPane(contentPane);

		jPanelCabecera = new JPanel();
		contentPane.add(jPanelCabecera);
		jPanelCabecera.setLayout(null);
		jLabelTitulo = new JLabel("Bitacora");
		jLabelTitulo.setBounds(60, 11, 46, 14);
		jPanelCabecera.add(jLabelTitulo);

		jLabelNumeroOrden = new JLabel("Orden: ");
		jLabelNumeroOrden.setBounds(239, 11, 46, 14);
		jPanelCabecera.add(jLabelNumeroOrden);

		jLabelTipoOrden = new JLabel("Tipo: ");
		jLabelTipoOrden.setBounds(660, 8, 50, 21);
		jPanelCabecera.add(jLabelTipoOrden);

		jLabelFechaLevantamiento = new JLabel("Fecha  de Levantamiento : ");
		jLabelFechaLevantamiento.setBounds(10, 36, 290, 21);
		jPanelCabecera.add(jLabelFechaLevantamiento);

		jLabelFechaAsignacion = new JLabel("Fecha de Asignacion: ");
		jLabelFechaAsignacion.setBounds(10, 68, 186, 21);
		jPanelCabecera.add(jLabelFechaAsignacion);

		jLabelTecnico = new JLabel("Tecnico: ");
		jLabelTecnico.setBounds(660, 36, 50, 21);
		jPanelCabecera.add(jLabelTecnico);

		jLabelDescripcion = new JLabel("Descripcion: ");
		jLabelDescripcion.setBounds(20, 100, 66, 21);
		jPanelCabecera.add(jLabelDescripcion);
		
		jTextPane = new JTextPane();
		jTextPane.setEditable(false);
		jTextPane.setText("Orden de prueba");
		jTextPane.setBounds(96, 100, 665, 132);
		jPanelCabecera.add(jTextPane);
		
		btnNuevoSeguimiento = new JButton("Nuevo seguimiento");
		btnNuevoSeguimiento.setBounds(638, 67, 123, 23);
		jPanelCabecera.add(btnNuevoSeguimiento);
		Object[] nombresColumnas = {"Fecha de seguimiento", "Hora de seguimiento", "Observación", "status"};
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5)},
			    {"John", "Doe",
			     "Rowing", new Integer(3)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10)}
		};
		
		tableBitacora = new JTable(data, nombresColumnas);
		tableBitacora.setFillsViewportHeight(true);
		contentPane.add(tableBitacora);
	}
}
