/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Triangle  {
 public int xA, yA, xB, yB, xC, yC ;

 public void créer()
 {
   Scanner lectureClavier = new Scanner(System.in);
   System.out.println("Point A : ");
   System.out.print("Entrez l'abscisse  : ");
   xA = lectureClavier.nextInt();
   System.out.print("Entrez l'ordonnee : ");
   yA = lectureClavier.nextInt();
   System.out.println("Point B : ");
   System.out.print("Entrez l'abscisse  : ");
   xB = lectureClavier.nextInt();
   System.out.print("Entrez l'ordonnee : ");
   yB = lectureClavier.nextInt();
   System.out.println("Point C : ");
   System.out.print("Entrez l'abscisse  : ");
   xC = lectureClavier.nextInt();
   System.out.print("Entrez l'ordonnee : ");
   yC = lectureClavier.nextInt();
 }

 
 public void afficher()  {
  	System.out.println("Point A : " + xA + "  " + yA);
	System.out.println("Point B : " + xB + "  " + yB);
	System.out.println("Point C : " + xC + "  " + yC);
 }
 public void deplacer(int nx, int ny){
   xA += nx;
   yA += ny;
   xB += nx;
   yB += ny;
   xC += nx;
   yC += ny;	
   }
} // Fin de la classe Triangle