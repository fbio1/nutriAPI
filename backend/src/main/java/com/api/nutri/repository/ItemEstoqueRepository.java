package com.api.nutri.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.core.repository.GenericRepository;
import com.api.nutri.model.ConsultaItemEstoque;
import com.api.nutri.model.ItemEstoque;

@Repository
public interface ItemEstoqueRepository extends GenericRepository<ItemEstoque, Integer> {

//	@Query("SELECT SUM(ie.quantidade) as quantidadeTotal, "
//            + "u.multiplicador, "
//            + "u.tipo as tipoUnidadeBase, "
//                + "(CASE u.tipo "
//                +   "WHEN 'GRAMA' THEN 1 "
//                +   "WHEN 'MILILITRO' THEN 1 "
//                +   "WHEN 'QUILO' THEN 1000 "
//                +   "WHEN 'LITRO' THEN 1000 "
//            + "END)  as multiplicadorConvertido, "
//            + "u.id, "
//            + "(SUM(ie.quantidade) * u.multiplicador * "
//            + "CASE u.tipo "
//                +   "WHEN 'GRAMA' THEN 1 "
//                +   "WHEN 'MILILITRO' THEN 1 "
//                +   "WHEN 'QUILO' THEN 1000 "
//                +   "WHEN 'LITRO' THEN 1000 "
//            +"END ) as totalMenorUnidade "
//            +" FROM ItemEstoque ie"
//            +" INNER JOIN Unidade u ON ie.idUnidade = u.id"
//            +" WHERE ie.idInsumo = :idInsumo" 
//            +" AND ie.ativo = true"
//            +" GROUP by u.id")
//	Optional<ConsultaItemEstoque> findItem(@Param("idInsumo")Integer idInsumo);
}
