package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahsisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahsisi = jumlahsisi;
    }

    public double hitungLuas(){
        return (alas*tinggi)/2;
    }
    
    public void printInfo(){
        System.out.println("bangun Segitiga berisi " + this.getjumlahsisi() + " sisi");
    }
}
