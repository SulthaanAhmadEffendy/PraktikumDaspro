package JobSheet05;
import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Masukkan Angka: ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " Bilangan Genap");
        } else {
            System.out.println(number + " Bilangan Ganjil");
        }
    }
    
}
