package Pertemuan7;

public class Mahasiswa21_CM {
    String NIM;
    String Nama;
    String Prodi;

    Mahasiswa21_CM(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    void Tampil(){
        System.out.println(NIM + " | " + Nama + " | " + Prodi);
    }
}
