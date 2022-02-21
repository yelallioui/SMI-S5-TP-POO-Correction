/**
 * @author yelallioui
 *
 */

import java.util.*;
// b. Définition de la classe Fusee héritant de la classe MoyenDeTransport
public class Ascenseur extends MoyenDeTransport {

 public Ascenseur(int xx, int yy)	{
   super(xx, yy);
   // c. Verifier que la vitesse de la fuséée ne dépasse pas 20
   vitesse = limitation(5, 20);
   System.out.println("Je suis un ascenseur ! ");
   System.out.println("Vitesse : " + vitesse);
 }

// b. Un ascenceur se déplace sur l'axe des Y
//    la méthode deplacementEnY() est redéfinie
 public void deplacementEnY()   {	
 		y+=vitesse;	
 	    System.out.println("y : " + y);			
 }
// b. Un ascenceur ne se déplace pas sur l'axe des X
//    La méthode deplacementX() est celle définie par l'interface Deplacement
 
} // Fin de la classe Ascenseur