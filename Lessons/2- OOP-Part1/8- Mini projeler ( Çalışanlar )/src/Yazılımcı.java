

public class Yazılımcı extends Çalışan{

    private String diller;
    
    
    public Yazılımcı(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);    
        
        this.diller = diller;
    }
    
   
    public void bilgileriGöster(){
        super.bilgileriGöster();
        System.out.println("Bildiği diller: " + diller);
    }

    
    public void formatAt(String işletim_sistemi){
        System.out.println(getAd() + " " + işletim_sistemi + "'ni yüklüyor");
    }

 
    
    public String getDiller() {
        return diller;
    }

    public void setDiller(String diller) {
        this.diller = diller;
    }
    
    
    
    
}
