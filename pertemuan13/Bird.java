/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Bird.java
 */
public class Bird extends Animal implements IFIyer{
    public void takeOff(){
        System.out.println("burung take off");
    }
    public void land(){
        System.out.println("burung mendarat");
    }
    public void fly(){
        System.out.println("burung terbang");
    }
    public void buildNest(){
        System.out.println("burung bikin sarang");
    }
    public void layEgs(){
        System.out.println("burung bertelur");
    }
    public void eat(){
        System.out.println("burung makan cacing");
    }
}
