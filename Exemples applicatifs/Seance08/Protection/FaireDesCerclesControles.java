/**
 * @author yelallioui
 *
 */
import java.util.*;
public class FaireDesCerclesControles {
 public static void main(String [] arg) {
  Scanner lectureClavier = new Scanner(System.in);
  CercleControle A = new CercleControle();
  A.cr�er();
  A.afficher();
  System.out.print("Entrer une valeur d'agrandissement : ");
  int plus = lectureClavier.nextInt();
  A.agrandir(plus);
  System.out.println("Apr�s agrandissement : ");
  A.afficher();
 }
}