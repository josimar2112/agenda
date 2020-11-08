package br.com.agenda.dao;

import java.util.List;

public interface DaoGenerica {
	
	
	List<?> listarTudo();
	
	void excluir(int id);
	

}
