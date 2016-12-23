/**
 * Created by Mo ndoye on 08/12/2016.
 */
import java.util.*;
public class Alphabet {
    public static void main (String[] args){
        String[] mot = new String[3];
        Scanner mnf = new Scanner(System.in);
        System.out.println("Entrer le premier mot");
        String mot1 = mnf.next();
        System.out.println("Entrer le second mot");
        String mot2 = mnf.next();
        System.out.println("Entrer le troisieme mot");
        String mot3 = mnf.next();
        mot[0]=mot1;
        mot[1]=mot2;
        mot[2]=mot3;
        int a =mot1.compareTo(mot2);
        System.out.print(a);

    }
}
