package PraktikumArray2;
import java.util.Scanner;

public class BioskopWithScanner24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
               
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;
                    boolean valid = false;

                    
                    while (!valid) {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia!");
                            continue;
                        }

                       
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi!");
                            System.out.println("Silahkan pilih kursi lain.\n");
                            continue;
                        }

                        valid = true;
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Penonton berhasil ditambahkan.\n");

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (pilihan == 2) {
                
                System.out.println("\n===== DAFTAR PENONTON =====");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("*** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("============================\n");

            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan layanan kami!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
}


