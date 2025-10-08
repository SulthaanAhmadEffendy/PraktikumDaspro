package JobSheet05;
import java.util.Scanner;

public class CetakKRS24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cetak KRS SIAKAD");
        System.out.print("Apakah Ukt Anda Sudah Lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan dpa");
        } else {
            System.out.println("Registrasi Ditolak. Silahkan lunasi UKT Anda");
        }
    }
}