package br.siguan.repository;

import br.siguan.model.Login;

public interface LoginRepository extends GenericRepository<Login, Integer> {

	Login findByloginAndAtivoTrue(String Login);

}
