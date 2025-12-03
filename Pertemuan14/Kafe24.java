package Pertemuan14;
import java.util.Scanner;

public class Kafe24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah anda member? (ya/tidak): ");
        String jawabanMember = sc.nextLine();
        boolean isMember = jawabanMember.equalsIgnoreCase("ya");
        System.out.print("Masukkan kode promo (jika ada, jika tidak ketik 'tidak'): ");
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);

        sc.close();
    }

     public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        Scanner sc = new Scanner(System.in);

        String[] namaItems = {"Kopi Hitam","Cappuccino","Latte","Teh Tarik","Roti Bakar","Mie Goreng"};
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        }

        System.out.println("\n===== MENU KAFE =====");
        for (int i = 0; i < namaItems.length; i++) {
            System.out.printf("%d. %s - Rp %,d%n", i+1, namaItems[i], hargaItems[i]);
        }
        System.out.println("0. Selesai pemesanan");
        System.out.println("=======================");

        int totalHarga = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang anda pesan (0 untuk selesai): ");
            if (!sc.hasNextInt()) {
                System.out.println("Input harus berupa angka.");
                sc.next(); continue;
            }
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) {
                sc.nextLine(); 
                break;
            }
            if (pilihanMenu < 1 || pilihanMenu > namaItems.length) {
                System.out.println("Pilihan tidak valid. Masukkan 1 s.d. " + namaItems.length + " atau 0 untuk selesai.");
                continue;
            }

            System.out.print("Masukkan banyak item yang anda pesan: ");
            if (!sc.hasNextInt()) {
                System.out.println("Jumlah harus angka.");
                sc.next(); continue;
            }
            int banyakItem = sc.nextInt();
            sc.nextLine(); 

            int subtotal = hargaItems[pilihanMenu - 1] * banyakItem;
            totalHarga += subtotal;
            System.out.println(namaItems[pilihanMenu - 1] + " x" + banyakItem + " ditambahkan. Subtotal: Rp " + subtotal);
        }

        
        double promoDisc = 0.0;
        if ("DISKON50".equalsIgnoreCase(kodePromo)) {
            promoDisc = 0.50;
            System.out.println("Kode promo 'DISKON50' valid. Diskon 50% akan diterapkan.");
        } else if ("DISKON30".equalsIgnoreCase(kodePromo)) {
            promoDisc = 0.30;
            System.out.println("Kode promo 'DISKON30' valid. Diskon 30% akan diterapkan.");
        } else if ("tidak".equalsIgnoreCase(kodePromo) || kodePromo.trim().isEmpty()) {
            System.out.println("Tidak ada kode promo.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        double memberDisc = isMember ? 0.10 : 0.0;

        double afterMember = totalHarga * (1 - memberDisc);
        double finalHarga = afterMember * (1 - promoDisc);

        System.out.println("\n===== RINGKASAN =====");
        System.out.println("Total sebelum diskon : Rp " + totalHarga);
        if (isMember) System.out.println("Diskon member (10%)  : Rp " + (int)(totalHarga * memberDisc));
        if (promoDisc > 0) System.out.println("Diskon promo (" + (int)(promoDisc*100) + "%): Rp " + (int)(afterMember * promoDisc));
        System.out.println("---------------------------");
        System.out.println("Total yang harus dibayar: Rp " + (int) finalHarga);
        
      }

      public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) return 0;
        return hargaItems[pilihanMenu - 1] * banyakItem;
      }
}
