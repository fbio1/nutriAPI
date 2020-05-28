package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Preparacao;

@Repository
public interface PreparacaoRepository extends GenericRepository<Preparacao, Integer> {

}
