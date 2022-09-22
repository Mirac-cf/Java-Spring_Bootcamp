
public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String gmail;
    private String telefonNo;

    
    public Account(){
        
        /*this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.gmail = "Bilgi yok";
        this.telefonNo = "Bilgi yok";*/
        
        this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");  
        // aşağıdaki constructorı çağırarak yukardaki uzun işlem yerine bu işlemi yaptık
        // yani objede hiçbir özelliği girmezsek yukardaki bilgi yok ifadeleri otomatikman atanıcak 
        
    }
    
    // Birden fazla constructor yazabiliriz yanioverloadin yapmış oluruz
    
    public Account(String isim, String gmail, String telefonNo){        
        // sadece 3 özelliği tanımladığımız bu constrocturı aşağıdaki constructoru çağırarak daha kısa yöntem lede yazabiliriz
        
        this("Bilgi yok",0.0,isim,gmail,telefonNo);   // hesap no ve bakiyeyi var sayılan değer olarak giriyoruz
    
    }
    
    
    public Account(String hesapNo, double bakiye, String isim, String gmail, String telefonNo){
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.gmail = gmail;
        this.telefonNo = telefonNo;
    }
 
    
    
    public void BilgileriGöster(){
        
        System.out.println("**************************************");
        
        System.out.println("İsim: " + isim +     
                           "\nHesap no: " + hesapNo +
                           "\nBakiye: "+ bakiye + 
                           "\nGmail: " + gmail + 
                           "\nTelefon no: " + telefonNo);
        
        System.out.println("**************************************");
    }
        
    
    public void paraYatır(double miktar){
        bakiye += miktar;    // burda  this.bakiye demedik çünkü bakiye sabit miktarla işi
        System.out.println("Paranız hesabınıza yatırıldı... \nGüncel bakiyeniz: " + bakiye);        
        
    }
    
    
    public void paraÇekme(double miktar){
        
        if (miktar > 1500) {
            System.out.println("Bir günde en yüksek 1500 TL çekebilirsiniz...");
        }
        
        else if (bakiye < miktar) {
            System.out.println("Bakiyeniz yetersiz...  \nBakiyeniz: " + bakiye);
        }
        
        else {
            bakiye -= miktar;
            System.out.println("Bakiyenizden " + miktar + "TL çekildi \nGüncel bakiyeniz: " + bakiye);
        }         
    }
 
    
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the gmail
     */
    public String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
