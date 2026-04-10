|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 25407020237 |
| Nama | Muhammad Akbar Raffi Putra Susanto  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/254107020237-crypto/PraktikumASD

## JOBSHEET VI

## 6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search

## Kode Program 
``` java 
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
```

# Hasil Run 

``` java 
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.6
---------------------------------
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : Tio
Kelas   : 2
IPK     : 3.8
---------------------------------
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : Ila
Kelas   : 2
IPK     : 3.0
---------------------------------
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : Lia
Kelas   : 2
IPK     : 3.5
---------------------------------
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : Fia
Nama: Adi
NIM: 111
Kelas: 2
IPK: 3.6
----------------------------
Nama: Tio
NIM: 222
Kelas: 2
IPK: 3.8
----------------------------
Nama: Ila
NIM: 333
Kelas: 2
IPK: 3.0
----------------------------
Nama: Lia
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: Fia
NIM: 555
Kelas: 2
IPK: 3.3
----------------------------
-----------------------------------------------------------
Pencarian Data
-----------------------------------------------------------
Masukkan IPK Mahasiswa yang Dicari:
IPK: 3.5
Menggunakan Sequential Searching
Data Mahasiswa dengan IPK: 3.5 Ditemukan pada Indeks 3
NIM     : 444
Nama    : Lia
Kelas   : 2
IPK     : 3.5
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

### 6.2.3. Pertanyaan

1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!

    - TampilPosisi hanya menampilkan informasi posisi/indeks di mana data ditemukan, tanpa menampilkan detail datanya. Contoh output: "data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3".

    - Sedangkan tampilDataSearch menampilkan detail lengkap data mahasiswa (nim, nama, kelas, ipk) yang ditemukan pada indeks tersebut. Keduanya sama-sama menerima parameter pos untuk mengecek apakah data ditemukan (pos != -1) atau tidak.

2. Jelaskan fungsi break pada kode program di bawah ini!

``` java 
if (ListMhs[j].IPK == Cari) {
    Posisi=j;
    break;
}
```

   - Break berfungsi untuk menghentikan perulangan for lebih awal begitu data yang dicari sudah ditemukan. Tanpa break, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ketemu, yang berarti membuang waktu komputasi. Dengan break, program langsung keluar dari loop sehingga lebih efisien. 

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

    - Variabel pos berfungsi sebagai penanda lokasi (indeks array) di mana data yang dicari ditemukan. Nilai awalnya -1 sebagai tanda bahwa data belum/tidak ditemukan. Jika data ditemukan, pos diisi dengan nilai indeks j tempat data tersebut berada. Nilai pos ini kemudian digunakan oleh method tampilPosisi dan tampilDataSearch untuk menentukan apakah data berhasil ditemukan atau tidak, serta untuk mengakses elemen listMhs[pos].

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan?

    - kan menampilkan data yang pertama kali ditemukan (indeks terkecil). Karena pada sequential search loop berjalan dari indeks 0 ke atas, dan begitu data pertama yang cocok ditemukan langsung dieksekusi break sehingga loop berhenti. Data kedua yang nilainya sama tidak akan pernah dicapai.

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?

    - Jika break dihapus, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ditemukan di tengah. Akibatnya, jika ada lebih dari satu data dengan nilai IPK yang sama, variabel posisi akan terus ditimpa (overwrite) dengan indeks yang lebih baru. Sehingga hasil akhirnya bukan data pertama yang ditemukan, melainkan data terakhir yang memiliki nilai sama. Selain itu, performa menjadi lebih buruk karena tidak ada early exit.

## 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

## Kode Program 

``` java 
stem.out.println("-----------------------------------------------------------");
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
```

## Hasil Rul 

``` java 
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.1
---------------------------------
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : Ila
Kelas   : 2
IPK     : 3.2
---------------------------------
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : Lia
Kelas   : 2
IPK     : 3.3
---------------------------------
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : Suci
Kelas   : 2
IPK     : 3.5
---------------------------------
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : Anita 
Kelas   : 2
IPK     : 3.7
---------------------------------
Nama: Adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------------
Nama: Ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------------
Nama: Lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------------
Nama: Suci
NIM: 444
Kelas: 2
IPK: 3.5
----------------------------
Nama: Anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------------
-----------------------------------------------------------
Pencarian Data
-----------------------------------------------------------
Masukkan IPK Mahasiswa yang Dicari:
IPK: 3.7
Menggunakan Sequential Searching
Data Mahasiswa dengan IPK: 3.7 Ditemukan pada Indeks 4
NIM     : 555
Nama    : Anita
Kelas   : 2
IPK     : 3.7
-----------------------------------------------------------
Pencarian Data
-----------------------------------------------------------
Masukkan IPK Mahasiswa yang Dicari:
IPK: 3.7
-----------------------------
  Menggunakan Binary Search
-----------------------------
Data Mahasiswa dengan IPK: 3.7 Ditemukan pada Indeks 4
NIM     : 555
Nama    : Anita
Kelas   : 2
IPK     : 3.7
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

### 6.3.3. Pertanyaan

1. Tunjukkan pada kode program yang mana proses divide dijalankan!

    - mid = (left + right) / 2;

2.  Tunjukkan pada kode program yang mana proses conquer dijalankan!

    -     else if (listMhs[mid].ipk > cari) {
            return findBinarySearch(cari, left, mid - 1);  // cari di bagian kiri
            } else {
                return findBinarySearch(cari, mid + 1, right); // cari di bagian kanan
            }

3.  Apa fungsi left, right, dan mid?

    - Left → batas indeks paling kiri dari rentang array yang sedang ditelusuri. Awalnya bernilai 0.
    - Right → batas indeks paling kanan dari rentang array yang sedang ditelusuri. Awalnya bernilai n-1.
    - Mid → indeks tengah yang dihitung dari (left + right) / 2. Digunakan sebagai titik perbandingan untuk menentukan apakah pencarian dilanjutkan ke kiri atau ke kanan.

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?

    - Program tetap bisa berjalan (tidak error), namun hasilnya bisa salah atau data tidak ditemukan meskipun sebenarnya ada. Binary search mengasumsikan data sudah terurut. Jika tidak urut, logika perbandingan left dan right yang mempersempit rentang pencarian menjadi tidak valid — program bisa "salah arah" membuang sisi yang justru berisi data yang dicari, sehingga mengembalikan -1 (tidak ditemukan) secara keliru.

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai?

    - Hasilnya tidak akan ditemukan (return -1). Karena kode asli mengasumsikan data urut ascending, sedangkan data dimasukkan secara descending. Pada kondisi ini ketika listMhs[mid].ipk > cari, program akan mencari ke kiri — padahal data yang lebih kecil justru ada di kanan.

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array?

    - Binary search menentukan data tidak ditemukan ketika kondisi right >= left tidak lagi terpenuhi, yaitu saat right < left. Ini berarti rentang pencarian sudah habis dipersempit hingga tidak ada elemen tersisa untuk diperiksa, namun tidak ada yang cocok. Pada titik itu fungsi mengembalikan nilai -1 sebagai tanda data tidak ada dalam array.

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard?

## CM

``` java 
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
```

## Hasil Run

``` java 
=== SISTEM PEMINJAMAN ===
1. Tampilkan Mahasiswa
2. Tampilkan Buku
3. Tampilkan Peminjaman
4. Urutkan Berdasarkan Denda
5. Cari Berdasarkan NIM
6. Keluar
Pilih: 6
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```



