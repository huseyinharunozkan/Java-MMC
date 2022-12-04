
public class Main {

	public static void main(String[] args) {
		
		IOgrenci ogrenci = new IOgrenci() {

			@Override
			public void dersCalis() {
				System.out.println("Ders Çalýþýyorum");
				
			}

			@Override
			public void derseGir() {
				System.out.println("Derse giriyorum");
				
			}
			
		};
		ogrenci.dersCalis();
		ogrenci.derseGir();
		System.out.println("*************************");
		
		AOgrenci ogrenci2 = new AOgrenci() {

			@Override
			void kayitYaptir() {
				System.out.println("Kayýt yapýlýyor..");
				
			}
			
		};
		ogrenci2.kayitYaptir();
		ogrenci2.selamla();
	}
	public static abstract class AOgrenci{
		abstract void kayitYaptir();
		public void selamla() {
			System.out.println("Selamlar");
		}
	}

	public interface IOgrenci {
		void dersCalis();

		void derseGir();

	}

}
