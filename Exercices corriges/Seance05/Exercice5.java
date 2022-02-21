/**
 * @author yelallioui
 *
 */

import java.util.*;
public class Exercice5 {
 public static void main (String [] arg)  {
	int nbCB, nbCheque, nbVirement, nbDebit;
	double résultat;
        Scanner lectureClavier = new Scanner(System.in);
	System.out.print(" Nombre d'achat Cartes Bleues : ");
	nbCB = lectureClavier.nextInt();
	System.out.print(" Nombre de chèques émis : ");
	nbCheque = lectureClavier.nextInt();
	System.out.print(" Nombre de virements automatiques : ");
	nbVirement = lectureClavier.nextInt();
	nbDebit = nbCB + nbCheque + nbVirement; 
	System.out.println("Vous avez emis " + nbDebit + " debits ");
	résultat = pourcentage(nbDebit, nbCB) ;
	System.out.println(" dont " + résultat + " % par Carte bleue ");
	résultat = pourcentage(nbDebit, nbCheque) ;
	System.out.println("      " + résultat + " % par Cheques ");
	résultat = pourcentage(nbDebit, nbVirement) ;
	System.out.println("      " + résultat + " % par Virement automatique ");
 }

 public static double pourcentage(int t, int nb)	{
	double prct = (double) nb / t * 100;
	return prct ;
 }
}