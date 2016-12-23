/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class Factoriel {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Entrer le factoriel du nombre");
        int nb = sc.nextInt();
        if (nb!=0) {
            for (int i = 1; i <= nb; i++){
               fact *=i;
            }
            System.out.println("Le factoriel de "+nb+" est "+fact);
        }
        else
            System.out.println("le factoriel de "+nb+" est "+fact);
    }
}
