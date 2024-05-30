/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Seaplane.java
 */
public class Seaplane extends Airplane{
    private double maxLoad;

    public Seaplane(){
        this.maxLoad = 10;
    }

    public Seaplane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficency(){
        return this.maxLoad * 0.3;
    }

    public double calcTripDistance(){
        return this.maxLoad * 15;
    }
    public void takeOff(){
        System.out.println("Seaplane Take Off");
    }

    public void land(){
        System.out.println("Seaplane mendarat");
    }
    public void fly(){
        System.out.println("seaplane terbang");
    }
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
