/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : vehicle.java
 */
public abstract class vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}