package Pekan7_2511532014;

import java.util.Scanner;

public class PanggilMahasiswa2_2511532014 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("NIM : ");
		String x = input.nextLine();
		System.out.print("Nama : ");
		String y = input.nextLine();
		Mahasiswa_2511532014 a = new Mahasiswa_2511532014();
		a.setNim2(x);
		a.setnama(y);
		if(x.startsWith("25")) {
			System.out.println(a.getNama()+" Anda angkatan 2025");
		}
		if(a.getNim2().contains("1153")) {
			System.out.println(y+ " Anda mahasiswa informatika");
		}
		a.Cetak2();
		input.close();
	}

}
