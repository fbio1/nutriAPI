package br.siguan.model;

public class DadoRelatorioRequisicao {
    
    private String nomeInsumo;
    private String tipoinsumo;    
    private String nomeUnidade;    
    private String tipoUnidade;
    private Integer quantidade;
    private double multiplicador;
    private boolean condimento;
   
    public DadoRelatorioRequisicao() {
    }

    public DadoRelatorioRequisicao(String nomeInsumo, String tipoinsumo, String nomeUnidade, String tipoUnidade, Integer quantidade, double multiplicador, boolean condimento) {
        this.nomeInsumo = nomeInsumo;
        this.tipoinsumo = tipoinsumo;
        this.nomeUnidade = nomeUnidade;
        this.tipoUnidade = tipoUnidade;
        this.quantidade = quantidade;
        this.multiplicador = multiplicador;
        this.condimento = condimento;
    }

    public boolean isCondimento() {
        return condimento;
    }

    public void setCondimento(boolean condimento) {
        this.condimento = condimento;
    }

  

    public String getNomeInsumo() {
        return nomeInsumo;
    }

    public void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }   

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getTipoinsumo() {
        return tipoinsumo;
    }

    public void setTipoinsumo(String tipoinsumo) {
        this.tipoinsumo = tipoinsumo;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    @Override
    public String toString() {
        return "DadoRelatorioRequisicao{" + "nomeInsumo=" + nomeInsumo + ", tipoinsumo=" + tipoinsumo + ", nomeUnidade=" + nomeUnidade + ", tipoUnidade=" + tipoUnidade + ", quantidade=" + quantidade + ", multiplicador=" + multiplicador + ", condimento=" + condimento + '}';
    }

}