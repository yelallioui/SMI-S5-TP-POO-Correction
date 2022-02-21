/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice3 {
 public static void main( String [] argument){
  int a, b;
  char opérateur;
  double calcul;
  Scanner lectureClavier = new Scanner(System.in);
  opérateur = menu();
  System.out.print("Entrer la premiere valeur ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur ");
  b = lectureClavier.nextInt();
  calcul = calculer(a, b, opérateur );
  afficher(a, b, opérateur, calcul); 
 }
 
 public static double calculer (int x, int y, char o) {
  double résultat =0;
  switch (o)  {
   case '+' : résultat = x + y;
              break;
   case '-' : résultat = x - y;
              break;
   case '/' : résultat = x / y;
              break;
   case '*' : résultat = x * y ; 
              break;
    }
    return résultat;
 }

 public static void afficher(int x, int y, char o, double r) {
   System.out.println(x + "  " +o+ " "+ y + " =  " + r);  
 }
 
 public static char menu()  {
  char opération ;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrer en premier l'opération choisie ");
  System.out.println("+ pour additionner ");
  System.out.println(" - pour soustraire ");
  System.out.println(" * pour pultiplier ");
  System.out.println(" / pour diviser ");
  System.out.print(" (+, -, *, /)  ? : ");
  opération = lectureClavier.next().charAt(0);
  return opération ;
  }
 }