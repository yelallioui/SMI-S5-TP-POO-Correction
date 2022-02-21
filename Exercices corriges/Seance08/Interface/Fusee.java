/**
 * @author yelallioui
 *
 */
import java.util.*;
// c. Définition de la classe Fusee héritant de la classe MoyenDeTransport
public class Fusee extends MoyenDeTransport {

 public Fusee(int xx, int yy)	{
   super(xx, yy);
    // c. Verifier que la vitesse de la fuséée ne dépasse pas 2000
   vitesse = limitation(100, 2000);
   System.out.println("Je suis une fusee ! ");
   System.out.println("Vitesse : " + vitesse);
 }

 // c. Une fusée se déplace sur l'axe des X 
 public void deplacementEnX()   {	
 		x+=vitesse;	
 		System.out.println("x : " + x);			
 }
 // c. Une fusée se déplace sur l'axe des Y 
 public void deplacementEnY()   {	
 		y+=vitesse;	
 		System.out.println("y : " + y);	
 }
 
} // Fin de la classe Fusee