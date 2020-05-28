package com.api.nutri.repository;

import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.MenuAplicado;

@Repository
public interface MenuAplicadoRepository extends GenericRepository<MenuAplicado, Integer> {

	
//    menus = (List<MenuAplicado>) sessao.createCriteria(MenuAplicado.class)
//            //exemplo detalhado da string: dia BETWEEN '2017-09-01' AND '2017-09-07';
//            .add(Restrictions.sqlRestriction("dia BETWEEN " 
//                    + DataUtil.dataDaSemana(data) ))
//            .add(Restrictions.sqlRestriction("ativo = true"))
//            .list();
}
