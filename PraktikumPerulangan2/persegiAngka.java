package PraktikumPerulangan2;

import java.util.Scanner;
public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal harus 3");
            return;
        }

       
        for (int j = 1; j <= n; j++) {
            System.out.print(n + " ");
        }
        System.out.println();

        
        for (int i = 2; i < n; i++) {
            System.out.print(n + " ");
            for (int j = 2; j < n; j++) {
                System.out.print("  ");
            }
            System.out.print(n + " ");
            System.out.println();
        }

        
        for (int j = 1; j <= n; j++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
