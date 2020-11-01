package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.agenda.data.Conexao;
import br.com.agenda.data.ConexaoMySql;

public class LocalDAO {
	
	private final Conexao conexao;
	
	public LocalDAO() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMySql();
	}
	
	
	public void inserir(String nomeLocal) throws SQLException {
		String sqlQuery = "insert into local(nome)values (?);";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			stmt.setString(1, nomeLocal);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}

}



