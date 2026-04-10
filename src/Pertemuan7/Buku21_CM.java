package Pertemuan7;

public class Buku21_CM {
    String Kode;
    String Judul;
    int Tahun;

    Buku21_CM(String Kode, String Judul, int Tahun){
        this.Kode = Kode;
        this.Judul = Judul;
        this.Tahun = Tahun;
    }
    
    void Tampil(){
        System.out.println(Kode + " | " + Judul + " | " + Tahun);
    }
}