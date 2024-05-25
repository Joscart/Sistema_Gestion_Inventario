package modelo;

import java.io.File;

import controlador.logic_Menu.VENTANA_TIPO;

public interface Config {
	
	public final String RUTA = "Datos/";
	public final String RUTA_ABSOLUTA = getRutaAbsoluta();
	
	private static void crearDirectorio(String ruta) {
		File directorio = new File(ruta);
		if (!directorio.exists()) {
			directorio.mkdirs();
		}
	}
	
	private static String getRutaAbsoluta() {
		crearDirectorio(RUTA);
		return new File(RUTA).getAbsolutePath();
	}
	
	public static String getRutaEspecifica(VENTANA_TIPO tipo) {
		String subRuta = switch (tipo) {
		case CLIENTE -> "db_clientes/";
		case PROVEEDOR -> "db_proveedores/";
		case PRODUCTO -> "db_productos/";
		case VENTA -> "db_ventas/";
		};
		
		String ruta = RUTA_ABSOLUTA + subRuta;
		crearDirectorio(ruta);
		return ruta;
	}

}
