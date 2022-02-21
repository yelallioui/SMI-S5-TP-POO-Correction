/**
 * @author yelallioui
 *
 */
public class FormerDesCercles {
 public static void main(String [] arg) {
  Cercle A  = new Cercle(5, 5);
  A.afficher();
  double p = A.périmètre();
  System.out.println("Votre cercle a pour perimetre : " + p);
  A.déplacer(5, 10);
  System.out.println("Apres déplacement : ");
  A.afficher();
  A.agrandir(10);
  System.out.println("Apres agrandissement : ");
  A.afficher();
  Forme F = new Forme (10, 10);
  F.échangerAvec(A);
  A.afficher();
  F.afficher();
  A.échangerAvec(F);
  A.afficher();
  F.afficher();
 }
}