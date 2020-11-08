package br.com.agenda.model;

import java.util.Date;

public class ListaTarefas {

	private Long id;
	private String descricao;
	private Date dataCadastro;
	private int statusTarefa;
	private Date dataExecucao;
	private Date dataConclusao;
	private String observacao;
	private Local local;
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public int getStatusTarefa() {
		return statusTarefa;
	}

	public void setStatusTarefa(int statusTarefa) {
		this.statusTarefa = statusTarefa;
	}

	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ListaTarefas(Long id, String descricao, Date dataCadastro, int statusTarefa, Date dataExecucao,
			Date dataConclusao, String observacao, Local local, Usuario usuario) {
		this.id = id;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.statusTarefa = statusTarefa;
		this.dataExecucao = dataExecucao;
		this.dataConclusao = dataConclusao;
		this.observacao = observacao;
		this.local = local;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "ListaTarefas [id=" + id + ", descricao=" + descricao + ", dataCadastro=" + dataCadastro
				+ ", statusTarefa=" + statusTarefa + ", dataExecucao=" + dataExecucao + ", dataConclusao="
				+ dataConclusao + ", observacao=" + observacao + ", local=" + local + ", usuario=" + usuario + "]";
	}

}
