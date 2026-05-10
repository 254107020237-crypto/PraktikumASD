package Pertemuan10;

public class AntianLayanan {
    Mahasiswa[] Data;
    int Front;
    int Rear;
    int Size;
    int Max;

    public AntianLayanan(int Max) {
        this.Max = Max;
        this.Data = new Mahasiswa[Max];
        this.Front = 0;
        this.Rear = -1;
        this.Size = 0;
    }

    public boolean IsEmpty() {
       if (Size == 0) {
        return true;
       } else {
        return false;
       }
    }

    public boolean IsFull() {
        if (Size == Max) {
            return true;
        } else {
            return false;
        }
    }

    public void TambahAntian(Mahasiswa MHS) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        Rear = (Rear + 1) % Max;
        Data[Rear] = MHS;
        Size++;
        System.out.println(MHS.Nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa LayaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa MHS = Data[Front];
        Front = (Front + 1) % Max;
        Size--;
        return MHS;
    }

    public void LihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            Data[Front].TampilkanData();
        }
    }

    public void TampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < Size; i++) {
            int Index = (Front + i) % Max;
            System.out.print((i + 1) + ". ");
            Data[Index].TampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            Data[Rear].TampilkanData();
        }
    }    

    public int getJumlahAntrian() {
        return Size;
     
    }
}
