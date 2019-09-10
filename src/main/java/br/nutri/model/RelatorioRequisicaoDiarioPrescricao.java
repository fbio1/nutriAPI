package br.nutri.model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioRequisicaoDiarioPrescricao {
	private String Date;
	private List<DadoRelatorioRequisicao> dadoRelatorio = new ArrayList<DadoRelatorioRequisicao>();

	public RelatorioRequisicaoDiarioPrescricao() {
	}

	public RelatorioRequisicaoDiarioPrescricao(String Date) {
		this.Date = Date;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String Date) {
		this.Date = Date;
	}

	public List<DadoRelatorioRequisicao> getDadoRelatorio() {
		return dadoRelatorio;
	}

	public void setDadoRelatorio(List<DadoRelatorioRequisicao> dadoRelatorio) {
		this.dadoRelatorio = dadoRelatorio;
	}
}
