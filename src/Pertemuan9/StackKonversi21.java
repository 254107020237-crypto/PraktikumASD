package Pertemuan9;

public class StackKonversi21 {
    int[] TumpukanBiner;
    int Size;
    int Top;

    public StackKonversi21() {
        this.Size = 32;
        TumpukanBiner = new int[Size];
        Top = -1;
    }

    public boolean IsEmpty() {
        return Top == -1;
    }

    public boolean IsFull() {
        return Top == Size - 1;
    }

    public void Push(int Data) {
        if (IsFull()) {
            System.out.println("Stack penuh");
        } else {
            Top++;
            TumpukanBiner[Top] = Data;
        }
    }

    public int POP() {
        if (IsEmpty()) {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int Data = TumpukanBiner[Top];
            Top--;
            return Data;
        }
    }
}
