

import java.util.Scanner;

public class latihan6{

 

    public static void main(String[] args) {
     // input jumlah kWh yang digunakan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah kWh yang digunakan: ");
        int kWh = scanner.nextInt();
        
        System.out.println("Opsi Daya");
        System.out.println("1. 900 VA");
        System.out.println("2. 1.300 VA");
        System.out.println("3. 2.200 VA");
        System.out.println("4. 3.500 VA");
        System.out.println("5. 5.500 VA");
        System.out.print("Pilih opsi daya: ");
        int opsiDaya = scanner.nextInt();

        // biaya tetap 50000 per pelanggan dan biaya variabel 1500 per kWh
        // dikenakan pajak pertambahan nilai (PPN) sebesar 10% dari total tagihan (biaya tetap + biaya variabel)

        int biayaTetap = 50000;
        int tarif;
        switch (opsiDaya) {
            case 1:
                tarif = 1300;   
                break;
            case 2:
            case 3:
                tarif = 1500;
                break;
            case 4:
            case 5:
                tarif = 1700;
                break;
            default:
                System.out.println("Opsi daya tidak valid.");
                return;
        }
     
        double ppn = 0.1 * (biayaTetap + (kWh * tarif));
        double total = biayaTetap + (kWh * tarif) + ppn;

        // output total tagihan listrik
        System.out.printf("Total tagihan listrik: Rp %,d%n", (int) total);
    }

}


    

