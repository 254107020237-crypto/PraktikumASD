package Pertemuan7;

public class Mahasiswa21 {
    String NIM;
    String Nama;
    String Kelas;
    double IPK;

    Mahasiswa21(String NM, String Name, String Kls, double Ip){
        NIM=NM;
        Nama= Name;
        IPK= Ip;
        Kelas=Kls;
    }

    void TampilInformasi(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Kelas: " + Kelas);
        System.out.println("IPK: " + IPK);
        
    }
}
