/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Exercice1 {
	public static void main(String [] argument) {
		String s1 = "", s2 = "", s3 = "", s4 = "";
		int nbA = 0;
                Scanner lectureClavier = new Scanner(System.in);
		// a. demande la saisie d'une phrase
		System.out.print("Entrez une phrase : ");
		s1 = lectureClavier.next();
		// b. affiche la phrase en majuscule 
		s2 = s1.toUpperCase();
		for (int i = 0; i < s2.length(); i++)
			if(s2.charAt(i) == 'A') nbA++;
		System.out.println("Vous avez entre : " + s1);
		System.out.println("Soit en majuscule : " + s2);
		System.out.println("Ce mot contient : " + nbA + " A ");
		s3 = s2.replace('A','*');
		System.out.println("Il s'ecrit donc : " + s3);
		System.out.print("Entrez un second mot : ");
		s4 = lectureClavier.next();
		if (s1.regionMatches(5,s4,0,7))
		  System.out.println("La sous chaine " + s4 + " est bien placee ");
	}
}