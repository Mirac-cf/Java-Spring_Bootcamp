package introHomework;

import java.util.Scanner;

public class AsalMi {

	public static void main(String[] args) {
		//Sayi Asal mi ?
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Bir sayi giriniz: ");
		int sayi = scan.nextInt();
	   	boolean sonuc = true;
				
		for(int i = 2 ; i < sayi ; i++) {
			if(sayi%i==0) {
				sonuc = false;
				break;
			}
		}
				
		if(sonuc) {
			System.out.println("sayi asaldir");
		}else {
			System.out.println("sayi asal degildir");
		}
				

	}

}
