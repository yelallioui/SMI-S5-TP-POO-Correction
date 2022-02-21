/**
 * @author yelallioui
 *
 */

import java.util.*;

// a. Définition de la classe Voiture héritant de la classe MoyenDeTransport
public class Voiture extends MoyenDeTransport {

 public Voiture(int xx, int yy)	{
   super(xx, yy);
   // a. Verifier que la vitesse de la voiture ne dépasse pas 100
   vitesse = limitation(10, 100);
   System.out.println("Je suis une voiture ! ");
   System.out.println("Vitesse : " + vitesse);
 }

// a. Une voiture se déplace sur l'axe des X 
//    la méthode deplacementEnX() est redéfinie
 public void deplacementEnX()   {	
       x+=vitesse;	
       System.out.println("x : " + x);		
 }

// a. Une voiture ne se déplace pas sur l'axe des Y
//    La méthode deplacementY() est celle définie par l'interface Deplacement
} // Fin de la classe Voiture