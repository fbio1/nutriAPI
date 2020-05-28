package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.CardapioAplicado;

@Repository
public interface CardapioAplicadoRepository extends GenericRepository<CardapioAplicado, Integer> {

//    List<CardapioAplicado> cardapios = (List<CardapioAplicado>) 
//            sessao.createCriteria(CardapioAplicado.class)
//            .add(Restrictions.sqlRestriction("data = '" + DataUtil.dataAtualString() + "'"))
//            .add(Restrictions.sqlRestriction("ativo = true"))
//            .addOrder(Order.asc("nome"));
}
