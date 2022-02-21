/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Calculette {
 public static double résultat ; 
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
  char opération ; 
  switch (opération) {
   case '+' : résultat = a + b ;
              break ;
   case '-' : résultat = a - b ;
              break ;
   case '/' : résultat = a / b ;
              break ;
   case '*' : résultat = a * b ;
              break ;
  }
 }

 public static void afficher() {
  char opération ;
  System.out.print(a + "  " +opération + "  "+ b + " =  " + résultat);
 }
 
 public static void menu() {
  char opération ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrez l'operation choisie") ;
  System.out.println(" + pour additionner ") ;
  System.out.println(" - pour soustraire ") ;
  System.out.println(" * pour pultiplier ") ;
  System.out.println(" / pour diviser ") ;
  System.out.print(" (+, -, *, /)  ? : ") ;
  opération = lectureClavier.next().charAt(0);
 }
}