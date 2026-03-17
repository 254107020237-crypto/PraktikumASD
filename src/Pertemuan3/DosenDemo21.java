package Pertemuan3;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Dosen21[] arrayofDosen21 = new Dosen21[3];
        String Kode, Nama, JenisKelamin, Dummy;
        int Usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            Kode = input.nextLine();
            System.out.print("Nama          : ");
            Nama = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            JenisKelamin = input.nextLine();
            System.out.print("Usia          : ");
            Dummy = input.nextLine();
            Usia = Integer.parseInt(Dummy);
            System.out.println("--------------------------------");

            arrayofDosen21[i] = new Dosen21(Kode, Nama, JenisKelamin, Usia);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Dosen Ke-" + (i+1));
            System.out.println("Kode            : "+arrayofDosen21[i].Kode);
            System.out.println("Nama            : "+arrayofDosen21[i].Nama);
            System.out.println("Jenis Kelamin   : "+arrayofDosen21[i].JenisKelamin);
            System.out.println("Usia            : "+arrayofDosen21[i].Usia);
            System.out.println("--------------------------------");
        }
        Dosen21.DataSemuaDosen(arrayofDosen21);

        Dosen21.DataSemuaDosen(arrayofDosen21);
        Dosen21.jumlahDosenPerJenisKelamin(arrayofDosen21);

        Dosen21.RataUsiaDosenPerjenisKelamin(arrayofDosen21);

        Dosen21.InfoDosenPalingTua(arrayofDosen21);

        Dosen21.InfoDosenPalingMuda(arrayofDosen21);

    }
}
