package modelo;



public class ValidateProducto implements Parametrizable{
	
	public static boolean validateNames(String names) {
		return names.matches(ERNames);
	}
	
	public static boolean validateprice(String price) {
		return price.matches(ERPrice);
	}
	
	public static boolean validateDesc(String Descrip) {
		return Descrip.matches(ErDesc);
	}
	
	public static boolean validatestock(String stock) {
		return stock.matches(Erstock);
	}
	
	

}
