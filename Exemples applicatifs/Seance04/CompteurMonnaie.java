/**
 * @author yelallioui
 *
 */
import java.util.*;
public class CompteurMonnaie
{
 public static void main(String [] arg)
 {
  int nbPi�ce5C = 0, nbPi�ce10C = 0, nbPi�ce20C=0, pi�ce;
  int totalRe�u = 0;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Pour obtenir un cafe, entrez au moins 45 cents");
  System.out.println("Je rends la monnaie ");
  do 
  {
   System.out.print("valeur de la piece entree : ");
   pi�ce = lectureClavier.nextInt();
   switch (pi�ce)
   { 
     case 5 :
       nbPi�ce5C = nbPi�ce5C + 1;
       break;
     case 10 :
       nbPi�ce10C = nbPi�ce10C + 1;
       break;
     case 20 :
       nbPi�ce20C = nbPi�ce20C + 1;
       break;
     default :
       pi�ce = 0;
       System.out.println ("Piece impossible");
   }
   totalRe�u = totalRe�u + pi�ce;
   System.out.println("Vous avez entre : ");
   System.out.println("    " + nbPi�ce5C + " piece(s) de 5 cents"); 
   System.out.println("    " + nbPi�ce10C + " piece(s) de 10 cents");
   System.out.println("    " + nbPi�ce20C + " piece(s) de 20 cents");
   System.out.println("Soit au total :  " + totalRe�u + " cents");
  } while (totalRe�u < 45);
  System.out.println("Je vous verse 1 cafe ");
  if (totalRe�u > 45)
   System.out.println("et vous rends : " + (totalRe�u-45) + " cents ");
  }
}
