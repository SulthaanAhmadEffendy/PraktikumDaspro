package PraktikumPerulangan;
import java.util.Scanner;

public class TugasParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifparkirmobil = 3000;
        int tarifparkirmotor = 2000;
        int tarifparkirlebih = 12500;
        int totalTarif = 0;

        System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
        int jenisKendaraan = sc.nextInt();

        while (jenisKendaraan != 0) {
            if(jenisKendaraan < 1 || jenisKendaraan > 2){
                System.out.println("Jenis kendaraan tidak valid.");
                System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
                jenisKendaraan = sc.nextInt();
                continue;
            }

            System.out.print("Masukkan lama parkir (dalam jam): ");
            int lamaParkir = sc.nextInt();

            if (lamaParkir > 5) {
                totalTarif = tarifparkirlebih;
                System.out.println("Total tarif parkir: Rp " + totalTarif);
            } else {
                if (jenisKendaraan == 1) {
                    totalTarif = lamaParkir * tarifparkirmobil;
                    System.out.println("Total tarif parkir mobil: Rp " + totalTarif);
                } else {
                    totalTarif = lamaParkir * tarifparkirmotor;
                    System.out.println("Total tarif parkir motor: Rp " + totalTarif);
                }
            }

            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenisKendaraan = sc.nextInt();
        }
        
        System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
    }
}
