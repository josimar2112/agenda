package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.data.Conexao;
import br.com.agenda.data.ConexaoMySql;
import br.com.agenda.model.Usuario;

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

	
	public List<Usuario> listarTudo() throws SQLException, ClassNotFoundException {
		String sql = "Select id, nome FROM Usuario order by id";

		try {
			PreparedStatement st = this.conexao.getConnection().prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			List<Usuario> listaPesquisada = new ArrayList<Usuario>();

			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getLong("id"), rs.getString("nome"));
				listaPesquisada.add(usuario);
			}

			return listaPesquisada;
		} catch (SQLException exception) {
			throw exception;
		}
	}

	
	public void alterar(String nomeAtualizado, int i) throws SQLException {
		String sql = "update usuario set nome = ? where id = ?";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
			stmt.setString(1, nomeAtualizado);
			stmt.setLong(2, i);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}
	}

	public void excluir(int i) throws SQLException {
		String excluir = "delete from usuario where id = ?; ";
		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(excluir);
			stmt.setLong(1, i);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

	}
}




