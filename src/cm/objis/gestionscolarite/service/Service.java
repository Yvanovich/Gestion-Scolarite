package cm.objis.gestionscolarite.service;

import java.util.List;
import java.util.Scanner;

import cm.objis.gestionscolarite.dao.Dao;
import cm.objis.gestionscolarite.dao.IDao;
import cm.objis.gestionscolarite.domaine.Etudiant;
import cm.objis.gestionscolarite.domaine.Individu;

/**
 * 
 * @author NKOUOTOU Yvan Classe qui implemente l'interface IService
 */
public class Service implements IService {

	private IDao dao;

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public Service(IDao dao) {
		super();
		this.dao = dao;
	}

	/**
	 * Methode affichant le contenu de la base de donnees
	 */
	@Override
	public List<Etudiant> lectureServiceEtudiant() {
		// TODO Auto-generated method stub
		return dao.lectureDaoEtudiants();
	}

	/**
	 * Methode qui appel la methode enregistrer dans la classe Dao
	 * 
	 * @return
	 */
	@Override
	public int enregistrerServiceEtudiant(Etudiant ed) {
		// TODO Auto-generated method stub
		return dao.enregistrerDaoEtudiant(ed);
	}
}