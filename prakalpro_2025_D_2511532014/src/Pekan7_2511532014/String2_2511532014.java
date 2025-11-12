package Pekan7_2511532014;

import java.util.Scanner;

public class String2_2511532014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nama Depan: ");
		String firstname = input.nextLine();
		System.out.print("Nama Depan: ");
		String lastname = input.nextLine();
		String txt1 = "Dosen\"intelektual\" kampus";
		System.out.println("Nama lengkap:" +firstname+" "+lastname);
		System.out.println("Nama lengkap:"+firstname.concat(lastname));
		System.out.println(txt1);
		int x = 10;
		int y = 20;
		int z = x+y;
		System.out.println("x + y = "+z);
		String a = "10";
		String b= "20";
		String c= a+b;
		System.out.println("string a + string b = " +c);
		String v = a + y;
		System.out.println("string a + integer y = " +v);
	}

}
