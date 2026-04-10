package Pertemuan7;

public class Peminjaman21_CM {
    Mahasiswa21_CM MHS;
    Buku21_CM Buku;
    int LamaPinjam;
    int Terlambat;
    int Denda;

    Peminjaman21_CM(Mahasiswa21_CM MHS, Buku21_CM Buku, int LamaPinjam){
        this.MHS = MHS;
        this.Buku = Buku;
        this.LamaPinjam = LamaPinjam;
        HitungDenda();
    }

    void HitungDenda(){
        if(LamaPinjam > 5){
            Terlambat = LamaPinjam - 5;
            Denda = Terlambat * 2000;
        } else {
            Terlambat = 0;
            Denda = 0;
        }
    }

    void Tampil(){
        System.out.println(MHS.Nama + " | " + Buku.Judul + " | Lama: " + LamaPinjam + " | Terlambat: " + Terlambat + " | Denda: " + Denda);
    }
}
