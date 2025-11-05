package Pekan6_2511532014;

import java.util.Scanner;

public class PerulanganWhile1_2511532014 {
	public static void main(String[]args) {
		int counter = 0;
		String jawab;
		boolean running = true;
		//Deklarasi Scanner
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter++;
			System.out.println("Jumlah = "+ counter);
			System.out.print("Apakah lanjut? (ya/tidak) ");
			jawab = scan.nextLine();
			//cek jawab = tidak, perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			}
		}
		System.out.println("Anda melakukan perulangan sebanyak "+counter+" kali");
	}

}
