package PraktikumPerulangan2;
import java.util.Scanner;

public class Kuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            StringBuilder expr = new StringBuilder();

          
            for (int j = 1; j <= i; j++) {
                int square = j * j;
                sum += square;
                expr.append(square);
                if (j < i) {
                    expr.append(" + ");
                }
            }

          
            System.out.println("n = " + i + " → jumlah kuadrat = " + expr.toString() + " = " + sum);
        }
        
        sc.close();
    }
}
