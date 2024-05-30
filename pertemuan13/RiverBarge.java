/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : RiverBarge.java
 */
public class RiverBarge {
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad(){ 
        return this.maxLoad;
    }

    public double calcFuelEfficency(){ 
        return this.maxLoad * 0.2;
    }

    public double calcTripDistance(){
        return this.calcFuelEfficency() * 10;
    }
}
