package controlador;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import controlador.logic_Menu.VENTANA_TIPO;
import vista.Formulario;

public class logic_Formulario implements ActionListener, KeyListener, WindowListener{
	
	private Formulario lb;
	private boolean guardado = true;
	
	VENTANA_TIPO tipo;

	public logic_Formulario(Formulario lb) {
		this.lb = lb;
		lb.setVisible(true);
		lb.setDefaultCloseOperation(Formulario.HIDE_ON_CLOSE);
		lb.setVisible(false);
		listener();
	}
	
	public VENTANA_TIPO getTipo() {
		return tipo;
	}

	public boolean setTipo(VENTANA_TIPO tipo, Rectangle... btn) {
		if (!guardado) {
			if (!confirmarSalida()) {
				lb.setVisible(true);				
				return false;
			} else {
			}
		}
		
		this.tipo = tipo;
		guardado = true;
		if (btn.length > 0)
			lb.setBounds(btn[0]);
		cargarFormulario();
		lb.setVisible(true);
		return true;
	}
	
	private void listener() {
		lb.txt_entrada1.addKeyListener(this);
		lb.txt_entrada2.addKeyListener(this);
		lb.txt_entrada3.addKeyListener(this);
		lb.txt_entrada4.addKeyListener(this);
		lb.txt_entrada5.addKeyListener(this);
		lb.txt_entrada6.addKeyListener(this);
		lb.cbx_entrada7.addActionListener(this);
		lb.btn_agregar.addActionListener(this);
		lb.btn_guardar.addActionListener(this);
		lb.addWindowListener(this);
	}
	
	private void reset() {
		lb.setTitle("");
		lb.lbl_estatus.setText("");
		lb.btn_agregar.setText("");
		lb.btn_guardar.setText("");
		lb.txt_informacion.setText("");
		lb.lbl_entrada1.setText("");
		lb.lbl_entrada2.setText("");
		lb.lbl_entrada3.setText("");
		lb.lbl_entrada4.setText("");
		lb.lbl_entrada5.setText("");
		lb.lbl_entrada6.setText("");
		lb.lbl_entrada7.setText("");
		lb.txt_entrada1.setText("");
		lb.txt_entrada2.setText("");
		lb.txt_entrada3.setText("");
		lb.txt_entrada4.setText("");
		lb.txt_entrada5.setText("");
		lb.txt_entrada6.setText("");
		lb.cbx_entrada7.removeAllItems();
		lb.lbl_entrada1.setVisible(true);
		lb.lbl_entrada2.setVisible(true);
		lb.lbl_entrada3.setVisible(true);
		lb.lbl_entrada4.setVisible(true);
		lb.lbl_entrada5.setVisible(true);
		lb.lbl_entrada6.setVisible(true);
		lb.lbl_entrada7.setVisible(true);
		lb.txt_entrada1.setVisible(true);
		lb.txt_entrada2.setVisible(true);
		lb.txt_entrada3.setVisible(true);
		lb.txt_entrada4.setVisible(true);
		lb.txt_entrada5.setVisible(true);
		lb.txt_entrada6.setVisible(true);
		lb.cbx_entrada7.setVisible(true);
		lb.txt_informacion.setVisible(true);
		lb.lbl_estatus.setVisible(true);
		lb.btn_agregar.setVisible(true);
		lb.btn_guardar.setVisible(true);
		lb.txt_entrada1.setEnabled(true);
		lb.txt_entrada2.setEnabled(true);
		lb.txt_entrada3.setEnabled(true);
		lb.txt_entrada4.setEnabled(true);
		lb.txt_entrada5.setEnabled(true);
		lb.txt_entrada6.setEnabled(true);
		lb.cbx_entrada7.setEnabled(true);
		lb.txt_informacion.setEditable(false);
	}
	
	private boolean confirmarSalida() {
		if (JOptionPane.showConfirmDialog(lb, "¿Desea salir sin guardar?", "Confirmar Salida",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			return true;
		}
		return false;
	}

	public void cargarFormulario() {
		reset();
		switch (tipo) {
		case CLIENTE:
			lb.setTitle("Registro de Usuario");
			lb.lbl_titulo.setText("Registro de Usuario");
			lb.lbl_entrada1.setText("Nombres");
			lb.lbl_entrada2.setText("Direccion");
			lb.lbl_entrada3.setText("Cedula");
			lb.lbl_entrada4.setText("Telefono");
			lb.lbl_entrada5.setText("Correo");
			lb.lbl_entrada6.setVisible(false);
			lb.txt_entrada6.setVisible(false);
			lb.lbl_entrada7.setText("Tipo");
			lb.cbx_entrada7.addItem("Cliente");
			lb.cbx_entrada7.addItem("Empleado");
			lb.cbx_entrada7.addItem("Administrador");
			lb.txt_informacion.setVisible(false);
			lb.btn_agregar.setVisible(false);
			lb.btn_guardar.setText("Guardar");
			break;
		case PROVEEDOR:
			lb.setTitle("Registro de Proveedor");
			lb.lbl_titulo.setText("Registro de Proveedor");
			lb.lbl_entrada1.setText("Nombres Completos");
			lb.lbl_entrada2.setText("Email");
			lb.lbl_entrada3.setText("Cedula");
			lb.lbl_entrada4.setText("Codigo");
			lb.lbl_entrada5.setText("Telefono");
			lb.lbl_entrada6.setText("Razon Social");
			lb.cbx_entrada7.addItem("Persona Fisica");
			lb.cbx_entrada7.addItem("Persona Moral");
			lb.txt_informacion.setVisible(false);
			lb.btn_agregar.setVisible(false);
			lb.btn_guardar.setText("Guardar");
			break;
		case PRODUCTO:
			lb.setTitle("Registro de Producto");
			lb.lbl_titulo.setText("Registro de Producto");
			lb.lbl_entrada1.setText("Nombre");
			lb.lbl_entrada2.setText("Descripcion");
			lb.lbl_entrada3.setText("Codigo");
			lb.lbl_entrada4.setVisible(false);
			lb.txt_entrada4.setVisible(false);
			lb.lbl_entrada5.setText("Precio");
			lb.lbl_entrada6.setText("Existencias");
			lb.lbl_entrada7.setText("Proveedor");
			//rellenar proveedores
			lb.txt_informacion.setVisible(false);
			lb.btn_agregar.setVisible(false);
			lb.btn_guardar.setText("Guardar");
			break;
		case VENTA:
			lb.setTitle("Registro de Venta");
			lb.lbl_titulo.setText("Registro de Venta");
			lb.lbl_entrada1.setText("Codigo Producto");
			lb.lbl_entrada2.setText("nombre");
			lb.txt_entrada2.setEnabled(false);
			lb.lbl_entrada3.setText("Cantidad");
			lb.lbl_entrada4.setVisible(false);
			lb.txt_entrada4.setVisible(false);
			lb.lbl_entrada5.setVisible(false);
			lb.txt_entrada5.setVisible(false);
			lb.lbl_entrada6.setText("Cliente");
			lb.txt_entrada6.setEnabled(false);
			lb.lbl_entrada7.setText("Facturacion");
			lb.cbx_entrada7.addItem("Consumidor Final");
			lb.cbx_entrada7.addItem("Datos Facturacion");
			lb.btn_agregar.setText("Agregar Producto");
			lb.btn_guardar.setText("Finalizar Venta");
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		guardado = false;
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
	
}
