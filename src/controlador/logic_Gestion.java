package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import controlador.logic_Menu.VENTANA_TIPO;
import vista.Formulario;
import vista.Gestion;

public class logic_Gestion implements ActionListener, KeyListener, WindowListener, MouseListener, FocusListener{
	
	private Gestion lb;
	private logic_Formulario lb_formulario = new logic_Formulario(new Formulario());
	private boolean guardado = true;
	
	VENTANA_TIPO tipo;
	
	public logic_Gestion(Gestion lb) {
		this.lb = lb;
		lb.setVisible(true);
		lb.setDefaultCloseOperation(Gestion.HIDE_ON_CLOSE);
		lb.setVisible(false);
		listener();
	}
	
	public VENTANA_TIPO getTipo() {
		return tipo;
	}

	public boolean setTipo(VENTANA_TIPO tipo) {
		if (!guardado) {
			if (!confirmarSalida()) {
				lb.setVisible(true);				
				return false;
			} else {
			}
		}
		
		this.tipo = tipo;
		guardado = true;
		cargarGestion();
		lb.setVisible(true);
		return true;
	}
	
	private boolean confirmarSalida() {
		if (JOptionPane.showConfirmDialog(lb, "¿Desea salir sin guardar?", "Confirmar Salida",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			return true;
		}
		return false;
	}
	
	private void listener() {
		lb.txt_busqueda.addKeyListener(this);
		lb.lst_resultados.addKeyListener(this);
		lb.lst_resultados.addMouseListener(this);
		lb.lst_resultados.addFocusListener(this);
		lb.btn_buscar.addActionListener(this);
		lb.btn_editar.addActionListener(this);
		lb.btn_eliminar.addActionListener(this);
		lb.btn_guardar.addActionListener(this);
		lb.btn_nuevo.addActionListener(this);
		lb.addWindowListener(this);
	}
	
	private void reset() {
		lb.btn_buscar.setText("");
		lb.btn_editar.setText("");
		lb.btn_eliminar.setText("");
		lb.btn_guardar.setText("");
		lb.btn_nuevo.setText("");
		lb.lst_resultados.removeAll();
		lb.txt_busqueda.setText("");
		lb.txt_informacion.setText("");
		lb.btn_buscar.setVisible(true);
		lb.btn_editar.setVisible(true);
		lb.btn_eliminar.setVisible(true);
		lb.btn_guardar.setVisible(true);
		lb.btn_nuevo.setVisible(true);
		lb.lst_resultados.setVisible(true);
		lb.txt_busqueda.setVisible(true);
		lb.txt_informacion.setVisible(true);
		lb.btn_buscar.setEnabled(true);
		lb.btn_editar.setEnabled(true);
		lb.btn_eliminar.setEnabled(true);
		lb.btn_guardar.setEnabled(true);
		lb.btn_nuevo.setEnabled(true);
		lb.lst_resultados.setEnabled(true);
		lb.txt_busqueda.setEnabled(true);
		lb.txt_informacion.setEditable(false);
	}
	
	public void cargarGestion() {
		reset();
		switch (tipo) {
		case CLIENTE:
			lb.setTitle("Clientes");
			lb.btn_buscar.setText("Buscar Cliente");
			lb.btn_editar.setText("Editar Cliente");
			lb.btn_eliminar.setText("Eliminar Cliente");
			lb.btn_guardar.setText("Guardar Cliente");
			lb.btn_nuevo.setText("Nuevo Cliente");
			break;
		case PROVEEDOR:
			lb.setTitle("Proveedores");
			lb.btn_buscar.setText("Buscar Proveedor");
			lb.btn_editar.setText("Editar Proveedor");
			lb.btn_eliminar.setText("Eliminar Proveedor");
			lb.btn_guardar.setText("Guardar Proveedor");
			lb.btn_nuevo.setText("Nuevo Proveedor");
			break;
		case PRODUCTO:
			lb.setTitle("Productos");
			lb.btn_buscar.setText("Buscar Producto");
			lb.btn_editar.setText("Editar Producto");
			lb.btn_eliminar.setText("Eliminar Producto");
			lb.btn_guardar.setText("Guardar Producto");
			lb.btn_nuevo.setText("Nuevo Producto");
			break;
		case VENTA:
			lb.setTitle("Ventas");
			lb.btn_buscar.setText("Buscar Venta");
			lb.btn_editar.setText("Editar Venta");
			lb.btn_eliminar.setText("Eliminar Venta");
			lb.btn_guardar.setText("Guardar Venta");
			lb.btn_nuevo.setText("Nueva Venta");
			break;
		}
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
		if (e.getSource() == lb.btn_buscar) {

		} else if (e.getSource() == lb.btn_editar) {
			lb_formulario.setTipo(tipo);
		} else if (e.getSource() == lb.btn_eliminar) {

		} else if (e.getSource() == lb.btn_guardar) {

		} else if (e.getSource() == lb.btn_nuevo) {
			lb_formulario.setTipo(tipo);
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		if (!guardado) {
			guardado = confirmarSalida();
			if (!guardado) {
				lb.setDefaultCloseOperation(Formulario.DO_NOTHING_ON_CLOSE);
			} else {
				lb.setDefaultCloseOperation(Formulario.HIDE_ON_CLOSE);
			}
		}
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
}

