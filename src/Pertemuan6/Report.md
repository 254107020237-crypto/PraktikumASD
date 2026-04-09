|  | Praktikum Algoritma dan Struktur Data |
|--|--|
| NIM | 25407020237 |
| Nama | Muhammad Akbar Raffi Putra Susanto  |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/254107020237-crypto/PraktikumASD

# JOBSHEET 5

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan Object

``` java
package Pertemuan_5;

package Pertemuan6;

public class SortingMain21 {
public static void main(String[] args) {
    int A[]= {20, 10, 2, 7, 12};
    int B[]= {30, 20, 2, 8, 14};
    int C[]= {40, 10, 4, 9, 3};

    Sorting21 DataUrut1 = new Sorting21(A, A.length);
    Sorting21 DataUrut2 = new Sorting21(B, B.length);
    Sorting21 DataUrut3 = new Sorting21(C, C.length);

    System.out.println("Data Awal 1");
    DataUrut1.Tampil();
    DataUrut1.BubbleSort();
    System.out.println("Data sudah di urutkan dengan BUBBLE SORT (ASC)");
    DataUrut1.Tampil();

    System.out.println("Data Awal 2");
    DataUrut2.Tampil();
    DataUrut2.BubbleSort();
    System.out.println("Data sudah di urutkan dengan BUBBLE SORT (ASC)");
    DataUrut2.Tampil();

    System.out.println("Data Awal 3");
    DataUrut3.Tampil();
    DataUrut3.BubbleSort();
    System.out.println("Data sudah di urutkan dengan BUBBLE SORT (ASC)");
    DataUrut3.Tampil();
}
}
```
## Hasil Run

``` java
Data Awal 1
20 10 2 7 12
Data sudah di urutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20
Data Awal 2
30 20 2 8 14
Data sudah di urutkan dengan BUBBLE SORT (ASC)
2 8 14 20 30
Data Awal 3
40 10 4 9 3
Data sudah di urutkan dengan BUBBLE SORT (ASC)
3 4 9 10 40
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

### 5.2.5 Pertanyaan 

1. Jelaskan fungsi kode program berikut 

``` java 
if (Data[j-1] > Data[j]) {
                Temp=Data[j];
                Data[j]=Data[j-1];
                Data[j-1]=Temp;
            }
```

    - Untuk melakukan Swap atau Penukaran Nilai antara dua posisi di dalam sebuah array.

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!

``` java 
for (int i = 0; i < JumData-1; i++) {
        int Min=i;
        for (int j = i+1; j < JumData; j++) {
            if (Data[j]<Data[Min]) {
                Min=j;
            }
        }
}
```

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan

    - ondisi ini adalah perintah untuk "cari posisi dan geser data." j >= 0 berfungsi sebagai rem agar pengecekan tidak keluar dari batas array sementara Data[j] > Temp memastikan angka yang lebih besar terus digeser ke kanan. Perulangan akan berhenti tepat saat posisi yang pas untuk menyisipkan angka Temp sudah ditemukan.

4. Pada Insertion sort, apakah tujuan dari perintah

    - Untuk menemukan bahwa angka di sebelah kiri (Data[j]) lebih besar daripada angka yang sedang dipegang (Temp), maka angka tersebut harus dipindahkan satu slot ke depan untuk membuka ruang (celah). Perintah ini memastikan tidak ada data yang tertumpuk, melainkan hanya bergeser sementara sampai posisi yang benar-benar tepat untuk Temp ditemukan.

## 5.3 Praktikum 2 - (Sorting Menggunakan Array of Object)     
``` java 
package Pertemuan_5;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        MahasiswaBerprestasi21 List = new MahasiswaBerprestasi21();
        Mahasiswa21 M1 = new Mahasiswa21("123", "Zidan", "2A", 3.2);
        Mahasiswa21 M2 = new Mahasiswa21("124", "Ayu", "2A", 3.5);
        Mahasiswa21 M3 = new Mahasiswa21("125", "Sofi", "2A", 3.1);
        Mahasiswa21 M4 = new Mahasiswa21("126", "Sita", "2A", 3.9);
        Mahasiswa21 M5 = new Mahasiswa21("127", "Miki", "2A", 3.7);

        List.Tambah(M1);
        List.Tambah(M2);
        List.Tambah(M3);
        List.Tambah(M4);
        List.Tambah(M5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        List.Tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
        List.BubbleSort();
        List.Tampil();
        
    }
}
``` 

## Hasil Run

```java
Data Mahasiswa Sebelum Sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------------
Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) :
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------------
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

### 5.3.4 Pertanyaan 

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

``` java 
for (int i = 0; i < ListMhs.length-1; i++) {
    for (int j = 1; j < ListMhs.length-i; j++) {
    }
}
```

1. A. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?

        - Karena jika ada n data, kita hanya butuh n-1 langkah untuk mengurutkannya.

1. B. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?

        - Sebagai optimasi. Setiap satu tahap selesai, satu data terbesar sudah di posisi ujung.

1. C. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akanberlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

        - Perulangan i: Berlangsung 49 kali, ada 49 tahap pengurutan yang ditempuh.

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

## Kode Modifikasi 

``` java 
package Pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
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

            Mahasiswa21 m = new Mahasiswa21(NIM, Nama, Kelas, IPK);
            List.Tambah(m);
        }

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        List.Tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
        List.BubbleSort();
        List.Tampil();
        
    }
}
```

## Hasil Run Modifikasi 

``` java
Masukkan Data Nahasiswa Ke-1
NIM     : 123
Nama    : Ali
Kelas   : 2B
IPK     : 3.9
Masukkan Data Nahasiswa Ke-2
NIM     : 124
Nama    : Ila
Kelas   : 2B
IPK     : 3.1
Masukkan Data Nahasiswa Ke-3
NIM     : 125
Nama    : Agus
Kelas   : 2B
IPK     : 3.6
Masukkan Data Nahasiswa Ke-4
NIM     : 126
Nama    : Tika
Kelas   : 2B
IPK     : 3.3
Masukkan Data Nahasiswa Ke-5
NIM     : 127
Nama    : Udin
Kelas   : 2B
IPK     : 3.2
Data Mahasiswa Sebelum Sorting: 
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------------
Nama: Ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------------
Nama: Agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------------
Nama: Tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------------
Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) :
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------------
Nama: Agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------------
Nama: Tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------------
Nama: Ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------------
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD>
```

## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

``` java 
void SelectionSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            int IdxMin=i;
            for (int j = i+1; j < ListMhs.length; j++) {
                if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) {
                    IdxMin=j;
                }
            }
            Mahasiswa21 Tpm = ListMhs[IdxMin];
            ListMhs[IdxMin] = ListMhs[i];
            ListMhs[i] = Tpm;
        }
    }

System.out.println("Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)");
List.SelectionSort();
List.Tampil();
```

## Hasil Run 

``` java 
Masukkan Data Nahasiswa Ke-1
NIM     : 123
Nama    : Ali
Kelas   : 2B
IPK     : 3.9
Masukkan Data Nahasiswa Ke-2
NIM     : 124
Nama    : Ila
Kelas   : 2B
IPK     : 3.1
Masukkan Data Nahasiswa Ke-3
NIM     : 125
Nama    : Agus
Kelas   : 2B
IPK     : 3.6
Masukkan Data Nahasiswa Ke-4
NIM     : 126
Nama    : Tika
Kelas   : 2B
IPK     : 3.3
Masukkan Data Nahasiswa Ke-5
NIM     : 127
Nama    : Udin
Kelas   : 2B
IPK     : 3.2

Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)
Nama: Ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------------
Nama: Udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------------
Nama: Tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------------
Nama: Agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------------
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------------
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

## 5.3.7 Pertanyaan

1. Di dalam method selection sort, jelaskan baris program seperti di bawah ini:

``` java
int IdxMin=i; 
for (int j = i+1; j < ListMhs.length; j++) { 
    if (ListMhs[j].IPK < ListMhs[IdxMin].IPK) { 
        IdxMin=j; 
    }
}
```

    - Berfungsi untuk mencari IPK paling kecil dalam array mulai dari indeks i. Jika ditemukan nilai yang lebih kecil, indeksnya disimpan di IdxMin untuk nanti ditukar ke posisi depan agar data terurut naik (ascending).

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

``` java 
void InsertionSort(){
    for (int i = 1; i < ListMhs.length; i++) {
        Mahasiswa21 Temp = ListMhs[i];
        int j=i;
        while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
            ListMhs[j] = ListMhs[j - 1];
            j--;
        }
        ListMhs[j] = Temp;
    }
}

System.out.println("Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)");
List.InsertionSort();
List.Tampil();
```

## Hasil Run

``` java 
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : Ayu
Kelas   : 2C
IPK     : 3.7
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : Dika
Kelas   : 2C
IPK     : 3.0
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : Ila
Kelas   : 2C
IPK     : 3.8
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : Suci
Kelas   : 2C
IPK     : 3.1
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : Yayuk
Kelas   : 2C
IPK     : 3.4

Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)
Nama: Dika
NIM: 222
Kelas: 2C
IPK: 3.0
----------------------------
Nama: Suci
NIM: 444
Kelas: 2C
IPK: 3.1
----------------------------
Nama: Yayuk
NIM: 555
Kelas: 2C
IPK: 3.4
----------------------------
Nama: Ayu
NIM: 111
Kelas: 2C
IPK: 3.7
----------------------------
Nama: Ila
NIM: 333
Kelas: 2C
IPK: 3.8
----------------------------
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```

### 5.4.3 Pertanyaan

1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending

## Kode Modifikasi
``` java 
for (int i = 1; i > ListMhs.length; i++) {
}
```

## 5.5 Latihan Praktikum

## Kode Tugas Data Dosen

``` java 
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
```

## Hasil Run Tugas Data Dosen

``` java 
=== MENU ===
1. Tambah Data Dosen
2. Tampil Data
3. Sorting ASC (Termuda ? Tertua)
4. Sorting DSC (Tertua ? Termuda)
5. Keluar
Pilih: 5
PS D:\Kuliah\Semester 2\Praktikum Algoritma Dan Struktur Data\PraktikumASD> 
```






