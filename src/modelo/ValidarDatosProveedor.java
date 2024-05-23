package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarDatosProveedor {

    // Método para validar el email
    public static boolean validarEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método para validar el DNI (ejemplo simple: longitud de 8 caracteres)
    public static boolean validarDni(String dni) {
        return dni != null && dni.length() == 8 && dni.matches("\\d+");
    }

    // Método para validar el código (puede incluir más reglas según el negocio)
    public static boolean validarCodigo(String codigo) {
        return codigo != null && !codigo.trim().isEmpty();
    }

    // Método para validar el teléfono (ejemplo simple: longitud de 9-15 caracteres)
    public static boolean validarTelefono(String telefono) {
        return telefono != null && telefono.length() >= 9 && telefono.length() <= 15 && telefono.matches("\\d+");
    }

    // Método para validar la razón social (ejemplo simple: no vacío)
    public static boolean validarRazonSocial(String razonSocial) {
        return razonSocial != null && !razonSocial.trim().isEmpty();
    }
}
