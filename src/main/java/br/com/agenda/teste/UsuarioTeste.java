package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.UsuarioDAO;

public class UsuarioTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		 * UsuarioDAO dao = new UsuarioDAO();
		 * 
		 * dao.inserir("leon");
		 * 
		 */
		
		UsuarioDAO dao = new UsuarioDAO();
		dao.listarTudo();
		
		System.out.println(dao.listarTudo());
		
		//UsuarioDAO daoUpdate = new UsuarioDAO();
		//daoUpdate.alterar("Leon Maximos", 5);
		
		UsuarioDAO del = new UsuarioDAO();
		del.excluir(5);
		
		
	}

}
