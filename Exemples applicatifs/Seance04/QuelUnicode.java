/**
 * @author yelallioui
 *
 */

import java.util.*;
public class QuelUnicode {
 public static void main (String [] paramètre)  {
  int i;
  char recherche, atrouver;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Quel caractere recherchez-vous : ");
  recherche = lectureClavier.next().charAt(0);
  for (i = 0; i <= 127; i++)  {  
   atrouver = (char) i;
   if (atrouver == recherche)   {
    System.out.print("le code Unicode de " + atrouver);
    System.out.println(" est \\u00" + Integer.toString(i,16));
   } // Fin du if
  } // Fin du for
 } // Fin du main()
}// Fin de QuelUnicode