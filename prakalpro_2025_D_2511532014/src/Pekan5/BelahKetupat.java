package Pekan5;

public class BelahKetupat {
	public static void main(String[]args) {
		System.out.println("#================#");
		int tinggi= 8;
		int set = tinggi/2;
		//perulangan 
		for (int t=1; t<=tinggi;t++) {
			System.out.print("|");
			
			//Spasi kiri
			if (t<=4) {
				for (int sp=0;sp<(set-t)*2;sp++) {
					System.out.print(" ");
				}
			} else {
				for (int sp=0;sp<(t-set-1)*2;sp++) {
					System.out.print(" ");
				}
			}
			
			//diamond
			System.out.print("<>");
			
			//Point
			if (t<=4) {
				for (int p=0;p<(t-1)*4;p++) {
					System.out.print(".");
				}
			} else {
				for (int p=0;p<(8-t)*4;p++) {
					System.out.print(".");
				}
			}
			
			//diamond
			System.out.print("<>");
			
			//Spasi Kanan
			if (t<=4) {
				for (int sp=0;sp<(set-t)*2;sp++) {
					System.out.print(" ");
				}
			} else {
				for (int sp=0;sp<(t-set-1)*2;sp++) {
					System.out.print(" ");
				}
			}
			System.out.println("|");
		}
		System.out.println("#================#");
	}

}
//System.out.println();
