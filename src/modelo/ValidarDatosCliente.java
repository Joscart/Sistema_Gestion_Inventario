package modelo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidarDatosCliente {
	
	 public static boolean validarNombre(String nombre) {
	        String regex = "^[a-zA-Z\\s]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(nombre);
	        return matcher.matches();
	    }

	    public static boolean validarDireccion(String direccion) {
	        String regex = "^[a-zA-Z0-9\\s,.-]+$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(direccion);
	        return direccion.matches(direccion);
	    }
	 
	    public static boolean validarDetallesDeContacto(String contacto) {
	        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,63}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(contacto);
	        return contacto.matches(contacto);
	    }
	 
}





