package modelo;

import libreria.Generica;

public class Producto {
	
	Generica<String, Double> dt_prd;
	Generica<Integer, String>dte_prd;
	
	public Producto() {
		
		dt_prd = new Generica<>();
		dte_prd = new Generica<>();
	}
	
	public Producto(String name, String desc, double precio, int stock, String proveedor) {
		dt_prd = new Generica<>(name, desc,precio );
		dte_prd = new Generica<>(stock, proveedor);
		
	}
	
	//Getters
	
	public String getname(){
		return dt_prd.getAtributo1();
	}
	
	public String getDesc() {
		return dt_prd.getAtributo2();
	}
	
	public double getprecio() {
		return dt_prd.getAtributo3();
	}
	
	public int getstock(){
		return dte_prd.getAtributo1();
	}
	
	public String getproveedor() {
		return dte_prd.getAtributo4();
	}
	
	//setters 
	
	public void setname(String name_) {
		this.dt_prd.setAtributo1(name_);
	}
	
	public void setdesc(String desc_) {
		this.dt_prd.setAtributo2(desc_);
	}
	
	public void setprecio(double precio_) {
		this.dt_prd.setAtributo3(precio_);
	}
	public void setstock(int stock_) {
		this.dte_prd.setAtributo1(stock_);
	}
	public void setproveedor(String proveedor_) {
		this.dte_prd.setAtributo4(proveedor_);
	}

	@Override
	public String toString() {
		return "Producto [getname()=" + getname() + ", getDesc()=" + getDesc() + ", getprecio()=" + getprecio()
				+ ", getstock()=" + getstock() + "]";
	}
	
	public String Information() {
        return String.format("%s;%s;%.2f;%d;%s", getname(), getDesc(), getprecio(), getstock(), getproveedor());
    }


}
