package PraktikumPerulangan2;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai ke n: ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;

            while(j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
