
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Faiz Uygulamas�
        Kullan�c�dan anapara de�erini ve paras�n� ka� y�l vadeli yat�rmak istedi�i
        bilgisini al�n ve her sene sonunda toplam para miktar�n� ekrana yazd�r�n.
        
        Faiz Oran� : %6 Faiz Oran�

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankam�za ho�geldiniz. Faiz Oran� %6");
        
        int anapara,vade;
        System.out.print("Yat�rmak istedi�iniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paran�z� ka� y�l vadeli yat�rmak istiyorsunuz ? ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i =  1 ;  i<= vade ; i++) {
            
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ".y�l�n sonunda toplam para : " + (int)toplampara);
            
            
        }
        
        
        
    }
}
