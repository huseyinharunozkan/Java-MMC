
public class Main {

	public static void main(String[] args) {
		
		IOgrenci ogrenci = new IOgrenci() {

			@Override
			public void dersCalis() {
				System.out.println("Ders �al���yorum");
				
			}

			@Override
			public void derseGir() {
				System.out.println("Derse giriyorum");
				
			}
			
		};
		ogrenci.dersCalis();
		ogrenci.derseGir();
		System.out.println("*************************");
		
		AOgrenci ogrenci2 = new AOgrenci("Harun",319) {

			@Override
			void kayitYaptir() {
				System.out.println("Kay�t yap�l�yor.."+" �sim: "+getIsim()+" Numara: "+getNumara());
				
			}
			
		};
		ogrenci2.kayitYaptir();
		ogrenci2.selamla();
	}
	public static abstract class AOgrenci{
		private String isim;
		private int numara;
		
		public AOgrenci(String isim, int numara) {
			super();
			this.isim = isim;
			this.numara = numara;
		}
		
		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}

		public int getNumara() {
			return numara;
		}

		public void setNumara(int numara) {
			this.numara = numara;
		}

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
