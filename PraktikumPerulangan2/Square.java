package PraktikumPerulangan2;
import java.util.Scanner;

public class Square {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai ke n: ");
        int n = sc.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
