package modelo;

public class Empleado extends Cliente{

	public Empleado(String nombre, String direccion, String cedula, String telefono, String correo) {
		super(nombre, direccion, cedula, telefono, correo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format(
				"Empleado [getNombre()=%s, getDireccion()=%s, getCedula()=%s, getTelefono()=%s, getCorreo()=%s]",
				getNombre(), getDireccion(), getCedula(), getTelefono(), getCorreo());
	}
	
	public String information() {
		return String.format("%s,%s;%s;%s;%s;1", 
				getNombre(), getDireccion(), getCedula(), getTelefono(), getCorreo());
	}

}
