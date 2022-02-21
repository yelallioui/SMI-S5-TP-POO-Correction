/**
 * @author yelallioui
 *
 */
import java.util.*;
public class JourParMois  {  // Le fichier s'appelle JourParMois.java
  public static void main (String [] parametre)  {
   byte mois, nbjours = 0 ; 
   short année ;
   Scanner lectureClavier = new Scanner(System.in);
   System.out.println("De quel mois s'agit-il ? :") ;
   mois =  lectureClavier.nextByte(); 
   System.out.println("De quelle annee ? :") ;
   année =  lectureClavier.nextShort(); 
   switch(mois)   {
     case 1 : case 3 :		// Pour les mois à 31 jours 
     case 5 : case 7 : 
     case 8 : case 10 :	
     case 12 : 
            nbjours = 31 ; 
            break ;
     case 4 : case 6 :		// Pour les mois à 30 jours
     case 9 : case 11 :
            nbjours  = 30 ;
            break ;
     case 2 :  			// Pour le cas particulier du mois de février
          if (année % 4 == 0 && année % 100 != 0 || année % 400 == 0)
               nbjours  = 29 ; 
          else  nbjours  = 28 ;
          break ;
     default :			// En cas d'erreur de frappe
              System.out.println("Impossible, ce mois n'existe pas ") ;
              System.exit(0) ;
   }
   System.out.print(" En " + année + ", le mois n° " + mois) ;
   System.out.println(" a " + nbjours + " jours ") ;
  } // Fin du main()
} // Fin de la class JourParMois