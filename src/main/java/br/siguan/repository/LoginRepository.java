package br.siguan.repository;

import java.util.Optional;

import br.siguan.model.Login;

public interface LoginRepository extends GenericRepository<Login, Integer> {

	Optional<Login> findByloginAndAtivoTrue(String Login);

}
