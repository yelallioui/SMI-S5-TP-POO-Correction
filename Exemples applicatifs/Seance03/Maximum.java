/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Maximum { // Le fichier s'appelle Maximum.java
  public static void main (String [] parametre)  {
   int premi�re, deuxi�me, laPlusGrande ;

   Scanner lectureClavier = new Scanner(System.in);

   System.out.print("Entrer une valeur :") ;
   premi�re =  lectureClavier.nextInt();
   System.out.print("Entrer une deuxieme valeur :") ;
   deuxi�me =  lectureClavier.nextInt();
   if (premi�re > deuxi�me)    {
     System.out.println(deuxi�me + "  " + premi�re) ;
     laPlusGrande = premi�re ;
   }
   else   {
     System.out.println(premi�re + " " + deuxi�me) ;
     laPlusGrande = deuxi�me ;
   }
  System.out.println("La plus grande valeur est : " + laPlusGrande) ;
  } // Fin du main ()
} // Fin de la classe Maximum