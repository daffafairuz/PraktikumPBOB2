// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = Class titik mengandung function dan prosedur dalam membuat titik
// pertemuan = 2

public class Titik{
    private double absis;
    private double ordinat;
    static double counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik ++;
    }

    void setAbsis(double a){
        absis = a;
    }
    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    static double getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX(){
        ordinat = - ordinat;
    }
    public void refleksiY(){
        absis = - absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
}