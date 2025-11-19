package PraktikumArray2;
import java.util.Scanner;

public class Survei {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Survei Kepuasan Pelanggan ===");
        System.out.println("Masukkan jumlah responden");
        int RESPONDEN = sc.nextInt();
        System.out.println("Masukkan jumlah pertanyaan");
        int PERTANYAAN = sc.nextInt();

        int[][] jawaban = new int[RESPONDEN][PERTANYAAN];

        System.out.println("Input nilai survei (1-5) untuk " + RESPONDEN + " responden dan " + PERTANYAAN + " pertanyaan.");

        for (int i = 0; i < RESPONDEN; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < PERTANYAAN; j++) {
                int nilai;
                while (true) {
                    System.out.print("  Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    if (!sc.hasNextInt()) {
                        sc.next(); 
                        System.out.println("   Input harus angka 1-5. Coba lagi.");
                        continue;
                    }
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("   Nilai harus antara 1 dan 5. Coba lagi.");
                    } else {
                        break;
                    }
                }
                jawaban[i][j] = nilai;
            }
        }


        System.out.println("\nRata-rata per responden:");
        double totalSemua = 0;
        for (int i = 0; i < RESPONDEN; i++) {
            int sum = 0;
            for (int j = 0; j < PERTANYAAN; j++) {
                sum += jawaban[i][j];
            }
            double rata = (double) sum / PERTANYAAN;
            totalSemua += sum;
            System.out.printf(" Responden %2d: %.2f%n", (i + 1), rata);
        }

        
        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < PERTANYAAN; j++) {
            int sum = 0;
            for (int i = 0; i < RESPONDEN; i++) {
                sum += jawaban[i][j];
            }
            double rata = (double) sum / RESPONDEN;
            System.out.printf(" Pertanyaan %d: %.2f%n", (j + 1), rata);
        }

       
        double rataKeseluruhan = totalSemua / (RESPONDEN * PERTANYAAN);
        System.out.printf("%nRata-rata keseluruhan: %.2f%n", rataKeseluruhan);

        sc.close();
    }

}
