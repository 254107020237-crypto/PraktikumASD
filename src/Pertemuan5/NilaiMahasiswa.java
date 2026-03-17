package Pertemuan5;

public class NilaiMahasiswa {
    String Nama, NIM;
    int TahunMasuk, NilaiUTS, NilaiUAS;

    NilaiMahasiswa(String Nama, String NIM, int Tahun, int UTS, int UAS){
        this.Nama = Nama;
        this.NIM = NIM;
        this.TahunMasuk = Tahun;
        this.NilaiUTS = UTS;
        this.NilaiUAS = UAS;
    }

    int TertinggiUTS(int arr[], int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r)/2;
        int lTertinggi = TertinggiUTS(arr, l, mid);
        int rTertinggi = TertinggiUTS(arr, mid+1, r);
        return Math.max(lTertinggi, rTertinggi);
    }

    int TerendahUTS(int arr[], int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r)/2;
        int lTerendah = TerendahUTS(arr, l, mid);
        int rTerendah = TerendahUTS(arr, mid+1, r);
        return Math.min(lTerendah, rTerendah);
    }

    int RataRataUAS(NilaiMahasiswa[] mhs){
        int Total = 0;
        for (int i = 0; i < mhs.length; i++) {
            Total += mhs[i].NilaiUAS;
        }
        return Total/mhs.length;
    }
}
