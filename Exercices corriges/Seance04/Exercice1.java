/**
 * @author yelallioui
 *
 */ass    : Exercice1
*/
import java.util.*;
public class Exercice1 {
 public static void main (String [] argument) {
  int a,b,r;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Entrer un entier : ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer un entier : ");
  b = lectureClavier.nextInt();
  do  {
    r = a%b;
    a = b;
    b = r;
   } while (r != 0 );
  System.out.println("Le resultat est " + a);
 }
}