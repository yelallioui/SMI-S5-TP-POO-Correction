/**
 * @author yelallioui
 *
 */

public class Cercle extends Forme {
 private int rayon ;
 
 public Cercle(int nx, int ny, int nr, int nc){
   super(nx, ny, nc);
   rayon = verifier(nr, 0, hauteurEcran);
 }
 public Cercle()	{
    rayon = verifier("Rayon : ", 0, hauteurEcran);
  }
 
 public void afficher()  {
  super.afficher();
  System.out.println("Rayon : " + rayon);
 }

} // Fin de la classe Cercle