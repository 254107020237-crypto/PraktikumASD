package Pertemuan6;

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
        for (Mahasiswa21 M:ListMhs){
            M.TampilInformasi();
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
        for (int i = 1; i > ListMhs.length; i++) {
            Mahasiswa21 Temp = ListMhs[i];
            int j=i;
            while (j > 0 && ListMhs[j - 1].IPK > Temp.IPK) {
                ListMhs[j] = ListMhs[j - 1];
                j--;
            }
            ListMhs[j] = Temp;
        }
    }
}
