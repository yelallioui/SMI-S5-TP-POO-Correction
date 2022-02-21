/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Exercice7 {
 public static void main (String [] paramètre) {
  long i, b = 1;
  int a;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Entrer un entier :");
  a = lectureClavier.nextInt();
  for (i = 2; i <= a; i++)
    b = b * i;
  System.out.println("La resultat vaut " + b);
 }
}