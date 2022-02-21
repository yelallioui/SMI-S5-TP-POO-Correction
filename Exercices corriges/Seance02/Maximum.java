/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Maximum  {
  public static void main (String [] parametre)  {
   int première, deuxième, laPlusGrande ;
   Scanner lectureClavier = new Scanner(System.in);

   System.out.print("Entrer une valeur :") ;
   première =  lectureClavier.nextInt(); ; 
   System.out.print("Entrer une deuxieme valeur :") ;
   deuxième =  lectureClavier.nextInt(); ; 
   if (première > deuxième) 
   {
     System.out.println(deuxième + "  " + première) ;
     laPlusGrande = première ;
     System.out.println("La plus grande valeur est : " + laPlusGrande) ;
   }
   else
   {
     if (première < deuxième) {
       System.out.println(première + " " + deuxième) ;
       laPlusGrande = deuxième ;
       System.out.println("La plus grande valeur est : " + laPlusGrande) ;
     }
     else System.out.println("Les deux valeurs saisies sont identiques") ;
   }
} // Fin du main ()
} // Fin de la Class Maximum