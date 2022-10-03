import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yatýrdýðýnýz harç bedeli: ");
		this.harc= scan.nextInt();
		scan.nextLine();
		
		System.out.print("Herhangi bir siyasi yasaðýnýz var mý?(evet ya da hayýr) ");
		
		String cevap = scan.nextLine();
		if(cevap.equals("evet")){
			this.siyasiYasak = true;
		}
		else {
			this.siyasiYasak = false;
		}

		System.out.print("Vizeniz var mý?(evet ya da hayýr) ");
		String cevap2 = scan.nextLine();
		if(cevap2.equals("evet")) {
			this.vizeDurumu = true;
		}
		else {
			this.vizeDurumu = false;
		}
	}
	
	@Override
	public boolean yurtDisiHarci() {
		if(this.harc<15) {
			System.out.println("Lütgen yurtdýþý çýkýþ harcýný tam yatýrýn.");
			return false;
		}
		else {
			System.out.println("Yurdýþý harcý iþlemi tamam!");
			return true;
		}
		
	}
	@Override
	public boolean siyasiYasak() {
		if(this.siyasiYasak == true) {
			System.out.println("Siyasi yasaðýnýz bulunuyor. Yurtdýþýna çýkamazsýnýz.");
			return false;
		}
		else {
			System.out.println("Siyasi yasaðýnýz bulunmuyor.");
			return true;
		}
	}
	@Override
	public boolean vizeDurumu() {
		if(this.vizeDurumu == true) {
			System.out.println("Vize iþlemleri tamam!");
			return true;
			
		}
		else {
			System.out.println("Vizeniz gideceðiniz ülkeye bulunmamaktadýr.");
			return false;
		}
	}
	
}
