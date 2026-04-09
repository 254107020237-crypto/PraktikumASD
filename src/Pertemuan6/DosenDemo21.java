package Pertemuan6;

import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
        DataDosen21 List = new DataDosen21();
        int Pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            Pilih = Akbar21.nextInt();
            Akbar21.nextLine();

            switch (Pilih) {
                case 1:
                    System.out.print("Kode   : ");
                    String KD = Akbar21.nextLine();
                    System.out.print("Nama   : ");
                    String NM = Akbar21.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean JK = Akbar21.nextBoolean();
                    System.out.print("Usia   : ");
                    int Usia = Akbar21.nextInt();

                    List.Tambah(new Dosen21(KD, NM, JK, Usia));
                    break;
                case 2:
                    List.Tampil();
                    break;

                case 3:
                    List.SortingASC();
                    System.out.println("Data sudah Diurutkan ASC");
                    List.Tampil();
                    break;
            
                case 4:
                    List.SortingDSC();
                    System.out.println("Data sudah Diurutkan DSC");
                    List.Tampil();
                    break;
            }
        } while (Pilih != 5);
    }
}
