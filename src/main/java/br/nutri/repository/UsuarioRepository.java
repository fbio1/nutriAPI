package br.nutri.repository;

import java.util.Optional;

import br.nutri.model.Usuario;

public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {
	
//	Optional<Usuario> findByUsernameAndAtivoTrue(String username);
//	
	Optional<Usuario> findByEmailAndAtivoTrue(String email);

}