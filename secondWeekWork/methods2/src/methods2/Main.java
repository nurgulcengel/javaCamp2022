package methods2;

public class Main {

	public static void main(String[] args) {

		System.out.println(sehirVer("Muğla"));
		System.out.println(randomSayı());
		ekle();
		sil();
		güncelle();
		int toplamlar = topla(85, 77);
		System.out.println(toplamlar);
		double rastgeleSayi = randomSayı();
		System.out.println(rastgeleSayi);
		String memleketiniz = sehirVer("Samsun");
		System.out.println(memleketiniz);
		int toplam = topla2(25, 66, 88);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int sayi, int sayi2) {
		return sayi + sayi2;
	}

	public static String sehirVer(String sehir) {
		return sehir;
	}

	public static double randomSayı() {

		return Math.random();

	}

//Variable Arguments
	public static int topla2(int... sayilar) {

		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;

		}
		return toplam;
	}

}
