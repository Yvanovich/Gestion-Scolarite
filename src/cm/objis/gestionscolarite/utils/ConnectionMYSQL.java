/**
 * 
 */
package cm.objis.gestionscolarite.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author NKOUOTOU Yvan
 *
 */
public class ConnectionMYSQL {

	// Information d'accès à la base de données
	public static String url = "jdbc:mysql://localhost/gestionscolarite";
	public static String login = "yvan";
	public static String passwd = "";
	public static Connection connection;

	/**
	 * Methode connection Ne prend rien en parametre
	 * 
	 * @return Connection
	 */
	public static Connection getInstance() {

		if (connection == null) {

			try {
				// Etape 1 : récupération de la connexion
				connection = DriverManager.getConnection(url, login, passwd);

			} catch (SQLException e) {

				System.out.println("Problem de connexion");
			}
		}
		return connection;
	}
}