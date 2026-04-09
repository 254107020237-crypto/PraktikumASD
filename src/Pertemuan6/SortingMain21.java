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
