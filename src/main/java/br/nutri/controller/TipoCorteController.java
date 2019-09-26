package br.nutri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.nutri.model.TipoCorte;
import br.nutri.repository.TipoCorteRepository;

@RestController
@RequestMapping(value = "/tipoCorte")
@CrossOrigin(origins = "*")
public class TipoCorteController extends GenericArchivableRestController<TipoCorte, Integer> {

	@Autowired
	private TipoCorteRepository tipoCorteRepository;

	@Override
	public JpaRepository<TipoCorte, Integer> getRepository() {
		return tipoCorteRepository;
	}
}
