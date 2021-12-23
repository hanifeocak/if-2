package day_07_IfElse;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve
		// girilen karakterin harf olup olmadigini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir karekter giriniz");
		char krk = scan.next().toLowerCase().charAt(0);
		if (krk >= 'a' && krk <= 'z' ) {
			System.out.println(" girilin karakter harftir");

		} else {
			System.out.println("girilen karakter harf degildir");
		}
		scan.close();
	}
}
