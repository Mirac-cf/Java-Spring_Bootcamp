
public class Köpek extends Hayvan{
    
    private int diş_sayısı;
    
    
    public Köpek(String isim, int kilo, int boy , int bacak_sayısı, int diş_sayısı){
        super(isim, kilo, boy, bacak_sayısı);
        this.diş_sayısı = diş_sayısı;
    }

    
    public void harekete_geç(int hiz){
        System.out.println("Köpek " + hiz + " hızında hareket ediyor...");  
    }
       
    public void koş (int hiz){
        System.out.println("Köpek koşuyor...");
        
        //super.harekete_geç(hiz);  // eğer önüne super. koymazsak java Köpek clasında yazdığımız harekete_geç() metodunu kullanıcak
        harekete_geç(hiz);          // super. yazarsak ortak class olan Hayvan clasındaki harekete_geç() metodunu kullanıcak
        // boyle yazmak daha iyi çünkü örneğin sonradan o methodu overrride edersek ve çalıştırmak istersek kodu değiştirmek zorunda kalmayız
    }
    
    
    public int getDiş_sayısı() {
        return diş_sayısı;
    }

    public void setDiş_sayısı(int diş_sayısı) {
        this.diş_sayısı = diş_sayısı;
    }
       
    
    
}
