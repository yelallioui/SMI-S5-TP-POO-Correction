/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Jeu  {
  public static void main (String [] parametre)		  {
	int i, nombreLu = -1, nbBoucle = 0;
        Scanner lectureClavier = new Scanner(System.in);
	i = (int) (50*Math.random()); 
	System.out.print("Ceci est un jeu, j'ai tire un nombre au ");
	System.out.println("hasard entre 0 et 50, devinez lequel ? ");
	while (nombreLu!= i)  {
		System.out.print("Votre choix : ");
		nombreLu = lectureClavier.nextInt();
		nbBoucle++;
		if (nombreLu != i) System.out.println("Mauvaise réponse");
		if (nombreLu < i) System.out.println(" Trop petit...");
		if (nombreLu > i) System.out.println(" Trop grand...");
	} 
	System.out.print("Bravo ! ");
	System.out.println("vous avez reussi en " + nbBoucle + " fois");
  } // Fin du main ()
} // Fin de la Class jeu