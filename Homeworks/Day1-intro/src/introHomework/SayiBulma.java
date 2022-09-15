package introHomework;

import java.util.Scanner;

public class SayiBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] sayilar = new int[] {1,2,3,4,5,6,9,0};
		
		System.out.print("Sayi: ");
		int aranacak = scan.nextInt();
		
		
		boolean sonuc = false;
		
		for (int i : sayilar) {
			if(i == aranacak) {
				sonuc = true;
				break;
			}
		}
		
		if(sonuc) {
			System.out.println("Sayi listede var...");
		}else {
			System.out.println("Sayi listede yok...");
		}
		

	}

}
