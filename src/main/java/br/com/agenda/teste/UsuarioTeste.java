package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioDAO;

public class UsuarioTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UsuarioDAO dao = new UsuarioDAO();
		
		dao.inserir("leon");
		

	}

}
