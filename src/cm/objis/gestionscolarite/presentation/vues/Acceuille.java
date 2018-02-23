package cm.objis.gestionscolarite.presentation.vues;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Acceuille {

	private JFrame frmGestionScolarite;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuille window = new Acceuille();
					window.frmGestionScolarite.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Acceuille() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionScolarite = new JFrame();
		frmGestionScolarite.setTitle("Gestion Scolarite");
		frmGestionScolarite.getContentPane().setBackground(Color.CYAN);
		frmGestionScolarite.getContentPane().setForeground(Color.BLACK);
		frmGestionScolarite.getContentPane().setFont(new Font("Comic Sans MS", Font.ITALIC, 15));
		frmGestionScolarite.setBounds(100, 100, 585, 280);
		frmGestionScolarite.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionScolarite.getContentPane().setLayout(null);

		JButton buttonListEtudiants = new JButton("Liste Des Etudiants");
		buttonListEtudiants.setBackground(Color.BLUE);
		buttonListEtudiants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeEtudiants frame = new ListeEtudiants();
				frame.setVisible(true);
			}
		});
		buttonListEtudiants.setBounds(58, 189, 139, 23);
		frmGestionScolarite.getContentPane().add(buttonListEtudiants);

		JButton btnEnregistrerEtudiant = new JButton("Enregistrer Etudiant");
		btnEnregistrerEtudiant.setBackground(Color.BLUE);
		btnEnregistrerEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionEtudiants window = new GestionEtudiants();
				window.frameEnregistrerEtudiant.setVisible(true);

			}
		});
		btnEnregistrerEtudiant.setBounds(335, 189, 139, 23);
		frmGestionScolarite.getContentPane().add(btnEnregistrerEtudiant);

		lblNewLabel = new JLabel("Bienvenue Sur Le Programme De Scolarite");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(61, 11, 413, 51);
		frmGestionScolarite.getContentPane().add(lblNewLabel);

		lblNewLabel_1 = new JLabel(
				"Cette application vous permet d'inscrire des etudiants et afficher la liste de ces etudiants");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 73, 536, 51);
		frmGestionScolarite.getContentPane().add(lblNewLabel_1);

		JMenuBar menuBar = new JMenuBar();
		frmGestionScolarite.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("Fichier");
		menuBar.add(mnFile);

		JMenuItem mntmEnregistrerEtudiant = new JMenuItem("Enregistrer Etudiant");
		mntmEnregistrerEtudiant.setIcon(
				new ImageIcon(Acceuille.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		mntmEnregistrerEtudiant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestionEtudiants window = new GestionEtudiants();
				window.frameEnregistrerEtudiant.setVisible(true);
			}
		});
		mnFile.add(mntmEnregistrerEtudiant);

		JMenuItem mntmListeDesEtudiants = new JMenuItem("Liste Des Etudiants");
		mntmListeDesEtudiants
				.setIcon(new ImageIcon(Acceuille.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mntmListeDesEtudiants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListeEtudiants frame = new ListeEtudiants();
				frame.setVisible(true);
			}
		});
		mnFile.add(mntmListeDesEtudiants);

		JMenuItem mntmExit = new JMenuItem("Quitter");
		mntmExit.setIcon(new ImageIcon(Acceuille.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmCopier = new JMenuItem("Copier                     Ctrl+C");
		mntmCopier.setIcon(
				new ImageIcon(Acceuille.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")));
		mnEdit.add(mntmCopier);

		JMenuItem mntmCouper = new JMenuItem("Couper                    Ctrl+X");
		mntmCouper.setIcon(
				new ImageIcon(Acceuille.class.getResource("/com/sun/javafx/scene/web/skin/Cut_16x16_JFX.png")));
		mnEdit.add(mntmCouper);

		JMenuItem mntmColler = new JMenuItem("Coller                      Ctrl+V");
		mntmColler.setIcon(
				new ImageIcon(Acceuille.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		mnEdit.add(mntmColler);

		JMenuItem mntmSupprimer = new JMenuItem("Supprimer                Suppr");
		mntmSupprimer.setIcon(
				new ImageIcon(Acceuille.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		mnEdit.add(mntmSupprimer);

		JMenuItem mntmToutSelectionner = new JMenuItem("Tout Selectionner      Ctrl+A");
		mnEdit.add(mntmToutSelectionner);
	}
}
