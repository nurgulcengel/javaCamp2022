package classes;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(); // adres değişikliği
		CustomerManager customerManager2 = new CustomerManager();

		customerManager = customerManager2;

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

//value 

		int sayi1 = 5;
		int sayi2 = 20;

		sayi1 = sayi2;
		sayi2 = 25;
		System.out.println(sayi1);

//reference

		int[] sayilar = { 1, 2, 3, 4 };
		int[] sayilar2 = { 5, 6, 7, 8 };

		sayilar = sayilar2;

		sayilar2[0] = 25;

		System.out.println(sayilar[0]);

	}
}
