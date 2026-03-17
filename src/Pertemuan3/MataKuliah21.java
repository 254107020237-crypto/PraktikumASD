package Pertemuan3;

import java.util.Scanner;

public class MataKuliah21 {
    public String Kode;
    public String Nama;
    public int SKS;
    public int JumlahJam;

    public MataKuliah21 (String Kode, String Nama, int SKS, int JumlahJam){
        this.Kode = Kode;
        this.Nama = Nama;
        this.SKS = SKS;
        this.JumlahJam = JumlahJam;
    }

    public MataKuliah21() {
        this.Kode = "";
        this.Nama = "";
        this.SKS = 0;
        this.JumlahJam = 0;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.Kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.Nama = sc.nextLine();
        System.out.print("SKS        : ");
        String dummySks = sc.nextLine();
        this.SKS = Integer.parseInt(dummySks);
        System.out.print("Jumlah Jam : ");
        String dummyJam = sc.nextLine();
        this.JumlahJam = Integer.parseInt(dummyJam);
        System.out.println("--------------------------------");
    }

    public void CetakInfo() {
        System.out.println("Kode       : " + Kode);
        System.out.println("Nama       : " + Nama);
        System.out.println("SKS        : " + SKS);
        System.out.println("Jumlah Jam : " + JumlahJam);
        System.out.println("--------------------------------");
    }

}
