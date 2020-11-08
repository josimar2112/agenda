package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.LocalDAO;

public class LocalTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * dao.inserir(" Giassi ");
		 */


		LocalDAO dao = new LocalDAO();
		dao.listarTudo();
		
		System.out.println(dao.listarTudo());
		
		/*
		
		LocalDAO daoUpdate = new LocalDAO();
		daoUpdate.alterar("Cooper a nossa Cooperativa", 2);
		
		LocalDAO del = new LocalDAO();
		del.excluir(5);
			*/	
	}

}
