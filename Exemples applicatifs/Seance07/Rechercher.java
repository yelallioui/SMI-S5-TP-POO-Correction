/**
 * @author yelallioui
 *
 */
import java.util.*;
class Rechercher {
 public static void main(String [] argument)  {
  String phrase = "Mieux vaut tard que jamais";
  String soumo ="";
  int place;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.println("Vous avez dit : " + phrase);
  soumo = phrase.substring(11,15);
  System.out.println("De 11 a 15, la sous chaine est :  " + soumo);

  for ( int i = 0; i < 5; i++)
     System.out.println("en " + i + ", il y a : " + phrase.charAt(i));  

  System.out.print("Entrez un mot  : ");
  soumo = lectureClavier.next();

  if(phrase.endsWith(soumo))
   System.out.println("La phrase se termine avec : " + soumo);
  else
   System.out.println("La phrase ne finit pas avec : " + soumo);

  place = phrase.indexOf(soumo);
  if (place == -1)
   System.out.println("Ce mot n'existe pas dans : " + phrase);
  else
   System.out.println(soumo+" est a la position :  " + place);
 }
}