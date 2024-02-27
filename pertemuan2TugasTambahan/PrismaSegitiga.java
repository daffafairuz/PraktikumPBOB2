// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = Class PrismaSegitiga, atribut dan method digunakan dalam operasi prismasegitiga
// pertemuan = 2
public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga segi, double tinggi){
        alas = segi;
        tinggiPrisma = tinggi;
    }

    public double hitungVolume(){
        double luasSegitiga = alas.hitungLuas();
        double tinggi = tinggiPrisma;
        return luasSegitiga * tinggi;
    }

    public double hitungLuasPermukaan(){
        double luasTutup = 2 * alas.hitungLuas();
        double sisiSisiSegitiga = Math.sqrt(Math.pow(alas.getTinggiSegitiga(), 2) + Math.pow(alas.getAlas()/2, 2));
        double luasLateral = (alas.getAlas() + (2*sisiSisiSegitiga))*tinggiPrisma;
        return luasLateral + luasTutup;
    }
}
