package PraktikumArray2;
import java.util.Scanner;

public class SIAKAD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        if (jumlahMahasiswa <= 0 || jumlahMatkul <= 0) {
            System.out.println("Jumlah mahasiswa dan mata kuliah harus lebih dari 0.");
            sc.close();
            return;
        }

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan nilai untuk mahasiswa ke-" + (i + 1));
            double totalPerMhs = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerMhs += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + " = " + (totalPerMhs / jumlahMatkul));
        }

        
        System.out.println("\n=====================");
        System.out.println("Rata-rata nilai setiap mata kuliah");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mata kuliah ke-" + (j + 1) + ": " + (totalPerMatkul / jumlahMahasiswa));
        }

        sc.close();
    }

}

