package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe24 {

    static void inputDataPenjualan(int[][] penjualan, String[] namaMenu, Scanner sc) {
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanDataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== Rekap Penjualan =====");
        System.out.print("Menu/Hari\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void menuPenjualanTertinggi(int[][] penjualan, String[] namaMenu) {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < namaMenu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    static void rataRataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\nRata-rata penjualan setiap menu:");
        for (int i = 0; i < namaMenu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / penjualan[i].length;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine(); 

        String[] namaMenu = new String[jumlahMenu];
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\nMasukkan nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine(); 
        }

        inputDataPenjualan(penjualan, namaMenu, sc);
        tampilkanDataPenjualan(penjualan, namaMenu);
        menuPenjualanTertinggi(penjualan, namaMenu);
        rataRataPenjualan(penjualan, namaMenu);

        sc.close();
    }
}
