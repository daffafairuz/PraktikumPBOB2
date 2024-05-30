/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Superman.java
 */
public class Superman extends Kryptonian{
    private String nama;

    public Superman(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void takeOff(){
        System.out.println(this.nama + "sedang lepas landas");
    }
    public void land(){
        System.out.println(this.nama + "sedang mendarat");
    }
    public void fly(){
        System.out.println(this.nama + "sedang terbang");
    }
    public void leapBuilding(){
        System.out.println(this.nama + "sedang melompati gedung");
    }
    public void stopBullet(){
        System.out.println(this.nama + "sedang menghentikan peluru");
    }
    public void eat(){
        System.out.println(this.nama + " ,mclaren lu warna apa bos");
    }

}
