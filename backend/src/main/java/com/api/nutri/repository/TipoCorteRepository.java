package com.api.nutri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.nutri.model.TipoCorte;

@Repository
public interface TipoCorteRepository extends JpaRepository<TipoCorte, Integer> {

}
