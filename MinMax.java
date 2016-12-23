/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class MinMax {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i=1, temp=0,temp1=100000000, entier, nombre;
        System.out.println("Saisir le nombre d'entier ");
        entier = sc.nextInt();
        while (i<=entier){
            System.out.println("Merci de saisir le nombre "+i);
            nombre = sc.nextInt();
            if(nombre>temp)
                temp = nombre;
            if (nombre<temp1)
                temp1 = nombre;
            i++;
            }

        System.out.println("Le minimum est " +temp1);
        System.out.println("Le maximum est " +temp);
        }

    }

