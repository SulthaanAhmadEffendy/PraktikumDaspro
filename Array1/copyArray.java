package Array1;

public class copyArray {

    public static void main(String[] args) {
        // 1. Deklarasi dan inisialisasi array sumber
        int[] arraySumber = {10, 20, 30, 40, 50};
        int ukuran = arraySumber.length;

        // 2. Deklarasi array tujuan dengan ukuran yang sama
        int[] arrayTujuan = new int[ukuran];

        System.out.println("--- 1. Menyalin Array ---");
        
        // 3. Menyalin elemen menggunakan loop
        for (int i = 0; i < ukuran; i++) {
            arrayTujuan[i] = arraySumber[i];
        }

        // Tampilkan hasil
        System.out.print("Array Sumber: ");
        for (int nilai : arraySumber) {
            System.out.print(nilai + " ");
        }
        System.out.println();
        
        System.out.print("Array Tujuan (Hasil Salinan): ");
        for (int nilai : arrayTujuan) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n");
    }

    // ... (Fungsi-fungsi lain akan ditambahkan di bawah)
} 