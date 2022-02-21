/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Carre  { // Donner un nom à la classe
 public static void main(String [] argument) {
   // Déclaration des variables représentant le 
   // périmètre et le coté
   double périmètre, côté ;
   // Afficher le message "Valeur du cote : " 
   // à l'écran
   System.out.print("Valeur du cote : ");
   // Lire au clavier une valeur
   Scanner lectureClavier = new Scanner(System.in);
   // placer cette valeur dans la variable correspondante
   côté = lectureClavier.nextDouble();
   // Calculer le périmètre du carré
   périmètre = côté * côté ;
   // Afficher le résultat
   System.out.print("Perimetre  : "+périmètre);
 }
}