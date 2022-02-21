/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice3 {
 public static void main( String [] argument){
  int a, b;
  char op�rateur;
  double calcul;
  Scanner lectureClavier = new Scanner(System.in);
  op�rateur = menu();
  System.out.print("Entrer la premiere valeur ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur ");
  b = lectureClavier.nextInt();
  calcul = calculer(a, b, op�rateur );
  afficher(a, b, op�rateur, calcul); 
 }
 
 public static double calculer (int x, int y, char o) {
  double r�sultat =0;
  switch (o)  {
   case '+' : r�sultat = x + y;
              break;
   case '-' : r�sultat = x - y;
              break;
   case '/' : r�sultat = x / y;
              break;
   case '*' : r�sultat = x * y ; 
              break;
    }
    return r�sultat;
 }

 public static void afficher(int x, int y, char o, double r) {
   System.out.println(x + "  " +o+ " "+ y + " =  " + r);  
 }
 
 public static char menu()  {
  char op�ration ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrer en premier l'op�ration choisie ");
  System.out.println("+ pour additionner ");
  System.out.println(" - pour soustraire ");
  System.out.println(" * pour pultiplier ");
  System.out.println(" / pour diviser ");
  System.out.print(" (+, -, *, /)  ? : ");
  op�ration = lectureClavier.next().charAt(0);
  return op�ration ;
  }
 }