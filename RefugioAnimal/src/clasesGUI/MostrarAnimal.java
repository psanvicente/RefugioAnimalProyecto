package clasesGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import clasesPrincipales.Animal;
import clasesPrincipales.Gato;
import clasesPrincipales.Loro;
import clasesPrincipales.Paloma;
import clasesPrincipales.Perro;
import clasesPrincipales.Serpiente;
import clasesPrincipales.Tortuga;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class MostrarAnimal extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6917838278544252841L;
	private final JPanel contentPanel = new JPanel();
	static private JTextField nombretextField;
	static private JTextField pesoTextField;
	private JTextField edadTextField_2;
	private JTextField sexoTextField_3;
	private JTextField patastextField_4;
	private JTextField fechaAltatextField_5;
	private JTextField costeMensuatextField_6;
	private JTextField costeAdopciontextField_7;
	private JTextField reproducciontextField_8;
	private JTextField alimentaciontextField_9;
	private JTextField familiaTextField_10;
	private JTextField tipoAnimaltextField_11;
	JLabel lblNombre;
	private JTextField fechaAdopciontextField;
	JPanel panelFechaAdopcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MostrarAnimal dialog = new MostrarAnimal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MostrarAnimal() {
		setTitle("Mostrar Animal");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 698, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(17, 74, 118, 37);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblPeso = new JLabel("Peso");
			lblPeso.setBounds(17, 117, 118, 37);
			contentPanel.add(lblPeso);
		}
		{
			JLabel lblNPatas = new JLabel("Edad");
			lblNPatas.setBounds(17, 164, 118, 37);
			contentPanel.add(lblNPatas);
		}
		{
			JLabel lblFechaAlta_1 = new JLabel("Fecha Alta");
			lblFechaAlta_1.setBounds(17, 300, 118, 37);
			contentPanel.add(lblFechaAlta_1);
		}
		{
			JLabel lblFechaAlta = new JLabel("N\u00BA Patas");
			lblFechaAlta.setBounds(17, 253, 118, 37);
			contentPanel.add(lblFechaAlta);
		}
		{
			JLabel lblSexo = new JLabel("Sexo");
			lblSexo.setBounds(17, 210, 118, 37);
			contentPanel.add(lblSexo);
		}
		
		nombretextField = new JTextField();
		nombretextField.setBounds(120, 82, 132, 20);
		contentPanel.add(nombretextField);
		nombretextField.setColumns(10);
		
		pesoTextField = new JTextField();
		pesoTextField.setEditable(false);
		pesoTextField.setDisabledTextColor(Color.BLACK);
		pesoTextField.setColumns(10);
		pesoTextField.setBounds(120, 125, 132, 20);
		contentPanel.add(pesoTextField);
		
		edadTextField_2 = new JTextField();
		edadTextField_2.setEditable(false);
		edadTextField_2.setDisabledTextColor(Color.BLACK);
		edadTextField_2.setColumns(10);
		edadTextField_2.setBounds(120, 172, 132, 20);
		contentPanel.add(edadTextField_2);
		
		sexoTextField_3 = new JTextField();
		sexoTextField_3.setEditable(false);
		sexoTextField_3.setDisabledTextColor(Color.BLACK);
		sexoTextField_3.setColumns(10);
		sexoTextField_3.setBounds(120, 218, 132, 20);
		contentPanel.add(sexoTextField_3);
		
		patastextField_4 = new JTextField();
		patastextField_4.setEditable(false);
		patastextField_4.setDisabledTextColor(Color.BLACK);
		patastextField_4.setColumns(10);
		patastextField_4.setBounds(120, 261, 132, 20);
		contentPanel.add(patastextField_4);
		
		fechaAltatextField_5 = new JTextField();
		fechaAltatextField_5.setEditable(false);
		fechaAltatextField_5.setDisabledTextColor(Color.BLACK);
		fechaAltatextField_5.setColumns(10);
		fechaAltatextField_5.setBounds(120, 308, 132, 20);
		contentPanel.add(fechaAltatextField_5);
		{
			JLabel lblTipo = new JLabel("Tipo Animal");
			lblTipo.setBounds(281, 74, 118, 37);
			contentPanel.add(lblTipo);
		}
		{
			JLabel lblFamilia = new JLabel("Familia");
			lblFamilia.setBounds(281, 117, 118, 37);
			contentPanel.add(lblFamilia);
		}
		{
			JLabel lblTipoAlimentacin = new JLabel("Tipo Alimentaci\u00F3n");
			lblTipoAlimentacin.setBounds(281, 164, 118, 37);
			contentPanel.add(lblTipoAlimentacin);
		}
		{
			JLabel lblTipoReproduccion = new JLabel("Tipo Reproduccion");
			lblTipoReproduccion.setBounds(281, 210, 118, 37);
			contentPanel.add(lblTipoReproduccion);
		}
		{
			JLabel lblCosteAdopcion = new JLabel("Coste Adopcion");
			lblCosteAdopcion.setBounds(281, 253, 118, 37);
			contentPanel.add(lblCosteAdopcion);
		}
		{
			JLabel lblCosteMensual = new JLabel("Coste Mensual");
			lblCosteMensual.setBounds(281, 300, 118, 37);
			contentPanel.add(lblCosteMensual);
		}
		{
			costeMensuatextField_6 = new JTextField();
			costeMensuatextField_6.setEditable(false);
			costeMensuatextField_6.setDisabledTextColor(Color.BLACK);
			costeMensuatextField_6.setColumns(10);
			costeMensuatextField_6.setBounds(384, 308, 132, 20);
			contentPanel.add(costeMensuatextField_6);
		}
		{
			costeAdopciontextField_7 = new JTextField();
			costeAdopciontextField_7.setEditable(false);
			costeAdopciontextField_7.setDisabledTextColor(Color.BLACK);
			costeAdopciontextField_7.setColumns(10);
			costeAdopciontextField_7.setBounds(384, 261, 132, 20);
			contentPanel.add(costeAdopciontextField_7);
		}
		{
			reproducciontextField_8 = new JTextField();
			reproducciontextField_8.setEditable(false);
			reproducciontextField_8.setDisabledTextColor(Color.BLACK);
			reproducciontextField_8.setColumns(10);
			reproducciontextField_8.setBounds(384, 218, 132, 20);
			contentPanel.add(reproducciontextField_8);
		}
		{
			alimentaciontextField_9 = new JTextField();
			alimentaciontextField_9.setEditable(false);
			alimentaciontextField_9.setDisabledTextColor(Color.BLACK);
			alimentaciontextField_9.setColumns(10);
			alimentaciontextField_9.setBounds(384, 172, 132, 20);
			contentPanel.add(alimentaciontextField_9);
		}
		{
			familiaTextField_10 = new JTextField();
			familiaTextField_10.setEditable(false);
			familiaTextField_10.setDisabledTextColor(Color.BLACK);
			familiaTextField_10.setColumns(10);
			familiaTextField_10.setBounds(384, 125, 132, 20);
			contentPanel.add(familiaTextField_10);
		}
		{
			tipoAnimaltextField_11 = new JTextField();
			tipoAnimaltextField_11.setEditable(false);
			tipoAnimaltextField_11.setDisabledTextColor(Color.BLACK);
			tipoAnimaltextField_11.setColumns(10);
			tipoAnimaltextField_11.setBounds(384, 82, 132, 20);
			contentPanel.add(tipoAnimaltextField_11);
		}
		
		final JCheckBox adoptadoCheckbox = new JCheckBox("Adoptado");
		adoptadoCheckbox.setEnabled(false);
		adoptadoCheckbox.setBounds(17, 355, 97, 23);
		contentPanel.add(adoptadoCheckbox);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Animal tmp = Principal.refugio.getAnimalNombre(nombretextField.getText());
				if(tmp != null){
					pesoTextField.setText(Float.toString(tmp.getPeso()));
					edadTextField_2.setText(Integer.toString(tmp.getEdad()));
					patastextField_4.setText(Integer.toString(tmp.getnPatas()));
					reproducciontextField_8.setText(tmp.getReproduccion().toString());
					alimentaciontextField_9.setText(tmp.getAlimentacion().toString());
					costeAdopciontextField_7.setText(Float.toString(tmp.getCosteAdopcion()));
					costeMensuatextField_6.setText(Float.toString(tmp.getCosteMantenimientoMensual()));
					
					
					familiaTextField_10.setText(tmp.getTipoAnimal().toString());
					tipoAnimaltextField_11.setText(getNombreClase(tmp));
					sexoTextField_3.setText(tmp.getSexo().toString());
					
					if(tmp.getAdoptado())
						adoptadoCheckbox.setSelected(true);
					else
						adoptadoCheckbox.setSelected(false);
					Calendar cal = tmp.getFechaAlta();
					//cal.add(Calendar.MONTH, -1);
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String formatted = sdf.format(cal.getTime());

					fechaAltatextField_5.setText(formatted);

					if(tmp.estaAdoptado()){
						panelFechaAdopcion.setVisible(true);
						String formateado = sdf.format(tmp.getFechaAdopcion().getTime());
						fechaAdopciontextField.setText(formateado);
					}
					else
						panelFechaAdopcion.setVisible(false);

						
					
				}
				else{
					
					JOptionPane.showMessageDialog(contentPanel,
							"Animal no encontrado");
				}
				
			}

			
		});
		btnBuscar.setBounds(17, 29, 89, 23);
		contentPanel.add(btnBuscar);
		
		panelFechaAdopcion = new JPanel();
		panelFechaAdopcion.setVisible(false);
		panelFechaAdopcion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Fecha Adopci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelFechaAdopcion.setBounds(115, 340, 119, 43);
		contentPanel.add(panelFechaAdopcion);
		panelFechaAdopcion.setLayout(null);
		
		fechaAdopciontextField = new JTextField();
		fechaAdopciontextField.setBounds(6, 16, 107, 20);
		panelFechaAdopcion.add(fechaAdopciontextField);
		fechaAdopciontextField.setEditable(false);
		fechaAdopciontextField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Volver");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private String getNombreClase(Animal tmp) {
		
		if(tmp instanceof Gato)
			return "Gato";
		if(tmp instanceof Loro)
			return "Loro";
		if(tmp instanceof Perro)
			return "Perro";
		if(tmp instanceof Paloma)
			return "Paloma";
		if(tmp instanceof Tortuga)
			return "Tortuga";
		if(tmp instanceof Serpiente)
			return "Serpiente";
		
		return "Instancia no encontrada";
	}
}
