package br.nutri.repository;

import java.util.Optional;

import br.nutri.model.Login;

public interface LoginRepository extends GenericRepository<Login, Integer> {

	Optional<Login> findByloginAndActiveIsTrue(String Login);

}
