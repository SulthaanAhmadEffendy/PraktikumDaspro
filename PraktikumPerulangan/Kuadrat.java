package PraktikumPerulangan;

import java.util.Scanner;

public class Kuadrat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            StringBuilder expr = new StringBuilder();

            // perulangan bersarang: j dari 1 sampai i
            for (int j = 1; j <= i; j++) {
                int sq = j * j;
                sum += sq;
                expr.append(sq);
                if (j < i) expr.append(" + ");
            }

            expr.append(" = ").append(sum);
            System.out.println("n = " + i + " \u2192 jumlah kuadrat = " + expr.toString());
        }

        sc.close();
    }
    
}
