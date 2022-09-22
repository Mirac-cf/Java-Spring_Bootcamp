
import java.util.Scanner;


public class Login {
        
    public boolean login(Hesap hesap){    // hesap diye bir obje gönderdik
        
        Scanner input = new Scanner(System.in);
            
        System.out.print("\nKullanıcı adı: ");
        String kullanıcı_adı = input.nextLine();
            
        System.out.print("Parola: ");
        String parola = input.nextLine();
    
        if (hesap.getKullanıcıAdı().equals(kullanıcı_adı) && hesap.getParola().equals(parola)) {
            return true;
        }
        
        else {
            return false;
        }
            
    }    
    
}
