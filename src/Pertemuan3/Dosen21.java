package Pertemuan3;

public class Dosen21 {
    String Kode;
    String Nama;
    String JenisKelamin;
    int Usia;

    public Dosen21(String Kode, String Nama, String JenisKelamin, int Usia){
        this.Kode = Kode;
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Usia = Usia;
    }

    public static void DataSemuaDosen(Dosen21[] arrayOfDosen21){
        System.out.println("=========================================");
        System.out.println("           DATA SEMUA DOSEN              ");
        System.out.println("=========================================");

        int i =1;
        for (Dosen21 Dosen : arrayOfDosen21){
            if (Dosen != null) {
                System.out.println("Data Dosen Ke-" + i);
                System.out.println("Kode          : " + Dosen.Kode);
                System.out.println("Nama          : " + Dosen.Nama);
                System.out.println("Jenis Kelamin : " + Dosen.JenisKelamin);
                System.out.println("Usia          : " + Dosen.Usia);
                System.out.println("-----------------------------------------");
                i++;
            }
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen21){
        int Pria = 0;
        int Wanita = 0;

        for (Dosen21 Dosen : arrayOfDosen21){
            if (Dosen != null) {
                if (Dosen.JenisKelamin.equalsIgnoreCase("Pria")) {
                    Pria++;
                } else if (Dosen.JenisKelamin.equalsIgnoreCase("Wanita")) {
                    Wanita++;
                }
            }
        }

        System.out.println("=========================================");
        System.out.println("      JUMLAH DOSEN PER JENIS KELAMIN     ");
        System.out.println("=========================================");
        System.out.println("Pria   : " + Pria);
        System.out.println("Wanita : " + Wanita);
        System.out.println("-----------------------------------------");
    }

    public static void RataUsiaDosenPerjenisKelamin(Dosen21[] arrayofDosen21){
        int TotalUsiaPria = 0, countPria = 0;
        int TotalUsiaWanita = 0, countWanita = 0;

        for (Dosen21 Dosen : arrayofDosen21){
            if (Dosen != null) {
                if (Dosen.JenisKelamin.equalsIgnoreCase("Pria")) {
                    TotalUsiaPria += Dosen.Usia;
                    countPria++;
                } else if (Dosen.JenisKelamin.equalsIgnoreCase("wanita")) {
                    TotalUsiaWanita += Dosen.Usia;
                    countWanita++;
                }
            }
        }

    System.out.println("=========================================");
    System.out.println("     RATA-RATA USIA PER JENIS KELAMIN    ");
    System.out.println("=========================================");

    double rataPria = (countPria == 0) ? 0 : (double) TotalUsiaPria / countPria;
    double rataWanita = (countWanita == 0) ? 0 : (double) TotalUsiaWanita / countWanita;

    System.out.println("Rata-rata Usia Pria   : " + rataPria);
    System.out.println("Rata-rata Usia Wanita : " + rataWanita);
    System.out.println("-----------------------------------------");
    }

    public static void InfoDosenPalingTua(Dosen21[] arrayofDosen21){
        if (arrayofDosen21 == null || arrayofDosen21.length == 0){
            return;
        }

        Dosen21 DosenTerTua = arrayofDosen21[0];

        for (Dosen21 Dosen : arrayofDosen21){
            if (Dosen != null) {
                if (Dosen.Usia > DosenTerTua.Usia) {
                        DosenTerTua = Dosen;
                }
            }
        }
        System.out.println("=========================================");
        System.out.println("            DOSEN PALING TUA              ");
        System.out.println("=========================================");
        System.out.println("Kode          : " + DosenTerTua.Kode);
        System.out.println("Nama          : " + DosenTerTua.Nama);
        System.out.println("Jenis Kelamin : " + DosenTerTua.JenisKelamin);
        System.out.println("Usia          : " + DosenTerTua.Usia);
        System.out.println("-----------------------------------------");     
    }

    public static void InfoDosenPalingMuda(Dosen21[] arrayofDosen21){
        if (arrayofDosen21 == null || arrayofDosen21.length == 0){
            return;
        }

        Dosen21 DosenTerMuda = arrayofDosen21[0];

        for (Dosen21 Dosen : arrayofDosen21){
            if (Dosen != null) {
                if (Dosen.Usia < DosenTerMuda.Usia) {
                    DosenTerMuda = Dosen;
                }
            }
        }
        System.out.println("=========================================");
        System.out.println("            DOSEN PALING MUDA              ");
        System.out.println("=========================================");
        System.out.println("Kode          : " + DosenTerMuda.Kode);
        System.out.println("Nama          : " + DosenTerMuda.Nama);
        System.out.println("Jenis Kelamin : " + DosenTerMuda.JenisKelamin);
        System.out.println("Usia          : " + DosenTerMuda.Usia);
        System.out.println("-----------------------------------------"); 
    }
}
