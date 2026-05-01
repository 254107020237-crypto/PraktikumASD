package Pertemuan9;

public class Surat21 {
    String IDSurat;
    String NamaMahasiswa;
    String Kelas;
    char JenisIzin;
    int Durasi;

    public Surat21(String ID, String Nama, String Kelas, char Jenis, int Durasi) {
        this.IDSurat = ID;
        this.NamaMahasiswa = Nama;
        this.Kelas = Kelas;
        this.JenisIzin = Jenis;
        this.Durasi = Durasi;
    }

    public void tampil() {
        System.out.println(IDSurat + "\t" + NamaMahasiswa + "\t" + Kelas + "\t" + JenisIzin + "\t" + Durasi);
    }
}
