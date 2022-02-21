/**
 * @author yelallioui
 *
 */
import java.util.*;
public class FaireDesCercles {
 public static void main(String [] arg) {
        Scanner lectureClavier = new Scanner(System.in);
	System.out.print("Combien de Cercles : ");
	int nbCercle = lectureClavier.nextInt();

	if (nbCercle < 3) nbCercle = 4;
	// a. Cr�� un tableau de type Cercle, dont la taille est choisie 
	//    par l'utilisateur�. 
	Cercle [] C  = new Cercle [nbCercle];
	for (int i = 0; i < C.length; i++)
		// b. Initialisation par le constructeur par d�faut
		C[i] = new Cercle();
	System.out.println("----------  R�capitulatif  ----------- ");
	for (int i = 0; i < C.length; i++)	C[i].afficher();
	// c. D�placement du cercle 1 en 20, 20
	System.out.println("-----Cercle 1 : D�placement en 20,20  ----- ");
	C[1].d�placer(20, 20);
	C[1].afficher();
	// d. Agrandissement du cercle 1 de 50
	System.out.println("-----Cercle 2 : Agrandissement de 50 ---- ");
	C[2].agrandir(50);
	C[2].afficher();
	// e. Echange du cercle 0 avec le cercle 3
	System.out.println("---- Echange du Cercle 0 avec le cercle 3 ---- ");
	C[0].�changerAvec(C[3]);
	C[0].afficher();
	C[3].afficher();
	// f. Permute les cercles, le cercle 0 va en 1, le cercle 1 en 2 etc.
	System.out.println("----------  Permutations ----------- ");
	for ( int i = 0;  i < C.length; i++)
		C[i].�changerAvec(C[0]);
	for ( int i = 0;  i < C.length; i++)
		C[i].afficher();
 }
}