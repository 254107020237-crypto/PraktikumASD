package Pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa21[] arrayMahasiswa21 = new Mahasiswa21[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayMahasiswa21[i] = new Mahasiswa21();

            System.out.println("Masukkan Data Mahasiswa Ke- " + (i + 1));
            System.out.print("NIM       : ");
            arrayMahasiswa21[i].Nim = input.nextLine();
            System.out.print("Nama      : ");
            arrayMahasiswa21[i].Nama = input.nextLine();
            System.out.print("Kelas     : ");
            arrayMahasiswa21[i].Kelas = input.nextLine();
            System.out.print("IPK       : ");
            dummy = input.nextLine();
            arrayMahasiswa21[i].IPK = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa Ke- " + (i + 1 ));
            System.out.println("NIM       : " + arrayMahasiswa21[i].Nim);
            System.out.println("Nama      : " + arrayMahasiswa21[i].Nama);
            System.out.println("Kelas     : " + arrayMahasiswa21[i].Kelas);
            System.out.println("IPK       : " + arrayMahasiswa21[i].IPK);
        }

        System.out.println("Data Mahasiswa Yang Dimasukkan: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa Ke- " + (i + 1));
            arrayMahasiswa21[i].CetakInfo();
        }
    }
}