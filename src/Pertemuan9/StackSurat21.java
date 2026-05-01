package Pertemuan9;

public class StackSurat21 {
    Surat21[] Stack;
    int Top;
    int Size;

    public StackSurat21(int Size) {
        this.Size = Size;
        Stack = new Surat21[Size];
        Top = -1;
    }

    public boolean IsFull() {
        return Top == Size -1;
    }

    public boolean IsEmpty() {
        return Top == -1;
    }

    public void Push(Surat21 s) {
        if (!IsFull()) {
            Top++;
            Stack[Top] = s;
        } else {
            System.out.println("Stack penuh.");
        }
    }

    public Surat21 POP() {
        if (!IsEmpty()) {
            return Stack[Top--];
        } else {
            System.out.println("Stack Kosong!");
            return null;
        }
    }

    public Surat21 Peek() {
        if (!IsEmpty()) {
            return Stack[Top];
        } else {
            return null;
        }
    }

    public void Cari(String Nama) {
        if (IsEmpty()) {
            System.out.println("Stack masih kosong!");
            return;
        }
        boolean Ketemu = false;
        for (int i = Top; i >= 0; i--) {
            if (Stack[i].NamaMahasiswa.trim().equalsIgnoreCase(Nama.trim())) {
                Stack[i].tampil();
                Ketemu = true;
            }
        }
        if (!Ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
