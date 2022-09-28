
public class Hayvan {
    
    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayısı;
    
    
    public Hayvan(String isim, int kilo, int boy, int bacak_sayısı){   
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayısı = bacak_sayısı;        
    }
    
    
    public void yemek_ye(){
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    
    public void harekete_geç(int hiz){
        System.out.println("Hayvan " + hiz + " hızında hareket ediyor...");  
    }
    
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayısı() {
        return bacak_sayısı;
    }

    public void setBacak_sayısı(int bacak_sayısı) {
        this.bacak_sayısı = bacak_sayısı;
    }
      
    
}
