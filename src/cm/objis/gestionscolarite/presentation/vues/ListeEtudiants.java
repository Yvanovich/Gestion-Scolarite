package cm.objis.gestionscolarite.presentation.vues;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import cm.objis.gestionscolarite.dao.Dao;
import cm.objis.gestionscolarite.dao.IDao;
import cm.objis.gestionscolarite.domaine.EtudiantModel;
import cm.objis.gestionscolarite.service.IService;
import cm.objis.gestionscolarite.service.Service;

public class ListeEtudiants extends JFrame {

	private JPanel contentPane;
	private JTable tableEtudiant;

	private IDao dao;
	private IService service;

	/**
	 * Create the frame.
	 */
	public ListeEtudiants() {
		setTitle("Liste D'Etudiants");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		dao = new Dao();
		service = new Service(dao);

		EtudiantModel etumodel = new EtudiantModel(service.lectureServiceEtudiant());

		tableEtudiant = new JTable(etumodel);

		contentPane.add(new JScrollPane(tableEtudiant), BorderLayout.CENTER);
	}

}
