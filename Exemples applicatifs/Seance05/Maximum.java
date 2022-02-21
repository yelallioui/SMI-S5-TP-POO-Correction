/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Maximum  { // Le fichier s'appelle Maximum.java
public static void main(String [] parametre)  {
   // Déclaration des variables
   int v1, v2, sup;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Entrer une valeur : ");
   v1 = lectureClavier.nextInt();
   System.out.print("Entrer une valeur : ");
   v2 = lectureClavier.nextInt();
   sup = max (v1,v2);
   System.out.println("Le max de " + v1 + " et de " + v2 + " est " + sup);
} // fin de main()

  public static int max (int a, int b)  {
   int m = a;
   if (b > m) m = b;
   return m;
  } // fin de max()
} //fin de class Maximum