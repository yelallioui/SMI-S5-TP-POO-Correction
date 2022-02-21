/**
 * @author yelallioui
 *
 */

// a. Définition de l'interface Deplacement
interface Deplacement {
 
 // a. Définition du comportement seDeplacer()
 public void seDeplacer();

 // a. Définition du comportement deplacementEnX()
 // Par défaut il n'y a pas de déplacement en X
 default public void deplacementEnX() {
 }
// a. Définition du comportement deplacementEnY()
// Par défaut il n'y a pas de déplacement en Y
 default public void deplacementEnY() {
 }


} // Fin de la l'interface Deplacement