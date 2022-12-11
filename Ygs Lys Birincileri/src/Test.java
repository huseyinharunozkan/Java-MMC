import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("YGS LYS Birinci Bulma Programý...");
		Scanner scan = new Scanner(System.in);
		
		String islemler = "Ýþlemler:\n"
						+"1. Eþit Aðýrlýk Öðrencileri Birincisi\n"
						+"2. Sayýsal Öðrencileri Birincisi";
								
		System.out.println("**********************************");
		System.out.println(islemler);
		System.out.println("**********************************");
		
		while(true) {
			System.out.println("Çýkýþ için q'ya basýn");
			String cevap = scan.nextLine();
			if(cevap.equals("q")) {
				System.out.println("Programdan Çýkýlýyor...");
				break;
			}
			
			//Birinci Öðrenci
			System.out.print("Birinci Öðrenci Ýsmi : ");
			String isim1 = scan.nextLine();
			System.out.println("Netler(Türkçe Matematik Edebiyat Fizik) : ");
			int turkce1 = scan.nextInt();
			int matematik1 = scan.nextInt();
			int edebiyat1 = scan.nextInt();
			int fizik1 = scan.nextInt();
			scan.nextLine();
			//Ýkinci Öðrenci
			System.out.print("Ýkinci Öðrenci Ýsmi : ");
			String isim2 = scan.nextLine();
			System.out.println("Netler(Türkçe Matematik Edebiyat Fizik) : ");
			int turkce2 = scan.nextInt();
			int matematik2 = scan.nextInt();
			int edebiyat2 = scan.nextInt();
			int fizik2 = scan.nextInt();
			scan.nextLine();
			//Üçüncü Öðrenci 
			System.out.print("Üçüncü Öðrenci Ýsmi : ");
			String isim3 = scan.nextLine();
			System.out.println("Netler(Türkçe Matematik Edebiyat Fizik) : ");
			int turkce3 = scan.nextInt();
			int matematik3 = scan.nextInt();
			int edebiyat3 = scan.nextInt();
			int fizik3 = scan.nextInt();
			scan.nextLine();
			System.out.println("Ýþlemi Giriniz : ");
			String islem = scan.nextLine();
			
			
			 if ( islem.equals("1")) {
				EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1,isim1);
				EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2,isim2);
				EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3,isim3);
				
				EsitAgirlik birinci = birinci(ogrenci1,ogrenci2,ogrenci3);
				
				System.out.println("Birinci Eþit Aðýrlýk Öðrencisi : "+ birinci.getIsim());
				System.out.println("Öðrenci Puaný : " + birinci.puanHesapla());
				
				
			}
			else if ( islem.equals("2")) {
				Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1,isim1);
				Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2,isim2);
				Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3,isim3);
				
				Sayisal birinci = birinci(ogrenci1,ogrenci2,ogrenci3);
				
				System.out.println("Birinci Sayýsal Öðrencisi : "+ birinci.getIsim());
				System.out.println("Öðrenci Puaný : " + birinci.puanHesapla());
				
			}
			else {
				System.out.println("Geçersiz Ýþlem!!!");
			}
			
			
		}
	}

	public static <E extends Aday> E birinci(E e1, E e2, E e3) {
		if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
			return e1;
		} else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
			return e1;
		} else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
			return e1;
		} else {
			return e1;
		}
	}

//	public static <E> void yazdir(E[] dizi) {
//		for (E e : dizi) {
//
//			System.out.println(e);
//		}
//	}
//	
}
