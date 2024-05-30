/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Helicopter.java
 */
public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(){
        this.maxLoad = 10;
    }
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficency(){
        return this.maxLoad * 0.2;
    }
    public double calcTripDistance(){
        return this.maxLoad * 10;
    }

    public void takeOff(){
        System.out.println("Heli Take Off");
    }
    public void land(){
        System.out.println("Heli mendarat");
    }
    public void fly(){
        System.out.println("Heli terbang");
    }
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
