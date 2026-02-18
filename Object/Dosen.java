package Object;

class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen(){}

    Dosen(String id, String nama,
          boolean status, int tahun,
          String bidang) {
        this.idDosen = id;
        this.nama = nama;
        this.statusAktif = status;
        this.tahunBergabung = tahun;
        this.bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println(idDosen + " | " + nama +
                " | Aktif: " + statusAktif +
                " | Bergabung: " + tahunBergabung +
                " | Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
