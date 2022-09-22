// sağ tklayıp   Insert code --> constructor  tıkladığımızda otomatikmen constructoru oluşturabiliyoruz
// getter and setter codlarını yazmak için ise sağ tıklayıp  Insert code --> getter and setter   tıkladığımızda otomatikman oluşuyor


public class Hesap {
    
    private String kullanıcıAdı;
    private String parola;
    private int bakiye;

    
    
    public Hesap(String kullanıcıAdı, String parola, int bakiye) {
        this.kullanıcıAdı = kullanıcıAdı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    
    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    
    
    public void paraYatır(int miktar){       
        bakiye += miktar;
        System.out.println("Paranız hesabınıza yatırıldı... Güncel bakiyeniz: " + bakiye);   
    }
    
     
    public  void paraÇekme(int miktar){
        if (miktar > bakiye){
            System.out.println("Bakiyeniz yetersiz...  \ngüncel bakiyeniz: " + bakiye);
        }
        
        else{
            bakiye -= miktar;   // burda this.bakiye diyebilirdik ama gerek yok zaten aynı classtayız. bir hata vermez
            System.out.println("Paranız çekilmiştir...  \nGüncel bakiyeniz: " + bakiye);
        }
    
    }
    
    
    
    
    
    
    
    
    
    
}
