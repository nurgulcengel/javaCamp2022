package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static yapıcı blokçalıştı"); //static operasyonlar kullanıldığında newlenmese de static yapıcı bloğunuz çalışır ama normal constructor çalışmaz.
	}

	public static boolean isValid(Product product) {
		
		if (product.price>0 && !product.name.isEmpty()) {
			
			return true;
		}else {
			return false;
		}
	}
}
