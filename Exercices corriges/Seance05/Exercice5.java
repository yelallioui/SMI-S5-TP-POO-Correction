/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice5 {
 public static void main (String [] arg)  {
	int nbCB, nbCheque, nbVirement, nbDebit;
	double r�sultat;
        Scanner lectureClavier = new Scanner(System.in);
	System.out.print(" Nombre d'achat Cartes Bleues : ");
	nbCB = lectureClavier.nextInt();
	System.out.print(" Nombre de ch�ques �mis : ");
	nbCheque = lectureClavier.nextInt();
	System.out.print(" Nombre de virements automatiques : ");
	nbVirement = lectureClavier.nextInt();
	nbDebit = nbCB + nbCheque + nbVirement; 
	System.out.println("Vous avez emis " + nbDebit + " debits ");
	r�sultat = pourcentage(nbDebit, nbCB) ;
	System.out.println(" dont " + r�sultat + " % par Carte bleue ");
	r�sultat = pourcentage(nbDebit, nbCheque) ;
	System.out.println("      " + r�sultat + " % par Cheques ");
	r�sultat = pourcentage(nbDebit, nbVirement) ;
	System.out.println("      " + r�sultat + " % par Virement automatique ");
 }

 public static double pourcentage(int t, int nb)	{
	double prct = (double) nb / t * 100;
	return prct ;
 }
}