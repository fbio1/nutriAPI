package br.siguan.model;

/**
 *
 * @author Taniro
 */
public class ConsultaItemEstoque {
	private java.math.BigDecimal quantidadeTotal;
	private Double multiplicador;
	private String tipoUnidadeBase;
	private java.lang.Number multiplicadorConvertido;
	private int idUnidade;
	private Double totalMenorUnidade;

	public ConsultaItemEstoque() {
	}

	public java.math.BigDecimal getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(java.math.BigDecimal quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public Double getMultiplicador() {
		return multiplicador;
	}

	public void setMultiplicador(Double multiplicador) {
		this.multiplicador = multiplicador;
	}

	public java.lang.Number getMultiplicadorConvertido() {
		return multiplicadorConvertido;
	}

	public void setMultiplicadorConvertido(java.lang.Number multiplicadorConvertido) {
		this.multiplicadorConvertido = multiplicadorConvertido;
	}

	public String getTipoUnidadeBase() {
		return tipoUnidadeBase;
	}

	public void setTipoUnidadeBase(String tipoUnidadeBase) {
		this.tipoUnidadeBase = tipoUnidadeBase;
	}

	public int getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(int idUnidade) {
		this.idUnidade = idUnidade;
	}

	public Double getTotalMenorUnidade() {
		return totalMenorUnidade;
	}

	public void setTotalMenorUnidade(Double totalMenorUnidade) {
		this.totalMenorUnidade = totalMenorUnidade;
	}

	@Override
	public String toString() {
		return "ConsultaItemEstoque{" + "quantidadeTotal=" + quantidadeTotal + ", multiplicador=" + multiplicador
				+ ", tipoUnidadeBase=" + tipoUnidadeBase + ", multiplicadorConvertido=" + multiplicadorConvertido
				+ ", idUnidade=" + idUnidade + ", totalMenorUnidade=" + totalMenorUnidade + '}';
	}

}
