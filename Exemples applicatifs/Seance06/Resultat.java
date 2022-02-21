/**
 * @author yelallioui
 *
 */

public class Resultat {
 public static void main (String [] paramètre)  {
   // Déclaration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant tripler() ");
   valeur = tripler(valeur);
   System.out.println("Valeur = " + valeur + " apres tripler() ");
 } // fin de main()

  public static int tripler (int v)  {
   System.out.println("v = " + v + " dans tripler() ");  
    int résultat = 3*v ;
   System.out.println("Resultat = " + résultat + " dans tripler() ");
   return résultat;
  } // fin de tripler
} //fin de class Resultat