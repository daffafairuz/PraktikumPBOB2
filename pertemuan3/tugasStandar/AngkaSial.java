/*Nama : Daffa Fairuz Annizairi
 * NIM : 24060122140044
 * File_Name : AngkaSial.java
 * Deskripsi : fungsi main AngkaSial untuk mengecek apakah terdapat angka sial pada fungsi cobaAngka
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka");
        }
    }
}

/*
 * Jawaban : apa yang terjadi pada baris 12(System.out.println(angka +" bukan angka sial") jika program diatas dieksekusi?
 * baris tersebut tetap dieksekusi sekali pada pemanggilan pertama yaitu as.cobaAngka(10). baris tersebut tidak dikesekusi lagi setelahnya karena 
 * pada pemanggilan selanjutnya terjadi eksepsi pada fungsi cobaAngka sehingga akan terlempar ke fungsi AngkaSial dan mengeluarkan peringatan eksepsi.
 * program utama dihentikan sehingga pemanggilan fungsi cobaAngka ketiga tidak dijalankan.
 */