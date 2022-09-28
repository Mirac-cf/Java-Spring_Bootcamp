
public class Test {
    public static void main(String[] args) {
        
        Account hesap1 = new Account();

        Account hesap2 = new Account("Ahmet","ahmet@gmail.com","542231");

        Account hesap3 = new Account("254565",200,"Melis","Melis@gmail.com","7649769");
        
        System.out.println("isim: " + hesap2.getIsim());        
        System.out.println("bakiye: " + hesap2.getBakiye());
        
        hesap2.BilgileriGöster();
        
        hesap2.paraYatır(3000);
    
        hesap3.BilgileriGöster();
    }
}
