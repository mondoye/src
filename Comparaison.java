/**
 * Created by Mo ndoye on 08/12/2016.
 */
import java.util.*;
public class Comparaison {
    public static void main(String[] args) {
        Scanner mo = new Scanner(System.in);
        int nb1, nb2;
        System.out.print("Entrer le premier nombre ");
        nb1 = mo.nextInt();
        System.out.print("Entrer le second nombre ");
        nb2 = mo.nextInt();
        if(nb1>nb2)
            System.out.print(nb2+(" est plus petit"));
        else
            System.out.print(nb1+(" est plus petit"));
    }
}
