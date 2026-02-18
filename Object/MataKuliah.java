package Object;

class MataKuliah {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah() {}

    MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
}
    void tampilInformasi() {
        System.out.println(kodeMK + " | " + nama +
                " | SKS: " + sks +
                " | Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak bisa dilakukan");
        }
    }
}
