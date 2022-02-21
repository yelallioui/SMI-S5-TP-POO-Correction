/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Statistique  {
  public static void main (String [] arg)  {
   int nbCB, nbCheque, nbVirement, nbDebit;
   double prctCB, prctCh, prctVi;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.print("Nombre d'achat Cartes Bleues : ");
   nbCB = lectureClavier.nextInt();
   System.out.print("Nombre de cheques emis : ");
   nbCheque = lectureClavier.nextInt();
   System.out.print("Nombre de virements automatiques : ");
   nbVirement = lectureClavier.nextInt();
   nbDebit = nbCB + nbCheque + nbVirement; 
   prctCB = (double) nbCB / nbDebit  * 100;
   prctCh = (double) nbCheque / nbDebit  * 100;
   prctVi = (double) nbVirement / nbDebit  * 100;
   System.out.println("Vous avez emis " + nbDebit + " ordres de debit");
   System.out.println("dont " + prctCB + " % par Carte bleue ");
   System.out.println("     " + prctCh + " % par Cheques ");
   System.out.println("     " + prctVi + " % par virements automatiques ");
 }
}