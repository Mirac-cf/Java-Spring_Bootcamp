package introHomework;

import java.util.Scanner;

public class MukkemmelSayi {

	public static void main(String[] args) {
		// kendinden başka kendisini bolen tum pozitif tam sayilarin toplami o sayisa esit ise mukemmel sayidir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i<sayi ; i++) {
			if(sayi % i == 0) {
				sum+=i;
			}
		}
		
		if(sum==sayi) {
			System.out.println("Mukkemmel sayidir...");
		}else {
			System.out.println("Mukemmel sayi degildir...");
		}
		
	}

}
