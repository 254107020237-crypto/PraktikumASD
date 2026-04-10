package Pertemuan7;

public class MahasiswaBerprestasi21 {
    Mahasiswa21 [] ListMhs = new Mahasiswa21[5];
    int Idx;

    void Tambah(Mahasiswa21 M){
        if (Idx<ListMhs.length) {
            ListMhs[Idx]=M;
            Idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void Tampil(){
        for (int i = 0; i < Idx; i++) {
            ListMhs[i].TampilInformasi();
            System.out.println("----------------------------");
}
    }

    void BubbleSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            for (int j = 1; j < ListMhs.length-i; j++) {
                if (ListMhs[j].IPK>ListMhs[j-1].IPK) {
                    Mahasiswa21 tmp = ListMhs[j];
                    ListMhs[j]=ListMhs[j-1];
                    ListMhs[j-1]=tmp;
                }
            }
        }
    }

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

    int SequentialSearching(double Cari){
        int Posisi = -1;
        for (int j = 0; j < ListMhs.length; j++) {
            if (ListMhs[j].IPK == Cari) {
                Posisi=j;
                break;
            }
        }
        return Posisi;
    }

    void TampilPosisi(double X, int Pos){
        if (Pos != -1) {
            System.out.println("Data Mahasiswa dengan IPK: " +X+ " Ditemukan pada Indeks " + Pos);            
        }
        else {
            System.out.println("Data " +X+ "Tidak Ditemukan");
        }
    }

    void TampilDataSearch(double X, int Pos){
        if (Pos != -1) {
            System.out.println("NIM\t: "+ListMhs[Pos].NIM);
            System.out.println("Nama\t: "+ListMhs[Pos].Nama);
            System.out.println("Kelas\t: "+ListMhs[Pos].Kelas);
            System.out.println("IPK\t: " +X);
        }
        else {
            System.out.println("Data Mahasiswa dengan IPK " +X+ "Tidak Ditemukan");
        }
    }

    int FindBinarySearch(double Cari, int Left, int Right){
        int Mid;
        if (Right >= Left) {
            Mid = (Left + Right)/2;

            if (Cari == ListMhs[Mid].IPK) {
                return (Mid);
            }
            else if (ListMhs[Mid].IPK > Cari) {
                return FindBinarySearch(Cari, Left, Mid-1);
            }
            else {
                return FindBinarySearch(Cari, Mid+1, Right);
            }
        }
        return -1;
    }
}
