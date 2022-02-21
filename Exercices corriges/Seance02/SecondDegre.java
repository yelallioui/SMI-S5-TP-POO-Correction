//**
 * @author yelallioui
 *
 */
import java.util.*;
public class SecondDegre {
	public static void main (String [] arg)	{
		double a, b, c, delta ;
		double x, x1, x2 ;
                Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrer une valeur pour a : ") ;
		a =  lectureClavier.nextDouble();
		System.out.print("Entrer une valeur pour b : ") ;
		b =  lectureClavier.nextDouble();;
		System.out.print("Entrer une valeur pour c : ") ;
		c =  lectureClavier.nextDouble(); 
		if (a == 0)		{
			if (b == 0)		{
				if (c == 0)		{
					System.out.println("tout reel est solution") ;
				}
				else	{
					System.out.println("il n'y a pas de solution") ;
				}
			}
			else	{
				x = -c/b ;
				System.out.println("la solution est " + x) ;
			}
		}
		else	{ 
			delta = b*b - 4*a*c ;
			if (delta < 0)		{
				System.out.println("il n'y a pas de solution dans les reels") ;
			}
			else	{
				x1 = (-b + Math.sqrt(delta))/ (2*a) ;
				x2 = (-b - Math.sqrt(delta))/ (2*a) ;
				System.out.println("il y deux solutions egales a " + x1 + " et " + x2) ;
			}
		}
	}
}