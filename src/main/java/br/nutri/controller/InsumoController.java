package br.nutri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.nutri.model.Insumo;
import br.nutri.repository.InsumoRepository;

@RestController
@RequestMapping(value = "/insumo")
@CrossOrigin(origins = "*")
public class InsumoController extends GenericArchivableRestController<Insumo, Integer> {

	@Autowired
	private InsumoRepository insumoRepository;

	@Override
	public JpaRepository<Insumo, Integer> getRepository() {
		return insumoRepository;
	}
}
