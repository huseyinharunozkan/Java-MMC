import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
		
		acilservis.offer(new Hasta ("H�seyin","Apandisit"));
		acilservis.offer(new Hasta ("�dil","Yan�k"));
		acilservis.offer(new Hasta ("Harun","Apandisit"));
		acilservis.offer(new Hasta ("Umut","Apandisit"));
		acilservis.offer(new Hasta ("Melike","Apandisit"));
		acilservis.offer(new Hasta ("M�ge","Yan�k"));
		acilservis.offer(new Hasta ("Ertu�rul","Apandisit"));
		acilservis.offer(new Hasta ("Berkay","Ba� A�r�s�"));
		
		int i = 1;
		
		while(!acilservis.isEmpty()) {
			System.out.println("*********************************************");
			System.out.println(i+". s�rada");
			System.out.println(acilservis.poll());
			
		}
	}

}
