/**
 * @author yelallioui
 *
 */
import java.util.*;
public class PlusieursResultats {
	public static void main (String [] arg) {	
                var lectureClavier = new Scanner(System.in);	
		System.out.print("Entrer une valeur pour a : ");
		var a = lectureClavier.nextInt();
		System.out.print("Entrer une valeur pour b : ");
		var b = lectureClavier.nextInt();
		System.out.println(" a = "+a+" b = "+b);
	        echange (a,b);	
		System.out.println("Apres echange,");
		System.out.println(" a = "+ a +" b = "+b);
	}
	public static void echange(int x, int  y) {
		var tmp = x;
		x = y;
		y = tmp;
	}
}