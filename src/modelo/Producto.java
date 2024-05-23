package modelo;

import libreriaV2.generic;

public class Producto {
	
	generic<String, Double> dt_prd;
	generic<Integer, String>dte_prd;
	
	public Producto() {
		
		dt_prd = new generic<>();
		dte_prd = new generic<>();
	}
	
	public Producto(String name, String desc, double precio, int stock, String proovedor) {
		dt_prd = new generic<>(name, desc,precio );
		dte_prd = new generic<>(stock, proovedor);
		
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

	@Override
	public String toString() {
		return "Producto [getname()=" + getname() + ", getDesc()=" + getDesc() + ", getprecio()=" + getprecio()
				+ ", getstock()=" + getstock() + "]";
	}
	
	

}
