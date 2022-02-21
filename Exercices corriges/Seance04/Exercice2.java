/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Exercice2 {
 public static void main (String [] argument) {
  int valeur;
  Scanner lectureClavier = new Scanner(System.in);
  do  {
     System.out.print("Entrer un entier : ");
     valeur = lectureClavier.nextInt();
   } while ( valeur < 0 || valeur > 100) ;
   System.out.println("Vous avez saisi : " + valeur);
 }
}