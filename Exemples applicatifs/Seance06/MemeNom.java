/**
 * @author yelallioui
 *
 */

public class MemeNom
{
// d�claration de la variable valeur
 static int valeur ;
  public static void main(String [] parametre)
  {
   valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " apr�s modifier() ");
} // fin de main()

  public static void modifier ()
  {
   System.out.println(valeur + " dans modifier() avant la d�claration");
   int valeur  ;
   valeur = 3 ;
   System.out.println(valeur + " dans modifier() apr�s la d�claration");
  } // fin de modifier
} //fin de class MemeNom