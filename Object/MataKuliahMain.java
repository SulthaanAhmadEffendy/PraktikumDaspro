package Object;

public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah mk2 =
            new MataKuliah("IF102","Basis Data",3,6);

        mk1.tampilInformasi();
        mk2.tampilInformasi();

        mk1.ubahSKS(4);
        mk2.tambahJam(2);
        mk1.kurangiJam(3);

        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}