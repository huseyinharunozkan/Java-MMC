import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
		
		acilservis.offer(new Hasta ("Hüseyin","Apandisit"));
		acilservis.offer(new Hasta ("Ýdil","Yanýk"));
		acilservis.offer(new Hasta ("Harun","Apandisit"));
		acilservis.offer(new Hasta ("Umut","Apandisit"));
		acilservis.offer(new Hasta ("Melike","Apandisit"));
		acilservis.offer(new Hasta ("Müge","Yanýk"));
		acilservis.offer(new Hasta ("Ertuðrul","Apandisit"));
		acilservis.offer(new Hasta ("Berkay","Baþ Aðrýsý"));
		
		int i = 1;
		
		while(!acilservis.isEmpty()) {
			System.out.println("*********************************************");
			System.out.println(i+". sýrada");
			System.out.println(acilservis.poll());
			
		}
	}

}
