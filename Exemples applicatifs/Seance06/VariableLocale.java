/**
 * @author yelallioui
 *
 */

public class VariableLocale {
  public static void main(String [] param�tre)   {
   // d�claration de variables locales
   int valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " apres modifier() ");
  } // fin de main()

  public static void modifier ()  {
   // d�claration de variables locales
   int valeur ;
   valeur = 3 ;
   System.out.println("Valeur = " + valeur + " dans modifier() ");
  } // fin de modifier
} //fin de class VariableLocale