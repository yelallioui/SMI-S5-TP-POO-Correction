/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Rectangle  { // Nom � la classe
 public static void main(String [] argument)  {
   // D�claration des variables 
   double surface, largeur, longueur ;
   // Afficher un message � l'�cran
   System.out.print("Valeur de la longueur : ");
   // Lire au clavier une valeur
   Scanner lectureClavier = new Scanner(System.in);
   longueur = lectureClavier.nextDouble();
   // Afficher un message � l'�cran
   System.out.print("Valeur de la largeur : ");
   // Lire au clavier une valeur
   largeur = lectureClavier.nextDouble();
   // Calculer le surface du rectangle
   surface = largeur * longueur;
   // Afficher le r�sultat
   System.out.print("Surface: " + surface);
 }
}