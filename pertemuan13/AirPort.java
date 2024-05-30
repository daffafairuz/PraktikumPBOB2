/* Nama : Daffa Fairuz Annizari
 * NIM : 24060122140044
 * Lab : B2
 * namaFile : Airport.java
 */
public class AirPort{
    private Airplane airplane;
    private String Name;

    public AirPort(String name){
        this.Name = name;
    }

    public String givePermissionToLand(IFIyer flyer){
        if (flyer instanceof Airplane){
            return "diizinkan mendarat";
        }
        else{
            return "dilarang mendarat";
        }
    }

}
