package cm.objis.gestionscolarite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cm.objis.gestionscolarite.domaine.Etudiant;
import cm.objis.gestionscolarite.utils.ConnectionMYSQL;

public class Dao implements IDao {

	public Dao() {
		super();
	}

	@Override
	public int enregistrerDaoEtudiant(Etudiant ed) {

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			String sql = "INSERT INTO `etudiant` (`nom`,`prenom`,`classe`,`age`,`sexe`,`dateDeNaissance`,`numero`,`tuteur`,`tuteurnum`,`addresse`,`matricule`) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

			// Etape 2 : Création d'un statement
			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, ed.getNom());
			ps.setString(2, ed.getPrenom());
			ps.setString(3, ed.getClasse());
			ps.setInt(4, ed.getAge());
			ps.setString(5, ed.getSexe());
			ps.setString(6, ed.getDateDeNaissance());
			ps.setInt(7, ed.getNumero());
			ps.setString(8, ed.getTuteur());
			ps.setInt(9, ed.getTuteurnum());
			ps.setString(10, ed.getAddresse());
			ps.setString(11, ed.getMatricule());

			// Etape 3 : exécution requête
			ps.executeUpdate();

			// Etape 4 : gestion des exceptions et libération 'automatique' des
			// ressources
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}

		return 1;
	}

	@Override
	public List<Etudiant> lectureDaoEtudiants() {

		/*
		 * Creation d'une collection d'etudiant
		 */
		List<Etudiant> maListeEtudiant = new ArrayList<Etudiant>();

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : préparation requête
			Statement st = cn.createStatement();

			String sql = "SELECT * FROM etudiant ";

			// Etape 3 : exécution requête
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				Etudiant ed = new Etudiant();
				ed.setNom(rs.getString("nom"));
				ed.setPrenom(rs.getString("prenom"));
				ed.setClasse(rs.getString("classe"));
				ed.setAge(rs.getInt("age"));
				ed.setSexe(rs.getString("sexe"));
				ed.setDateDeNaissance(rs.getString("dateDeNaissance"));
				ed.setNumero(rs.getInt("numero"));
				ed.setTuteur(rs.getString("tuteur"));
				ed.setTuteurnum(rs.getInt("tuteurnum"));
				ed.setAddresse(rs.getString("addresse"));
				ed.setMatricule(rs.getString("matricule"));

				/**
				 * Instruction permettant d'ajouter un objet etudiant dans la
				 * liste d'etudiant
				 */
				maListeEtudiant.add(ed);
				// System.out.println(rs.getString("prenom")+" "+
				// rs.getString("nom"));
			}

			// Etape 5 : gestion des exceptions et libération 'automatique' des
			// ressources
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return maListeEtudiant;
	}

}
