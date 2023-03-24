import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("C�mleyi Giriniz: ");
		String cumle = scan.nextLine();
		
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i = 0;i<cumle.length()/2;i++) {
			 stack.push(cumle.charAt(i));
			 
		 }
		 if(isPalindrome(cumle, stack)) {
			 System.out.println("Bu c�mle Palindromedur...");
		 }
		 else {
			 System.out.println("Bu c�mle Palindrome de�ildir...");
		 }

	}
	public static boolean isPalindrome(String cumle,Stack<Character>stack) {
		for(int i = (cumle.length()/2 )+1;i<cumle.length();i++) {
			if(cumle.charAt(i)!= stack.pop()) {
				return false;
			}
		}
		return true;
		
	}

}
