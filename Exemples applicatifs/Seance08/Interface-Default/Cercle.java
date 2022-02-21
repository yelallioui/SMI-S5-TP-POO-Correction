/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Cercle extends Forme {
 public final static int TailleEcran = 600 ;private int  r ; 
 public Cercle(int xx, int yy)	{
   super(xx, yy);
   couleur = 10;
   r = rayonVerifie();
 }
 public void afficher()  {
  super.afficher();
  System.out.println("Rayon : " + r);
 }
 private int rayonVerifie() {
        Scanner lectureClavier = new Scanner(System.in);
	int tmp;
	do  {
		System.out.print("Rayon          :  ");
		tmp = lectureClavier.nextInt();
	} while ( tmp < 0 || tmp > TailleEcran) ;
	return tmp; 
 } 
 private int rayonVerifie (int tmp) {
	if (tmp < 0) return 0;
	else if ( tmp > TailleEcran) return TailleEcran ; 
	else return tmp;
 }
 public double perimetre() {
  return 2*Math.PI*r;
 }
 public double surface() {
  return Math.PI*r*r;
 }
 public void agrandir(int nr) {
  r = rayonVerifie(r + nr);	
 }
} // Fin de la classe Cercle