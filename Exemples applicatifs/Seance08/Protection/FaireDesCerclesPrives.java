/**
 * @author yelallioui
 *
 */

public class FaireDesCerclesPrives {
 public static void main(String [] arg) {
  CerclePrive A  = new CerclePrive();
  A.afficher();
  System.out.println("Entrez le rayon : ");
  A.r = Lire.i() ;
  System.out.println("Le cercle est de rayon : " + A.r) ;
 }
}