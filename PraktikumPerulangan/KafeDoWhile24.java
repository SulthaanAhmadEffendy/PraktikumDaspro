package PraktikumPerulangan;
import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        do{
            System.out.print("Masukkan nama Pelanggan (ketik 'batal' untuk keluar): ");
            String namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi:");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh:");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti:");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); 

        } while (true);

        System.out.println("Semua transaksi selesai. Terima kasih!");
    }
    
}
