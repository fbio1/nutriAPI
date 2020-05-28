package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Insumo;

@Repository
public interface InsumoRepository extends GenericRepository<Insumo, Integer> {

}
