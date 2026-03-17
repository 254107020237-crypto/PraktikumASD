package Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Kode, Nama, Dummy;
        int SKS, JumlahJam;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int JumlahMataKuliah = Integer.parseInt(input.nextLine());

        MataKuliah21[] arrayofMataKuliah21 = new MataKuliah21[JumlahMataKuliah];

        for (int i = 0; i < arrayofMataKuliah21.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah Ke- " + (i +1));
            //System.out.print("Kode       : ");
            //Kode = input.nextLine();
            //System.out.print("Nama       : ");
            //Nama = input.nextLine();
            //System.out.print("SKS        : ");
            //Dummy = input.nextLine();
            //SKS = Integer.parseInt(Dummy);
            //System.out.print("Jumlah Jam : ");
            //Dummy = input.nextLine();
            //JumlahJam = Integer.parseInt(Dummy);

            arrayofMataKuliah21[i] = new MataKuliah21();
            arrayofMataKuliah21[i].tambahData(input);

            //arrayofMataKuliah21[i] = new MataKuliah21(Kode, Nama, SKS, JumlahJam);
        }

        System.out.println("--- Daftar Mata Kuliah ---");
        for (int i = 0; i < arrayofMataKuliah21.length; i++) {
            System.out.println("Data Mata Kuliah Ke- "+ (i + 1));
            System.out.println("Kode              : "+arrayofMataKuliah21[i].Kode);
            System.out.println("Nama              : "+arrayofMataKuliah21[i].Nama);
            System.out.println("SKS               : "+arrayofMataKuliah21[i].SKS);
            System.out.println("Jumlah Jam        : "+arrayofMataKuliah21[i].JumlahJam);
            System.out.println("--------------------------------");

        }

        System.out.println("\n=== CETAK INFO MATA KULIAH ===");
        for (int i = 0; i < arrayofMataKuliah21.length; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i + 1));
            arrayofMataKuliah21[i].CetakInfo();
        }
    }
}
