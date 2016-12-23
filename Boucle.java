/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class Boucle {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int comptCf=0,comptPair=0, comptImpair=0;

        char yp = 'o';
        do{
            ++comptCf;
            System.out.println("Entrer un chiffre");
            int cf = sc.nextInt();
            if (cf%2==0){
                comptPair++;
            }
            else {
                comptImpair++;
            }
            System.out.println("Voulez vous recommencer?");
            yp = sc.next().charAt(0);
        }while(yp=='o');
        System.out.println("Le nombre de chiffres saisis "+comptCf);
        System.out.println("Le nombre de chiffres pairs "+comptPair);
        System.out.println("Le nombre de chiffres impairs "+comptImpair);

    }
}
