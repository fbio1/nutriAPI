package com.api.nutri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.core.model.GenericAbstractModel;

@Entity
@Table(name = "analise_quimica")
public class AnaliseQuimica extends GenericAbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "proteinas", nullable = true)
	// @NotNull(message = "Informe a quantidade de proteinas.")
	private double proteinas;

	@Column(name = "carboidratos", nullable = true)
	// @NotNull(message = "Informe a quantidade de carboidratos.")
	private double carboidratos;

	@Column(name = "lipideos", nullable = true)
	//// @NotNull(message = "Informe a quantidade de lipídios.")
	private double lipideos;

	@Column(name = "tamanhoAmostra", nullable = true)
	// @NotNull(message = "Informe a quantidade do tamanho da amostra.")
	private double tamanhoAmostra;

	@Column(name = "umidade", nullable = true)
	// @NotNull(message = "Informe a quantidade de umidade.")
	private double umidade;

	@Column(name = "energiaKCAL", nullable = true)
	// @NotNull(message = "Informe a quantidade de energiaKCAL.")
	private double energiaKCAL;

	@Column(name = "colesterol", nullable = true)
	// @NotNull(message = "Informe a quantidade de colesterol.")
	private double colesterol;

	@Column(name = "energiaKJ", nullable = true)
	// @NotNull(message = "Informe a quantidade de energiaKJ.")
	private double energiaKJ;

	@Column(name = "fibraAlimentar", nullable = true)
	// @NotNull(message = "Informe a quantidade de fibraAlimentar.")
	private double fibraAlimentar;

	@Column(name = "cinzas", nullable = true)
	// @NotNull(message = "Informe a quantidade de cinzas.")
	private double cinzas;

	@Column(name = "calcio", nullable = true)
	// @NotNull(message = "Informe a quantidade de calcio.")
	private double calcio;

	@Column(name = "magnesio", nullable = true)
	// @NotNull(message = "Informe a quantidade de magnesio.")
	private double magnesio;

	@Column(name = "fosforo", nullable = true)
	// @NotNull(message = "Informe a quantidade de fosforo.")
	private double fosforo;

	@Column(name = "ferro", nullable = true)
	// @NotNull(message = "Informe a quantidade de ferro.")
	private double ferro;

	@Column(name = "sodio", nullable = true)
	// @NotNull(message = "Informe a quantidade de sodio.")
	private double sodio;

	@Column(name = "potasio", nullable = true)
	// @NotNull(message = "Informe a quantidade de potasio.")
	private double potasio;

	@Column(name = "cobre", nullable = true)
	// @NotNull(message = "Informe a quantidade de cobre.")
	private double cobre;

	@Column(name = "zinco", nullable = true)
	// @NotNull(message = "Informe a quantidade de zinco.")
	private double zinco;

	@Column(name = "retinol", nullable = true)
	// @NotNull(message = "Informe a quantidade de retinol.")
	private double retinol;

	@Column(name = "re", nullable = true)
	// @NotNull(message = "Informe a quantidade de RE.")
	private double re;

	@Column(name = "rae", nullable = true)
	// @NotNull(message = "Informe a quantidade de RAE.")
	private double rae;

	@Column(name = "tiamina", nullable = true)
	// @NotNull(message = "Informe a quantidade de tiamina.")
	private double tiamina;

	@Column(name = "riboflavina", nullable = true)
	// @NotNull(message = "Informe a quantidade de riboflavina.")
	private double riboflavina;

	@Column(name = "piridoxina", nullable = true)
	// @NotNull(message = "Informe a quantidade de piridoxina.")
	private double piridoxina;

	@Column(name = "niacina", nullable = true)
	// @NotNull(message = "Informe a quantidade de niacina.")
	private double niacina;

	@Column(name = "vitaminaC", nullable = true)
	// @NotNull(message = "Informe a quantidade de vitaminaC.")
	private double vitaminaC;

	@Column(name = "saturados", nullable = true)
	// @NotNull(message = "Informe a quantidade de saturados.")
	private double saturados;

	@Column(name = "monosaturados", nullable = true)
	// @NotNull(message = "Informe a quantidade de monosaturados.")
	private double monoinsaturado;

	@Column(name = "polinsaturados", nullable = true)
	// @NotNull(message = "Informe a quantidade de polinsaturados.")
	private double poliinsaturado;

	@Column(name = "manganes", nullable = true)
	private double manganes;

	public AnaliseQuimica() {
	}

	public AnaliseQuimica(double proteinas, double carboidratos, double lipideos, double tamanhoAmostra, double umidade,
			double energiaKCAL, double colesterol, double energiaKJ, double fibraAlimentar, double cinzas,
			double calcio, double magnesio, double fosforo, double ferro, double sodio, double potasio, double cobre,
			double zinco, double retinol, double re, double rae, double tiamina, double riboflavina, double piridoxina,
			double niacina, double vitaminaC, double saturados, double monoinsaturado, double poliinsaturado,
			double manganes) {
		this.proteinas = proteinas;
		this.carboidratos = carboidratos;
		this.lipideos = lipideos;
		this.tamanhoAmostra = tamanhoAmostra;
		this.umidade = umidade;
		this.energiaKCAL = energiaKCAL;
		this.colesterol = colesterol;
		this.energiaKJ = energiaKJ;
		this.fibraAlimentar = fibraAlimentar;
		this.cinzas = cinzas;
		this.calcio = calcio;
		this.magnesio = magnesio;
		this.fosforo = fosforo;
		this.ferro = ferro;
		this.sodio = sodio;
		this.potasio = potasio;
		this.cobre = cobre;
		this.zinco = zinco;
		this.retinol = retinol;
		this.re = re;
		this.rae = rae;
		this.tiamina = tiamina;
		this.riboflavina = riboflavina;
		this.piridoxina = piridoxina;
		this.niacina = niacina;
		this.vitaminaC = vitaminaC;
		this.saturados = saturados;
		this.monoinsaturado = monoinsaturado;
		this.poliinsaturado = poliinsaturado;
		this.manganes = manganes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(double carboidratos) {
		this.carboidratos = carboidratos;
	}

	public double getLipideos() {
		return lipideos;
	}

	public void setLipideos(double lipideos) {
		this.lipideos = lipideos;
	}

	public double getTamanhoAmostra() {
		return tamanhoAmostra;
	}

	public void setTamanhoAmostra(double tamanhoAmostra) {
		this.tamanhoAmostra = tamanhoAmostra;
	}

	public double getUmidade() {
		return umidade;
	}

	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public double getEnergiaKCAL() {
		return energiaKCAL;
	}

	public void setEnergiaKCAL(double energiaKCAL) {
		this.energiaKCAL = energiaKCAL;
	}

	public double getColesterol() {
		return colesterol;
	}

	public void setColesterol(double colesterol) {
		this.colesterol = colesterol;
	}

	public double getEnergiaKJ() {
		return energiaKJ;
	}

	public void setEnergiaKJ(double energiaKJ) {
		this.energiaKJ = energiaKJ;
	}

	public double getFibraAlimentar() {
		return fibraAlimentar;
	}

	public void setFibraAlimentar(double fibraAlimentar) {
		this.fibraAlimentar = fibraAlimentar;
	}

	public double getCinzas() {
		return cinzas;
	}

	public void setCinzas(double cinzas) {
		this.cinzas = cinzas;
	}

	public double getCalcio() {
		return calcio;
	}

	public void setCalcio(double calcio) {
		this.calcio = calcio;
	}

	public double getMagnesio() {
		return magnesio;
	}

	public void setMagnesio(double magnesio) {
		this.magnesio = magnesio;
	}

	public double getFosforo() {
		return fosforo;
	}

	public void setFosforo(double fosforo) {
		this.fosforo = fosforo;
	}

	public double getFerro() {
		return ferro;
	}

	public void setFerro(double ferro) {
		this.ferro = ferro;
	}

	public double getSodio() {
		return sodio;
	}

	public void setSodio(double sodio) {
		this.sodio = sodio;
	}

	public double getPotasio() {
		return potasio;
	}

	public void setPotasio(double potasio) {
		this.potasio = potasio;
	}

	public double getCobre() {
		return cobre;
	}

	public void setCobre(double cobre) {
		this.cobre = cobre;
	}

	public double getZinco() {
		return zinco;
	}

	public void setZinco(double zinco) {
		this.zinco = zinco;
	}

	public double getRetinol() {
		return retinol;
	}

	public void setRetinol(double retinol) {
		this.retinol = retinol;
	}

	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	public double getRae() {
		return rae;
	}

	public void setRae(double rae) {
		this.rae = rae;
	}

	public double getMonoinsaturado() {
		return monoinsaturado;
	}

	public void setMonoinsaturado(double monoinsaturado) {
		this.monoinsaturado = monoinsaturado;
	}

	public double getPoliinsaturado() {
		return poliinsaturado;
	}

	public void setPoliinsaturado(double poliinsaturado) {
		this.poliinsaturado = poliinsaturado;
	}

	public double getTiamina() {
		return tiamina;
	}

	public void setTiamina(double tiamina) {
		this.tiamina = tiamina;
	}

	public double getRiboflavina() {
		return riboflavina;
	}

	public void setRiboflavina(double riboflavina) {
		this.riboflavina = riboflavina;
	}

	public double getPiridoxina() {
		return piridoxina;
	}

	public void setPiridoxina(double piridoxina) {
		this.piridoxina = piridoxina;
	}

	public double getNiacina() {
		return niacina;
	}

	public void setNiacina(double niacina) {
		this.niacina = niacina;
	}

	public double getVitaminaC() {
		return vitaminaC;
	}

	public void setVitaminaC(double vitaminaC) {
		this.vitaminaC = vitaminaC;
	}

	public double getSaturados() {
		return saturados;
	}

	public void setSaturados(double saturados) {
		this.saturados = saturados;
	}

	public double getManganes() {
		return manganes;
	}

	public void setManganes(double manganes) {
		this.manganes = manganes;
	}
}
