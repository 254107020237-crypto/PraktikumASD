package Kuis;

import java.util.Scanner;

public class SmartHomeDiviceDemo {
    public static void main(String[] args) {
        SmartHomeDivice [] arrayofSmartHomeDivice = new SmartHomeDivice[2];

        Scanner Akbar = new Scanner(System.in);
        // array untuk menyimpan data seperti nama, konsumsi power dan stanbypower
        arrayofSmartHomeDivice [0] = new SmartHomeDivice();
        arrayofSmartHomeDivice [0].Nama = "";
        arrayofSmartHomeDivice [0].KonsumsiPower = 5; 
        arrayofSmartHomeDivice [0].StandbyPower = 7;

        arrayofSmartHomeDivice [1] = new SmartHomeDivice();
        arrayofSmartHomeDivice [1].Nama = " ";
        arrayofSmartHomeDivice [1].KonsumsiPower = 30;
        arrayofSmartHomeDivice [1].StandbyPower = 50;
        
        // untuk menampilkan data yang di simpan di array
        System.out.println("================================================");
        System.out.print("Nama : " + arrayofSmartHomeDivice[0].Nama);
        arrayofSmartHomeDivice[0].Nama = Akbar.nextLine();
        System.out.println("Konsumsi Power : " + arrayofSmartHomeDivice[0].KonsumsiPower);
        System.out.println("Standby Power : " + arrayofSmartHomeDivice[0].StandbyPower);

        // hitung total energi dan rasio efesiensi
        System.out.println("================================================");
        System.out.println("Total Energi Actual : " + arrayofSmartHomeDivice[0].KonsumsiPower + arrayofSmartHomeDivice[0].StandbyPower);
        System.out.println("Rasio Efesiensi : " + arrayofSmartHomeDivice[0].KonsumsiPower+arrayofSmartHomeDivice[0].StandbyPower / arrayofSmartHomeDivice[0].StandbyPower);
        System.out.println("================================================");

        // untuk menampilkan data yang di simpan di array
        System.out.println("================================================");
        System.out.print("Nama : " + arrayofSmartHomeDivice[1].Nama);
        arrayofSmartHomeDivice[1].Nama = Akbar.nextLine();
        System.out.println("Konsumsi Power : " + arrayofSmartHomeDivice[1].KonsumsiPower);
        System.out.println("Standby Power : " + arrayofSmartHomeDivice[1].StandbyPower);

        // hitung total energi dan rasio efesiensi
        System.out.println("================================================");
        System.out.println("Total Energi Actual : " + arrayofSmartHomeDivice[1].KonsumsiPower + arrayofSmartHomeDivice[1].StandbyPower);
        System.out.println("Rasio Efesiensi : " + arrayofSmartHomeDivice[1].KonsumsiPower+arrayofSmartHomeDivice[1].StandbyPower / arrayofSmartHomeDivice[1].StandbyPower);
        System.out.println("================================================");
    }
}
