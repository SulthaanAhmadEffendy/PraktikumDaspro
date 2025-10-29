package PraktikumPerulangan;

import java.util.Scanner;

public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalPenjualan = 0; 
        int totalPendapatan = 0;

        do{
            System.out.print("Masukkan nama penonton (ketik 'selesai' untuk berhenti): ");
            String namaPenonton = sc.nextLine();
            if (namaPenonton.equalsIgnoreCase("selesai")) {
                System.out.println("Penjualan tiket selesai.");
                System.out.println("Total penjualan tiket: " + totalPenjualan);
                System.out.println("Total pendapatan: Rp " + totalPendapatan);
                break;
            }
            System.out.print("Masukkan jumlah tiket yang dibeli oleh " + namaPenonton + ": ");
            int jumlahTiket = sc.nextInt();
            sc.nextLine(); 

            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan coba lagi.");
                continue;
            }

            if (jumlahTiket > 10) {
                hargaTiket = hargaTiket - (int)(0.15 * hargaTiket);
            } else if (jumlahTiket > 4) {
                hargaTiket = hargaTiket - (int)(0.10 * hargaTiket);
            } else {
                hargaTiket = 50000; 
            }

            int totalHarga = jumlahTiket * hargaTiket;
            System.out.println("Total yang harus dibayar oleh " + namaPenonton + ": Rp " + totalHarga);

            totalPenjualan += jumlahTiket;
            totalPendapatan += totalHarga;
           

        }while(true);


    }
    
}
