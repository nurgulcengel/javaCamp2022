package degerVeReferansTipler;

public class Main {

	public static void main(String[] args) {
		
		
		
		//deger tipler
				int sayi=15;
				int sayi2=30;
				sayi=sayi2;
				
				sayi2=150;
				System.out.println(sayi);
				
				//referans tipler
				
				int[]sayilar= {1,2,3,4};
				int[]sayilar2= {11,22,33,44};
				
				sayilar=sayilar2;
				
				sayilar[0]=178;
				System.out.println(sayilar[0]);
				
				

	}

}
