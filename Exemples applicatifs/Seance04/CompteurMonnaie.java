/**
 * @author yelallioui
 *
 */
import java.util.*;
public class CompteurMonnaie
{
 public static void main(String [] arg)
 {
  int nbPièce5C = 0, nbPièce10C = 0, nbPièce20C=0, pièce;
  int totalReçu = 0;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Pour obtenir un cafe, entrez au moins 45 cents");
  System.out.println("Je rends la monnaie ");
  do 
  {
   System.out.print("valeur de la piece entree : ");
   pièce = lectureClavier.nextInt();
   switch (pièce)
   { 
     case 5 :
       nbPièce5C = nbPièce5C + 1;
       break;
     case 10 :
       nbPièce10C = nbPièce10C + 1;
       break;
     case 20 :
       nbPièce20C = nbPièce20C + 1;
       break;
     default :
       pièce = 0;
       System.out.println ("Piece impossible");
   }
   totalReçu = totalReçu + pièce;
   System.out.println("Vous avez entre : ");
   System.out.println("    " + nbPièce5C + " piece(s) de 5 cents"); 
   System.out.println("    " + nbPièce10C + " piece(s) de 10 cents");
   System.out.println("    " + nbPièce20C + " piece(s) de 20 cents");
   System.out.println("Soit au total :  " + totalReçu + " cents");
  } while (totalReçu < 45);
  System.out.println("Je vous verse 1 cafe ");
  if (totalReçu > 45)
   System.out.println("et vous rends : " + (totalReçu-45) + " cents ");
  }
}
