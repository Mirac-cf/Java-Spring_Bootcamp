package intro;

public class Main {

	public static void main(String[] args) {
System.out.println("Hello world!");
		
		//değişken isimlendirmeleri java'da camelcase yazılır
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.15;
		double dolarBugun = 18.15;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if(dolarBugun==dolarDun) {
			okYonu ="equal.svg";
			System.out.println(okYonu);
		}else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		
		String[] krediler = {"Hizli Kredi","Maasini Halkbanktan","Mutlu Emekli"};
		
		System.out.println("\n");
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("\n");
		for(int i = 0 ; i<krediler.length ; i++) {
			System.out.println(i+1 + "-" + krediler[i]);
		}
		

	}

}
