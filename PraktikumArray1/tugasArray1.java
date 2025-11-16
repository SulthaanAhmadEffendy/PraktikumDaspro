package PraktikumArray1;
import java.util.Scanner;

public class tugasArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] daftarMenu = { "Kentang Goreng", "Sandwich", "Roti Bakar", "Donat", "Kue Cubit", "Es Teh", "Kopi Hitam", "Cappucino" };
        int[] hargaMenu = { 15000, 20000, 10000, 12000, 5000, 7000, 10000, 15000 };

        while (true) {
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
            int jumlahPesanan = sc.nextInt();
            sc.nextLine(); 
            
            if (jumlahPesanan == 0) {
                System.out.println("Terima kasih telah berbelanja!");
                break;
            }
            
            int totalHarga = 0;
            
           
            for (int i = 1; i <= jumlahPesanan; i++) {
                System.out.print("Masukkan menu " + i + ": ");
                String namaMenu = sc.nextLine();
                
                
                int indeksMenu = -1;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(namaMenu)) {
                        indeksMenu = j;
                        break;
                    }
                }
                
                
                if (indeksMenu != -1) {
                    System.out.print("Masukkan jumlah: ");
                    int jumlahItem = sc.nextInt();
                    sc.nextLine(); 
                    
                    
                    totalHarga += hargaMenu[indeksMenu] * jumlahItem;
                } else {
                    System.out.println("Maaf, menu '" + namaMenu + "' tidak tersedia.");
                    i--; 
                }
            }
            
            
            System.out.println("Total: " + totalHarga);
        }
        
        sc.close();
    }
}