# Gestion-Scolarite
				Description de l'application:

GestionScolarite est une application qui permet d'enregistrer et ensuite afficher les informations concernant un(e) etudiant(e) des son inscription dans un etablissement avant qu'il(elle) y frequente.On peut egalement enregistrer un individu avant de passer a son inscription.
					Necessite avant l'execution
					
Installer un jdk ou un jre sur son ordinateur.
Pour l'installation merci de suivre les etapes suivantes:

	-Dirigez vers la partie Java du site d’Oracle : http://www.oracle.com/technetwork/java
	-Dans la zone de droite "software downloads", cliquez sur le lien "Java SE" (pour Java Standard Edition)
	-Cliquez sur l’icone "Java" pour telecharger le JDK
	-Accepter la licence
	-De preference choisir la version la plus recente (derniere sur la liste)
		-si votre machine est une 64 bit, choisir la version du jdk dont le nom a "windows-X64" avant le ".exe"
		-si votre machine est une 32 bit, choisir la version du jdk dont le nom a "windows-i586" avant le ".exe"
	-Cliquez sur le bouton "Enregistrer le fichier". Le telechargement va demarrer
	-Double cliquez sur le fichier telecharge. L’assistant d’installation du JDK va se lancer
	-Cliquez sur le bouton "Next" au fil des fenetre qui s'afficheront
	-Au moment d’installer un environnement d’execution independant du JDK, l’assistant vous consulte. Acceptez les options par defaut et cliquez sur Next
	-Ainsi meme si vous supprimez par la suite le repertoire d’installation du JDK (qui contient aussi une JRE), vous pourrez tout de meme executer des programmes Java sur votre ordinateur
	-Vous arrivez a l’ecran de fin d’installation, qui vous precise que l’installation s’est bien passee 
	-Cliquez sur Close: L’installation du JDK est terminee.
	
	
	Tйlйcharger et installer une base de donnйes Mysql а l'exemple de bitnami-wampstack-5.5.38-0-windows-installer
tйlйcharger et installer un client de base de donnйe а l'exemple de  SQLyog-11.5.0-1_x86-x64_setup 
	-Dйmarrez les services de mysql et lancer le client de base de donnйe concernйe
	(si c'est SQLyog double cliquйe sur l'icone de 
	-crйer l'utilisateur yvan avec le mot de passe yvan
	-si c'est SQLyog cliquez sur l'onglet Database puis sur----> Import puis sur---> execute SQL Script
Dans le dossier 'LivrableNo3' copier le jar "mysql-connector-java-5.1.28-bin" 
puis collez le dans le dossier lib/ext prйsent dans le dossier d'installation du JRE.
					
					Version du jdk utilise
					
					java version "1.8.0_20"
	Java(TM) SE Runtime Environment (build 1.8.0_20-b02)
	Java HotSpot(TM) 64-Bit Server VM (build 25.20-b02, mixed mode)


					Documentation:

Veuillez suivre les instructions suivantes:

1) Rendez vous dans le dossier "Livraison No5\doc".

2) Double cliquez sur "index.html".

	 	Execution de l'application:
		
	Suivez les instructions suivantes:
	
1) 	A l'aide de votre interpretteur de commande (cmd.exe),
	placer vous dans le dossier ou vous avez telecharge
	le fichier compresse "GestionScolarite.jar"
	("cd [chemin]/[dossier cible]").

2)	Entrer la commande "java -jar GestionScolarite.jar".
3)A present suivez les instructions et poursuiez.

