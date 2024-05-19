package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Formulario;
import vista.Menu;

public class logic_Menu implements ActionListener{

	private Menu lb;
	private logic_Formulario lb_formulario = new logic_Formulario(new Formulario());
	
	public logic_Menu(Menu lb) {
		this.lb = lb;
		cargarMenu();
		lb.btn_boton1.addActionListener(this);
		lb.btn_boton2.addActionListener(this);
		lb.btn_boton3.addActionListener(this);
		lb.btn_boton4.addActionListener(this);
	}
	
	private void cargarMenu() {
		lb.btn_boton1.setText("Clientes");
		lb.btn_boton2.setText("Proveedores");
		lb.btn_boton3.setText("Productos");
		lb.btn_boton4.setText("Ventas");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == lb.btn_boton1) {
			lb_formulario.setTipo(logic_Formulario.TIPO_FORMULARIO.CLIENTE);
		} else if (e.getSource() == lb.btn_boton2) {
			lb_formulario.setTipo(logic_Formulario.TIPO_FORMULARIO.PROVEEDOR);
		} else if (e.getSource() == lb.btn_boton3) {
			lb_formulario.setTipo(logic_Formulario.TIPO_FORMULARIO.PRODUCTO);
		} else if (e.getSource() == lb.btn_boton4) {
			lb_formulario.setTipo(logic_Formulario.TIPO_FORMULARIO.VENTA);
		}
	}
}
