/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Carre  { // Donner un nom � la classe
 public static void main(String [] argument) {
   // D�claration des variables repr�sentant le 
   // p�rim�tre et le cot�
   double p�rim�tre, c�t� ;
   // Afficher le message "Valeur du cote : " 
   // � l'�cran
   System.out.print("Valeur du cote : ");
   // Lire au clavier une valeur
   Scanner lectureClavier = new Scanner(System.in);
   // placer cette valeur dans la variable correspondante
   c�t� = lectureClavier.nextDouble();
   // Calculer le p�rim�tre du carr�
   p�rim�tre = c�t� * c�t� ;
   // Afficher le r�sultat
   System.out.print("Perimetre  : "+p�rim�tre);
 }
}