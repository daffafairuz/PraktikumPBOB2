package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args){
        bukuAkademik Buku1 = new bukuAkademik("Algoritma Pemrograman untuk Balita edisi akhir bulan", "Wir A", "2024", "alpro", 10, 20000);
        bukuNovel Buku2 = new bukuNovel("Awang Gaming", "Pratama Tawang", "2024", "thriller", 120, 100000);

        Buku1.view();
        Buku2.view();
    }
}
