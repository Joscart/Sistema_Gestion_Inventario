package modelo;

public class cliente {
	private String nombre;
    private String direccion;
    private String detallesDeContacto;

	public cliente(String nombre, String direccion, String detallesDeContacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.detallesDeContacto = detallesDeContacto;
    }
	
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDetallesDeContacto() {
		return detallesDeContacto;
	}


	public void setDetallesDeContacto(String detallesDeContacto) {
		this.detallesDeContacto = detallesDeContacto;
	}

    
}
