|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 254107020237 |
| Nama | Muhammad Akbar Raffi Putra Susanto  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/254107020237-crypto/PraktikumASD


## JOBSHEET X

## 2. Praktikum 1

## 2.1 Percobaan 1 : Operasi Dasar Queue

## Kode Program

``` java
package Pertemuan10;

import java.util.Scanner;

public class QueueMain {
   
    public static void Menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1.  Enqueue");
        System.out.println("2.  Dequeue");
        System.out.println("3.  Print");
        System.out.println("4.  Peek");
        System.out.println("5.  Clear");
        System.out.println("============================");
    }

    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int N = Akbar21.nextInt();

        Queue Q = new Queue(N);

        int Pilih;

        do {
            Menu();
            Pilih = Akbar21.nextInt();
            switch (Pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int DataMasuk = Akbar21.nextInt();
                    Q.Enqueue(DataMasuk);
                    break;
                case 2:
                    int DataKeluar = Q.Dequeue();
                    if (DataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + DataKeluar);
                    } 
                    break;
                case 3:
                    Q.Print();
                    break;
                case 4: 
                    Q.Peek();
                    break;
                case 5:
                    Q.Clear();
                    break;
            }
        } while (Pilih == 1 || Pilih ==2 || Pilih == 3 || Pilih ==4 || Pilih ==5);
    }
}
```

## Hasil Run 

``` java 
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
4
Elemen terdapan: 15
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

### 2.1.3. Pertanyaan

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

    - antrean masih kosong dan belum menunjuk ke indeks array mana pun, sementara size = 0 menunjukkan jumlah elemen yang tersimpan memang belum ada.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    - Berfungsi untuk memindahkan rear kembali ke indeks 0 jika rear sudah mencapai batas akhir array (max - 1), asalkan antrean belum penuh. Ini  memungkinkan penggunaan kembali ruang kosong di bagian depan array yang mungkin sudah ditinggalkan oleh proses Dequeue.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    - Berfungsi untuk memutar posisi front. Jika data yang diambil berada di indeks terakhir array, maka posisi front berikutnya akan bergeser kembali ke indeks 0.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?

    - Karena dalam Queue, data yang pertama kali akan keluar (dan data tertua) berada di posisi front. Data tidak selalu dimulai dari indeks 0 karena posisi front terus bergeser setiap kali ada proses Dequeue.

5.  Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

    - Jika i belum mencapai max - 1, maka i hanya bertambah 1. Jika i sudah mencapai max - 1, maka (max - 1 + 1) % max hasilnya adalah 0. Ini memastikan perulangan tetap berada di dalam rentang indeks array yang tersedia.

6. Tunjukkan potongan kode program yang merupakan queue overflow!

     ``` java
     if (IsFull()) {
    System.out.println("Qoueue sudah penuh");
    }
    ```

7. Modifikasi

- Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadiqueue overflow dan queue underflow, program dihentikan!

## Kode Program

``` java
public void Enqueue(int DT) {
    if (IsFull()) {
        System.out.println("Qoueue sudah penuh! Program dihentikan");
        System.exit(1);
    }
}
```

``` java 
public int Dequeue() {
    int DT = 0;
    if (IsEmpty()) {
        System.out.println("Queue masih kosong! Program dihentikan");
        System.exit(1);
    }
}
```

## Hasil Run

``` java 
Masukkan kapasitas queue: 2
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1 
Masukkan data baru: 10
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 20
Masukkan operasi yang diinginkan:
1.  Enqueue
2.  Dequeue
3.  Print
4.  Peek
5.  Clear
============================
1
Masukkan data baru: 30
Qoueue sudah penuh! Program dihentikan
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

## 2.2. Percobaan 2 : Antrian Layanan Akademik

## Kode Program 

``` java 
package Pertemuan10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);
         AntianLayanan Antrian = new AntianLayanan(5);
         int Pilihan;

         do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            Pilihan = Akbar21.nextInt(); Akbar21.nextLine();  
            
            switch (Pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String NIM = Akbar21.nextLine();
                    System.out.print("Nama  : ");
                    String Nama = Akbar21.nextLine();
                    System.out.print("Prodi : ");
                    String Prodi = Akbar21.nextLine();
                    System.out.print("Kelas : ");
                    String Kelas = Akbar21.nextLine();
                    Mahasiswa MHS = new Mahasiswa(NIM, Nama, Prodi, Kelas);
                    Antrian.TambahAntian(MHS);
                    break; 
                case 2:
                    Mahasiswa diLayani = Antrian.LayaniMahasiswa();                
                    if (diLayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        diLayani.TampilkanData();
                    }
                    break;
                case 3:
                    Antrian.LihatTerdepan();
                    break;
                case 4:
                    Antrian.TampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + Antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (Pilihan != 0);
        Akbar21.close();
    }
}
```

## Hasil Run

``` java 
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian: 
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian: 
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima kasih.
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

### 2.2.3 Pertanyaan

- Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga method LihatAkhir dapat dipanggil!

## Kode Program 

``` java 
public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            Data[Rear].TampilkanData();
        }
    }    
```

``` java 
case 6:
    Antrian.lihatAkhir(); 
        break;
```

## Hasil Run 

``` java 
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian: 
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian: 
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 6
Mahasiswa paling belakang: 
NIM - NAMA - PRODI - KELAS
124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian paling belakang
0. Keluar
Pilih menu: 0
Terima kasih.
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

## 2.3 Tugas

## Kode Program 

``` java
package Pertemuan10;

import java.util.Scanner;

public class AntrianKRSMain21 {
    public static void main(String[] args) {
        Scanner Akbar21 = new Scanner(System.in);

        AntrianKRS21 Antrian = new AntrianKRS21(10, 30);

        int Pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan Dua Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Jumlah Antrian");
            System.out.println("7.  Jumlah yang Sudah Proses KRS");
            System.out.println("8.  Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("9.  Cek Antrian Kosong");
            System.out.println("10. Cek Antrian Penuh");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            Pilihan = Akbar21.nextInt();
            Akbar21.nextLine();       
            
            switch (Pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String NIM = Akbar21.nextLine();
                    System.out.print("Nama  : ");
                    String Nama = Akbar21.nextLine();
                    System.out.print("Prodi : ");
                    String Prodi = Akbar21.nextLine();
                    System.out.print("Kelas : ");
                    String Kelas = Akbar21.nextLine();
                    Mahasiswa21 MHS = new Mahasiswa21(NIM, Nama, Prodi, Kelas);
                    Antrian.TambahAntrian(MHS);
                    break;                    
                case 2:
                    Antrian.PanggilKRS();
                    break;
                case 3:
                    Antrian.TampilkanSemua();
                    break;
                case 4:
                    Antrian.TampilkanduaTerdepan();
                    break;
                case 5:
                    Antrian.TampilkanAkhir();
                    break;
                case 6: 
                    System.out.println("Jumlah antrian saat ini: " + Antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah yang sudah proses KRS: " + Antrian.getTotalDilayani());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + Antrian.getMahasiswaBelumKRS());
                    break;
                case 9:
                    if (Antrian.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 10:
                    if (Antrian.IsFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 11:
                    Antrian.KosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                    default:
                        System.out.println("Pilihan tidak valid.");
            }
        } while (Pilihan != 0);
    }
}

``` 

## Hasil Run

``` java
=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi Berhasil masuk ke antrian. Nomor Antrian: 1

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 1
NIM   : 124
Nama  : Edo
Prodi : TI
Kelas : 1B
Edo Berhasil masuk ke antrian. Nomor Antrian: 2

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 1
NIM   : 125
Nama  : Lina
Prodi : TI
Kelas : 1F
Lina Berhasil masuk ke antrian. Nomor Antrian: 3

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 2
Memanggil mahasiswa untuk proses KRS:
NIM - Nama - Prodi - Kelas
1. 123 - Aldi - TI - 1A
2. 124 - Edo - TI - 1B

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 3
Daftar mahasiwa dalam antrian: 
NIM - Nama - Prodi - Kelas
1. 125 - Lina - TI - 1F

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 4
Dua Mahasiswa Terdepan: 
NIM - Nama - Prodi - Kelas
1. 125 - Lina - TI - 1F
Tidak ada mahsiswa lagi.

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 5
Mahasiswa paling akhir: 
NIM - Nama - Prodi - Kelas
125 - Lina - TI - 1F

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 6
Jumlah antrian saat ini: 1

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 7
Jumlah yang sudah proses KRS: 2

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 8
Jumlah mahasiswa belum proses KRS: 1

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 9
Antrian tidak kosong.

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 10
Antrian belum penuh.

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 11
Antrian berhasil dikosongkan.

=== Menu Antrian Persetujuan KRS ===
1.  Tambah Mahasiswa ke Antrian
2.  Panggil Antrian untuk Proses KRS (2 mahasiswa)
3.  Tampilkan Semua Antrian
4.  Tampilkan Dua Antrian Terdepan
5.  Tampilkan Antrian Paling Akhir
6.  Jumlah Antrian
7.  Jumlah yang Sudah Proses KRS
8.  Jumlah Mahasiswa Belum Proses KRS
9.  Cek Antrian Kosong
10. Cek Antrian Penuh
11. Kosongkan Antrian
0.  Keluar
Pilih menu: 0
Terima kasih
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```



