/**
 * @author yelallioui
 *
 */

public class Resultat {
 public static void main (String [] param�tre)  {
   // D�claration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant tripler() ");
   valeur = tripler(valeur);
   System.out.println("Valeur = " + valeur + " apres tripler() ");
 } // fin de main()

  public static int tripler (int v)  {
   System.out.println("v = " + v + " dans tripler() ");  
    int r�sultat = 3*v ;
   System.out.println("Resultat = " + r�sultat + " dans tripler() ");
   return r�sultat;
  } // fin de tripler
} //fin de class Resultat