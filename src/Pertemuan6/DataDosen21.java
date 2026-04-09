package Pertemuan6;

public class DataDosen21 {
    Dosen21[] DataDosen = new Dosen21[10];
    int Idx;

    void Tambah(Dosen21 dsn) {
        if (Idx < DataDosen.length) {
            DataDosen[Idx] = dsn;
            Idx++;
        } else {
            System.out.println("Data Penuh");
        }
    }

    void Tampil() {
        for (int i = 0; i < Idx; i++) {
            DataDosen[i].tampil();
        }
    }

    void SortingASC() {
        for (int i = 0; i < Idx - 1; i++) {
            for (int j = 0; j < Idx - i - 1; j++) {
                if (DataDosen[j].Usia > DataDosen[j + 1].Usia) {
                    Dosen21 tmp = DataDosen[j];
                    DataDosen[j] = DataDosen[j + 1];
                    DataDosen[j + 1] = tmp;
                }
            }
        }
    }

    void SortingDSC(){
        for (int i = 0; i < Idx; i++) {
            int Max = i;
            for (int j = i + 1; j < Idx; j++) {
                if (DataDosen[j].Usia > DataDosen[Max].Usia) {
                    Max = j;
                }
            }
            Dosen21 Tmp = DataDosen[Max];
            DataDosen[Max] = DataDosen[i];
            DataDosen[i] = Tmp;
        }
    }
}
