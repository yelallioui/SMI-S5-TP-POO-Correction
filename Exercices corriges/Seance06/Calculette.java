/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Calculette {
 public static double r�sultat ; 
 public static void main( String [] argument)  {
  int a, b;
  Scanner lectureClavier = new Scanner(System.in);
  menu();
  System.out.print("Entrer la premiere valeur ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur ");
  b = lectureClavier.nextInt();
  calculer();
  afficher(); 
 }
 
 public static void calculer() {
  char op�ration ; 
  switch (op�ration) {
   case '+' : r�sultat = a + b ;
              break ;
   case '-' : r�sultat = a - b ;
              break ;
   case '/' : r�sultat = a / b ;
              break ;
   case '*' : r�sultat = a * b ;
              break ;
  }
 }

 public static void afficher() {
  char op�ration ;
  System.out.print(a + "  " +op�ration + "  "+ b + " =  " + r�sultat);
 }
 
 public static void menu() {
  char op�ration ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrez l'operation choisie") ;
  System.out.println(" + pour additionner ") ;
  System.out.println(" - pour soustraire ") ;
  System.out.println(" * pour pultiplier ") ;
  System.out.println(" / pour diviser ") ;
  System.out.print(" (+, -, *, /)  ? : ") ;
  op�ration = lectureClavier.next().charAt(0);
 }
}