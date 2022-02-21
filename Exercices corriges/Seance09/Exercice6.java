/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Exercice6 {
 public static void main (String [] parametre) {
  int i,j, N = 5;
  char C;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Entrer un  caractère :");
  C = lectureClavier.next().charAt(0);
  for (i = 1; i < N; i++)  { 
   for (j = 1; j < N; j++)  {
    if (i < j) System.out.print(C);
    else System.out.print(" ");
   }
  }
 }
}