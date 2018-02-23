package de.sneakerLove.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class to connect to an Postgresql Server.
 * 
 * @author Artem Spies
 *
 */
public class DataBaseConnection {
	protected static Connection instance;
	private static final String DB_SERVER = "207.154.234.136:5432";
	private static final String DB_NAME = "1718-Sneakerlove";
	private static final String DB_USER = "1718-Sneakerlove";
	private static final String DB_PASSWORD = "65fc4980263b14c12b3e3a1057026e46"; 
	private static final String DB_DRIVER = "org.postgresql.Driver";
	private static final String DB_URL = "jdbc:postgresql://" + DB_SERVER + "/" + DB_NAME;

	/**
	 * Initializes a connection to the data base defined by DB_URL.
	 * 
	 * @return java.sql.Connection or null if there is an error.
	 */
	private static Connection init() {
		try {
			Class.forName(DB_DRIVER);
			instance = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return instance;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("PostgresDb: Something went wrong: ");
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Returns a Connection or null if connecting to data base fails for some
	 * reason.
	 * 
	 * @return java.sql.Connection
	 */
	public static Connection getConnection() {
		try {
			return (instance == null || instance.isClosed()) ? init() : instance;
		} catch (SQLException e) {
			e.printStackTrace();
			return init();
		}
	}

	public static void closeConnection() {
		try {
			instance.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}