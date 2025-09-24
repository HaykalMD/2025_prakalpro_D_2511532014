package Pekan2;

public class DeklarasiVariabel {
	/* program java
	 * latihan
	 * tentang pendeklarasian variabel
	 */
	static int umur=25; /* variabel langsung dapat diinisasi */
	public static void main(String[] args) {
		int kode;
		boolean isDibawahumur; /* perhatikan penulisan nama variabel */
		kode = 1234; /* pengisian variabel (assignment */
		double gaji; /* deklarasi variabel dapat dimana saja *///
		gaji = 5500000.23;
		isDibawahumur = true;
		System.out.println("Status: "+isDibawahumur);
		System.out.println("Kode: "+kode);
		System.out.println("Umur: "+umur);
		System.out.println("Gaji: "+ gaji);
	}

}
