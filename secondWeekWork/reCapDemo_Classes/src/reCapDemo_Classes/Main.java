package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {

		DortIslem dortislem = new DortIslem();

		int sonuc = dortislem.Topla(8, 9);
		int[] sonuclar = { dortislem.Topla(3, 5), dortislem.Cikar(28, 7), dortislem.Carp(5, 2), dortislem.Bol(12, 3) };

		for (int s : sonuclar) {

			System.out.println(s);

		}

	}

}
