package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.InsumoPerCapita;

@Repository
public interface InsumoPerCapitaRepository extends GenericRepository<InsumoPerCapita, Integer> {

}
