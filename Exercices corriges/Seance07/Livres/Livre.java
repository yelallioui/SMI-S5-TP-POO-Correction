/**
 * @author yelallioui
 *
 */

public class Livre {

	//7.3 Définition des propriétés
	public String titre;
	public String categorie ;
	public String isbn ;
	public String nomAuteur ;
	public String prenomAuteur ;
	public String code ;

	//7.4 Définition des comportements
	public void afficherUnLivre(){
		System.out.println("Titre : " + titre);
		System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);	
		System.out.println("Categorie : " + categorie);	
		System.out.println("ISBN : " + isbn);
	}
	public String calculerLeCode () {
		String debutNom;
		String debutPrenom;
		String debutCategorie;
		int longueurIsbn;
		String finIsbn;

		debutNom=nomAuteur.substring(0,2);
		debutPrenom=prenomAuteur.substring(0,2);
		debutCategorie=categorie.substring(0,2);
		longueurIsbn=isbn.length();
		finIsbn=isbn.substring((longueurIsbn-2),longueurIsbn);
		return debutNom+debutPrenom+debutCategorie+finIsbn;

	}
}
