/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Truck.java
 */
public class Truck extends vehicle{
    private double maxLoad;

    public Truck(){
        this.maxLoad = 10;
    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }

    public double getMaxload(){ 
        return this.maxLoad;
    }
    public double calcFuelEfficency(){ 
        return this.maxLoad * 0.5;
    }

    public double calcTripDistance(){
        return this.calcFuelEfficency() * 15;
    }

}
