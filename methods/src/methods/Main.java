package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		Scanner input = new Scanner(System.in);
		int[] sayilar = { 1, 2, 5, 7, 9, 0 };
		boolean varMi = false;

		System.out.println("Lütfen aranacak sayıyı giriniz");
		int aranacakSayi = Integer.parseInt(input.next());

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println(aranacakSayi + " mevcuttur");
		} else {
			System.out.println(aranacakSayi + " mevcut değildir");
		}
	}

}
