package cm.objis.gestionscolarite.dao;

import java.util.List;

import cm.objis.gestionscolarite.domaine.Etudiant;

public interface IDao {

	public int enregistrerDaoEtudiant(Etudiant ed);

	public List<Etudiant> lectureDaoEtudiants();

}
