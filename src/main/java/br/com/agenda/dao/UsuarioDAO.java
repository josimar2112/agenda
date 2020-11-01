package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.agenda.data.Conexao;
import br.com.agenda.data.ConexaoMySql;

public class UsuarioDAO {

	private final Conexao conexao;

	public UsuarioDAO() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMySql();
	}

	public void inserir(String nomeUsuario) throws SQLException {
		String sqlQuery = "insert into usuario(nome)values (?);";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			stmt.setString(1, nomeUsuario);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}

}
