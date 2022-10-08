
public class Main {

	public static void main(String[] args) {

		String a = "Mustafa";
		String b = new String("Mustafa");

		System.out.println(b);
//		
//		System.out.println("Harf Sayýsý: "+ b.length());
//		
//		System.out.println("0. indeks : "+ a.charAt(0));
//		System.out.println("2. indeks : "+ a.charAt(2));
//		System.out.println("Son eleman : "+ a.charAt(b.length()-1));
//		
//		
//		System.out.println(b.startsWith("Mu"));
//		System.out.println(b.endsWith("CO"));

//		System.out.println(b.indexOf('a'));
//		System.out.println(b.lastIndexOf('a'));

//		System.out.println(b.toLowerCase());
//		System.out.println(b.toUpperCase());

//		String a1 = "1923";
//		
//		int b1 = Integer.parseInt(a1);
//		
//		System.out.println(b1-42);

//		int b1 = 1923;
//
//		String a1 = String.valueOf(b1);
//
//		System.out.println(a1);

//		String a1 ="Mustafa";
//		String a2 = "Mustafa";
//		
//		if(a1==a2)
//			System.out.println("Eþitler");
	
		String b1 = new String("Mustafa");
		String b2 = new String("Mustafa");
		if(b1.equals(b2))
			System.out.println("Eþitler");
		
		Integer lale = new Integer(5);
		System.out.println(lale);
	}

}
