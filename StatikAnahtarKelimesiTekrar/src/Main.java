
public class Main {

	public static void main(String[] args) {
	/*	StaticClass s1 = new StaticClass("Harun");
		StaticClass s2 = new StaticClass("Haski");
		
		System.out.println("obje sayýsý: "+StaticClass.objeSayisi);
		System.out.println("obje sayýsý: "+s1.objeSayisi);
		System.out.println("obje sayýsý: "+s2.objeSayisi); */
		Main java = new Main();
		java.toplama(3,4,5);
		
	}
	public  void toplama(int a ,int b,int c ) {
		System.out.println(a+b+c);
	}
}
