
public class Test {
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();
        
        //set ile özelliği yazıyoruz belirliyoruz get metodu ile de nesnenin özelliğini kullanabiliyoruz
        
        araba1.setModel("mercedes");
        System.out.println("Arabanın modeli: " + araba1.getModel());
        
        araba1.setKapilar(-4);
        
        Araba araba3;
        Araba araba2 = null;  // bu şekilde referansımıza bir obje ataması yapmadan bekletebiliriz. ama Araba clasının özelliklerini kullanamayız hata verir
        //araba2.setModel("renault");  // "NullPointerException" hatası verir
        
    }
}
