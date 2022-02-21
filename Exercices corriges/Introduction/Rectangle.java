/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Rectangle  { // Nom à la classe
 public static void main(String [] argument)  {
   // Déclaration des variables 
   double surface, largeur, longueur ;
   // Afficher un message à l'écran
   System.out.print("Valeur de la longueur : ");
   // Lire au clavier une valeur
   Scanner lectureClavier = new Scanner(System.in);
   longueur = lectureClavier.nextDouble();
   // Afficher un message à l'écran
   System.out.print("Valeur de la largeur : ");
   // Lire au clavier une valeur
   largeur = lectureClavier.nextDouble();
   // Calculer le surface du rectangle
   surface = largeur * longueur;
   // Afficher le résultat
   System.out.print("Surface: " + surface);
 }
}