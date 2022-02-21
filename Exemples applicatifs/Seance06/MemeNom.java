/**
 * @author yelallioui
 *
 */

public class MemeNom
{
// déclaration de la variable valeur
 static int valeur ;
  public static void main(String [] parametre)
  {
   valeur = 2 ;
   System.out.println("Valeur = " + valeur + " avant modifier() ");
   modifier();
   System.out.println("Valeur = " + valeur + " après modifier() ");
} // fin de main()

  public static void modifier ()
  {
   System.out.println(valeur + " dans modifier() avant la déclaration");
   int valeur  ;
   valeur = 3 ;
   System.out.println(valeur + " dans modifier() après la déclaration");
  } // fin de modifier
} //fin de class MemeNom