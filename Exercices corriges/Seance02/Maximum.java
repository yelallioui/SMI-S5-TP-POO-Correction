/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Maximum  {
  public static void main (String [] parametre)  {
   int premi�re, deuxi�me, laPlusGrande ;
   Scanner lectureClavier = new Scanner(System.in);

   System.out.print("Entrer une valeur :") ;
   premi�re =  lectureClavier.nextInt(); ; 
   System.out.print("Entrer une deuxieme valeur :") ;
   deuxi�me =  lectureClavier.nextInt(); ; 
   if (premi�re > deuxi�me) 
   {
     System.out.println(deuxi�me + "  " + premi�re) ;
     laPlusGrande = premi�re ;
     System.out.println("La plus grande valeur est : " + laPlusGrande) ;
   }
   else
   {
     if (premi�re < deuxi�me) {
       System.out.println(premi�re + " " + deuxi�me) ;
       laPlusGrande = deuxi�me ;
       System.out.println("La plus grande valeur est : " + laPlusGrande) ;
     }
     else System.out.println("Les deux valeurs saisies sont identiques") ;
   }
} // Fin du main ()
} // Fin de la Class Maximum