/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class Heure {
    public static void main(String[] args){
        Scanner fa = new Scanner(System.in);
        System.out.println("Donner l'heure");
        int h = fa.nextInt();
        System.out.println("Donner les minutes");
        int m = fa.nextInt();
        System.out.println("Donner les secondes");
        int s = fa.nextInt();
        if (s==59){
            if (m==59){
                if(h==23){
                    System.out.println("00h 00 min 00 sec");
                }
                else
                    System.out.println((h+1)+"h 00 min 00 sec");
            }
            else
                System.out.println(h+"h "+(m+1)+" min 00 sec");
        }
        else if(m==59)
            System.out.print(h+"h "+m+" min "+(s+1)+" sec");
        else
            System.out.println((h+1)+"h "+(m+1)+" min "+(s+1)+" sec");
    }
}
