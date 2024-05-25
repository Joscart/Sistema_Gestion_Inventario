package modelo;

public class Administrador extends Empleado{

	public Administrador(String nombre, String direccion, String cedula, String telefono, String correo) {
		super(nombre, direccion, cedula, telefono, correo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format(
				"Administrador [toString()=%s, getNombre()=%s, getDireccion()=%s, getCedula()=%s, getTelefono()=%s, getCorreo()=%s]",
				super.toString(), getNombre(), getDireccion(), getCedula(), getTelefono(), getCorreo());
	}

	public String information() {
		return String.format("%s,%s;%s;%s;%s;2", 
				getNombre(), getDireccion(), getCedula(), getTelefono(), getCorreo());
	}
}
