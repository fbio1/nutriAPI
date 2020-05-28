package com.api.nutri.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.DadoRelatorioCardapioSemanal;
import com.api.nutri.model.Prescricao;

@Repository
public interface PrescricaoRepository extends GenericRepository<Prescricao, Integer> {

//	@Query(" SELECT " +   
//		   " u.nome as nomeUnidade, " + 
//		   " u.multiplicador as multiplicador, " +  
//		   " u.tipo AS tipoUnidade, " + 
//		   " resultado.nome as nomeInsumo, " +
//		   " resultado.tipo as tipoinsumo, " + 
//		   " resultado.quantidade as quantidade, " + 
//		   " resultado.condimento " +
//		   "     FROM unidade u  " +
//		   "     INNER JOIN (  " +
//		   "         SELECT DISTINCT i1.nome, i1.id AS idInsumo, i1.tipo, inspc.condimento, inspc.id, it1.id as idu, it1.quantidade " +
//		   "            FROM  insumo i1, insumo_per_capta inspc, item_estoque it1, prescricao pres " +
//		   "            LEFT JOIN prescricao_itens_almoco AS almoco ON pres.id = almoco.FK_Prescricao " +
//		   "            LEFT JOIN prescricao_itens_ceia AS ceia  ON pres.id = ceia.FK_Prescricao " +
//		   "            LEFT JOIN prescricao_itens_desjejum AS desjejum  ON pres.id = desjejum.FK_Prescricao " +
//		   "            LEFT JOIN prescricao_itens_janta AS jantar  ON pres.id = jantar.FK_Prescricao " +
//		   "            LEFT JOIN prescricao_itens_lanche_tarde AS lm1 ON pres.id = lm1.FK_Prescricao " +
//		   "            LEFT JOIN prescricao_itens_lanche_manha AS lt1 ON pres.id = lt1.FK_Prescricao " +
//		   "                WHERE it1.id > 0 " +
//		   "                  AND i1.id = it1.id_insumo " +
//		   "                  AND inspc.ingrediente_id = i1.id " +
//		   "                  AND pres.dia = :dataPesquisada " +
//		   "                  AND pres.active IS TRUE  " +
//		   "                  AND it1.quantidade < 0 " +
//		   "         )  AS resultado  ON u.id = resultado.idu " +
//		   "         WHERE u.active IS TRUE  " +
//		   "         GROUP BY resultado.idInsumo, " +
//		   "                  nomeUnidade, " +
//		   "                  multiplicador, " +
//		   "                  tipoUnidade, " +
//		   "                  nomeInsumo, " +
//		   "                  tipoinsumo, " +
//		   "                  quantidade, " +
//		   "                  condimento " +
//		   "         ORDER BY u.nome")
//	List<DadoRelatorioCardapioSemanal> relatorioRequisicaoDiaria(Date dataPesquisada);

//	Criteria criteria = sessao.createCriteria(Prescricao.class).
//            add(Restrictions.eq("dia", date)).
//            add(Restrictions.eq("ativo", true))
//            .addOrder(Order.asc("dia"));
	
//	  Criteria criteria = sessao.createCriteria(Prescricao.class).
//              add(Restrictions.eq("dia", date))
//              .addOrder(Order.asc("dia"))
//              .add(Restrictions.eq("ativo", true));
}
