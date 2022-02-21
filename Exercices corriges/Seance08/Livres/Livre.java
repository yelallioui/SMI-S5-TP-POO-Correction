/**
 * @author yelallioui
 *
 */
import java.util.*;
public class Livre {

	//8.1 Les propri�t�s sont priv�es
	private String titre;
	private String categorie ;
	private String isbn ;
	private String nomAuteur ;
	private String prenomAuteur ;
	private String code ;

	
	
    // 8.2.a D�finition des methodes d�acc�s en �criture
	// Le Titre
	public void setTitre (String valeur) {
		titre = valeur ;
	}
	// La cat�gorie
	public void setCategorie (String valeur) {
		categorie = valeur;
	}
	// Le num�ro ISBN
	public void setIsbn (String valeur) {
		isbn =valeur;
	}
	// Le nom de l'auteur 
	public void setNomAuteur (String valeur) {
		nomAuteur =valeur;
	}
	// Le pr�nom de l'auteur 
	public void setPrenomAuteur (String valeur) {
		prenomAuteur =valeur;
	}
	
	//  8.3 D�finition des methodes d�acc�s en lecture
	//Le titre
	public String getTitre () {
		return titre;
	}
	// La cat�gorie
	public String getCategorie () {
		return categorie;
	}
	// Le num�ro ISBN
	public String getIsbn () {
		return isbn;
	}
	// Le nom de l'auteur 
	public String getNomAuteur () {
		return nomAuteur;
	}
	// Le pr�nom de l'auteur 
	public String getPrenomAuteur () {
		return prenomAuteur;
	}
	// Le code d'enregistrement
	public String getCode() {
		code= setCode ();
		return code;
	}

	// 8.4 D�finition d'une m�thode invisible (m�tier)
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
	
	// 8.5.a D�finition du constructeur par d�faut
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
	
	// D�finition des comportements
	public void afficherUnLivre(){
		System.out.println("Titre : " + titre);
		System.out.println("Auteur : " + nomAuteur + " " + prenomAuteur);	
		System.out.println("Categorie : " + categorie);	
		System.out.println("ISBN : " + isbn);
		// 8.4 Appel de la m�thode invisible
		System.out.println("Code : " + getCode());
	}

}
