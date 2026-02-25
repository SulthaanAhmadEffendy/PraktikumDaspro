package Praktikum03;

import java.util.Scanner;

public class DosenDemo25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen25[] arrayOfDosen = new Dosen25[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (P/L): ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia: ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }

        DataDosen25 data = new DataDosen25();

        System.out.println("\n=== DATA SEMUA DOSEN ===");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== RERATA USIA DOSEN ===");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING TUA ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n=== DOSEN PALING MUDA ===");
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}
