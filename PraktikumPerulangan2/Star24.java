package PraktikumPerulangan2;
import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai ke n: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
        System.out.print("* ");
        }
    }
}
