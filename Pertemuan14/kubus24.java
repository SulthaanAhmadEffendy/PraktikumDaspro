package Pertemuan14;
import java.util.Scanner;

public class kubus24 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, luas, volume;

        System.out.print("Masukkan sisi kubus: ");
        s = input.nextInt();

        luas = 6 * s * s;
        volume = s * s * s;

        System.out.println("Luas permukaan kubus adalah: " + luas);
        System.out.println("Volume kubus adalah: " + volume);

        input.close();
    }
}