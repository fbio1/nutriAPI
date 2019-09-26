package br.nutri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.nutri.model.Unidade;
import br.nutri.repository.UnidadeRepository;

@RestController
@RequestMapping(value = "/unidade")
@CrossOrigin(origins = "*")
public class UnidadeController extends GenericArchivableRestController<Unidade, Integer> {
	
	@Autowired
	private UnidadeRepository unidadeRepository;

	@Override
	public JpaRepository<Unidade, Integer> getRepository() {
		return unidadeRepository;
	}

}
