package getterSetter;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Dizüstü Bilgisayar");
		product.setPrice(15.500);
		product.setStockAmount(5);
		
		
		System.out.println(product.getName());
		System.out.println(product.getKod());

		ProductManager productManager = new ProductManager();

		productManager.Add(product);

	}

}
