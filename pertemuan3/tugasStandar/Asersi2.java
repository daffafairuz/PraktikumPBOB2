/*Nama : Daffa Fairuz Annizairi
 * NIM : 24060122140044
 * File_Name : Asersi2.java
 * Deskripsi : Program untuk menunjukkan Asersi dengan menggunakan fungsi hitungkeliling lingkaran
 */
class lingkaran{
    private double jariJari;
    public lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0):"jari jari harus lebih dari 0 ";
        lingkaran i = new lingkaran(jariJari);
        double kelilingLingkaran = i.hitungKeliling();
        System.out.println("keliling_lingkaran = "+kelilingLingkaran);
    }
}

/*
 * konsep yang kurang tepat pada asersi diatas. 
 * telah diperbaiki :
 * pada fungsi di atas, peringatan yang berbunyi "Jari - jari tidak boleh nol!!!" diganti menjadi jari - jari harus lebih besar dari 0
 * sehingga konsep asersinya sudah benar.
 */
