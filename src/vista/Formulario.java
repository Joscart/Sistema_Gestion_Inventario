package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.logic_Formulario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField txt_entrada1;
	public JTextField txt_entrada2;
	public JTextField txt_entrada3;
	public JTextField txt_entrada4;
	public JTextField txt_entrada5;
	public JTextField txt_entrada6;
	public JLabel lbl_entrada1;
	public JLabel lbl_entrada2;
	public JLabel lbl_entrada3;
	public JLabel lbl_entrada4;
	public JLabel lbl_entrada5;
	public JLabel lbl_entrada6;
	public JLabel lbl_entrada7;
	public JComboBox cbx_entrada7;
	public JTextArea txt_informacion;
	public JLabel lbl_estatus;
	public JButton btn_agregar;
	public JButton btn_guardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_entrada1 = new JLabel("New label");
		lbl_entrada1.setBounds(10, 25, 86, 14);
		contentPane.add(lbl_entrada1);
		
		lbl_entrada2 = new JLabel("New label");
		lbl_entrada2.setBounds(10, 50, 86, 14);
		contentPane.add(lbl_entrada2);
		
		lbl_entrada3 = new JLabel("New label");
		lbl_entrada3.setBounds(10, 75, 86, 14);
		contentPane.add(lbl_entrada3);
		
		lbl_entrada4 = new JLabel("New label");
		lbl_entrada4.setBounds(10, 100, 86, 14);
		contentPane.add(lbl_entrada4);
		
		lbl_entrada5 = new JLabel("New label");
		lbl_entrada5.setBounds(10, 125, 86, 14);
		contentPane.add(lbl_entrada5);
		
		lbl_entrada6 = new JLabel("New label");
		lbl_entrada6.setBounds(10, 158, 86, 14);
		contentPane.add(lbl_entrada6);
		
		lbl_entrada7 = new JLabel("New label");
		lbl_entrada7.setBounds(10, 183, 86, 14);
		contentPane.add(lbl_entrada7);
		
		txt_entrada1 = new JTextField();
		txt_entrada1.setBounds(122, 22, 86, 20);
		contentPane.add(txt_entrada1);
		txt_entrada1.setColumns(10);
		
		txt_entrada2 = new JTextField();
		txt_entrada2.setBounds(122, 47, 86, 20);
		contentPane.add(txt_entrada2);
		txt_entrada2.setColumns(10);
		
		txt_entrada3 = new JTextField();
		txt_entrada3.setBounds(122, 72, 86, 20);
		contentPane.add(txt_entrada3);
		txt_entrada3.setColumns(10);
		
		txt_entrada4 = new JTextField();
		txt_entrada4.setBounds(122, 97, 86, 20);
		contentPane.add(txt_entrada4);
		txt_entrada4.setColumns(10);
		
		txt_entrada5 = new JTextField();
		txt_entrada5.setBounds(122, 122, 86, 20);
		contentPane.add(txt_entrada5);
		txt_entrada5.setColumns(10);
		
		txt_entrada6 = new JTextField();
		txt_entrada6.setBounds(122, 155, 86, 20);
		contentPane.add(txt_entrada6);
		txt_entrada6.setColumns(10);
		
		cbx_entrada7 = new JComboBox();
		cbx_entrada7.setBounds(122, 179, 86, 22);
		contentPane.add(cbx_entrada7);
		
		txt_informacion = new JTextArea();
		txt_informacion.setBounds(246, 20, 178, 181);
		contentPane.add(txt_informacion);
		
		lbl_estatus = new JLabel("New label");
		lbl_estatus.setBounds(10, 236, 102, 14);
		contentPane.add(lbl_estatus);
		
		btn_agregar = new JButton("New button");
		btn_agregar.setBounds(151, 232, 89, 23);
		contentPane.add(btn_agregar);
		
		btn_guardar = new JButton("New button");
		btn_guardar.setBounds(335, 232, 89, 23);
		contentPane.add(btn_guardar);
		
		//logic_Formulario logic = new logic_Formulario(this);
	}
}
