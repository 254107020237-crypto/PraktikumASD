package Pertemuan6;

public class Sorting21 {
    int [] Data;
    int JumData;

Sorting21 (int Data[], int JmlData){
    this.JumData=JmlData;
    this.Data=new int[JmlData];
    for (int i = 0; i < JumData; i++) {
        this.Data[i]= Data[i];
    }
}

void BubbleSort(){
    int Temp=0;
    for (int i = 0; i < JumData-1; i++) {
        for (int j = 1; j < JumData-i; j++) {
            if (Data[j-1] > Data[j]) {
                Temp=Data[j];
                Data[j]=Data[j-1];
                Data[j-1]=Temp;
            }
        }
    }
}

void Tampil(){
    for (int i = 0; i < JumData; i++) {
        System.out.print(Data[i]+" ");
    }
    System.out.println();
}

void SelectionSort(){
    for (int i = 0; i < JumData-1; i++) {
        int Min=i;
        for (int j = i+1; j < JumData; j++) {
            if (Data[j]<Data[Min]) {
                Min=j;
            }
        }
        int Temp=Data[i];
        Data[i]=Data[Min];
        Data[Min]=Temp;
    } 
}

void InsertionSort(){
    for (int i = 1; i < Data.length; i++) {
        int Temp=Data[i];
        int j=i-1;
        while (j>=0 && Data[j]>Temp) {
            Data[j+1]=Data[j];
            j++;
        }
        Data[j+1]=Temp;
    }
}
}


