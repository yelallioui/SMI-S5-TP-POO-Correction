/**
 * @author yelallioui
 *
 */

public class FaireDesFormesGeometriques {

	public static void main(String[] args) {
	    Cercle C  = new Cercle(105, 105, 20, 10);
	    C.afficher();
	    C.deplacer(100, 100);
	    C.afficher();
	    Rectangle R = new Rectangle(100, 100, 50, 20, 5);
	    R.afficher();
	    R.deplacer(200, 200);
	    R.afficher();
	    Triangle T = new Triangle (200, 200, 100, 300, 300, 300, 2);
	    T.afficher();
            T.deplacer(300, 300);
	    T.afficher();
		
	}
}
