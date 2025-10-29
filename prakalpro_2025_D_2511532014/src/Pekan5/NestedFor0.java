package Pekan5;

public class NestedFor0 {
	public static void main(String[] args) {
		for (int line = 1; line <=5; line++) {
			for (int j = 1; j <= (5-line);j++) {
				System.out.print(".");
			}
			System.out.println(line);
		}
	}
}
