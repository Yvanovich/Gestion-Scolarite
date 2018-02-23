package cm.objis.gestionscolarite.presentation.vues;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cm.objis.gestionscolarite.dao.Dao;
import cm.objis.gestionscolarite.dao.IDao;
import cm.objis.gestionscolarite.domaine.Etudiant;
import cm.objis.gestionscolarite.service.IService;
import cm.objis.gestionscolarite.service.Service;

import javax.swing.JRadioButton;

public class GestionEtudiants {
//fenetre d'enregistrement d'etudiants
	public JFrame frameEnregistrerEtudiant;
// champs
	private JTextField textFieldNom;
	private JTextField textFieldPrenom;
	private JTextField textFieldClasse;
	private JTextField textFieldAge;
	private JTextField textFieldSexe;
	private JTextField textFieldDateDeNaissance;
	private JTextField textFieldNumero;
	private JTextField textFieldAddresse;
	private JTextField textFieldTuteur;
	private JTextField textFieldTuteurnum;
	private IService service;
	private IDao dao;
	private JTextField textFieldMatricule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionEtudiants window = new GestionEtudiants();
					window.frameEnregistrerEtudiant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionEtudiants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameEnregistrerEtudiant = new JFrame();
		frameEnregistrerEtudiant.setTitle("Enregistrer Un Etudiant");
		frameEnregistrerEtudiant.setBounds(100, 100, 470, 415);
		frameEnregistrerEtudiant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEnregistrerEtudiant.getContentPane().setLayout(null);

		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(35, 25, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblNom);

		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(35, 65, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblPrenom);

		JLabel lblClasse = new JLabel("Classe:");
		lblClasse.setBounds(35, 110, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblClasse);

		textFieldNom = new JTextField();
		textFieldNom.setBounds(105, 23, 324, 16);
		frameEnregistrerEtudiant.getContentPane().add(textFieldNom);
		textFieldNom.setColumns(10);

		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(105, 63, 324, 17);
		frameEnregistrerEtudiant.getContentPane().add(textFieldPrenom);
		textFieldPrenom.setColumns(10);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(33, 149, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblAge);

		JLabel lblDateDeNaissance = new JLabel("Date De Naissance :");
		lblDateDeNaissance.setBounds(35, 189, 108, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblDateDeNaissance);

		textFieldClasse = new JTextField();
		textFieldClasse.setBounds(105, 108, 101, 17);
		frameEnregistrerEtudiant.getContentPane().add(textFieldClasse);
		textFieldClasse.setColumns(10);

		textFieldAge = new JTextField();
		textFieldAge.setBounds(102, 146, 86, 17);
		frameEnregistrerEtudiant.getContentPane().add(textFieldAge);
		textFieldAge.setColumns(10);

		textFieldDateDeNaissance = new JTextField();
		textFieldDateDeNaissance.setBounds(153, 189, 173, 16);
		frameEnregistrerEtudiant.getContentPane().add(textFieldDateDeNaissance);
		textFieldDateDeNaissance.setColumns(10);

		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(340, 345, 89, 23);
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// code source executé apres clique sur enregistrer

				// 1.recupere les donnees entre par l'utillisateur
				String nom = textFieldNom.getText();
				String prenom = textFieldPrenom.getText();
				String classe = textFieldClasse.getText();
				String age = textFieldAge.getText();
				String sexe = textFieldSexe.getText();
				String dateDeNaissance = textFieldDateDeNaissance.getText();
				String numero = textFieldNumero.getText();
				String tuteur = textFieldTuteur.getText();
				String tuteurnum = textFieldTuteurnum.getText();
				String addresse = textFieldAddresse.getText();
				String matricule = textFieldMatricule.getText();

				// 2.creation d'un objet etudiant et mise a jour attribut
				Etudiant etud = new Etudiant();

				etud.setNom(nom);
				etud.setPrenom(prenom);
				etud.setClasse(classe);
				etud.setAge(Integer.parseInt(age));
				etud.setSexe(sexe);
				etud.setDateDeNaissance(dateDeNaissance);
				etud.setNumero(Integer.parseInt(numero));
				etud.setTuteur(tuteur);
				etud.setTuteurnum(Integer.parseInt(tuteurnum));
				etud.setAddresse(addresse);
				etud.setMatricule(matricule);

				// 3.appel de la couche service pour enregistrer etudiant

				int etat = service.enregistrerServiceEtudiant(etud);
				if (etat == 1) {
					JOptionPane.showMessageDialog(null,
							"L'etudiant " + etud.getNom() + " " + etud.getPrenom() + " est bien enregistré");
					textFieldNom.setText("");
					textFieldPrenom.setText("");
					textFieldClasse.setText("");
					textFieldAge.setText("");
					textFieldSexe.setText("");
					textFieldDateDeNaissance.setText("");
					textFieldNumero.setText("");
					textFieldTuteur.setText("");
					textFieldTuteurnum.setText("");
					textFieldAddresse.setText("");
					textFieldMatricule.setText("");

				} else {
					JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement");
				}

			}
		});
		frameEnregistrerEtudiant.getContentPane().add(btnEnregistrer);

		JLabel lblSexe = new JLabel("Sexe:");
		lblSexe.setBounds(242, 110, 53, 18);
		frameEnregistrerEtudiant.getContentPane().add(lblSexe);

		textFieldSexe = new JTextField();
		textFieldSexe.setBounds(297, 110, 85, 16);
		textFieldSexe.setColumns(10);
		frameEnregistrerEtudiant.getContentPane().add(textFieldSexe);

		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(213, 149, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblNumero);

		textFieldNumero = new JTextField();
		textFieldNumero.setBounds(267, 147, 86, 17);
		textFieldNumero.setColumns(10);
		frameEnregistrerEtudiant.getContentPane().add(textFieldNumero);

		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(34, 286, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblAdresse);

		textFieldAddresse = new JTextField();
		textFieldAddresse.setBounds(104, 284, 173, 16);
		textFieldAddresse.setColumns(10);
		frameEnregistrerEtudiant.getContentPane().add(textFieldAddresse);

		textFieldTuteur = new JTextField();
		textFieldTuteur.setBounds(105, 222, 173, 16);
		textFieldTuteur.setColumns(10);
		frameEnregistrerEtudiant.getContentPane().add(textFieldTuteur);

		JLabel lblTuteur = new JLabel("Tuteur");
		lblTuteur.setBounds(35, 223, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblTuteur);

		textFieldTuteurnum = new JTextField();
		textFieldTuteurnum.setBounds(195, 254, 173, 16);
		textFieldTuteurnum.setColumns(10);
		frameEnregistrerEtudiant.getContentPane().add(textFieldTuteurnum);

		JLabel lblNumerosDudesTuteurs = new JLabel("Numero(s) Du/Des Tuteur(s)");
		lblNumerosDudesTuteurs.setBounds(34, 255, 138, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblNumerosDudesTuteurs);

		textFieldMatricule = new JTextField();
		textFieldMatricule.setColumns(10);
		textFieldMatricule.setBounds(105, 311, 173, 16);
		frameEnregistrerEtudiant.getContentPane().add(textFieldMatricule);

		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setBounds(35, 312, 57, 14);
		frameEnregistrerEtudiant.getContentPane().add(lblMatricule);

		dao = new Dao();
		service = new Service(dao);
	}
}
