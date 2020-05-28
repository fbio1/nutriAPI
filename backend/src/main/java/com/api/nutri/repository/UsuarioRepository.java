package com.api.nutri.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {
	
//	Optional<Usuario> findByUsernameAndAtivoTrue(String username);
//	
	Optional<Usuario> findByEmailAndActiveIsTrue(String email);

}