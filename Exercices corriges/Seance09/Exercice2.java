/**
 * @author yelallioui
 *
 */
public class Exercice2  {
 public static void main (String [] argument)  {
	int laPlusGrande, laPlusPetite, laSomme = 0, iMax = 0, nbMoy = 0 ;
	double laMoyenne;
	if (argument.length > 0) {
		int [] valeur = new int [argument.length];
		for (int i= 0; i < argument.length; i++)
			// a. stocke dans un tableau, des valeurs entières passées 
			//    en paramètre de la ligne de commande ;
			valeur[i] = Integer.parseInt(argument[i]);
		laPlusGrande = valeur[0] ;
		for (int i= 0; i < valeur.length; i++) {
			if (laPlusGrande < valeur[i]) {
			// d. recherche la plus grande des valeurs 
				laPlusGrande = valeur[i] ;
			// e. détermine la position de la plus grande des valeurs 
				iMax = i;
			}
			// b. calcule la somme de ces valeurs 
			laSomme = laSomme + valeur[i] ;
		} 
		// c. calcule la moyenne de ces valeurs 
		laMoyenne = (float) laSomme / valeur.length ;
		for (int i= 0; i < valeur.length; i++) 
			// f. calcule le nombre de valeurs supérieure à la moyenne 
			if ( valeur[i] >= laMoyenne) nbMoy++;
		System.out.println("La plus grande valeur est : " + laPlusGrande) ;
		System.out.println("A l'indice : " + iMax + " du tableau ") ;
		System.out.println("La moyenne de ces valeurs : " + laMoyenne) ;
		System.out.println("Nombre de valeurs > a la moyenne : " + nbMoy) ;
	}
 	else System.out.println("Commande : java Exercice2 listeDesValeursEntières ");
 } // Fin du main ()
} 