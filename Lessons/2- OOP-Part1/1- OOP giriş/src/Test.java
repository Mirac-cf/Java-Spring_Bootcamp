
// java dosyamızda projelerimiz çalıştırmak istiyorsak en az bir tane main metodu olması lazım

// classlar ve diziler referans tiplidir yani her objenin veya dizinin referansı vardır

// int, string,char gibi değişkenler ise value tiplidir referansları yoktur

public class Test {
    public static void main(String[] args) {
        
        Araba araba1 = new Araba();  // bu şekilde bir tane Araba classına ait bir araba1 objesi oluşturduk. "araba1" objenin birnevi adı oluyor
        
        araba1.renk = "Kırmızı";
        araba1.kapılar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model =  "renault";
        
        
        System.out.println(araba1.model);    // bu şekilde özellikleri kullanabiliriz
        System.out.println(araba1.kapılar);
    }


}
