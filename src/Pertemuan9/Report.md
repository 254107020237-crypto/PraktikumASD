|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 25407020237 |
| Nama | Muhammad Akbar Raffi Putra Susanto  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/254107020237-crypto/PraktikumASD

## JOBSHEET IX

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas

## Kode Program

``` java
package Pertemuan9;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);
        Scanner Akbar21 = new Scanner(System.in);

        int Pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Melihat tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
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
                    stack.Push(MHS);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", MHS.Nama);
                    break;
                case 2:
                    Mahasiswa21 Dinilai = stack.POP();
                    if (Dinilai != null) {
                        System.out.println("Menilai tugas dari " + Dinilai.Nama);
                        System.out.print("Masukkan nilai (0 -100): ");
                        int Nilai = Akbar21.nextInt();
                        Dinilai.TugasDinilai(Nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", Dinilai.Nama, Nilai);
                    }
                    break;
                case 3:
                    Mahasiswa21 Lihat = stack.Peek();
                    if (Lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + Lihat.Nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.Print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (Pilih >= 1 && Pilih <= 4);
    }
}
```

## Hasil Run

``` java
Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0 -100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

### 2.1.3 Pertanyaan

1.  Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?

    - Perbaikan terdapat pada menu dan output program agar semua fitur berjalan dan data dapat ditampilkan dengan benar.

---
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

    - Potongan kode program.

    ``` java
    StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);
    ```

3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?

    - Pengecekan digunakan agar data tidak melebihi kapasitas stack. Tanpa pengecekan ini, bisa terjadi error karena array penuh.

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

    - Kode Modifikasi

    ``` java
    public Mahasiswa21 LihatBawah() {
            if (!IsEmpty()) {
                return stack[0];
            } else {
                System.out.println("Stack kosong!");
                return null;
            }
        }
    ```

    - Hasil Run

    ```java
    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    Pilih: 1
    Nama: Dila
    NIM: 1001
    Kelas: 1A
    Tugas Dila berhasil dikumpulkan

    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    Pilih: 1
    Nama: Erik
    NIM: 1002
    Kelas: 1B
    Tugas Erik berhasil dikumpulkan

    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    Pilih: 5
    Tugas pertama dikumpulkan oleh Dila
    PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
    ```

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!

    - Kode Modifikasi

    ``` java
    public  int JumlahTugas() {
            return Top + 1;
    }
    ```

    - Hasil Run
    
    ``` java
    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    6. Jumlah Tugas Terkumpul
    Pilih: 1
    Nama: Dila
    NIM: 1001
    Kelas: 1A
    Tugas Dila berhasil dikumpulkan

    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    6. Jumlah Tugas Terkumpul
    Pilih: 1   
    Nama: Erik
    NIM: 1002
    Kelas: 1B
    Tugas Erik berhasil dikumpulkan

    Menu:
    1. Mengumpulkan Tugas
    2. Melihat tugas
    3. Melihat Tugas Teratas
    4. Melihat Daftar Tugas
    5. Melihat Tugas Terbawah
    6. Jumlah Tugas Terkumpul
    Pilih: 6
    Jumlah tugas saat ini 2
    PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
    ```

## 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner 

## Kode Program
``` java 
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
        } while (Pilih >= 1 && Pilih <= 6);
    }
}
```

## Hasil Run
``` java
Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Mengumpulkan Tugas
2. Melihat tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0 -100): 87
Nilai Tugas Tika adalah 87
Nilai Biner Tugas: 1010111
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

### 2.2.3 Pertanyaan

1. Jelaskan alur kerja dari method konversiDesimalKeBiner!

    - Dengan mengubah bilangan desimal ke biner dengan membagi nilai secara berulang dengan 2 dan menyimpan sisanya ke dalam stack. Karena stack bersifat LIFO, saat diambil kembali urutannya menjadi benar sehingga menghasilkan nilai biner.

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!

    - Jika kondisi diubah menjadi while (kode != 0), hasilnya tetap sama karena perulangan tetap berjalan sampai nilai menjadi 0 Perbedaannya hanya pada pengecekan, di mana != 0 lebih umum dibanding > 0.

## 2.4 Latihan Praktikum

## Kode Program

``` java
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
```

## Hasil Run

``` java
Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID: 1001
Nama: Budi
Kelas: 1C
Jenis (L/P): L
Durasi: 1

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 1
ID: 1002
Nama: Siti
Kelas: 1B
Jenis (L/P): P
Durasi: 2

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 2
Memproses surat:
1002    Siti    1B      P       2

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 3
Surat terakhir:
1001    Budi    1C      L       1

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 4
Cari nama: Budi
1001    Budi    1C      L       1

Menu:
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Terakhir
4. Cari Surat
5. Keluar
Pilih: 5
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```
