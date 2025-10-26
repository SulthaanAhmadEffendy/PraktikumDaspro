import java.util.Scanner;

public class latihan9 {

       public static void main(String[] args) {

        // input jumlah halaman buku yang akan dicetak
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah halaman buku yang akan dicetak: ");
        int jumlahHalaman = scanner.nextInt();
        System.out.println("Kota Pelanggan: ");
        String kotaPelanggan = scanner.next();

        // hanya menyediakan jilid dengan hard cover dengan biaya 20000
        // bookpaper dengan berat 3gram per lembar dan semua buku dicetak bolak balik 2 sisi
        // asumsi berat hard cover 250 gram dan berat kemasan 300 gram dengan biaya pengiriman 15000 per kilogram
        // menghitung total biaya berdasarkan jumlah halaman buku yang akan dicetak dan diperhatikan bahwa berat paket dibulatkan ke atas
//      
        int biayaPerHalaman = 200;
        int jumlahLembar = (int) Math.ceil((double) jumlahHalaman / 2);
        int biayaCetak = jumlahHalaman * biayaPerHalaman;
        int beratKertas = jumlahLembar * 3; 
        int beratHardCover = 250; 
        int beratKemasan = 300; 
        int totalBerat = beratKertas + beratHardCover + beratKemasan; 
        int totalBeratKg = (int) Math.ceil((double) totalBerat / 1000); 
        int biayaPengiriman = totalBeratKg * 15000; 
        int totalBiaya = biayaCetak + 20000 + biayaPengiriman;

        if (kotaPelanggan.equalsIgnoreCase("Malang") || kotaPelanggan.equalsIgnoreCase("Batu")) {
            biayaPengiriman = 20000;
        } 

        // output total biaya percetakan buku
        System.out.printf("Total biaya percetakan buku: Rp %,d%n", totalBiaya);
    }
    
    
}
