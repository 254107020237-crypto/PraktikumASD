package Pertemuan3;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Mahasiswa21[] arrayofMahasiswa21 = new Mahasiswa21[3];

        arrayofMahasiswa21[0] = new Mahasiswa21();
        arrayofMahasiswa21[0].Nim ="244107060033";
        arrayofMahasiswa21[0].Nama ="AGNES TITANIA KINANTI";
        arrayofMahasiswa21[0].Kelas ="SIB - 1E";
        arrayofMahasiswa21[0].IPK = 3.75f;

        arrayofMahasiswa21[1] = new Mahasiswa21();
        arrayofMahasiswa21[1].Nim = "2341720172";
        arrayofMahasiswa21[1].Nama ="ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa21[1].Kelas ="TI - 2A";
        arrayofMahasiswa21[1].IPK = 3.36f;

        arrayofMahasiswa21[2] = new Mahasiswa21();
        arrayofMahasiswa21[2].Nim = "244107023006";
        arrayofMahasiswa21[2].Nama = "DIRMAHAMAN PUTRANTO";
        arrayofMahasiswa21[2].Kelas = "TI - 2E";
        arrayofMahasiswa21[2].IPK = 3.80f;

        System.out.println("NIM    : "+ arrayofMahasiswa21[0].Nim);
        System.out.println("Nama   : "+ arrayofMahasiswa21[0].Nama);
        System.out.println("Kelas  : "+ arrayofMahasiswa21[0].Kelas);
        System.out.println("IPK    : " +arrayofMahasiswa21[0].IPK);
        System.out.println("--------------------------------------");

        System.out.println("NIM    : "+ arrayofMahasiswa21[1].Nim);
        System.out.println("Nama   : "+ arrayofMahasiswa21[1].Nama);
        System.out.println("Kelas  : "+ arrayofMahasiswa21[1].Kelas);
        System.out.println("IPK    : " +arrayofMahasiswa21[1].IPK);
        System.out.println("--------------------------------------");

        System.out.println("NIM    : "+ arrayofMahasiswa21[2].Nim);
        System.out.println("Nama   : "+ arrayofMahasiswa21[2].Nama);
        System.out.println("Kelas  : "+ arrayofMahasiswa21[2].Kelas);
        System.out.println("IPK    : " +arrayofMahasiswa21[2].IPK);
        System.out.println("--------------------------------------");
    }
}