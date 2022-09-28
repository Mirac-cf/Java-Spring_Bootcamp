
import java.util.Scanner;


/*
    Çalışanlar Programı
        
    Calisan Sınıfı Şeklinde Bir Üst Sınıf
        
    Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
    Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf
*/


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*******  Çalışanlar Grubuna Hoşgeldiniz  *******");
        
        while (true) {            
            System.out.println("************************************************");
            System.out.println("\nİşlemler...");
            System.out.println("\n1- Yazılımcı işlemleri \n2- Yönetici işlemleri \n3- çıkış için 'q'ya basınız");
            
            System.out.print("\nİşlem: ");
            String işlem = input.nextLine();
                        
            
            if (işlem.equals("q")) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            
            
            else if (işlem.equals("1")) {
                Yazılımcı yazılımcı = new Yazılımcı("Miraç","Çiftçi", 567, "python, C, java");                
                System.out.println("\nYazılımcı İşlemleri...  \n1- Format at  \n2- Bilgileri göster \n3- Ana menüye geçmek için 'q'ya basınız.");
                
                while (true) {                    
                    System.out.print("\nİşlem seçiniz: ");
                    String işlem_yazılımcı = input.nextLine();
                    
                    if (işlem_yazılımcı.equals("q")) {
                        System.out.println("Ana menüye geçiş yapılıyor...");
                        break;
                    }
                    
                    else if (işlem_yazılımcı.equals("1")) {
                        System.out.print("Format atmak istediğiniz işletim sistemi: ");
                        String işletim_sistemi = input.nextLine();                        
                        yazılımcı.formatAt(işletim_sistemi);
                    }
                    
                    else if (işlem_yazılımcı.equals("2")) {
                        yazılımcı.bilgileriGöster();
                    }
                    
                    else{
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }
                }                        
            }
            
            
            else if (işlem.equals("2")) {
                Yönetici yönetici = new Yönetici("Serhat", "Ay", 123, 10);
                System.out.println("\nYönetici İşlemleri...  \n1- Zam yap  \n2- Bilgileri göster \n3- Ana menüye geçmek için 'q'ya basınız.");
                
                while (true) {                    
                    System.out.print("\nİşlem seçiniz: ");
                    String yönetici_işlem = input.nextLine();
                    
                    if (yönetici_işlem.equals("q")) {
                        System.out.println("\nAna menüye geçiş yapılıyor...");
                        break;
                    }
                    
                    else if (yönetici_işlem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int miktar = input.nextInt();
                        input.nextLine();
                        yönetici.zam_yap(miktar);
                    }
                    
                    else if (yönetici_işlem.equals("2")) {
                        yönetici.bilgileriGöster();
                    }
                    
                    else{
                        System.out.println("Geçersiz işlem girdiniz...");
                    }
                }       
            }
            
            
            else{
                System.out.println("Geçersiz işlem girdiniz...");
            }

            
        }
        
        
              
    }
}
