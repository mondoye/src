/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class Facture {
    public static void main (String[] args){
        Scanner mo = new Scanner(System.in);
        System.out.println("Entrer la quantite");
        int qt = mo.nextInt();
        if (qt<=10)
            System.out.println("Le montant de la facture est de "+(qt*150)+" £");
        else if (qt>10 && qt<49)
            System.out.println("Le montant de la facture est de "+(qt*135)+"£");
        else
            System.out.println("La montant de la facture esr de "+(qt*110)+"£");
    }
}
