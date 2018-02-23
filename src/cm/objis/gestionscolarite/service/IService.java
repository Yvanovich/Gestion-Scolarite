package cm.objis.gestionscolarite.service;

import java.util.List;

import cm.objis.gestionscolarite.domaine.Etudiant;
import cm.objis.gestionscolarite.domaine.Individu;

/**
 * Interface contenant uniquement des declarations de methode a implementer
 */
public interface IService {
	public List<Etudiant> lectureServiceEtudiant();

	public int enregistrerServiceEtudiant(Etudiant ed);

}