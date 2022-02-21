/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Euro {
	public static void main (String [] argument) {
		double F, E = 0.0 ;
		double T = 6.55957 ;
                Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Nombre de Francs : ") ;
		F = lectureClavier.nextDouble();
		E = F / T ;
		System.out.println("Conversion F/E : " + T) ;
		System.out.println("Nombre d'Euro : " + E) ;
	}
}