
/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Forme {
 public final static int largeurEcran = 800 ;
 public final static int hauteurEcran = 600 ;
 public final static int couleurMax = 10 ;
 protected int x, y, couleur ;
 
 public Forme(int nx, int ny, int nc) {	
    x = verifier(nx, 0, largeurEcran) ;	
    y = verifier(ny, 0, hauteurEcran) ;
    couleur = verifier(nc, 0, couleurMax);
 }
 
 public Forme() {	
    x = verifier("en X", 0, largeurEcran);
    y = verifier("en Y", 0, hauteurEcran);
	couleur = verifier("couleur", 0, couleurMax);;
	 }
 public void afficher() {
 	System.out.println("Couleur : " + couleur);
 	System.out.println("Position en " + x + ", " + y); 
 }

 protected int verifier(String s, int a, int b) {
    Scanner lectureClavier = new Scanner(System.in);
    int resultat;
    do  {
	System.out.print(s+"          :  ");
    	resultat= lectureClavier.nextInt();
    } while ( resultat < a || resultat > b) ;
    return resultat ;
 }

 
 protected int verifier(int tmp, int a, int b) {
	if (tmp < a) return a;
	else if ( tmp > b) return b ; 
	else return tmp;
 }
 
 
 public void deplacer(int nx, int ny)   {						
 	x = verifier(x+nx, 0, largeurEcran) ;	
    y = verifier(y+ny, 0, hauteurEcran) ;
 }
 
 public void colorier(int nc)   {						
    couleur = verifier(nc, 0, couleurMax);					
 }
} // Fin de la classe Forme