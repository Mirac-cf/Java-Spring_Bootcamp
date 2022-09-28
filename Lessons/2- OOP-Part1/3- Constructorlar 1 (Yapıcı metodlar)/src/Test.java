
public class Test {
    
    public static void main(String[] args) {
        
        /*
        Account hesap = new Account();
     
        hesap.setHesapNo("12345");
        hesap.setBakiye(1000.0);
        hesap.setGmail("mirac@gmail.com");
        hesap.setIsim("Miraç");
        hesap.setTelefonNo("0453 232 45 67");        
        
        -  böyle tek tek özellikleri yazmak yorucu bu yüzden yapıcı metod (constructor) yardımı ile objeyi oluştururken bu özellikleri verebiliriz
        -  Constructorları önce account classında yazıyoruz  
        */
    
        
        Account hesap5 = new Account();
        
        System.out.println();
        Account hesap2 = new Account("12345", 1000.0, "miraç", "mirac@gmail.com", "545232"); 
        
        //constructor sayesinde objelerimizi tanımlarken tek seferde özelliklerimizide tanımladık
        System.out.println("Hesaptaki miktar : " + hesap2.getBakiye());
        hesap2.paraYatır(500); 
        hesap2.paraÇekme(2000);
        hesap2.paraÇekme(700);

        
    }
    
    
}
