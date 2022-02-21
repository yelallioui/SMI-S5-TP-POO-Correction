/**
 * @author yelallioui
 *
 */

public class Cercle  {
 public int x, y; 				// position du centre
 public int r;   				// rayon 
 public void affiche(){ //Affichage des données de la classe
	System.out.println(" Centre en " + x + ", " + y);
	System.out.println(" Rayon : " + r);
 }

 public double périmètre() {			//Calcul du périmètre d'un cercle
	return 2*Math.PI*r;
 }
 
 public void déplacer(int nx, int ny) { 	// Déplace le centre du cercle en 
	x = nx;					// (nx, ny). Ces coordonnées étant
	y = ny;					// passées en paramètre de la fonction
 }
 
 public void agrandir(int nr) {	// Augmente la valeur courante du 
  r = r + nr;					// rayon avec la valeur passée en paramètre
 }
 
 public void échange( Cercle autre) { // Echange la position d'un cercle avec celle 
	int tmp; 				// du cercle passé en paramètre
	tmp = x; 				// echanger la position en x
	x = autre.x;
	autre.x = tmp;
	tmp = y; 				// echanger la position en y
	y = autre.y;
	autre.y = tmp;
 }
} // Fin de la classe Cercle