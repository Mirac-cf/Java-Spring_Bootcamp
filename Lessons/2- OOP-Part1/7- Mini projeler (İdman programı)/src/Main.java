
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // İdman oluşturma programı
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("********  İdman Programına Hoşgeldiniz  ********");
        System.out.println("Geçerli hareketler...");
        System.out.println("-Burpee  \n-Pushup (şınav)  \n-Situp (mekik)  \n-Squat");
        
        System.out.println("\nBir idman oluşturun...\n");
        
        System.out.print("Burpee sayısı: ");
        int burpee = input.nextInt();
        
        System.out.print("Pushup sayısı: ");
        int pushup = input.nextInt();
        
        System.out.print("Situp sayısı: ");
        int situp = input.nextInt();
        
        System.out.print("Squat sayısı: ");
        int squat = input.nextInt();
        input.nextLine();  // bu sayede input boşluğunu güvence altına alıyoruz
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("\nİdmanınız başlıyor...\n");
        
        
        while (idman.idmanBittiMi() == false) {
            System.out.print("\nHareket türü (burpee, pushup, situp, squat) : ");
            String tür = input.nextLine();
            //input.nextLine();
            
            System.out.print("Hareket sayısı: ");
            int hareket_sayısı = input.nextInt();
            input.nextLine();
            
            idman.hareketYap(tür, hareket_sayısı);     
        }
        
        System.out.println("\nBugünlük programınızı bitirdiniz TEBRİKLER... ");
    
    
    
    }
}
