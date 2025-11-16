package Array1;

public class arrayTerbalik {
    public class TugasArray {

// Buat program untuk mengisi elemen array dengan 
// jumlah elemen 10, kemudian tampilkan isi array tersebut secara 
// terbalik.
public static void main(String[] args) {
    // 1. Deklarasi dan inisialisasi array
    int[] arrayAsli = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
    int ukuran = arrayAsli.length;

    System.out.println("--- Menampilkan Array Terbalik ---");

    // 2. Menampilkan elemen array secara terbalik
    System.out.print("Array Terbalik: ");
    for (int i = ukuran - 1; i >= 0; i--) {
        System.out.print(arrayAsli[i] + " ");
    }
    System.out.println();

   
}
    
}
