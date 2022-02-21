/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Calculette		{
 public static void main( String [] argument)	 {
  int a, b;
  char opérateur;
  double calcul = 0;
  boolean OK = true;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Entrer la première valeur : ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur : ");
  b = lectureClavier.nextInt();
  System.out.print("Type de l'opération : (+, -, *, /) : ");
  opérateur = Lire.c();  
switch (opérateur )  {
   case '+' : calcul = a + b;
              break;
   case '-' : calcul = a - b;
              break;
   case '/' : if ( b != 0) calcul = a / b;
  	      else OK = false;
              break;
   case '*' : calcul = a * b ;  
              break;
   default : OK = false ;
    }
   if (OK) {
     System.out.print("Cette operation a pour resultat : ");
     System.out.println(a + " " +opérateur+ " "+ b + " =  " + calcul); 
   }
   else  System.out.println("Operation non conforme !");
 }
}