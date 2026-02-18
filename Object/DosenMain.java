package Object;

public class DosenMain {
    public static void main(String[] args) {

        Dosen d1 = new Dosen();
        d1.idDosen = "D01";
        d1.nama = "Pak Budi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2018;
        d1.bidangKeahlian = "AI";

        Dosen d2 =
            new Dosen("D02","Bu Sari",true,2020,"Database");

        d1.tampilInformasi();
        d2.tampilInformasi();

        d1.setStatusAktif(false);
        d1.ubahKeahlian("Machine Learning");
        System.out.println("\nSetelah update:");
        d1.tampilInformasi();


        System.out.println("Masa kerja: "
                + d1.hitungMasaKerja(2025) + " tahun");
    }
}
