/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Animal.java
 */
public abstract class Animal{
    public String toString(){
        return this.getClass().getSimpleName();
    }
    public abstract void eat();
}
