package Pekan7_2511532014;

import java.util.Scanner;

public class PanggilMahasiswa3_2511532014 {
	public static void main(String[]args) {
		Mahasiswa_2511532014 a = new Mahasiswa_2511532014();
		Scanner input = new Scanner(System.in);
		System.out.print("NIM : ");
		a.setNim2(input.nextLine());
		System.out.print("Nama : ");
		a.setnama(input.nextLine());
		if(a.getNim2().startsWith("25")) {
			System.out.println(a.getNama()+" Anda angkatan 2025");
		}
		if(a.getNim2().contains("1153")) {
			System.out.println(a.getNama() + " Anda mahasiswa informatika");
		}
		a.Cetak2();
		input.close();
	}

}

