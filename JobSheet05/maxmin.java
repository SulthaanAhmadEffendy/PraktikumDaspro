package JobSheet05;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max, min;
        System.out.print("Masukkan bilangan pertama: ");
        a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        c = sc.nextInt();
        
        // mencari nilai maksimum
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        
        // mencari nilai minimum
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);
    }


    
}
