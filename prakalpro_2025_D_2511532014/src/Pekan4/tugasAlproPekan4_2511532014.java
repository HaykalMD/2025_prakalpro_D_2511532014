import java.util.Scanner;
class tugasAlproPekan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Masukan Nama Pembeli: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Jumlah Tiket: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = scanner.nextInt();
        System.out.print("Masukkan Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        int waktu = scanner.nextInt();
        System.out.print("Masukkan Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int studio = scanner.nextInt();
        
        //jenis studio
        int hargaawal = 0;
        String jenis = "";
        switch (studio) {
            case 1:
                hargaawal = 30000;
                jenis = "Regular";
                break;
            case 2:
                hargaawal = 50000;
                jenis = "Deluxe";
                break;
            case 3:
                hargaawal = 100000;
                jenis = "Premium";
                break;
            default:
                System.out.println("Jenis studio tidak valid!");
                return;
        }
        //biaya hari
        double biayaHari = 0;
        String ketHari = "";
        switch (hari) {
            case 1:
                biayaHari = 0.0;
                ketHari = "Senin-Kamis";
                break;
            case 2:
                biayaHari = 0.10;
                ketHari = "Jumat";
                break;
            case 3:
                biayaHari = 0.30;
                ketHari = "Sabtu-Minggu";
                break;
            default:
                System.out.println("Hari tidak valid!");
                return;
        }
        //biaya waktu
        double biayaWaktu = 0;
        String ketWaktu = "";
        switch (waktu) {
            case 1:
                biayaWaktu = 0.0;
                ketWaktu = "Pagi";
                break;
            case 2:
                biayaWaktu = 0.10;
                ketWaktu = "Siang";
                break;
            case 3:
                biayaWaktu = 0.20;
                ketWaktu = "Malam";
                break;
            default:
                System.out.println("Waktu tidak valid!");
                return;
        }
        //harga per tiket
        double hargaPerTiket = hargaawal+ (hargaawal * biayaHari) + (hargaawal * biayaWaktu);
        //subtotal
         double subtotal = hargaPerTiket * jumlah;
         //diskon
         double diskon = 0;
        if (jumlah >= 5) {
            diskon = subtotal * 0.20;
        }
        //total
        double total = subtotal - diskon;

        
        //output
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli\t: " + nama);
        System.out.println("Jumlah Tiket\t: " + jumlah);
        System.out.println("Hari\t: " + ketHari);
        System.out.println("Waktu Tayang\t: " + ketWaktu);
        System.out.println("Jenis Studio\t: " + jenis);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar\t: Rp " + hargaawal + "/tiket");
        System.out.println("Biaya Hari\t: +" + (int)(biayaHari * 100) + "%");
        System.out.println("Biaya Waktu\t: +" + (int)(biayaWaktu * 100) + "%");
        System.out.println("Harga per Tiket\t: Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal\t: Rp " + (int)subtotal);
        System.out.println("Diskon (20%)\t: Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR\t: Rp " + (int)total);
    }
}