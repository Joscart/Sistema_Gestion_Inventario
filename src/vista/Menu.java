package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.logic_Menu;

import javax.swing.JButton;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btn_boton1;
	public JButton btn_boton2;
	public JButton btn_boton3;
	public JButton btn_boton4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btn_boton1 = new JButton("New button");
		contentPane.add(btn_boton1);
		
		btn_boton2 = new JButton("New button");
		contentPane.add(btn_boton2);
		
		btn_boton3 = new JButton("New button");
		contentPane.add(btn_boton3);
		
		btn_boton4 = new JButton("New button");
		contentPane.add(btn_boton4);
		
		logic_Menu logic = new logic_Menu(this);
	}

}
