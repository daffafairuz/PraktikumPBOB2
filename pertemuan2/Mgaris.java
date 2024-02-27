// Nama = Daffa Fairuz Annizari
// NIM = 24060122140044
// Tanggal = 27 februari 2024
// Deskripsi = main class dari class Garis
// pertemuan = 2
public class Mgaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(1,1);
        Titik T2 = new Titik(2,2);
        Garis G1 = new Garis(T1, T2);
        Titik titikAwalG1 = G1.getTitikAwal();
        Titik titikAkhirG1 = G1.getTitikAkhir();

        System.out.println("titikAwal adalah "+ titikAwalG1.getAbsis() +","+ titikAwalG1.getOrdinat());
        System.out.println("titikAkhir adalah "+ titikAkhirG1.getAbsis() +","+ titikAkhirG1.getOrdinat());
        System.out.println("hello world");

        Titik T3 = new Titik(4,5);
        Titik T4 = new Titik(7,3);
        Garis G2 = new Garis(T3, T4);
        Titik titikAwalG2 = G2.getTitikAwal();
        Titik titikAkhirG2 = G2.getTitikAkhir();

        System.out.println("titikAwal adalah "+ titikAwalG2.getAbsis() +","+ titikAwalG2.getOrdinat());
        System.out.println("titikAkhir adalah "+ titikAkhirG2.getAbsis() +","+ titikAkhirG2.getOrdinat());
        
        System.out.println("Panjang dari garis G2 adalah " + G2.getPanjang());
        System.out.println("Gradien garis G1 adalah " + G1.getGradien());

        System.out.println("jarak T3 ke titik pusat adalah "+ T3.getJarakPusat());
        if (G1.IsTegakLurus(G2)){
            System.out.println("2 garis saling tegak lurus");
        }
        else{
            System.out.println("2 garis tidak saling tegak lurus");
        }

        Garis G3 = G2.getRefleksiY();
        Titik titikAwalG3 = G3.getTitikAwal();
        Titik titikAkhirG3 = G3.getTitikAkhir();

        System.out.println("titikAwal G3 adalah "+ titikAwalG3.getAbsis() +","+ titikAwalG3.getOrdinat());
        System.out.println("titikAkhir G3 adalah "+ titikAkhirG3.getAbsis() +","+ titikAkhirG3.getOrdinat());
    }

}
// Kesimpulan Praktikum pertemuan 2

// fungsi Access Modifier untuk informasi hiding, sehingga akses informasi(atribut) dapat diatur
// Garis adalah sebuah ADT/ Class yang terbentuk dari dua buah ADT/ Class titik (titikAwal, titikAkhir)
// Garis dan titik dapat di refleksikan terhadap sumbu X atau sumbu Y