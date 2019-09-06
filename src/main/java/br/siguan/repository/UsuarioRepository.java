package br.siguan.repository;

import java.util.Optional;

import br.siguan.model.Usuario;

public interface UsuarioRepository extends GenericRepository<Usuario, Integer> {
	
	Optional<Usuario> findByUsernameAndAtivoTrue(String username);
	
	Optional<Usuario> findByEmailAndAtivoTrue(String email);

}
