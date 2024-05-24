package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import vista.Formulario;
import vista.Login;

public class logic_Login implements ActionListener, KeyListener, WindowListener{
	
	private Login lb;
	private boolean valido = false;
	
	public logic_Login(Login lb) {
		this.lb = lb;
		lb.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
		listener();
		cargarLogin();
		lb.setVisible(true);
	}
	
	private void listener() {
        lb.txt_usuario.addKeyListener(this);
        lb.txt_contrasenia.addKeyListener(this);
        lb.btn_ingresar.addActionListener(this);
        lb.addWindowListener(this);
    }
	
	public Login getLogin() {
		return lb;
	}
	
	private void cargarLogin() {
		lb.txt_usuario.setText("");
		lb.txt_contrasenia.setText("");
		lb.lbl_titulo.setText("Ingreso al sistema");
		lb.lbl_usuario.setText("Usuario");
		lb.lbl_contrasenia.setText("Contraseña");
		lb.btn_ingresar.setText("Iniciar sesión");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == lb.btn_ingresar) {
			valido = true;
			if(valido) {
				JOptionPane.showMessageDialog(lb, "Bienvenido", "Ingreso exitoso", JOptionPane.INFORMATION_MESSAGE);
				lb.setDefaultCloseOperation(Login.DISPOSE_ON_CLOSE);
				lb.dispatchEvent(new WindowEvent(lb, WindowEvent.WINDOW_CLOSING));
			} else {
				JOptionPane.showMessageDialog(lb, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
