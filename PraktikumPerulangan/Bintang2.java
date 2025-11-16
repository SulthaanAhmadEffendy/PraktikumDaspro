package PraktikumPerulangan;

public class Bintang2 {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
           
            for (int k = 1; k <= n; k++) {
                if (k <= n - i) {
                    System.out.print("  "); 
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
