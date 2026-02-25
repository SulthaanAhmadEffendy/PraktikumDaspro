package Praktikum03;
import java.util.Scanner;

public class MataKuliahDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah25[] arrayOfMataKuliah = new MataKuliah25[3];
        String kode, nama, dummy, jumlahmatkul;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {

            arrayOfMataKuliah[i] = new MataKuliah25();

            System.out.println("Berapa matkul yang akan dimasukkan? ");
                jumlahmatkul = sc.nextLine();
                int jumlah = Integer.parseInt(jumlahmatkul);
    
                for (int j = 0; j < jumlah; j++) {
                    System.out.println("Masukkan data mata kuliah ke-" + (j + 1));
                    System.out.print("Kode: ");
                    kode = sc.nextLine();
    
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
    
                    System.out.print("SKS: ");
                    sks = Integer.parseInt(sc.nextLine());
    
                    System.out.print("Jumlah Jam: ");
                    jumlahJam = Integer.parseInt(sc.nextLine());
    
                 
                    arrayOfMataKuliah[i]
                        .tambahData(kode, nama, sks, jumlahJam);
                    System.out.println("------------------------------");
                }
        }




        System.out.println("\nDATA MATA KULIAH");
        System.out.println("------------------------------");
        for (MataKuliah25 mk : arrayOfMataKuliah) {
            mk.cetakInfo();
            System.out.println();
        }
    }
    
}
