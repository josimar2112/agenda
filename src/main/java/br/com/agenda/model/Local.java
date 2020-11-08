package br.com.agenda.model;

public class Local {

	private Long id;
	private String nome;

	public Local(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", nome=" + nome + "]";
	}

}
