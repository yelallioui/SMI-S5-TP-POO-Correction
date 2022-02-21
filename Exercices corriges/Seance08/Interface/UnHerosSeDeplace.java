/**
 * @author yelallioui
 *
 */

public class UnHerosSeDeplace {
 public static void main(String [] arg) {
  Voiture V  = new Voiture(5, 5);
  V.afficher();
  V.seDeplacer();
  V.afficher();
  
   Ascenseur A  = new Ascenseur(20, 5);
  A.afficher();
  A.seDeplacer();
  A.afficher();
  
  Fusee F = new Fusee(50, 0);
  F.afficher();
  F.seDeplacer();
  F.afficher();
  
  
  
  
 }
}