package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txt_usuario;
	public JPasswordField txt_contrasenia;
	public JLabel lbl_titulo;
	public JLabel lbl_usuario;
	public JLabel lbl_contrasenia;
	public JButton btn_ingresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lbl_titulo = new JLabel("New label");
		contentPane.add(lbl_titulo);
		
		lbl_usuario = new JLabel("New label");
		contentPane.add(lbl_usuario);
		
		txt_usuario = new JTextField();
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
		lbl_contrasenia = new JLabel("New label");
		contentPane.add(lbl_contrasenia);
		
		txt_contrasenia = new JPasswordField();
		contentPane.add(txt_contrasenia);
		
		btn_ingresar = new JButton("New button");
		contentPane.add(btn_ingresar);
	}

}
