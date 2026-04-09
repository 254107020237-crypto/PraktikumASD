package Pertemuan6;

public class Dosen21 {
    String Kode, Nama;
    boolean JenisKelamin;
    int Usia;

    public Dosen21(String KD, String Name, boolean JK, int AGE) {
        Kode = KD;
        Nama = Name;
        JenisKelamin = JK;
        Usia = AGE;
    }

     void tampil() {
        String JK = JenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println(Kode + " | " + Nama + " | " + JK + " | " + Usia);
    }
}
