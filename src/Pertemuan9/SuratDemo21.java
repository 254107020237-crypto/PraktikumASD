package Pertemuan9;

import java.util.Scanner;
import java.util.Stack;

public class SuratDemo21 {
    public static void main(String[] args) {
    StackSurat21 Stack = new StackSurat21(5);
    Scanner Akbar21 = new Scanner(System.in);
    int Pilih;

    do {
        System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            Pilih = Akbar21.nextInt();
            Akbar21.nextLine();     
            
            switch (Pilih) {
                case 1:
                    System.out.print("ID: ");
                    String ID = Akbar21.nextLine();
                    System.out.print("Nama: ");
                    String Nama = Akbar21.nextLine();
                    System.out.print("Kelas: ");
                    String Kelas = Akbar21.nextLine();
                    System.out.print("Jenis (L/P): ");
                    char Jenis = Akbar21.next().charAt(0);
                    System.out.print("Durasi: ");
                    int Durasi = Akbar21.nextInt();
                    Akbar21.nextLine();

                    Stack.Push(new Surat21(ID, Nama, Kelas, Jenis, Durasi));
                    break;

                case 2:
                    Surat21 s = Stack.POP();
                    if (s != null) {
                        System.out.println("Memproses surat:");
                        s.tampil();
                    }
                    break;

                case 3:
                     Surat21 top = Stack.Peek();
                    if (top != null) {
                        System.out.println("Surat terakhir:");
                        top.tampil();
                    }
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = Akbar21.nextLine().trim();
                    Stack.Cari(cari);
                    break;
            }
         } while (Pilih != 5);
    }
}
