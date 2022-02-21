/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Cercle	{
 public static void main(String [] argument)  {
	double unRayon, lePerimetre;
        Scanner lectureClavier = new Scanner(System.in);
	System.out.print("Valeur du rayon : ");
	unRayon = lectureClavier.nextDouble();
	lePerimetre = 2 * Math.PI * unRayon;
	System.out.print("Le cercle de rayon " + unRayon);
	System.out.println(" a pour perimetre : "+ lePerimetre);
 }
}