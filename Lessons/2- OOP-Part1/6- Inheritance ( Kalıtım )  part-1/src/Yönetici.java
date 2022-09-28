
 // bu classımız ise subclass oluyor yani alt class

public class Yönetici extends Calısan {  
    // "extends Calısan" yazarak Calısan classının bütün özelliklerini ve metodlarını kullanabiliriz  
    // ancak öncelikle bir yönetici clasına özgü constructor yazmalıyız
    
    private int sorumlu_kişi;   // ekstradan özellik de ekliyebiliyoruz
    
    
    public Yönetici(String isim, int maas, String departman, int sorumlu_kişi){
        /*
        this.isim = isim;             // miras aldığımız Calısan clasının özelliklerini kullanmak için constructorunu kullanmam lazım ama 
        this.maas = maas;             // this. yazınca hata veriyor bu yüzden bizde dolaylı yoldan kullanıcaz  
        this.departman = departman;   // super() metodunu kullanıcaz
        */
        
        super(isim, maas, departman);
        
        this.sorumlu_kişi = sorumlu_kişi;    
        
    }
    
    // ekstradan metodlarda ekliyebiliriz
    
    public void zamYap(int miktar){  
        System.out.println("Çalışanlara " + miktar + " TL zam yapıldı.");
    }
    
    // kalıtımda overloading şöyle oluyor biz eğer super class da(ortak class) tanımladığımız bir metodu aynı isimle alt classlarda da tanımlarsak
    // o metodu çağırdığımızda artık ortak class daki metod değil alt class da tanımladığımız metod gelecek ve onu kullanıcaz
    
    // Örneğin bilgileri göster metodunu tekrardan bu class da yazalım
    
    public void bilgileriGoster(){
        System.out.println("\nİsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        
        // yukardakileri yazamak yerine Calısan clasındaki bilgileriGoster() metodunu super ile çağırıp ekstradan sorumlu kişiyide ekliyebiliriz 
        //super.bilgileriGoster();
        
        System.out.println("Sorumlu olduğu çalışan sayısı: " + sorumlu_kişi);
    }
    
    
}
