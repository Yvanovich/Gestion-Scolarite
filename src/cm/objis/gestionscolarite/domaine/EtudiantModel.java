package cm.objis.gestionscolarite.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EtudiantModel extends AbstractTableModel {

	private final String[] entetes = { "Nom", "Prenom", "Classe", "Age", "Sexe", "DateDeNaissance", "Numero", "Tuteur",
			"Tuteurnum", "Addresse", "Matricule" };

	private List<Etudiant> etudiants;

	public EtudiantModel(List<Etudiant> etudiants) {

		this.etudiants = etudiants;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public int getRowCount() {
		return etudiants.size();
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			// Nom
			return etudiants.get(rowIndex).getNom();
		case 1:
			// Prenom
			return etudiants.get(rowIndex).getPrenom();
		case 2:
			// Classe
			return etudiants.get(rowIndex).getClasse();
		case 3:
			// Age
			return etudiants.get(rowIndex).getAge();
		case 4:
			// Sexe
			return etudiants.get(rowIndex).getSexe();
		case 5:
			// DateDeNaissance
			return etudiants.get(rowIndex).getDateDeNaissance();
		case 6:
			// Numero
			return etudiants.get(rowIndex).getNumero();
		case 7:
			// Tuteur
			return etudiants.get(rowIndex).getTuteur();
		case 8:
			// Tuteurnum
			return etudiants.get(rowIndex).getTuteurnum();
		case 9:
			// Addresse
			return etudiants.get(rowIndex).getAddresse();
		case 10:
			// Matricule
			return etudiants.get(rowIndex).getMatricule();

		default:
			throw new IllegalArgumentException();
		}

	}
}
