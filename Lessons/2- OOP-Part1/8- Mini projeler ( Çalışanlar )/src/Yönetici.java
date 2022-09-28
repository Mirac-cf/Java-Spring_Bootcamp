
public class Yönetici extends Çalışan{
    
    private int sorumlu_kişi_sayısı;

    
    public Yönetici(String ad, String soyad, int id, int sorumlu_kişi_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_kişi_sayısı = sorumlu_kişi_sayısı;
    }

   
    
    
    public void zam_yap(int miktar) {
        System.out.println(getAd() + " çalışanlara " + miktar + " TL zam yapıyor...");
    }
    
    
    
    
    
}
