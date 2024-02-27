// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = Class MPrismaSegitiga, main class dari prismasegitiga
// pertemuan = 2
public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga segitiga1 = new Segitiga(3, 4);
        double tingiPrisma = 5.0;
        PrismaSegitiga PrismaSegitiga1 = new PrismaSegitiga(segitiga1, tingiPrisma);

        System.out.println("tinggi prisma = "+ tingiPrisma + " dengan tinggi segitiga = "+ segitiga1.getTinggiSegitiga() + " dan alas Segitiga = " + segitiga1.getAlas());
        System.out.println("volume prisma segitiga ini adalah "+ PrismaSegitiga1.hitungVolume());
        System.out.println("volume prisma segitiga ini adalah "+ PrismaSegitiga1.hitungLuasPermukaan());

    }
}
