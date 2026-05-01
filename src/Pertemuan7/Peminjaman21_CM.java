package Pertemuan7;

public class Peminjaman21_CM {
    Mahasiswa21_CM MHS;
    Buku21_CM Buku;
    int LamaPinjam;
    int Terlambat;
    int Denda;
    int Tahun;

    Peminjaman21_CM(Mahasiswa21_CM MHS, Buku21_CM Buku, int LamaPinjam){
        this.MHS = MHS;
        this.Buku = Buku;
        this.LamaPinjam = LamaPinjam;
        this.Tahun = Tahun;
        HitungDenda();
    }

    void HitungDenda(){
        if(LamaPinjam > 5){
            Terlambat = LamaPinjam - 5;
            Denda = Terlambat * 2000 ;
        } else {
            if (Tahun < 2020) {
                Tahun = LamaPinjam - 2020;
                Denda = LamaPinjam * 2000 / 50;
            }
            Terlambat = 0;
            Denda = 0;
        }
    }

    

    void Tampil(){
        System.out.println(MHS.Nama + " | " + Buku.Judul + " | Lama: " + LamaPinjam + " | Terlambat: " + Terlambat + " | Denda: " + Denda);
    }
    void tampil(){
        System.out.println("==== Data transaksi peminjaman ====");
        System.out.println(MHS.Nama + " | " + Buku.Judul + " | Lama: " + LamaPinjam + " | Terlambat: " + Terlambat + " | Denda: " + Denda);
    }
}
