package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Unidade;

@Repository
public interface UnidadeRepository extends GenericRepository<Unidade, Integer> {

}
