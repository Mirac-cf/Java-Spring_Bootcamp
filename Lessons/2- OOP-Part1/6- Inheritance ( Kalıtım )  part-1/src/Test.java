
public class Test {
    public static void main(String[] args) {
        
        // IS-A ilişkisi kalıtımın sonucudur
        
        Yönetici yönetici1 = new Yönetici("Miraç", 3000, "It",30);
        Calısan calisan1 = new Calısan("Mehmet", 3000, "Front-end"); // ana classın referansini alt classlarda kullanilabilir
        
        calisan1.bilgileriGoster();
        
        calisan1.calış();
        yönetici1.calış();
     
        System.out.println("");
        
        yönetici1.zamYap(400);
        yönetici1.bilgileriGoster();   // Yönetici classındaki tekrardan tanımladığımız bilgileriGöster() metodunu çalıştırmış olduk 
                                       // Calısan classının içindeki bütün özellikleri ve fonksiyonları kullanabiliyoruz.
        
    }
}
