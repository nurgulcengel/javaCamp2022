package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulma();

	}

	public static void sayiBulma() {

		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int aranacak = 17;
		boolean varMi = false;
		for (int i = 0; i < sayilar.length; i++) {

			if (i == aranacak) {

				varMi = true;
			}

		}

		if (varMi) {

			mesajVer("Sayı mevcuttur :" + aranacak);
		} else {
			mesajVer("Sayı mevcut değildir");
		}

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);
	}

}
