/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Exercice3  {
  public static void main (String [] parametre)  {
   int valeur, laPlusGrande, laPlusPetite, laSomme = 0, leNombre = 0 ;
   double laMoyenne;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Entrer une valeur :") ;
   valeur =  lectureClavier.nextInt(); 
   laPlusGrande = valeur ;
   laPlusPetite = valeur ;
   do {
     	if (laPlusGrande < valeur) laPlusGrande = valeur ;
     	if (laPlusPetite > valeur) laPlusPetite = valeur ;
   		laSomme = laSomme + valeur ;
   		leNombre = leNombre + 1 ;
   		System.out.print("Entrer une valeur (0 pour sortir) :") ;
     	valeur =  Lire.i() ; 
   } while (valeur != 0);
     System.out.println("La plus grande valeur est : " + laPlusGrande) ;
     System.out.println("La plus petite valeur est : " + laPlusPetite) ;
  	   laMoyenne = (float) laSomme / leNombre ;
     System.out.println("La moyenne de ces valeurs : " + laMoyenne) ;
} // Fin du main ()
} // Fin de la Class Maximum