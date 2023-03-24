import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Ramazan Pidesi Uygulamas�....");
		
		Queue<String> pideKuyrugu = new LinkedList<String>();
		
		pideKuyrugu.offer("Murat");
		pideKuyrugu.offer("Hasan");
		pideKuyrugu.offer("Okan");
		pideKuyrugu.offer("Ay�e");
		pideKuyrugu.offer("Merve");
		pideKuyrugu.offer("Ezgi");
		pideKuyrugu.offer("Gizem");
		pideKuyrugu.offer("Mehmet");
		pideKuyrugu.offer("O�uz");
		pideKuyrugu.offer("Azer");
        
        Random random = new Random();
        
        int pideSayisi = random.nextInt(1,11);
        
        while(pideSayisi != 0) {
        	System.out.println(pideKuyrugu.poll()+" pideyi ald�...");
        	pideSayisi--;
        	Thread.sleep(1000);
        }
        System.out.println("Pide kalmad� !!!");
		
		
		

	}

}
