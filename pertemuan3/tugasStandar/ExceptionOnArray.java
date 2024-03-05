/*Nama : Daffa Fairuz Annizairi
 * NIM : 24060122140044
 * File_Name : ExceptionOnArray.java
 * Deskripsi : Program untuk menunjukkan eksepsi yaitu mencari kesalahan indexoutbound
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
                exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code");
        }

    }
}
