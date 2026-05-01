package Pertemuan9;

import java.util.Stack;

public class StackTugasMahasiswa21 {
    Mahasiswa21[] stack;
    int Top;
    int Size;

    public StackTugasMahasiswa21(int Size) {
        this.Size = Size;
        stack = new Mahasiswa21[Size];
        Top = -1;
    }

    public boolean IsFull() {
        if (Top == Size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (Top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void Push(Mahasiswa21 MHS) {
        if (!IsFull()) {
            Top++;
            stack[Top] = MHS;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa21 POP() {
        if (!IsEmpty()) {
            Mahasiswa21 M = stack[Top];
            Top--;
            return M;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa21 Peek() {
        if (!IsEmpty()) {
            return stack[Top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void Print() {
        for (int i = 0; i <= Top; i++) {
            System.out.println(stack[i].Nama + "\t" + stack[i].NIM + "\t" + stack[i].Kelas);
        }
        System.out.println("");
    }

    // No 4 Praktikum 1 
    public Mahasiswa21 LihatBawah() {
        if (!IsEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // No 5 Praktikum 1 
    public  int JumlahTugas() {
        return Top + 1;
    }

    // Praktikum 2 
   public String KonversiDesimalkeBiner(int Nilai) {
    StackKonversi21 Stack = new StackKonversi21();
    while (Nilai > 0) {
        int Sisa = Nilai % 2;
        Stack.Push(Sisa);
        Nilai = Nilai / 2;
    }
    String biner = new String();
    while (!Stack.IsEmpty()) {
        biner += Stack.POP();
    }
    return biner;
   }
}    
