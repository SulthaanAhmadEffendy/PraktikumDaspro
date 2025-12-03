package Pertemuan14;
import java.util.Scanner;

public class HitungBalok24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang balok: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        t = input.nextInt();

        L = p * l;
        vol = p * l * t;
        System.out.println("Luas persegi panjang adalah :" + L);
        System.out.println("Volume balok adalah :" + vol);

        input.close();
    }
    
}
