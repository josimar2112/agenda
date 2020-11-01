package br.com.agenda.data;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
	
	Connection getConnection();
	
	void close();
	
	void commit() throws SQLException;
	
	void rollback();
	
}
