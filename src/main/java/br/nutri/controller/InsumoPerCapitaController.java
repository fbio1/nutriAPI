package br.nutri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.nutri.model.InsumoPerCapita;
import br.nutri.repository.InsumoPerCapitaRepository;

@RestController
@RequestMapping(value = "/insumoPerCapita")
@CrossOrigin(origins = "*")
public class InsumoPerCapitaController extends GenericArchivableRestController<InsumoPerCapita, Integer> {
	
	@Autowired
	private InsumoPerCapitaRepository insumoPerCapitaRepository;

	@Override
	public JpaRepository<InsumoPerCapita, Integer> getRepository() {
		return insumoPerCapitaRepository;
	}
}
