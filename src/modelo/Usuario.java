package modelo;

import java.util.Date;

import libreria.Generica;

public class Usuario implements Codificador{
	
	private Generica<String,Date> lb = new Generica<>();
	
	private TIPO_USUARIO tipo;
	
	public static enum TIPO_USUARIO {
		ADMINISTRADOR, EMPLEADO
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String contrasena) {
		super();
		this.lb = new Generica<>(Codificador.codificar(nombre), Codificador.codificar(contrasena), new Date());
	}

	public Usuario(String nombre, String contrasena, Date fecha) {
		super();
		this.lb = new Generica<>(Codificador.codificar(nombre), Codificador.codificar(contrasena), fecha);
	}

	public String getUsuario() {
		return Codificador.decodificar(lb.getAtributo1());
	}

	public String getContrasena() {
		return Codificador.decodificar(lb.getAtributo2());
	}

	public Date getFechaCreacion() {
		return lb.getAtributo3();
	}
	
	public TIPO_USUARIO getTipo() {
		return tipo;
	}

	public void setUsuario(String nombre_usuario) {
		lb.setAtributo1(Codificador.codificar(nombre_usuario));
	}

	public void setcontrasena(String contrasena) {
		lb.setAtributo2(Codificador.codificar(contrasena));
	}

	public void setTipo(TIPO_USUARIO tipo) {
		this.tipo = tipo;
	}
	
	public String information() {
		return String.format("%s;%s;%s;%s", lb.getAtributo1(), lb.getAtributo2(), lb.getAtributo3().getTime(), tipo.toString());
	}
	
}
