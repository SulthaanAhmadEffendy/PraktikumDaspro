package Pertemuan14;

import java.util.Scanner;

public class NilaimahasiswaNoAbsen {
    
   
    static void isianArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    
    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + " = " + arr[i]);
        }
    }

    
    static int hitTot(int[] arr) {
        int total = 0;
        for (int v : arr) total += v;
        return total;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N harus lebih dari 0.");
            sc.close();
            return;
        }

        int[] nilai = new int[N];
        isianArray(nilai, sc);
        tampilArray(nilai);

        int total = hitTot(nilai);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + total);

        sc.close();
    }
}
