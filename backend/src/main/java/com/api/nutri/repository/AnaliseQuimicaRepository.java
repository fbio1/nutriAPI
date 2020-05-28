package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.AnaliseQuimica;

@Repository
public interface AnaliseQuimicaRepository extends GenericRepository<AnaliseQuimica, Integer> {

}
