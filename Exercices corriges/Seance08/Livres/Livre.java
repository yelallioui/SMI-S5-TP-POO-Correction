/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Livre {

	//8.1 Les propriétés sont privées
	private String titre;
	private String categorie ;
	private String isbn ;
	private String nomAuteur ;
	private String prenomAuteur ;
	private String code ;

	
	
    // 8.2.a Définition des methodes d’accès en écriture
	// Le Titre
	public void setTitre (String valeur) {
		titre = valeur ;
	}
	// La catégorie
	public void setCategorie (String valeur) {
		categorie = valeur;
	}
	// Le numéro ISBN
	public void setIsbn (String valeur) {
		isbn =valeur;
	}
	// Le nom de l'auteur 
	public void setNomAuteur (String valeur) {
		nomAuteur =valeur;
	}
	// Le prénom de l'auteur 
	public void setPrenomAuteur (String valeur) {
		prenomAuteur =valeur;
	}
	
	//  8.3 Définition des methodes d’accès en lecture
	//Le titre
	public String getTitre () {
		return titre;
	}
	// La catégorie
	public String getCategorie () {
		return categorie;
	}
	// Le numéro ISBN
	public String getIsbn () {
		return isbn;
	}
	// Le nom de l'auteur 
	public String getNomAuteur () {
		return nomAuteur;
	}
	// Le prénom de l'auteur 
	public String getPrenomAuteur () {
		return prenomAuteur;
	}
	// Le code d'enregistrement
	public String getCode() {
		code= setCode ();
		return code;
	}

	// 8.4 Définition d'une méthode invisible (métier)
	private String setCode () {
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
	
	// 8.5.a Définition du constructeur par défaut
	public Livre() {
                Scanner lectureClavier = new Scanner(System.in);
		System.out.print("Entrez le titre : ");
		setTitre(lectureClavier.next());
		System.out.print("Entrez la categorie : ");
		setCategorie(lectureClavier.next());
		System.out.print("Entrez le nom de l'auteur : ");
		setNomAuteur(lectureClavier.next());
		System.out.print("Entrez le prenom de l'auteur : ");
		setPrenomAuteur(lectureClavier.next());		
		System.out.print("Entrez le numero ISBN : ");
		setIsbn(lectureClavier.next());
	}	
	
	// 8.5.a surcharge de constructeur
	public Livre(String t, String c, String na, String pa, String i) {
		setTitre(t);
		setCategorie(c);
		setNomAuteur(na);
		setPrenomAuteur(pa);		
		setIsbn(i);
	}	
	
	// Définition des comportements
	public void afficherUnLivre(){
		System.out.println("Titre : " + titre);
		System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);	
		System.out.println("Categorie : " + categorie);	
		System.out.println("ISBN : " + isbn);
		// 8.4 Appel de la méthode invisible
		System.out.println("Code : " + getCode());
	}

}
