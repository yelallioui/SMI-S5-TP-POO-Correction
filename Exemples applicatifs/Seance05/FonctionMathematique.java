/**
 * @author yelallioui
 *
 */
import java.util.*;
public class FonctionMathematique {
 public static void main(String [] argument) {
   double résulat, a, b;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Entrez une premiere valeur :");
   a = lectureClavier.nextDouble();
   System.out.print("Entrez une seconde valeur :");
   b = lectureClavier.nextDouble();
   résulat = Math.cos(a) ;
   System.out.println("Cos(" + a + ") = " + résulat);
   résulat = Math.sin(a) ;
   System.out.println("Sin(" + a + ") = " +résulat);
   résulat = Math.tan(a) ;
   System.out.println("Tan(" + a + ") = " + résulat);
   résulat = Math.acos(a) ;
   System.out.println("ArcCos(" + a + ") = " + résulat);
   résulat = Math.asin(a) ;
   System.out.println("ArcSin(" + a + ") = " + résulat);
   résulat = Math.atan(a) ;
   System.out.println("ArcTan(" + a + ") = " +résulat);
   résulat = Math.log(a) ;
   System.out.println("Log(" + a + ") = " + résulat);
  résulat = Math.exp(a) ;
   System.out.println("Exp(" + a + ") = " +résulat);
   résulat = Math.floor(a) ;
   System.out.println("Floor(" + a + ") = " + résulat);
   résulat = Math.ceil(a) ;
   System.out.println("Ceil(" + a + ") = " + résulat);
   résulat = Math.sqrt(a) ;
   //résulat = Math.sqrt("quatre") ; erreur de compilation
   System.out.println("Sqrt(" + a + ") = " + résulat);
   résulat = Math.pow(a,b) ;
   System.out.println("Pow(" + a + ", " + b +") = " + résulat);
   résulat = Math.abs(a) ;
   System.out.println("Abs(" + a + ") = " + résulat);
   résulat = Math.max(a,b) ;
   System.out.println("Max(" + a + ", " + b + ") = " + résulat);
   résulat = Math.min(a,b) ;
   System.out.println("Min(" + a + ", " + b + ") = " + résulat);
   résulat = Math.random() ;
   System.out.println("Random() = " + résulat);
 }
}