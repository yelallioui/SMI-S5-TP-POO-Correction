/**
 * @author yelallioui
 *
 */

public class Visibilite {
  public static void main(String [] paramètre)   {
   // Déclaration des variables
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " apres modifier() ");
 } // fin de main()

  public static void modifier ()  {
   valeur = 3 ;
   System.out.println("Valeur = " + valeur + " dans modifier() ");
  } // fin de modifier
} //fin de class Visibilite