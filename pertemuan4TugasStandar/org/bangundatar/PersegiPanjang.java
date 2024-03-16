package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahsisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahsisi = jumlahsisi;
    }

    public double hitungLuas(){
        return panjang* lebar;
    }

    public void printInfo(){
        System.out.println("bangun persegi panjang berisi " + this.getjumlahsisi());
    }

}
