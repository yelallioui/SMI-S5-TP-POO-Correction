/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice2 {
 public static double r�sultat ;
 public static char op�ration ;
 
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
  switch (op�ration) {
   case '+' : r�sultat = x + y;
                    break;
   case '-' : r�sultat = x - y;
                    break;
   case '/' : r�sultat = x / y;
                    break;
   case '*' : r�sultat = x * y ;                    
                    break;
    }
 }

 public static void afficher(int x, int y)  {
   System.out.println(x + "  " +op�ration+ " "+ y + " =  " + r�sultat);  
 }
 
 public static void menu()  {  
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Je sais compter, entrer en premier l'op�ration choisie ");
  System.out.println("+ pour additionner ");
  System.out.println(" - pour soustraire ");
  System.out.println(" * pour pultiplier ");
  System.out.println(" / pour diviser ");
  System.out.print(" (+, -, *, /)  ? : ");
    op�ration = lectureClavier.next().charAt(0);
  }
 }