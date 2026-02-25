package Praktikum03;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {

        Mahasiswa25[] arrayOfMahasiswa = new Mahasiswa25[3];
        Scanner sc = new Scanner(System.in);

       
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa25();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK: ");
            arrayOfMahasiswa[i].ipk =
                Double.parseDouble(sc.nextLine());

            System.out.println("------------------------------");
        }

       
        System.out.println("\nDATA MAHASISWA");
        System.out.println("------------------------------");

        for (Mahasiswa25 mhs : arrayOfMahasiswa) {
            mhs.cetakInfo();
        }
    }
}