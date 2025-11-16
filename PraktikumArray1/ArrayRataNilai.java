package PraktikumArray1;
import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0;
        double rata2;
        double totalLulus = 0;
        int countLulus = 0;
        double totalTidakLulus = 0;
        int countTidakLulus = 0;

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Hitung total semua nilai
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        // Hitung nilai tertinggi
        int nilaitertinggi = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaitertinggi) {
                nilaitertinggi = nilaiMhs[i];
            }
        }

        // Hitung nilai terendah
        int nilaiterrendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < nilaiterrendah) {
                nilaiterrendah = nilaiMhs[i];
            }
        }

        // Hitung rata-rata nilai lulus dan tidak lulus
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        rata2 = totalLulus / countLulus;
        double rata2TidakLulus = totalTidakLulus / countTidakLulus;

        System.out.println("\nNilai tertinggi = " + nilaitertinggi);
        System.out.println("Nilai terendah = " + nilaiterrendah);
        System.out.println("Rata-rata nilai lulus = " + rata2);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        System.out.println("Masukkan nilai yang ingin dicari: ");
        int cariNilai = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == cariNilai) {
                System.out.println("Nilai " + cariNilai + " ditemukan pada indeks ke-" + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nilai " + cariNilai + " tidak ditemukan.");
        }
    }
}