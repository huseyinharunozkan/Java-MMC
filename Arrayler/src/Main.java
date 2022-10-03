import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void arrayi_bastir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element "+(i+1)+":"+array[i]);
		}
	}
	public static double ortalamayi_bul(int[] array) {
		int toplam = 0;
		for(int i = 0; i< array.length;i++) {
			toplam += array[i];
		}
		return (double)toplam/array.length;
	}
	
	public static void main(String[] args) {

		int[] a = new int[5];

		int[] b = { 10, 20, 30, 40, 50,60,31 };
		
		arrayi_bastir(b);
		System.out.println("Ortalama : "+ortalamayi_bul(b));
		
		
//		System.out.println("Arrayin uzunluğu : " + b.length);
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i = 0;i<5;i++) {
//			
//			a[i] = scan.nextInt();
//		}

//		System.out.println(a[0]);
//		System.out.println(a[2]);
//		System.out.println(a[6]);

//		for (int i = 0; i < 5; i++) {
//			a[i] = i * 4 + 2;
//			
//		}

//		System.out.println("-----------------------");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(a[i]);
//		}

		// double[] b;
//		a[5] = 32;
//		a[9] = 50;
	}
}
