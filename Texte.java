/**
 * Created by Mo ndoye on 13/12/2016.
 */
import java.util.*;
public class Texte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char []voy ={'a','e','u','i','o','y','é','è','ù','ê','î','ô','â','à','û'};
        char cons[]={'z','r','t','p','q','s','d','f','g','h','j','k','l','m','w','x','c','v','b','n'};
        char []car = {'.',' ','\'','?','!',',',';',':'};
        int comptV=0,comptC=0;
        int comptCar =0;
        System.out.println("Veuillez saisir le texte ci dessous");
        String texte = sc.nextLine().toLowerCase();
        System.out.println(texte.length());
        for (int k=0; k<texte.length();k++){
            for (int l=0;l<voy.length;l++){
                if (texte.charAt(k)==voy[l]){
                    comptV++;
                }

            }
            for (int m=0;m<cons.length;m++){
                if(texte.charAt(k)==cons[m]){
                    comptC++;
                }
            }
            for (int n=0;n<car.length;n++){
                if (texte.charAt(k)==car[n])
                    comptCar++;
            }
        }
        System.out.println("Le nombre de voyelles "+comptV);
        System.out.println("Le nombre de consonnes "+comptC);
        System.out.println("Le nombre de caracteres speciaux "+comptCar);
    }
}
