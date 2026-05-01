package Pertemuan9;

public class Mahasiswa21 {
    String Nama, NIM, Kelas;
    int Nilai;
    Mahasiswa21(String Nama, String NIM, String Kelas) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Kelas = Kelas;
        Nilai = -1;
    }

    void TugasDinilai(int Nilai) {
        this.Nilai = Nilai;
    }
}
