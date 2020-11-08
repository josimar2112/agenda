package br.com.agenda.teste;

import java.sql.SQLException;

import br.com.agenda.dao.ListaTarefasDAO;
import br.com.agenda.dao.LocalDAO;
import br.com.agenda.dao.UsuarioDAO;

public class ListaTarefasTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//busca de locais
		LocalDAO local = new LocalDAO();
		local.listarTudo();
		System.out.println(local.listarTudo());
		
		//busca de usuarios
		UsuarioDAO usuario = new UsuarioDAO();
		usuario.listarTudo();
		System.out.println(usuario.listarTudo());
		
		
		ListaTarefasDAO dao = new ListaTarefasDAO();
		dao.insert("Ir a Barbearia", "Arrumar o cabelo e a barba", 3, 1);

	}

}
