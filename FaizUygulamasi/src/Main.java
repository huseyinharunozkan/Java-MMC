
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Faiz Uygulamasý
        Kullanýcýdan anapara deðerini ve parasýný kaç yýl vadeli yatýrmak istediði
        bilgisini alýn ve her sene sonunda toplam para miktarýný ekrana yazdýrýn.
        
        Faiz Oraný : %6 Faiz Oraný

        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamýza hoþgeldiniz. Faiz Oraný %6");
        
        int anapara,vade;
        System.out.print("Yatýrmak istediðiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranýzý kaç yýl vadeli yatýrmak istiyorsunuz ? ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i =  1 ;  i<= vade ; i++) {
            
            toplampara = (toplampara * faizOrani) + toplampara;
            
            System.out.println(i + ".yýlýn sonunda toplam para : " + (int)toplampara);
            
            
        }
        
        
        
    }
}
