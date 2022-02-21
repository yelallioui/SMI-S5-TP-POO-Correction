/**
 * @author yelallioui
 *
 */
public class Exercice3 {
	public static void main(String [] parametre) {
		int R, max = f(0);
		for (int x = -5; x <= 5; x++) {	
			R = f(x) ;
			if (R > max) max = R ; 
		}
		System.out.print("Le max est : " + max);
	}
	public static int f( int x) {
		int resultat;
		resultat = -x * x + 3 * x - 2;
		return resultat;
	}
}