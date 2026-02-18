package Object;


public class MahasiswaMain {
    public static void main(String[] args) {
    Mahasiswa25 Mhs1 = new Mahasiswa25();
    Mhs1.nama = "Dimas Pratama";
    Mhs1.nim = "123456789";
    Mhs1.ipk = 3.75;
    Mhs1.kelas = "TI-1A";

  

    Mhs1.tampilkanInformasi();
    Mhs1.ubahKelas("TI-1B");
    Mhs1.updateIpk(3.85);
    Mhs1.tampilkanInformasi();

      Mahasiswa25 Mhs2 = new Mahasiswa25(
        "Rina Sari", 
        "987654321", 
        "TI-1B", 
        3.60
        );
        Mhs2.tampilkanInformasi();

    Mahasiswa25 mhs3 =
    new Mahasiswa25("Sulthaan Ahmad Effendy","254107060008","SIB-1C",3.7);
    mhs3.tampilkanInformasi();

    

    
    }
}
