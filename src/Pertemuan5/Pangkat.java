package Pertemuan5;

public class Pangkat {
    int nilai, pangkat;

    Pangkat(int n, int p) {
        this.nilai = n;
        this.pangkat = p;
    }
    int PangkatBF(){
        int hasil = 1;
        for (int i = 0; i < this.pangkat; i++) {
            hasil = hasil*this.nilai;
        }
        return hasil;
    }
    int PangkatDC(int a, int n){
        if(n==1){
            return a;
        } else {
            if (n%2==1) {
                return(PangkatDC(a, n/2)*PangkatDC(a, n/2)*a);
            } else {
                return(PangkatDC(a, n/2)*PangkatDC(a, n/2));
            }
        }
    }
}