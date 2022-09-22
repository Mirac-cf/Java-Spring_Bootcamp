
import java.util.Scanner;


public class ATM {
    
    public void çalıs(Hesap hesap){
    
        Login login = new Login();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*****  BANKAMIZA HOŞGELDİNİZ  *****");
        System.out.println("-----------------------------------");
        System.out.println("Kullanıcı Girişi");
        System.out.println("-----------------------------------");
        
        int giriş_hakkı = 3;
        
        
        while(true){
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı...");
                
                System.out.println("\n**********************************************\n");
                System.out.println("1- Bakiye görüntüleme \n2- para yatırma \n3- Para çekme \n4- Çıkış için 'q'ya basın");
                System.out.println("**********************************************");
    
        
                while (true) {            
                    System.out.print("\nişlem: ");
                    String işlem = input.nextLine();
        
                    if (işlem.equals("q")) {
                        System.out.println("Çıkış yapılıyor...");    
                        break;
                    }
            
                    else if (işlem.equals("1")) {
                        System.out.println("Bakiye: " + hesap.getBakiye());
                    }
            
                    else if (işlem.equals("2")) {
                        System.out.print("Yatrımak istediğiniz miktar: ");
                        int miktar = input.nextInt(); 
                        input.nextLine();   // bu boşluğa basma işlemi yerine denk geliyor                        
                        hesap.paraYatır(miktar);                
                    }
            
                    else if (işlem.equals("3")) {
                        System.out.print("Çekmek istediğiniz miktar: ");
                        int miktar = input.nextInt();    
                        input.nextLine();
                        hesap.paraÇekme(miktar);
                    }
            
                    else{
                        System.out.println("Geçersiz işlem...");
                    }
                }
                
                break;
            }
                
            else {
                System.out.println("Giriş başarısız parola veya kullanıcı adı hatalı...");
                giriş_hakkı--;
                System.out.println("kalan giriş hakkınız: " + giriş_hakkı);
            
                if (giriş_hakkı == 0) {
                    System.out.println("\nDeneme hakkınız bitti...");
                    
                    return;   // fonksiyonu bitirsin diye return koydum
                }
            }
        
        }
            
        
        
    }    
}
