
public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String gmail;
    private String telefonNo;

    // hiç constructor tanımlamasak java otomatik olarak kendi yazdığı verileri atıyacak
    
    public Account(){    
        System.out.println("Kendi yadığımız constructor");
    }
    
    // Birden fazla constructor yazabiliriz yani overloadin yapmış oluruz
    
    public Account(String hesapNo, double bakiye, String isim, String gmail, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.gmail = gmail; 
        this.telefonNo = telefonNo;
    }
    
        
    
    public void paraYatır(double miktar){
        bakiye += miktar;    // burda  this.bakiye demedik çünkü bakiye bu classta tek ve başka değişkenle karışmıyor ama this.Bakiye de diyebilirdk ikiside aynı
        System.out.println("Paranız hesabınıza yatırıldı... \nGüncel bakiyeniz: " + bakiye);        
    }
    
    public void paraÇekme(double miktar){    
        if (miktar > 1500) 
            System.out.println("Bir günde en yüksek 1500 TL çekebilirsiniz...");
        
        else if (bakiye < miktar)
            System.out.println("Bakiyeniz yetersiz...  \nBakiyeniz: " + bakiye);
        
        else {
            bakiye -= miktar;
            System.out.println("Bakiyenizden " + miktar + "TL çekildi \nGüncel bakiyeniz: " + bakiye);
        }
         
    }
    
    
    
    /**
     * @return the hesaplar
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesaplar to set
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
