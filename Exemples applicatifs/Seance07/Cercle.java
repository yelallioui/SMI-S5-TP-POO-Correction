/**
 * @author yelallioui
 *
 */

public class Cercle  {
 public int x, y; 				// position du centre
 public int r;   				// rayon 
 public void affiche(){ //Affichage des donn�es de la classe
	System.out.println(" Centre en " + x + ", " + y);
	System.out.println(" Rayon : " + r);
 }

 public double p�rim�tre() {			//Calcul du p�rim�tre d'un cercle
	return 2*Math.PI*r;
 }
 
 public void d�placer(int nx, int ny) { 	// D�place le centre du cercle en 
	x = nx;					// (nx, ny). Ces coordonn�es �tant
	y = ny;					// pass�es en param�tre de la fonction
 }
 
 public void agrandir(int nr) {	// Augmente la valeur courante du 
  r = r + nr;					// rayon avec la valeur pass�e en param�tre
 }
 
 public void �change( Cercle autre) { // Echange la position d'un cercle avec celle 
	int tmp; 				// du cercle pass� en param�tre
	tmp = x; 				// echanger la position en x
	x = autre.x;
	autre.x = tmp;
	tmp = y; 				// echanger la position en y
	y = autre.y;
	autre.y = tmp;
 }
} // Fin de la classe Cercle