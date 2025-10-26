import java.util.Scanner;

public class latihan7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input jumlah tim yang mendaftar
        System.out.println("Masukkan jumlah tim yang mendaftar: ");
        int jumlahTim = scanner.nextInt();

        // Biaya Tetap
       int biayaPublikasi = 300000;
       int biayaDekorasi = 500000;
       int biayaKonsumsiPanitiaJuri = 500000;
       int biayaKonsumsiPerpeserta = 25000;
       int biayaHadiah = 4000000;
       int biayaoperasional = 500000;
       int honorariumjuriperjudul = 75000;
     int biayaPendaftaranPertim = 50000;
       
     

       // Biaya Variabel
       // 1 tim = 3 peserta dan hanya dapat mengirim 1 judul dan menghitung berapa dana yang diperoleh dari sponsorship berdasarkan jumlah tim yang mendaftar
       // pihak polinema menanggung 60% dari seluruh biaya dan sisanya dari biaya pendaftaran dan biaya sponsorship
       // berapa dana sponsorship yang harus dicari agar acara dapat berjalan dengan lancar

       System.out.print("Apakah pihak Polinema bersedia memberikan dana bantuan? (ya/tidak): ");
       String jawaban = scanner.next();

       int persenBantuan = 0;
       if (jawaban.equalsIgnoreCase("ya")) {
           System.out.print("Masukkan persentase dana bantuan (dalam %): ");
           persenBantuan = scanner.nextInt();
       }

        int jumlahPeserta = jumlahTim * 3;
        int totalBiayaKonsumsiPeserta = biayaKonsumsiPerpeserta * jumlahPeserta;
      
        int totalHonorariumJuri = honorariumjuriperjudul * jumlahTim;  
        int totalBiaya = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri
         + biayaHadiah + biayaoperasional + totalHonorariumJuri + totalBiayaKonsumsiPeserta;
        int biayaDitanggungPolinema = (int) (0.6 * totalBiaya);
        int biayaSubsidi = totalBiaya - biayaDitanggungPolinema;  
        int totalBiayaPendaftaran = biayaPendaftaranPertim * jumlahTim;
        int biayaSponsorship = biayaSubsidi - totalBiayaPendaftaran;
        if (persenBantuan > 0) {
            int bantuanPolinema = (int) ((persenBantuan / 100.0) * totalBiaya);
            biayaSponsorship -= bantuanPolinema;
        }

        // Output hasil perhitungan

        System.out.printf("Dana sponsorship yang harus dicari: Rp %,d%n", biayaSponsorship);
      

    }

    }


    

