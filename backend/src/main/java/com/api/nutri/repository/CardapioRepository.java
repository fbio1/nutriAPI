package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.Cardapio;

@Repository
public interface CardapioRepository extends GenericRepository<Cardapio, Integer> {

}
