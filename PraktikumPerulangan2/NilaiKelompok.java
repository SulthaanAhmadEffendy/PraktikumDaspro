package PraktikumPerulangan2;
import java.util.Scanner;

public class NilaiKelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai;
        double totalNilai = 0;
        double rataNilai;
      
       for (int i = 1; i <= 6; i++) {
            System.out.println("Anggota kelompok ke-" + i);
            totalNilai = 0;
            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            double maxRata = 0;
            int kelompokTerbaik = 0;

           if (rataNilai > maxRata) {
            maxRata = rataNilai;
            kelompokTerbaik = i;
           }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok: " + rataNilai);
            System.out.println("Kelompok dengan nilai tertinggi: " + kelompokTerbaik);

            i++;
        }
    }
}
