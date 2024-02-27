// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = main class dari class Titik
// pertemuan = 2

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);
        

        Titik t3 = new Titik(2, 7);

        System.out.println("Jumlah Objek titik : " + Titik.getCounterTitik());
        System.out.println("t1 : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2 : (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t2 : (" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
        }

}

// Kesimpulan Praktikum pertemuan 2

// fungsi Access Modifier untuk informasi hiding, sehingga akses informasi(atribut) dapat diatur
// Garis adalah sebuah ADT/ Class yang terbentuk dari dua buah ADT/ Class titik (titikAwal, titikAkhir)
// Garis dan titik dapat di refleksikan terhadap sumbu X atau sumbu Y