package Pertemuan5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

         System.out.print("Masukkan Jumlah Elemen : ");
         int elemen = input.nextInt();

         Pangkat[] png = new Pangkat[elemen];
         for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke- "+(i+1)+": ");
            int basis = input.nextInt();
             System.out.print("Masukkan nilai pangkat elemen ke- "+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEEFORCE:");
        for (Pangkat P : png){
            System.out.println(P.nilai+"^"+P.pangkat+": "+P.PangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVICE AND CONQUER: ");
        for (Pangkat P : png){
            System.out.println(P.nilai+"^"+P.pangkat+": "+P.PangkatDC(P.nilai, P.pangkat));

        }
            
    }
    
}
