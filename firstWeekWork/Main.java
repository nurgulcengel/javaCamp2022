package javacamp;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		
		//variables 
		     
		int ogrenciSayısı = 20;
		String mesaj = "Öğrenci Sayısı : ";

		System.out.println(mesaj + ogrenciSayısı);
		System.out.println("Öğrenci Sayısı :" + ogrenciSayısı);

		//datatypes  

		double sayı = 17.5;   
		int sayı2 = 7;
		char karakter = 'N';
		boolean dogruMu =false;

		System.out.println(sayı);
		System.out.println(sayı2);
		System.out.println(karakter);
		System.out.println(dogruMu);

		     
		 //conditionals    

		int sayı3=24;

		if(sayı3<20) {
			System.out.println("Sayı 20'den küçüktür");
			
		}else if(sayı3==20) {
			System.out.println("Sayı 20'ye eşittir");
			
		}else {
			System.out.println("Sayı 20'den büyüktür ");
		}
		     
		//recapDemo1

		int sayı4=24;
		int sayı5=25;
		int sayı6=26;

		int enBuyuk=sayı4;

		if(enBuyuk<sayı5) {
			enBuyuk=sayı5;
		}

		if(enBuyuk<sayı6) {
			
			enBuyuk=sayı6;
		}

		System.out.println("En Büyük =" + enBuyuk);

		//switchDemo

		char grade ='A';

		switch (grade) {

		case 'A' :
		System.out.println("Mükemmel : Geçtiniz");
		break;

		case 'B' :
		System.out.println("İyi : Geçtiniz");
		break;

		case 'C' :
		System.out.println("Ortalama : Geçtiniz");
		break;

		case 'D' : 
		System.out.println("Fena Değil : Geçtiniz");
		break;

		case 'F' : 
		System.out.println("Maalesef : Kaldınız");
		break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		//loopDemo

		//For

		for (int i = 2; i < 10; i+=2) {
			
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		     
		//While

		int i = 2;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti");

		//Do-While
		int j = 20;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		     
		 System.out.println("Do-While Döngüsü Bitti");    
		 
		//arraysDemo
		 
		 String[] ogrenciler=new String[4];
		 
		 ogrenciler[0]="Ali";
		 ogrenciler[1]="Ömer";
		 ogrenciler[2]="Burak";
		 ogrenciler[3]="Kemal";
		 
		 for (int k = 0; k < ogrenciler.length; k++) {
			
			 System.out.println(ogrenciler[k]);
		}
		 
		 System.out.println("-------------------------------------------------------");
		 
		 for (String ogrenci : ogrenciler) {
			
			 System.out.println(ogrenci);
		}
		     
		//reCampDemo2
		 
		 double myList[]= {4.5,6.2,8.9,5.3,7.7};
		 
		 double max=myList[0];
		 double total=0;
		 for (double number : myList) {
		     
			 if(max<number) {
				 max=number;
			 }
			 total+=number;
			 System.out.println(number);
		}
		 
		 System.out.println("Toplam :"+total);
		 System.out.println("En Büyük Sayı :"+max);
		 
		 //multiDimensionalArrayDemo
		 
		 String[][] sehirler=new String[3][3];
		 
		 sehirler[0][0]="İstanbul";
		 sehirler[0][1]="Bursa";
		 sehirler[0][2]="Kocaeli";
		 sehirler[1][0]="Samsun";
		 sehirler[1][1]="Ordu";
		 sehirler[1][2]="Sinop";
		 sehirler[2][0]="Urfa";
		 sehirler[2][1]="Antep";
		 sehirler[2][2]="Adana";
		 
		 
		 for (int k = 0; k < sehirler.length; k++) {
			 
			 System.out.println("----------------------------------");
			 
			for (int k2 = 0; k2 < sehirler.length; k2++) {
				
				System.out.println(sehirler[k][k2]);
				
			}
			
		}
		 
		//stringDemo
		 
		String metin="Dünyayı geziyorum.";
		System.out.println(metin);

		System.out.println("Eleman Sayısı :" + metin.length());
		System.out.println("5.eleman : " + metin.charAt(4));
		System.out.println(metin.concat("Çok mutluyum !"));
		System.out.println(metin.startsWith("D"));
		System.out.println(metin.endsWith("n"));
		char[] karakterler =new char[5];
		metin.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(metin.indexOf('y'));
		System.out.println(metin.lastIndexOf('y'));

		System.out.println(metin.replace(" ", "-"));
		System.out.println(metin.substring(3,6));
		for (String c : metin.split(" ")) {
			System.out.println(c);
		}
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		System.out.println(metin.trim());

		//miniProjeAsalSayı

		int number =20;
		//int remainder = number % 2;

		boolean isPrime=true;

		if(number==1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}

		if(number<1) {
			System.out.println("Geçersiz Sayı Girdiniz");
			return;
		}


		for (int k = 2; k < number; k++) {
			if (number % k == 0) {
				isPrime=false;
			}
			
		}
		 
		System.out.println(isPrime==true ? "Sayı Asal" : "Sayı Asal Değil");

		//sesliHarfler

		char harf= 'O';

		switch(harf) {

		case 'A':
		case 'I':
		case 'O':
		case 'U':
		System.out.println("Kalın Sesli Harftir");
		break;
		default:
			System.out.println("İnce Sesli Harftir");
		}

		//mükemmelSayı

		int number2 = 6;
		int total2 = 0;

		if(number2 <= 1) {
			System.out.println("Geçersiz sayı..");
			return;
		}
		for (int k = 1; k < number2; k++) {

			if(number2 % k == 0) {
				total2+=k;
			}
		}
		 
		if(total2==number2) {
			System.out.println("Mükemmel Sayıdır");
		}
		else {
			System.out.println("Sayı Mükemmel Değildir");
		}

		//arkadasSayılar

		int sayiA=220;
		int sayiB=284;
		int toplamA=0;
		int toplamB=0;


		for (int k = 1; k < sayiA; k++) {
			
			if(sayiA % k == 0) {
				toplamA+=k;
			}
		}

		for (int k = 1; k < sayiB; k++) {
			
			if(sayiB % k == 0) {
				toplamB+=k;
			}
		}


		if(toplamA==sayiB && toplamB==sayiA) {
			System.out.println("Sayılar arkadaştır");
		}else {
		    
			System.out.println("Sayılar arkadaş değildir");}

		//sayiBulma

		int[] sayilar = {1,2,3,4,5,6,7,8,9,10,11};
		int aranacak=55;
		boolean varMi=false;

		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}

		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}


	}

}
