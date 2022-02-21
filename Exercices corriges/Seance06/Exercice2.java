/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice2 {
 public static double résultat ;
 public static char opération ;
 
 public static void main( String [] argument) {
  int a, b;
  Scanner lectureClavier = new Scanner(System.in);
  menu();
  System.out.print("Entrer la premiere valeur ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur ");
  b = lectureClavier.nextInt();
  calculer(a, b );
  afficher(a, b); 
 }
 
 public static void calculer(int x, int y){
  switch (opération) {
   case '+' : résultat = x + y;
                    break;
   case '-' : résultat = x - y;
                    break;
   case '/' : résultat = x / y;
                    break;
   case '*' : résultat = x * y ;                    
                    break;
    }
 }

 public static void afficher(int x, int y)  {
   System.out.println(x + "  " +opération+ " "+ y + " =  " + résultat);  
 }
 
 public static void menu()  {  
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrer en premier l'opération choisie ");
  System.out.println("+ pour additionner ");
  System.out.println(" - pour soustraire ");
  System.out.println(" * pour pultiplier ");
  System.out.println(" / pour diviser ");
  System.out.print(" (+, -, *, /)  ? : ");
    opération = lectureClavier.next().charAt(0);
  }
 }