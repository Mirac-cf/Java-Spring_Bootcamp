 
public class Main {
    public static void main(String[] args) {
        
        Account hesap1 = new Account("Ahmet","ahmet@gmail.com","56372223");
        // new Account ile bir obje oluşturup hesap1 adlı referansa eşitledik
        
        Account hesap2 = hesap1;  // yeni  bir obje oluşturmak yerine hesap1 objesine eşitledik ve ikisinin referansları, adresleri eşit oldu
                                  // bu sayede hesap2 hesap1 in tüm özelliklerine ve fonksiyonlarına sahip oldu
        Account hesap3 =new Account();  // içini boş bırakarak 1. contructoru çağırdık
        
        
        if (hesap1 == hesap2) {
            System.out.println("Aynı objeyi gösteriyorlar");
        }
        hesap2.BilgileriGöster();
        System.out.println();
        
        
        if (hesap1 == hesap3) {
            System.out.println("Aynı objeyi gösteriyorlar...");
        }
        else{
            System.out.println("aynı objeyi göstermiyorlar...");
        }
        
        
        new Account("mustafa","mustafa@gmail.com","34254543").BilgileriGöster();  
        // Bu şekilde referans vermeden obje oluşturabil ve fonksiyonları kullanabiliriz ama bu objeyi sadece bu satırda kullanabiliriz 
        // ilerde kullanmak istersek kullanamayız çünkü objenin referansı yok
        
        
    }
}
