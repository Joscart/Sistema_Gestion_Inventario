package modelo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controlador.logic_Menu.VENTANA_TIPO;
import libreria.Files;

public class ProductoDAO implements Config{

	private Files file;
	private final String RUTA_ESPECIFICA = Config.getRutaEspecifica(VENTANA_TIPO.PRODUCTO);

	public ProductoDAO() {
		super();
		// TODO Auto-generated constructor stub
		file = new Files(RUTA_ABSOLUTA);
	}

	public boolean agregarProducto(Producto p) throws IOException {
		file.setFile(new File(RUTA_ESPECIFICA, ARCHIVO_PRODUCTO));
		return file.writerFile(p.information(), false);
	}

	public boolean modificarDB(List<? extends Producto> list) throws IOException {
		file.setFile(new File(RUTA_ESPECIFICA, ARCHIVO_PRODUCTO));
		file.writerFile("", true);

		boolean flag = true;

		for (Producto c : list) {
			try {
				agregarProducto(c);
			} catch (IOException e) {
				flag = false;
				e.printStackTrace();
			}
		}

		return flag;
	}

	public List<Producto> leerDB() throws IOException {
		file.setFile(new File(RUTA_ESPECIFICA, ARCHIVO_PRODUCTO));
		file.create(1);
		List<Producto> list = new ArrayList<>();
		String texto = file.readerFile();
		for (String linea : texto.split("\n")) {
			if(linea.isEmpty()) continue;
			String[] datos = linea.split(";");
			list.add(new Producto(datos[0], datos[1], Double.parseDouble(datos[2]), Integer.parseInt(datos[3]), datos[4]));
		}
		return list;
	}
}
