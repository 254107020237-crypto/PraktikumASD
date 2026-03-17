package Pertemuan5;

import java.util.Scanner;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NilaiMahasiswa[] mhs ={
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int[] UTS = new int[mhs.length];
        for (int i = 0; i < mhs.length; i++) {
            UTS[i] = mhs[i].NilaiUTS;
        }

        NilaiMahasiswa p = new NilaiMahasiswa("", "", 0, 0, 0);

        System.out.println("Nilai Mahasiswa UTS Tertinggi: "+ p.TertinggiUTS(UTS, 0, UTS.length - 1));
        System.out.println("Nilai Mahasiswa UTS Terendah: "+ p.TerendahUTS(UTS, 0, UTS.length - 1));
        System.out.println("Rata-rata Nilai UAS: " + p.RataRataUAS(mhs));

    }
}
