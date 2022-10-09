package staticDemo;

public class ProductManager {

	public void add(Product product) {

		//ProductValidator validator = new ProductValidator(); istenilen operasyon static yapılınca newlemeye gerek kalmaz.
		if (ProductValidator.isValid(product)) {

			System.out.println("eklendi");
		} else {
			System.out.println("ürün geçersiz");
		}
	}
}
