/**
 * @author yelallioui
 *
 */

public class CompterDesCercles {
 public static void main(String [] arg) {
  Cercle A  = new Cercle();
  A.cr�er();
  System.out.println("Nombre de cercle(s) : " + Cercle.nombre);
  Cercle B = new Cercle();
  B.cr�er();
  System.out.println("Nombre de cercle(s) : " + Cercle.nombre);
 }
} // Fin de la classe CompterDesCercles