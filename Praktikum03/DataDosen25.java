package Praktikum03;

public class DataDosen25 {

    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        for (Dosen25 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen25 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        if (countPria > 0)
            System.out.println("Rata-rata usia dosen pria   : " + (totalPria / countPria));
        if (countWanita > 0)
            System.out.println("Rata-rata usia dosen wanita : " + (totalWanita / countWanita));
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tertua = arrayOfDosen[0];

        for (Dosen25 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 termuda = arrayOfDosen[0];

        for (Dosen25 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}
