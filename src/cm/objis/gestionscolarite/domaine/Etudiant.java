package cm.objis.gestionscolarite.domaine;

/**
 * 
 * @author NKOUOTOU Yvan classe enfant de la classe individu
 */
public class Etudiant extends Individu {

	private String matricule;

	public Etudiant() {
		super();
	}
	// TODO Auto-generated constructor stub

	/**
	 * constructeurs prennant en parametres les proprietes de la classe etudiant
	 * 
	 * @param nom
	 * @param prenom
	 * @param classe
	 * @param age
	 * @param sexe
	 * @param dateDeNaissance
	 * @param numero
	 * @param tuteur
	 * @param tuteurnum
	 * @param addresse
	 * 
	 */
	public Etudiant(String nom, String prenom, String classe, int age, String sexe, String dateDeNaissance, int numero,
			String tuteur, int tuteurnum, String addresse, String matricule) {
		super(nom, prenom, classe, age, sexe, dateDeNaissance, numero, tuteur, tuteurnum, addresse);
		this.matricule = matricule;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * redefinition de la methode confirmation
	 */
	public void confirmation() {
		System.out.println(
				"Nous allons maintenant proceder a l'inscription de cet etudiant\nVeuillez patienter.....\nInscription Reussie");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", classe=" + classe
				+ ", age=" + age + ", dateDeNaissance=" + dateDeNaissance + ", sexe=" + sexe + ", tuteur=" + tuteur
				+ ", tuteurnum=" + tuteurnum + ", addresse=" + addresse + ", numero=" + numero + ", getMatricule()="
				+ getMatricule() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getClasse()="
				+ getClasse() + ", getAge()=" + getAge() + ", getDateDeNaissance()=" + getDateDeNaissance()
				+ ", getSexe()=" + getSexe() + ", getTuteur()=" + getTuteur() + ", getTuteurnum()=" + getTuteurnum()
				+ ", getAddresse()=" + getAddresse() + ", getNumero()=" + getNumero() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
