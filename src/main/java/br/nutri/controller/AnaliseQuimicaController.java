package br.nutri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.nutri.model.AnaliseQuimica;
import br.nutri.repository.AnaliseQuimicaRepository;

@RestController
@RequestMapping(value = "/analiseQuimica")
@CrossOrigin(origins = "*")
public class AnaliseQuimicaController extends GenericArchivableRestController<AnaliseQuimica, Integer> {
	
	@Autowired
	private AnaliseQuimicaRepository analiseQuimicaRepository;

	@Override
	public JpaRepository<AnaliseQuimica, Integer> getRepository() {
		return analiseQuimicaRepository;
	}
}
