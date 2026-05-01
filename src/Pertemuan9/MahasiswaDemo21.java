package Pertemuan9;

import java.util.Scanner;
import java.util.Stack;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        StackTugasMahasiswa21 Stack = new StackTugasMahasiswa21(5);
        Scanner Akbar21 = new Scanner(System.in);

        int Pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Melihat tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas Terkumpul");
            System.out.print("Pilih: ");
            Pilih = Akbar21.nextInt();
            Akbar21.nextLine();
            switch (Pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String Nama = Akbar21.nextLine();
                    System.out.print("NIM: ");
                    String NIM = Akbar21.nextLine();
                    System.out.print("Kelas: ");
                    String Kelas = Akbar21.nextLine();
                    Mahasiswa21 MHS = new Mahasiswa21(Nama, NIM, Kelas);
                    Stack.Push(MHS);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", MHS.Nama);
                    break;
                case 2:
                    Mahasiswa21 Dinilai = Stack.POP();
                    if (Dinilai != null) {
                        System.out.println("Menilai tugas dari " + Dinilai.Nama);
                        System.out.print("Masukkan nilai (0 -100): ");
                        int Nilai = Akbar21.nextInt();
                        Dinilai.TugasDinilai(Nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", Dinilai.Nama, Nilai);
                        // Praktikum 2 
                        String biner = Stack.KonversiDesimalkeBiner(Nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa21 Lihat = Stack.Peek();
                    if (Lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + Lihat.Nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    Stack.Print();
                    break;

                case 5:
                    Mahasiswa21 Bawah = Stack.LihatBawah();
                    if (Bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + Bawah.Nama);
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas saat ini " + Stack.JumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (Pilih >= 1 && Pilih <= 7);
    }
}
