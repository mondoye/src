/**
 * Created by Mo ndoye on 08/12/2016.
 */
import java.util.*;
public class Pyramide {
    public static void main(String []args){
        Scanner oz = new Scanner(System.in);String et= "*";
        System.out.println("Donner la hauteur de la pyramide");
        int h = oz.nextInt();
        for (int i = 0;i<h;i++){
            System.out.println(et);
            et+="**";
        }
    }
}
