import java.util.Scanner;
public class alproTugasPekan3 {
	public static void main(String[] args) {
		int r;
        int t;
        double v;
        final double pi=3.14;
        System.out.println("Program penghitung volume tabung.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan jari-jari tabung : ");
        r = keyboard.nextInt();
        System.out.print("Masukan tinggi tabung: ");
        t = keyboard.nextInt();
        keyboard.close();
        v= pi*(r*r)*t;
        System.out.println("Volume tabung: "+v);
	}
}