/**
 * 
 */
package cm.objis.gestionscolarite.domaine;

/**
 * Cette classe affiche les attributs d'un individu
 * 
 * @author YEYAP Yvan
 * @version 2.0
 */

public class Individu {

	protected String nom;
	protected String prenom;
	protected String classe;
	protected int age;
	protected String dateDeNaissance;
	protected String sexe;
	protected String tuteur;
	protected int tuteurnum;
	protected String addresse;
	protected int numero;

	/**
	 * constructeurs prennant en parametres les proprietes de la classe etudiant
	 */
	public Individu(String nom, String prenom, String classe, int age, String sexe, String dateDeNaissance, int numero,
			String tuteur, int tuteurnum, String addresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
		this.age = age;
		this.sexe = sexe;
		this.dateDeNaissance = dateDeNaissance;
		this.numero = numero;
		this.tuteur = tuteur;
		this.tuteurnum = tuteurnum;
		this.addresse = addresse;
	}

	/**
	 * Surchage du constructeur
	 */
	public Individu() {
		super();
	}

	/*
	 * Getters & Setters
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTuteur() {
		return tuteur;
	}

	public void setTuteur(String tuteur) {
		this.tuteur = tuteur;
	}

	public int getTuteurnum() {
		return tuteurnum;
	}

	public void setTuteurnum(int tuteurnum) {
		this.tuteurnum = tuteurnum;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * methode qui enregistre un individu
	 */
	public void confirmation() {
		// affiche une instruction
		System.out.println("Enregistrement en cours.......\nVeuillez patienter.....\nIndividu enregistré avec succes");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Individu [nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + ", age=" + age
				+ ", dateDeNaissance=" + dateDeNaissance + ", sexe=" + sexe + ", tuteur=" + tuteur + ", tuteurnum="
				+ tuteurnum + ", addresse=" + addresse + ", numero=" + numero + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getClasse()=" + getClasse() + ", getAge()=" + getAge()
				+ ", getDateDeNaissance()=" + getDateDeNaissance() + ", getSexe()=" + getSexe() + ", getTuteur()="
				+ getTuteur() + ", getTuteurnum()=" + getTuteurnum() + ", getAddresse()=" + getAddresse()
				+ ", getNumero()=" + getNumero() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
