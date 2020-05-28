package com.api.nutri.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Login;

@Repository
public interface LoginRepository extends GenericRepository<Login, Integer> {

	Optional<Login> findByloginAndActiveIsTrue(String Login);

}
