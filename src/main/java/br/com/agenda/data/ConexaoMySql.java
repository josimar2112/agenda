package br.com.agenda.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoMySql implements Conexao {

	private Connection connection = null;

	private static final String USERNAME = "root";

	private static final String PASSWORD = "";

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";

	public ConexaoMySql() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		this.connection.setAutoCommit(false);
	}

	public Connection getConnection() {

		return this.connection;
	}

	public void close() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (SQLException ex) {
				Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

	}

	public void commit() throws SQLException {
		this.connection.commit();
		this.close();
	}

	public void rollback() {
		if (this.connection != null) {
			try {
				this.connection.rollback();
			} catch (SQLException ex) {
				Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
			} finally {
			}

		}
	}
}
