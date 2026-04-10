package Pertemuan7;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        //MahasiswaBerprestasi21 List = new MahasiswaBerprestasi21();
        Scanner Akbar21 = new Scanner(System.in);
        MahasiswaBerprestasi21 List = new MahasiswaBerprestasi21();
        int JmlMhs = 5;

        for (int i = 0; i < JmlMhs; i++) {
            System.out.println("Masukkan Data Nahasiswa Ke-" + (i+1));
            System.out.print("NIM     : ");
            String NIM = Akbar21.nextLine();
            System.out.print("Nama    : ");
            String Nama = Akbar21.nextLine();
            System.out.print("Kelas   : ");
            String Kelas = Akbar21.nextLine();
            System.out.print("IPK     : ");
            String InputIPK = Akbar21.nextLine();
            double IPK = Double.parseDouble(InputIPK);
            System.out.println("---------------------------------");

            List.Tambah(new Mahasiswa21(NIM, Nama, Kelas, IPK));

            //Mahasiswa21 m = new Mahasiswa21(NIM, Nama, Kelas, IPK);
            //List.Tambah(m);
        }
        //Mahasiswa21 M1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        //Mahasiswa21 M2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        //Mahasiswa21 M3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        //Mahasiswa21 M4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        //Mahasiswa21 M5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        //List.Tambah(M1);
        //List.Tambah(M2);
        //List.Tambah(M3);
        //List.Tambah(M4);
        //List.Tambah(M5);

        //System.out.println("Data Mahasiswa Sebelum Sorting: ");
        //List.Tampil();

        //System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
        //List.BubbleSort();
        //List.Tampil();

        //System.out.println("Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)");
        //List.SelectionSort();
        //List.Tampil();
        
        //System.out.println("Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)");
        //List.InsertionSort();
        //List.Tampil();

        List.Tampil();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        System.out.print("IPK: ");
        //double Cari = Akbar21.nextDouble();
        String inputCari = Akbar21.nextLine().replace(",", ".");
        double Cari = Double.parseDouble(inputCari);

        System.out.println("Menggunakan Sequential Searching");
        //double Posisi = List.SequentialSearching(Cari);
        int PSS = List.SequentialSearching(Cari);
        List.TampilPosisi(Cari, PSS);
        List.TampilDataSearch(Cari, PSS);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        System.out.print("IPK: ");
        //double cari = Akbar21.nextDouble();
        String inputCari2 = Akbar21.nextLine().replace(",", ".");
        double cari = Double.parseDouble(inputCari2);
        System.out.println("-----------------------------");
        System.out.println("  Menggunakan Binary Search");
        System.out.println("-----------------------------");
        double Posisi2 = List.FindBinarySearch(cari, 0, JmlMhs-1);
        int PSS2 = (int)Posisi2;
        List.TampilPosisi(Cari, PSS2);
        List.TampilDataSearch(Cari, PSS2);
    }
}