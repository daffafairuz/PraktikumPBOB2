// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = Class Garis, mengandung Class Titik dalam method dan atributnya
// pertemuan = 2
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal = awal;
    }
    public void setTitikAkhir(Titik akhir){
        titikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }
    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getPanjang(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return ordinat/absis;
    }

    public Garis getRefleksiY(){
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public Boolean IsTegakLurus(Garis g){
        return getGradien()*g.getGradien() == -1;
    }
}
