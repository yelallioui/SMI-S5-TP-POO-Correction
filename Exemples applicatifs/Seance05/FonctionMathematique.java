/**
 * @author yelallioui
 *
 */
import java.util.*;
public class FonctionMathematique {
 public static void main(String [] argument) {
   double r�sulat, a, b;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Entrez une premiere valeur :");
   a = lectureClavier.nextDouble();
   System.out.print("Entrez une seconde valeur :");
   b = lectureClavier.nextDouble();
   r�sulat = Math.cos(a) ;
   System.out.println("Cos(" + a + ") = " + r�sulat);
   r�sulat = Math.sin(a) ;
   System.out.println("Sin(" + a + ") = " +r�sulat);
   r�sulat = Math.tan(a) ;
   System.out.println("Tan(" + a + ") = " + r�sulat);
   r�sulat = Math.acos(a) ;
   System.out.println("ArcCos(" + a + ") = " + r�sulat);
   r�sulat = Math.asin(a) ;
   System.out.println("ArcSin(" + a + ") = " + r�sulat);
   r�sulat = Math.atan(a) ;
   System.out.println("ArcTan(" + a + ") = " +r�sulat);
   r�sulat = Math.log(a) ;
   System.out.println("Log(" + a + ") = " + r�sulat);
  r�sulat = Math.exp(a) ;
   System.out.println("Exp(" + a + ") = " +r�sulat);
   r�sulat = Math.floor(a) ;
   System.out.println("Floor(" + a + ") = " + r�sulat);
   r�sulat = Math.ceil(a) ;
   System.out.println("Ceil(" + a + ") = " + r�sulat);
   r�sulat = Math.sqrt(a) ;
   //r�sulat = Math.sqrt("quatre") ; erreur de compilation
   System.out.println("Sqrt(" + a + ") = " + r�sulat);
   r�sulat = Math.pow(a,b) ;
   System.out.println("Pow(" + a + ", " + b +") = " + r�sulat);
   r�sulat = Math.abs(a) ;
   System.out.println("Abs(" + a + ") = " + r�sulat);
   r�sulat = Math.max(a,b) ;
   System.out.println("Max(" + a + ", " + b + ") = " + r�sulat);
   r�sulat = Math.min(a,b) ;
   System.out.println("Min(" + a + ", " + b + ") = " + r�sulat);
   r�sulat = Math.random() ;
   System.out.println("Random() = " + r�sulat);
 }
}