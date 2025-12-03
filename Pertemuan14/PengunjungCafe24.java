package Pertemuan14;

public class PengunjungCafe24 {


static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Pengunjung ");
    int nomor = 1;
    for (String nama : namaPengunjung) {
        System.out.println(nomor++ + ". " + nama);
    }
    
}

public static void main(String[] args) {
    daftarPengunjung("Amin","Bena","Candra","Dela","Eka");
    System.out.println();
    daftarPengunjung("Farhan","Gisel","Hana");
}

}
