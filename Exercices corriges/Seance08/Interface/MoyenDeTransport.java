/**
 * @author yelallioui
 *
 */

// b. Création de la classe MoyenDeTransport
public class MoyenDeTransport implements Deplacement{
 // b. Création des propriétés x,y,vitesse et constante vitesseInitiale
 public final static int vitesseInitiale = 10 ;
 protected int x, y ;
 protected int vitesse ;

 public MoyenDeTransport(int nx, int ny) {	
  x = nx ;	
  y = ny ;
 }
    
 // d. Un moyen de transport possède une vitesse bornée
 protected int limitation (int tmp, int max) {
 	tmp = vitesseInitiale * tmp;
	if (tmp < 0) return 0;
	else if ( tmp > max) return max ; 
	else return tmp;
 }

// c. Definition de la méthode afficher()
 public void afficher() {
  System.out.println("Position en " + x + ", " + y);
 }

 // c. Un moyen de transport se déplace en X et en Y 
 // selon les méthode définies par l'interface Deplacement
 public void seDeplacer(){
 	deplacementEnX();
 	deplacementEnY();
 }
    
// c. les méthodes deplacementEnX() et deplacementEnY n'ont pas besoin d'être redéfinies
// ces dernières sont définies en méthode par défaut dans l'interface Deplacement
} // Fin de la classe Forme