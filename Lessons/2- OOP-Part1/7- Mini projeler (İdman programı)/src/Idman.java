
// sağ tıkla --> insert code --> constructor   ve   setter and getter


public class Idman {
    
    private int burpee_sayısı;
    private int pushup_sayısı;  // şınav
    private int situp_sayısı;   // mekik
    private int squat_sayısı;
    
    
    public Idman(int burpee_sayısı, int pushup_sayısı, int situp_sayısı, int squat_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
        this.pushup_sayısı = pushup_sayısı;
        this.situp_sayısı = situp_sayısı;
        this.squat_sayısı = squat_sayısı;
    }
    
    
    
    public int getBurpee_sayısı() {
        return burpee_sayısı;
    }

    public void setBurpee_sayısı(int burpee_sayısı) {
        this.burpee_sayısı = burpee_sayısı;
    }

    public int getPushup_sayısı() {
        return pushup_sayısı;
    }

    public void setPushup_sayısı(int pushup_sayısı) {
        this.pushup_sayısı = pushup_sayısı;
    }

    public int getSitup_sayısı() {
        return situp_sayısı;
    }

    public void setSitup_sayısı(int situp_sayısı) {
        this.situp_sayısı = situp_sayısı;
    }

    public int getSquat_sayısı() {
        return squat_sayısı;
    }

    public void setSquat_sayısı(int squat_sayısı) {
        this.squat_sayısı = squat_sayısı;
    }
    
    
    
    public void hareketYap(String hareketTuru, int sayısı){
        
        if (hareketTuru.equals("burpee")) {
            burpeeYap(sayısı);
        }
        
        else if (hareketTuru.equals("pushup")) {
            pushupYap(sayısı);
        }
        
        else if (hareketTuru.equals("situp")) {
            situpYap(sayısı);
        }
        
        else if (hareketTuru.equals("squat")) {
            squatYap(sayısı);
        }
        
        else{
            System.out.println("Geçersiz hareket...");
        }        
    } 
    
    
    public void burpeeYap(int sayı){    
        if (burpee_sayısı == 0) {
            System.out.println("Yapacak burpee kalmadı...");
        }
        
        if (burpee_sayısı < sayı) {
            System.out.println("Hedeflediğin burpee sayısını geçtin TEBRİKLER...");
            burpee_sayısı = 0;
            System.out.println("kalan burpee sayısı: " + burpee_sayısı);
        }       
        else{
            burpee_sayısı -= sayı;
            System.out.println("Şuan " + sayı + " burpee yaptınız");
            System.out.println("kalan burpee sayısı: " + burpee_sayısı);
        }  
    }
    
    
    public void pushupYap(int sayı){       
        if (pushup_sayısı == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        
        if (pushup_sayısı < sayı) {
            System.out.println("Hedeflediğin pushup sayısını geçtin TEBRİKLER...");
            pushup_sayısı = 0;
            System.out.println("kalan pushup sayısı: " + pushup_sayısı);
        }       
        else {
            pushup_sayısı -= sayı;
            System.out.println("Şuan " + sayı + " pushup yaptınız");
            System.out.println("kalan pushup sayısı: " + pushup_sayısı);
        }  
    }
    
    
    public void situpYap(int sayı){
        if (situp_sayısı == 0) {
            System.out.println("Yapacak situp kalmadı...");
        }
        
        if (situp_sayısı < sayı) {
            System.out.println("Hedeflediğin situp sayısını geçtin TEBRİKLER...");
            situp_sayısı = 0;
            System.out.println("kalan situp sayısı: " + situp_sayısı);
        }       
        else{
            situp_sayısı -= sayı;
            System.out.println("Şuan " + sayı + " situp yaptınız");
            System.out.println("kalan situp sayısı: " + situp_sayısı);
        }  
    }
    
    
    public void squatYap(int sayı){
        if (squat_sayısı == 0) {
            System.out.println("Yapacak squat kalmadı...");
        }
        
        if (squat_sayısı < sayı) {
            System.out.println("Hedeflediğin squat sayısını geçtin TEBRİKLER...");
            squat_sayısı = 0;
            System.out.println("kalan squat sayısı: " + squat_sayısı);
        }       
        else{
            squat_sayısı -= sayı;
            System.out.println("Şuan " + sayı + " squat yaptınız");
            System.out.println("kalan squat sayısı: " + squat_sayısı);
        }  
    }
    
    
    public boolean idmanBittiMi() {
        return (pushup_sayısı + situp_sayısı + squat_sayısı + burpee_sayısı == 0);
    }
    
    
    
    
    
    
    
    
    
}
