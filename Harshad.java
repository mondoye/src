/**
 * Created by Mo ndoye on 23/12/2016.
 */
public class Harshad {
    public static void main(String []args){
        String cf;
        int s=0; char c= ' ';
        for (int x = 0;x<args.length;x++){
            cf=args[x];
            for (int k=0;k<cf.length();k++) {
                c = cf.charAt(k);
                s+= (int) c - 48;
            }
            if (Integer.parseInt(cf)%s==0)
                System.out.println(cf+" est un nombre de Harshad");
            else
                System.out.println(cf+" n'est pas un nombre de Harshad");
        }
    }
}
