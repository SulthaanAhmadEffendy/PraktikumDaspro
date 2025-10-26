
import java.util.Scanner;

public class latihan2 {

     public static void main(String[] args) {

        // input lama sewa dalam hari dan jarak tempuh dalam km
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan lama sewa (dalam hari): ");
        int lamaSewa = scanner.nextInt();
        System.out.println("Masukkan jarak tempuh (dalam km): ");
        int jarakTempuh = scanner.nextInt();
        System.out.println("Masukkan Jenis BBM: ");
        String jenisBBM = scanner.next();

        // biaya sewa mobil per hari 300000
        // biaya sopir per hari 200000
        // biaya bbm 1000 per km
        // menghitung total biaya sewa mobil berdasarkan lama sewa dan jarak tempuh
        // biaya bbm tergantung jenis bbm
        // lama sewa maksimal 30 hari

        int biayaBbm = 1000 * jarakTempuh;
        int tarifPerHari = 300000;
        int biayaSopir = 200000 * lamaSewa;
        int totalBiaya = (tarifPerHari * lamaSewa) + biayaBbm + biayaSopir;

        // diskon 5% jika total biaya lebih dari 2 juta
        if(totalBiaya > 2000000){
            totalBiaya = totalBiaya - (totalBiaya * 5 / 100);
        }
      

        //output total biaya sewa mobil
        System.out.printf("Total biaya sewa mobil: Rp %,d%n", totalBiaya);
    }
    
}
