package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.SalaPreparacao;

@Repository
public interface SalaPreparacaoRepository extends GenericRepository<SalaPreparacao, Integer> {

}
