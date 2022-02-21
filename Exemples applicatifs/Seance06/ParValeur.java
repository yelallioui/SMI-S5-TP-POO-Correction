/**
 * @author yelallioui
 *
 */

public class ParValeur { 
public static void main (String [] paramètre)   {
   // Déclaration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant tripler() ");
   tripler(valeur);
   System.out.println("Valeur = " + valeur + " apres tripler() ");
} // fin de main()

  public static void tripler (int valeur)  {
   System.out.println("Valeur = " + valeur + " dans tripler() ");  
    valeur = 3 * valeur;
   System.out.println("Valeur = " + valeur + " dans tripler() ");  
  } // fin de tripler
} //fin de class ParValeur