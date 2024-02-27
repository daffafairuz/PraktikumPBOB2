// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = Class Segitiga, digunakan untuk membuat dan melakukan operasi pada bangun datar segitiga
// pertemuan = 2
public class Segitiga {
    private double Alas;
    private double Tinggi;

    public Segitiga(double alasSegitiga, double tinggiSegitiga){
        Alas = alasSegitiga;
        Tinggi = tinggiSegitiga;
    }

    public double getAlas(){
        return this.Alas;
    }

    public double getTinggiSegitiga(){
        return this.Tinggi;
    }

    public double hitungLuas(){
        return (Alas * Tinggi)/2;
    }
}