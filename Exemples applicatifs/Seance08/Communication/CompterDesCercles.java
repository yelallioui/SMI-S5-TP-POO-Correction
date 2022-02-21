/**
 * @author yelallioui
 *
 */

public class CompterDesCercles {
 public static void main(String [] arg) {
  Cercle A  = new Cercle();
  A.créer();
  System.out.println("Nombre de cercle(s) : " + Cercle.nombre);
  Cercle B = new Cercle();
  B.créer();
  System.out.println("Nombre de cercle(s) : " + Cercle.nombre);
 }
} // Fin de la classe CompterDesCercles