/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Rectangle  {
 public int x, y, couleur, hauteur, largeur ;

 public void créer()
 {
   System.out.println("Position en X ");
   x = verifier(0, 800);
   System.out.println("Position en Y ");
   y = verifier(0, 600);
   System.out.println("Couleur ");
   couleur = verifier(0, 10);
   System.out.println("Hauteur ");
   hauteur = verifier(0, 600);
   System.out.println("Largeur ");
   largeur = verifier(0, 800);
 }

 
 public  int verifier(int a, int b) {
    int resultat;
    Scanner lectureClavier = new Scanner(System.in);
    do  {
    	System.out.print("Entrez une valeur : ");
    	resultat= lectureClavier.nextInt();
    } while ( resultat < a || resultat > b) ;
    return resultat ;
}
 
 public void afficher()  {
  	System.out.println("Position en X : " + x);
  	System.out.println("Position en Y : " + y);
	System.out.println("Couleur : " + couleur);
	System.out.println("Hauteur: " + hauteur);
	System.out.println("Largeur: " + largeur);
 }
 
 public void deplacer(int nx, int ny){
   x += nx;
   y += ny;
   }
} // Fin de la classe Rectangle