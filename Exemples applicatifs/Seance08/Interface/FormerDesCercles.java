/**
 * @author yelallioui
 *
 */

public class FormerDesCercles {
 public static void main(String [] arg) {
  Cercle A  = new Cercle(5, 5);
  A.afficher();
  if( A.perimetre() >=0) {
	System.out.println("Le perimetre de A : " + A.perimetre());
  else {
  	System.out.println("Calcul impossible");
  }
  Forme F = new Forme(10,10);
  F.afficher();
  if( F.perimetre() >=0) {
	System.out.println("Le perimetre de F : " + F.perimetre());
  else {
  	System.out.println("Calcul impossible");
  }
 }
}