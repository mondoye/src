/**
 * Created by Mo ndoye on 08/12/2016.
 */
import java.util.*;
public class Commande {
    public static void main(String []args){
        Scanner mo = new Scanner(System.in);
        System.out.println("Donner le prix unitaire du produit");
        int pu = mo.nextInt();
        System.out.println("Donner la quantitee");
        int q = mo.nextInt();
        int mc = pu*q;
        System.out.println("Le montant de la commande "+mc);
        int rm = mc*5/100;
        System.out.println("La remise est de "+rm);
        int frais = mc*2/100;
        System.out.println("Les frais de port "+frais);
        System.out.println("Le montant final "+(mc-rm+frais));
    }
}
