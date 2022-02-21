/**
 * @author yelallioui
 *
 */
import java.util.*;
public class CerclePrive {
 private int x, y, r ; 
 public void créer()  {
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Position en x :  ");
   x = lectureClavier.nextInt();
   System.out.print("Position en y :  ");
   y = lectureClavier.nextInt();
   System.out.print("Rayon         :  ");
   r = lectureClavier.nextInt();
 }
 public void échangerAvec( CerclePrive autre)	 { 
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
public double périmètre()  {
   return 2*Math.PI*r;
 }
 public void déplacer(int nx, int ny)  {
   x = nx;
   y = ny;	
 }
 public void agrandir(int nr)  {	
   r = r + nr;
 }
} // Fin de la classe CerclePrive