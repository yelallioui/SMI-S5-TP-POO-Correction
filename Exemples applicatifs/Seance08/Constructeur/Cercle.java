/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Cercle {
	private int x, y, r ; 
	public final static int TailleEcran = 600 ;
	public  Cercle(){
                Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Position en x :  ");
		x = lectureClavier.nextInt();
		System.out.print("Position en y :  ");
		y = lectureClavier.nextInt();
		r = rayonVérifié();
	}
	public Cercle(int centrex, int centrey)		{
		x = centrex ;
		y = centrey;
  }
	public Cercle(int centrex, int centrey, int rayon)		{
		this( centrex, centrey) ;
		r = rayonVérifié(rayon);
	}
	public void agrandir(int nr) {
	 r = rayonVérifié(r + nr);		
	}
	private int rayonVérifié() {
 		int tmp;
 		do  {
 			System.out.print("Rayon            :  ");
 			tmp = Lire.i();
 		} while ( tmp < 0 || tmp > TailleEcran) ;
 		return tmp; 
 	} 
	private int rayonVérifié (int tmp) {
 		if (tmp < 0) return 0;
   	else if ( tmp > TailleEcran) return TailleEcran ; 
   	else return tmp;
	}
	public void échangerAvec( Cercle autre) {	 
		int tmp; 
		tmp = x;
		x = autre.x;
		autre.x = tmp;
		tmp = y;
		y = autre.y;
		autre.y = tmp;
	}
	public void afficher()  {
		System.out.println("Centre en " + x + ", " + y);
		System.out.println("Rayon : " + r);
	}
	public double périmètre() {
		return 2*Math.PI*r;
	}
	public void déplacer(int nx, int ny) {										
		x = nx;									
		y = ny;
	}
} // Fin de la classe Cercle