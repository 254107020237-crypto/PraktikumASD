package Pertemuan7;

import java.util.Scanner;

public class PerpustakaanDemo21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        Mahasiswa21_CM[] MHS = {
            new Mahasiswa21_CM("22001","Andi","TI"),
            new Mahasiswa21_CM("22002","Budi","TI"),
            new Mahasiswa21_CM("22003","Citra","SIB")
        };

          Buku21_CM[] Buku = {
            new Buku21_CM("B001","Algoritma",2020),
            new Buku21_CM("B002","Basis Data",2019),
            new Buku21_CM("B003","Pemrograman",2021),
            new Buku21_CM("B004","Fisika",2024)
        };

        Peminjaman21_CM[] Pinjam = {
            new Peminjaman21_CM(MHS[0], Buku[0],7),
            new Peminjaman21_CM(MHS[1], Buku[1],3),
            new Peminjaman21_CM(MHS[2], Buku[2],10),
            new Peminjaman21_CM(MHS[2], Buku[3],6),
            new Peminjaman21_CM(MHS[0], Buku[1],4)
        };

        int Pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            Pilih = Akbar21.nextInt();

            switch (Pilih) {
                case 1:
                    for(Mahasiswa21_CM m : MHS){
                        m.Tampil();
                    }
                    break;

                case 2:
                    for(Buku21_CM b : Buku){
                        b.Tampil();
                    }
                    break;

                case 3:
                    for(Peminjaman21_CM p : Pinjam){
                        p.Tampil();
                    }
                    break;

                case 4:
                    for(int i=1; i<Pinjam.length; i++){
                        Peminjaman21_CM temp = Pinjam[i];
                        int j = i;
                        while(j>0 && Pinjam[j-1].Denda < temp.Denda){
                            Pinjam[j] = Pinjam[j-1];
                            j--;
                        }
                        Pinjam[j] = temp;
                    }
                    System.out.println("Data berhasil diurutkan!");
                    break;
            
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String Cari = Akbar21.next();
                     boolean ketemu = false;
                    for(Peminjaman21_CM p : Pinjam){
                        if(p.MHS.NIM.equals(Cari)){
                            p.Tampil();
                            p.tampil();
                            ketemu = true;
                        }
                    }
                    if(!ketemu){
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
            }
        } while (Pilih != 6);
    }
}
