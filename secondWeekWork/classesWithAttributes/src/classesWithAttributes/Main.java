package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id=1;
		product.name="Laptop";
		product.description="Dizüstü Bilgisayar";
		product.price=15.500;
		product.stockAmount=5;
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.Add(product);
		
		
	}

}
